import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dta {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dta> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hu.a(jd.aB).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dsx.a.listOf().fieldOf("layers").forGetter(dta::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cqi.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aen.d(cqp.b),
                  aen.d(oz.g),
                  aen.d(oz.h)
               )
               .apply($$0, dta::new)
      )
      .comapFlatMap(dta::a, Function.identity())
      .stable();
   private final Optional<hj<dvd>> c;
   private final List<dsx> d = Lists.newArrayList();
   private final hf<cqi> e;
   private final List<dey> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<hf<dub>> j;

   private static DataResult<dta> a(dta $$0) {
      int $$1 = $$0.d.stream().mapToInt(dsx::a).sum();
      return $$1 > dih.c ? DataResult.error(() -> "Sum of layer heights is > " + dih.c, $$0) : DataResult.success($$0);
   }

   private dta(Optional<hj<dvd>> $$0, List<dsx> $$1, boolean $$2, boolean $$3, Optional<hf<cqi>> $$4, hf.c<cqi> $$5, hf<dub> $$6, hf<dub> $$7) {
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

   private static hf<cqi> a(Optional<? extends hf<cqi>> $$0, hf<cqi> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (hf<cqi>)$$0.get();
      }
   }

   public dta(Optional<hj<dvd>> $$0, hf<cqi> $$1, List<hf<dub>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dta a(List<dsx> $$0, Optional<hj<dvd>> $$1, hf<cqi> $$2) {
      dta $$3 = new dta($$1, $$2, this.j);

      for (dsx $$4 : $$0) {
         $$3.d.add(new dsx($$4.a(), $$4.b().b()));
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

   public cqj a(hf<cqi> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cqj $$1 = this.d().a().d();
         cqj.b $$2 = new cqj.b();
         if (this.i) {
            for (hf<dub> $$3 : this.j) {
               $$2.a(dkd.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cqp.a)) && this.h;
         if ($$4) {
            List<hj<dub>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dkd.b.d.ordinal() && $$6 != dkd.b.e.ordinal() && (!this.i || $$6 != dkd.b.b.ordinal())) {
                  for (hf<dub> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dey> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dey $$11 = $$9.get($$10);
            if (!dkh.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dkd.b.k, pc.a(dnl.ab, new dpt($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<hj<dvd>> c() {
      return this.c;
   }

   public hf<cqi> d() {
      return this.e;
   }

   public List<dsx> e() {
      return this.d;
   }

   public List<dey> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dsx $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(csl.a));
   }

   public static dta a(hg<cqi> $$0, hg<dvd> $$1, hg<dub> $$2) {
      hj<dvd> $$3 = hj.a($$1.b(duq.r), $$1.b(duq.a));
      dta $$4 = new dta(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dsx(1, csl.F));
      $$4.e().add(new dsx(2, csl.j));
      $$4.e().add(new dsx(1, csl.i));
      $$4.g();
      return $$4;
   }

   public static hf<cqi> a(hg<cqi> $$0) {
      return $$0.b(cqp.b);
   }

   public static List<hf<dub>> b(hg<dub> $$0) {
      return List.of($$0.b(oz.g), $$0.b(oz.h));
   }
}
