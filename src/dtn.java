import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dtn {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dtn> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hv.a(je.aB).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dtk.a.listOf().fieldOf("layers").forGetter(dtn::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cqv.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aew.d(crc.b),
                  aew.d(pf.g),
                  aew.d(pf.h)
               )
               .apply($$0, dtn::new)
      )
      .comapFlatMap(dtn::a, Function.identity())
      .stable();
   private final Optional<hk<dvq>> c;
   private final List<dtk> d = Lists.newArrayList();
   private final hg<cqv> e;
   private final List<dfl> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<hg<duo>> j;

   private static DataResult<dtn> a(dtn $$0) {
      int $$1 = $$0.d.stream().mapToInt(dtk::a).sum();
      return $$1 > diu.c ? DataResult.error(() -> "Sum of layer heights is > " + diu.c, $$0) : DataResult.success($$0);
   }

   private dtn(Optional<hk<dvq>> $$0, List<dtk> $$1, boolean $$2, boolean $$3, Optional<hg<cqv>> $$4, hg.c<cqv> $$5, hg<duo> $$6, hg<duo> $$7) {
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

   private static hg<cqv> a(Optional<? extends hg<cqv>> $$0, hg<cqv> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (hg<cqv>)$$0.get();
      }
   }

   public dtn(Optional<hk<dvq>> $$0, hg<cqv> $$1, List<hg<duo>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dtn a(List<dtk> $$0, Optional<hk<dvq>> $$1, hg<cqv> $$2) {
      dtn $$3 = new dtn($$1, $$2, this.j);

      for (dtk $$4 : $$0) {
         $$3.d.add(new dtk($$4.a(), $$4.b().b()));
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

   public cqw a(hg<cqv> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cqw $$1 = this.d().a().d();
         cqw.b $$2 = new cqw.b();
         if (this.i) {
            for (hg<duo> $$3 : this.j) {
               $$2.a(dkq.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(crc.a)) && this.h;
         if ($$4) {
            List<hk<duo>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dkq.b.d.ordinal() && $$6 != dkq.b.e.ordinal() && (!this.i || $$6 != dkq.b.b.ordinal())) {
                  for (hg<duo> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dfl> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dfl $$11 = $$9.get($$10);
            if (!dku.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dkq.b.k, pi.a(dny.ab, new dqg($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<hk<dvq>> c() {
      return this.c;
   }

   public hg<cqv> d() {
      return this.e;
   }

   public List<dtk> e() {
      return this.d;
   }

   public List<dfl> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dtk $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(csy.a));
   }

   public static dtn a(hh<cqv> $$0, hh<dvq> $$1, hh<duo> $$2) {
      hk<dvq> $$3 = hk.a($$1.b(dvd.r), $$1.b(dvd.a));
      dtn $$4 = new dtn(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dtk(1, csy.F));
      $$4.e().add(new dtk(2, csy.j));
      $$4.e().add(new dtk(1, csy.i));
      $$4.g();
      return $$4;
   }

   public static hg<cqv> a(hh<cqv> $$0) {
      return $$0.b(crc.b);
   }

   public static List<hg<duo>> b(hh<duo> $$0) {
      return List.of($$0.b(pf.g), $$0.b(pf.h));
   }
}
