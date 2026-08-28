import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eqq {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqq> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jv.a(mi.bd).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eqn.a.listOf().fieldOf("layers").forGetter(eqq::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dlm.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alp.d(dlt.b),
                  alp.d(rv.g),
                  alp.d(rv.h)
               )
               .apply($$0, eqq::new)
      )
      .comapFlatMap(eqq::a, Function.identity())
      .stable();
   private final Optional<jk<est>> c;
   private final List<eqn> d = Lists.newArrayList();
   private final jg<dlm> e;
   private final List<ebq> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jg<err>> j;

   private static DataResult<eqq> a(eqq $$0) {
      int $$1 = $$0.d.stream().mapToInt(eqn::a).sum();
      return $$1 > efn.c ? DataResult.error(() -> "Sum of layer heights is > " + efn.c, $$0) : DataResult.success($$0);
   }

   private eqq(Optional<jk<est>> $$0, List<eqn> $$1, boolean $$2, boolean $$3, Optional<jg<dlm>> $$4, jg.c<dlm> $$5, jg<err> $$6, jg<err> $$7) {
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

   private static jg<dlm> a(Optional<? extends jg<dlm>> $$0, jg<dlm> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jg<dlm>)$$0.get();
      }
   }

   public eqq(Optional<jk<est>> $$0, jg<dlm> $$1, List<jg<err>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eqq a(List<eqn> $$0, Optional<jk<est>> $$1, jg<dlm> $$2) {
      eqq $$3 = new eqq($$1, $$2, this.j);

      for (eqn $$4 : $$0) {
         $$3.d.add(new eqn($$4.a(), $$4.b().b()));
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

   public dln a(jg<dlm> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dln $$1 = this.d().a().d();
         dln.b $$2 = new dln.b();
         if (this.i) {
            for (jg<err> $$3 : this.j) {
               $$2.a(ehl.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dlt.a)) && this.h;
         if ($$4) {
            List<jk<err>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ehl.a.d.ordinal() && $$6 != ehl.a.e.ordinal() && (!this.i || $$6 != ehl.a.b.ordinal())) {
                  for (jg<err> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<ebq> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            ebq $$11 = $$9.get($$10);
            if (!ehp.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ehl.a.k, ry.a(ekw.ad, new enf($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jk<est>> c() {
      return this.c;
   }

   public jg<dlm> d() {
      return this.e;
   }

   public List<eqn> e() {
      return this.d;
   }

   public List<ebq> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eqn $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dnq.a));
   }

   public static eqq a(jh<dlm> $$0, jh<est> $$1, jh<err> $$2) {
      jk<est> $$3 = jk.a($$1.b(esg.r), $$1.b(esg.a));
      eqq $$4 = new eqq(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eqn(1, dnq.I));
      $$4.e().add(new eqn(2, dnq.j));
      $$4.e().add(new eqn(1, dnq.i));
      $$4.g();
      return $$4;
   }

   public static jg<dlm> a(jh<dlm> $$0) {
      return $$0.b(dlt.b);
   }

   public static List<jg<err>> b(jh<err> $$0) {
      return List.of($$0.b(rv.g), $$0.b(rv.h));
   }
}
