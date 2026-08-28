import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eow {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eow> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.bc).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eot.a.listOf().fieldOf("layers").forGetter(eow::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  djy.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ale.d(dkf.b),
                  ale.d(ru.g),
                  ale.d(ru.h)
               )
               .apply($$0, eow::new)
      )
      .comapFlatMap(eow::a, Function.identity())
      .stable();
   private final Optional<ji<eqz>> c;
   private final List<eot> d = Lists.newArrayList();
   private final je<djy> e;
   private final List<dzz> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<je<epx>> j;

   private static DataResult<eow> a(eow $$0) {
      int $$1 = $$0.d.stream().mapToInt(eot::a).sum();
      return $$1 > edw.c ? DataResult.error(() -> "Sum of layer heights is > " + edw.c, $$0) : DataResult.success($$0);
   }

   private eow(Optional<ji<eqz>> $$0, List<eot> $$1, boolean $$2, boolean $$3, Optional<je<djy>> $$4, je.c<djy> $$5, je<epx> $$6, je<epx> $$7) {
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

   private static je<djy> a(Optional<? extends je<djy>> $$0, je<djy> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (je<djy>)$$0.get();
      }
   }

   public eow(Optional<ji<eqz>> $$0, je<djy> $$1, List<je<epx>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eow a(List<eot> $$0, Optional<ji<eqz>> $$1, je<djy> $$2) {
      eow $$3 = new eow($$1, $$2, this.j);

      for (eot $$4 : $$0) {
         $$3.d.add(new eot($$4.a(), $$4.b().b()));
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

   public djz a(je<djy> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         djz $$1 = this.d().a().d();
         djz.b $$2 = new djz.b();
         if (this.i) {
            for (je<epx> $$3 : this.j) {
               $$2.a(efu.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dkf.a)) && this.h;
         if ($$4) {
            List<ji<epx>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != efu.a.d.ordinal() && $$6 != efu.a.e.ordinal() && (!this.i || $$6 != efu.a.b.ordinal())) {
                  for (je<epx> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dzz> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dzz $$11 = $$9.get($$10);
            if (!efy.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(efu.a.k, rx.a(eje.ac, new elm($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ji<eqz>> c() {
      return this.c;
   }

   public je<djy> d() {
      return this.e;
   }

   public List<eot> e() {
      return this.d;
   }

   public List<dzz> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eot $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dmc.a));
   }

   public static eow a(jf<djy> $$0, jf<eqz> $$1, jf<epx> $$2) {
      ji<eqz> $$3 = ji.a($$1.b(eqm.r), $$1.b(eqm.a));
      eow $$4 = new eow(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eot(1, dmc.I));
      $$4.e().add(new eot(2, dmc.j));
      $$4.e().add(new eot(1, dmc.i));
      $$4.g();
      return $$4;
   }

   public static je<djy> a(jf<djy> $$0) {
      return $$0.b(dkf.b);
   }

   public static List<je<epx>> b(jf<epx> $$0) {
      return List.of($$0.b(ru.g), $$0.b(ru.h));
   }
}
