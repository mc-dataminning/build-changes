import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class epe {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epe> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.bd).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  epb.a.listOf().fieldOf("layers").forGetter(epe::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dkd.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ale.d(dkk.b),
                  ale.d(ru.g),
                  ale.d(ru.h)
               )
               .apply($$0, epe::new)
      )
      .comapFlatMap(epe::a, Function.identity())
      .stable();
   private final Optional<ji<erh>> c;
   private final List<epb> d = Lists.newArrayList();
   private final je<dkd> e;
   private final List<eah> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<je<eqf>> j;

   private static DataResult<epe> a(epe $$0) {
      int $$1 = $$0.d.stream().mapToInt(epb::a).sum();
      return $$1 > eee.c ? DataResult.error(() -> "Sum of layer heights is > " + eee.c, $$0) : DataResult.success($$0);
   }

   private epe(Optional<ji<erh>> $$0, List<epb> $$1, boolean $$2, boolean $$3, Optional<je<dkd>> $$4, je.c<dkd> $$5, je<eqf> $$6, je<eqf> $$7) {
      this($$0, a($$4, $$5), List.of($$6, $$7));
      if ($$2) {
         this.b();
      }

      if ($$3) {
         this.a();
      }

      this.d.addAll($$1);
      this.g();
   }

   private static je<dkd> a(Optional<? extends je<dkd>> $$0, je<dkd> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (je<dkd>)$$0.get();
      }
   }

   public epe(Optional<ji<erh>> $$0, je<dkd> $$1, List<je<eqf>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public epe a(List<epb> $$0, Optional<ji<erh>> $$1, je<dkd> $$2) {
      epe $$3 = new epe($$1, $$2, this.j);

      for (epb $$4 : $$0) {
         $$3.d.add(new epb($$4.a(), $$4.b().b()));
         $$3.g();
      }

      if (this.h) {
         $$3.a();
      }

      if (this.i) {
         $$3.b();
      }

      return $$3;
   }

   public void a() {
      this.h = true;
   }

   public void b() {
      this.i = true;
   }

   public dke a(je<dkd> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dke $$1 = this.d().a().d();
         dke.b $$2 = new dke.b();
         if (this.i) {
            for (je<eqf> $$3 : this.j) {
               $$2.a(egc.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dkk.a)) && this.h;
         if ($$4) {
            List<ji<eqf>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != egc.a.d.ordinal() && $$6 != egc.a.e.ordinal() && (!this.i || $$6 != egc.a.b.ordinal())) {
                  for (je<eqf> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<eah> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            eah $$11 = $$9.get($$10);
            if (!egg.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(egc.a.k, rx.a(ejm.ac, new elu($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ji<erh>> c() {
      return this.c;
   }

   public je<dkd> d() {
      return this.e;
   }

   public List<epb> e() {
      return this.d;
   }

   public List<eah> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (epb $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dmh.a));
   }

   public static epe a(jf<dkd> $$0, jf<erh> $$1, jf<eqf> $$2) {
      ji<erh> $$3 = ji.a($$1.b(equ.r), $$1.b(equ.a));
      epe $$4 = new epe(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new epb(1, dmh.I));
      $$4.e().add(new epb(2, dmh.j));
      $$4.e().add(new epb(1, dmh.i));
      $$4.g();
      return $$4;
   }

   public static je<dkd> a(jf<dkd> $$0) {
      return $$0.b(dkk.b);
   }

   public static List<je<eqf>> b(jf<eqf> $$0) {
      return List.of($$0.b(ru.g), $$0.b(ru.h));
   }
}
