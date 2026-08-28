import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eqe {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqe> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ju.a(mh.bd).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eqb.a.listOf().fieldOf("layers").forGetter(eqe::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dla.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alg.d(dlh.b),
                  alg.d(ru.g),
                  alg.d(ru.h)
               )
               .apply($$0, eqe::new)
      )
      .comapFlatMap(eqe::a, Function.identity())
      .stable();
   private final Optional<jj<esh>> c;
   private final List<eqb> d = Lists.newArrayList();
   private final jf<dla> e;
   private final List<ebe> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jf<erf>> j;

   private static DataResult<eqe> a(eqe $$0) {
      int $$1 = $$0.d.stream().mapToInt(eqb::a).sum();
      return $$1 > efb.c ? DataResult.error(() -> "Sum of layer heights is > " + efb.c, $$0) : DataResult.success($$0);
   }

   private eqe(Optional<jj<esh>> $$0, List<eqb> $$1, boolean $$2, boolean $$3, Optional<jf<dla>> $$4, jf.c<dla> $$5, jf<erf> $$6, jf<erf> $$7) {
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

   private static jf<dla> a(Optional<? extends jf<dla>> $$0, jf<dla> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jf<dla>)$$0.get();
      }
   }

   public eqe(Optional<jj<esh>> $$0, jf<dla> $$1, List<jf<erf>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eqe a(List<eqb> $$0, Optional<jj<esh>> $$1, jf<dla> $$2) {
      eqe $$3 = new eqe($$1, $$2, this.j);

      for (eqb $$4 : $$0) {
         $$3.d.add(new eqb($$4.a(), $$4.b().b()));
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

   public dlb a(jf<dla> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dlb $$1 = this.d().a().d();
         dlb.b $$2 = new dlb.b();
         if (this.i) {
            for (jf<erf> $$3 : this.j) {
               $$2.a(egz.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dlh.a)) && this.h;
         if ($$4) {
            List<jj<erf>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != egz.a.d.ordinal() && $$6 != egz.a.e.ordinal() && (!this.i || $$6 != egz.a.b.ordinal())) {
                  for (jf<erf> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<ebe> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            ebe $$11 = $$9.get($$10);
            if (!ehd.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(egz.a.k, rx.a(ekk.ad, new emt($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jj<esh>> c() {
      return this.c;
   }

   public jf<dla> d() {
      return this.e;
   }

   public List<eqb> e() {
      return this.d;
   }

   public List<ebe> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eqb $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dne.a));
   }

   public static eqe a(jg<dla> $$0, jg<esh> $$1, jg<erf> $$2) {
      jj<esh> $$3 = jj.a($$1.b(eru.r), $$1.b(eru.a));
      eqe $$4 = new eqe(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eqb(1, dne.I));
      $$4.e().add(new eqb(2, dne.j));
      $$4.e().add(new eqb(1, dne.i));
      $$4.g();
      return $$4;
   }

   public static jf<dla> a(jg<dla> $$0) {
      return $$0.b(dlh.b);
   }

   public static List<jf<erf>> b(jg<erf> $$0) {
      return List.of($$0.b(ru.g), $$0.b(ru.h));
   }
}
