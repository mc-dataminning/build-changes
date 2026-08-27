import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dtl {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dtl> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hs.a(jc.aB).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dti.a.listOf().fieldOf("layers").forGetter(dtl::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cqt.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aeu.d(cra.b),
                  aeu.d(pd.g),
                  aeu.d(pd.h)
               )
               .apply($$0, dtl::new)
      )
      .comapFlatMap(dtl::a, Function.identity())
      .stable();
   private final Optional<hi<dvo>> c;
   private final List<dti> d = Lists.newArrayList();
   private final he<cqt> e;
   private final List<dfj> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<he<dum>> j;

   private static DataResult<dtl> a(dtl $$0) {
      int $$1 = $$0.d.stream().mapToInt(dti::a).sum();
      return $$1 > dis.c ? DataResult.error(() -> "Sum of layer heights is > " + dis.c, $$0) : DataResult.success($$0);
   }

   private dtl(Optional<hi<dvo>> $$0, List<dti> $$1, boolean $$2, boolean $$3, Optional<he<cqt>> $$4, he.c<cqt> $$5, he<dum> $$6, he<dum> $$7) {
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

   private static he<cqt> a(Optional<? extends he<cqt>> $$0, he<cqt> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (he<cqt>)$$0.get();
      }
   }

   public dtl(Optional<hi<dvo>> $$0, he<cqt> $$1, List<he<dum>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dtl a(List<dti> $$0, Optional<hi<dvo>> $$1, he<cqt> $$2) {
      dtl $$3 = new dtl($$1, $$2, this.j);

      for (dti $$4 : $$0) {
         $$3.d.add(new dti($$4.a(), $$4.b().b()));
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

   public cqu a(he<cqt> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cqu $$1 = this.d().a().d();
         cqu.b $$2 = new cqu.b();
         if (this.i) {
            for (he<dum> $$3 : this.j) {
               $$2.a(dko.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cra.a)) && this.h;
         if ($$4) {
            List<hi<dum>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dko.b.d.ordinal() && $$6 != dko.b.e.ordinal() && (!this.i || $$6 != dko.b.b.ordinal())) {
                  for (he<dum> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dfj> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dfj $$11 = $$9.get($$10);
            if (!dks.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dko.b.k, pg.a(dnw.ab, new dqe($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<hi<dvo>> c() {
      return this.c;
   }

   public he<cqt> d() {
      return this.e;
   }

   public List<dti> e() {
      return this.d;
   }

   public List<dfj> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dti $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(csw.a));
   }

   public static dtl a(hf<cqt> $$0, hf<dvo> $$1, hf<dum> $$2) {
      hi<dvo> $$3 = hi.a($$1.b(dvb.r), $$1.b(dvb.a));
      dtl $$4 = new dtl(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dti(1, csw.F));
      $$4.e().add(new dti(2, csw.j));
      $$4.e().add(new dti(1, csw.i));
      $$4.g();
      return $$4;
   }

   public static he<cqt> a(hf<cqt> $$0) {
      return $$0.b(cra.b);
   }

   public static List<he<dum>> b(hf<dum> $$0) {
      return List.of($$0.b(pd.g), $$0.b(pd.h));
   }
}
