import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dtb {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dtb> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ht.a(jc.aB).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dsy.a.listOf().fieldOf("layers").forGetter(dtb::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cqj.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aep.d(cqq.b),
                  aep.d(oy.g),
                  aep.d(oy.h)
               )
               .apply($$0, dtb::new)
      )
      .comapFlatMap(dtb::a, Function.identity())
      .stable();
   private final Optional<hi<dve>> c;
   private final List<dsy> d = Lists.newArrayList();
   private final he<cqj> e;
   private final List<dez> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<he<duc>> j;

   private static DataResult<dtb> a(dtb $$0) {
      int $$1 = $$0.d.stream().mapToInt(dsy::a).sum();
      return $$1 > dii.c ? DataResult.error(() -> "Sum of layer heights is > " + dii.c, $$0) : DataResult.success($$0);
   }

   private dtb(Optional<hi<dve>> $$0, List<dsy> $$1, boolean $$2, boolean $$3, Optional<he<cqj>> $$4, he.c<cqj> $$5, he<duc> $$6, he<duc> $$7) {
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

   private static he<cqj> a(Optional<? extends he<cqj>> $$0, he<cqj> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (he<cqj>)$$0.get();
      }
   }

   public dtb(Optional<hi<dve>> $$0, he<cqj> $$1, List<he<duc>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dtb a(List<dsy> $$0, Optional<hi<dve>> $$1, he<cqj> $$2) {
      dtb $$3 = new dtb($$1, $$2, this.j);

      for (dsy $$4 : $$0) {
         $$3.d.add(new dsy($$4.a(), $$4.b().b()));
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

   public cqk a(he<cqj> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cqk $$1 = this.d().a().d();
         cqk.b $$2 = new cqk.b();
         if (this.i) {
            for (he<duc> $$3 : this.j) {
               $$2.a(dke.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cqq.a)) && this.h;
         if ($$4) {
            List<hi<duc>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dke.b.d.ordinal() && $$6 != dke.b.e.ordinal() && (!this.i || $$6 != dke.b.b.ordinal())) {
                  for (he<duc> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dez> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dez $$11 = $$9.get($$10);
            if (!dki.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dke.b.k, pb.a(dnm.ab, new dpu($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<hi<dve>> c() {
      return this.c;
   }

   public he<cqj> d() {
      return this.e;
   }

   public List<dsy> e() {
      return this.d;
   }

   public List<dez> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dsy $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(csm.a));
   }

   public static dtb a(hf<cqj> $$0, hf<dve> $$1, hf<duc> $$2) {
      hi<dve> $$3 = hi.a($$1.b(dur.r), $$1.b(dur.a));
      dtb $$4 = new dtb(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dsy(1, csm.F));
      $$4.e().add(new dsy(2, csm.j));
      $$4.e().add(new dsy(1, csm.i));
      $$4.g();
      return $$4;
   }

   public static he<cqj> a(hf<cqj> $$0) {
      return $$0.b(cqq.b);
   }

   public static List<he<duc>> b(hf<duc> $$0) {
      return List.of($$0.b(oy.g), $$0.b(oy.h));
   }
}
