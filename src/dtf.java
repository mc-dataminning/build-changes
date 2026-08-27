import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dtf {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dtf> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hs.a(jc.aC).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dtc.a.listOf().fieldOf("layers").forGetter(dtf::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cqz.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aex.d(crg.b),
                  aex.d(pd.g),
                  aex.d(pd.h)
               )
               .apply($$0, dtf::new)
      )
      .comapFlatMap(dtf::a, Function.identity())
      .stable();
   private final Optional<hi<dvi>> c;
   private final List<dtc> d = Lists.newArrayList();
   private final he<cqz> e;
   private final List<dfd> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<he<dug>> j;

   private static DataResult<dtf> a(dtf $$0) {
      int $$1 = $$0.d.stream().mapToInt(dtc::a).sum();
      return $$1 > dim.c ? DataResult.error(() -> "Sum of layer heights is > " + dim.c, $$0) : DataResult.success($$0);
   }

   private dtf(Optional<hi<dvi>> $$0, List<dtc> $$1, boolean $$2, boolean $$3, Optional<he<cqz>> $$4, he.c<cqz> $$5, he<dug> $$6, he<dug> $$7) {
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

   private static he<cqz> a(Optional<? extends he<cqz>> $$0, he<cqz> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (he<cqz>)$$0.get();
      }
   }

   public dtf(Optional<hi<dvi>> $$0, he<cqz> $$1, List<he<dug>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dtf a(List<dtc> $$0, Optional<hi<dvi>> $$1, he<cqz> $$2) {
      dtf $$3 = new dtf($$1, $$2, this.j);

      for (dtc $$4 : $$0) {
         $$3.d.add(new dtc($$4.a(), $$4.b().b()));
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

   public cra a(he<cqz> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cra $$1 = this.d().a().d();
         cra.b $$2 = new cra.b();
         if (this.i) {
            for (he<dug> $$3 : this.j) {
               $$2.a(dki.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(crg.a)) && this.h;
         if ($$4) {
            List<hi<dug>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dki.b.d.ordinal() && $$6 != dki.b.e.ordinal() && (!this.i || $$6 != dki.b.b.ordinal())) {
                  for (he<dug> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dfd> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dfd $$11 = $$9.get($$10);
            if (!dkm.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dki.b.k, pg.a(dnq.ab, new dpy($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<hi<dvi>> c() {
      return this.c;
   }

   public he<cqz> d() {
      return this.e;
   }

   public List<dtc> e() {
      return this.d;
   }

   public List<dfd> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dtc $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cte.a));
   }

   public static dtf a(hf<cqz> $$0, hf<dvi> $$1, hf<dug> $$2) {
      hi<dvi> $$3 = hi.a($$1.b(duv.r), $$1.b(duv.a));
      dtf $$4 = new dtf(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dtc(1, cte.F));
      $$4.e().add(new dtc(2, cte.j));
      $$4.e().add(new dtc(1, cte.i));
      $$4.g();
      return $$4;
   }

   public static he<cqz> a(hf<cqz> $$0) {
      return $$0.b(crg.b);
   }

   public static List<he<dug>> b(hf<dug> $$0) {
      return List.of($$0.b(pd.g), $$0.b(pd.h));
   }
}
