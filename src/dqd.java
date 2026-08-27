import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dqd {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dqd> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ht.a(jc.aB).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dqa.a.listOf().fieldOf("layers").forGetter(dqd::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cnk.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aco.d(cnr.b),
                  aco.d(oy.g),
                  aco.d(oy.h)
               )
               .apply($$0, dqd::new)
      )
      .comapFlatMap(dqd::a, Function.identity())
      .stable();
   private final Optional<hi<dsg>> c;
   private final List<dqa> d = Lists.newArrayList();
   private final he<cnk> e;
   private final List<dcb> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<he<dre>> j;

   private static DataResult<dqd> a(dqd $$0) {
      int $$1 = $$0.d.stream().mapToInt(dqa::a).sum();
      return $$1 > dfk.c ? DataResult.error(() -> "Sum of layer heights is > " + dfk.c, $$0) : DataResult.success($$0);
   }

   private dqd(Optional<hi<dsg>> $$0, List<dqa> $$1, boolean $$2, boolean $$3, Optional<he<cnk>> $$4, he.c<cnk> $$5, he<dre> $$6, he<dre> $$7) {
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

   private static he<cnk> a(Optional<? extends he<cnk>> $$0, he<cnk> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (he<cnk>)$$0.get();
      }
   }

   public dqd(Optional<hi<dsg>> $$0, he<cnk> $$1, List<he<dre>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dqd a(List<dqa> $$0, Optional<hi<dsg>> $$1, he<cnk> $$2) {
      dqd $$3 = new dqd($$1, $$2, this.j);

      for (dqa $$4 : $$0) {
         $$3.d.add(new dqa($$4.a(), $$4.b().b()));
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

   public cnl a(he<cnk> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cnl $$1 = this.d().a().d();
         cnl.b $$2 = new cnl.b();
         if (this.i) {
            for (he<dre> $$3 : this.j) {
               $$2.a(dhg.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cnr.a)) && this.h;
         if ($$4) {
            List<hi<dre>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dhg.b.d.ordinal() && $$6 != dhg.b.e.ordinal() && (!this.i || $$6 != dhg.b.b.ordinal())) {
                  for (he<dre> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dcb> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dcb $$11 = $$9.get($$10);
            if (!dhk.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dhg.b.k, pb.a(dko.ab, new dmw($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<hi<dsg>> c() {
      return this.c;
   }

   public he<cnk> d() {
      return this.e;
   }

   public List<dqa> e() {
      return this.d;
   }

   public List<dcb> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dqa $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cpo.a));
   }

   public static dqd a(hf<cnk> $$0, hf<dsg> $$1, hf<dre> $$2) {
      hi<dsg> $$3 = hi.a($$1.b(drt.r), $$1.b(drt.a));
      dqd $$4 = new dqd(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dqa(1, cpo.F));
      $$4.e().add(new dqa(2, cpo.j));
      $$4.e().add(new dqa(1, cpo.i));
      $$4.g();
      return $$4;
   }

   public static he<cnk> a(hf<cnk> $$0) {
      return $$0.b(cnr.b);
   }

   public static List<he<dre>> b(hf<dre> $$0) {
      return List.of($$0.b(oy.g), $$0.b(oy.h));
   }
}
