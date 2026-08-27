import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dvk {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dvk> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iq.a(jz.aD).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dvh.a.listOf().fieldOf("layers").forGetter(dvk::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  csy.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  agg.d(ctf.b),
                  agg.d(qh.g),
                  agg.d(qh.h)
               )
               .apply($$0, dvk::new)
      )
      .comapFlatMap(dvk::a, Function.identity())
      .stable();
   private final Optional<ig<dxn>> c;
   private final List<dvh> d = Lists.newArrayList();
   private final ib<csy> e;
   private final List<dhi> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ib<dwl>> j;

   private static DataResult<dvk> a(dvk $$0) {
      int $$1 = $$0.d.stream().mapToInt(dvh::a).sum();
      return $$1 > dkr.c ? DataResult.error(() -> "Sum of layer heights is > " + dkr.c, $$0) : DataResult.success($$0);
   }

   private dvk(Optional<ig<dxn>> $$0, List<dvh> $$1, boolean $$2, boolean $$3, Optional<ib<csy>> $$4, ib.c<csy> $$5, ib<dwl> $$6, ib<dwl> $$7) {
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

   private static ib<csy> a(Optional<? extends ib<csy>> $$0, ib<csy> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ib<csy>)$$0.get();
      }
   }

   public dvk(Optional<ig<dxn>> $$0, ib<csy> $$1, List<ib<dwl>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dvk a(List<dvh> $$0, Optional<ig<dxn>> $$1, ib<csy> $$2) {
      dvk $$3 = new dvk($$1, $$2, this.j);

      for (dvh $$4 : $$0) {
         $$3.d.add(new dvh($$4.a(), $$4.b().b()));
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

   public csz a(ib<csy> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         csz $$1 = this.d().a().d();
         csz.b $$2 = new csz.b();
         if (this.i) {
            for (ib<dwl> $$3 : this.j) {
               $$2.a(dmn.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ctf.a)) && this.h;
         if ($$4) {
            List<ig<dwl>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dmn.b.d.ordinal() && $$6 != dmn.b.e.ordinal() && (!this.i || $$6 != dmn.b.b.ordinal())) {
                  for (ib<dwl> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dhi> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dhi $$11 = $$9.get($$10);
            if (!dmr.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dmn.b.k, qk.a(dpv.ab, new dsd($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ig<dxn>> c() {
      return this.c;
   }

   public ib<csy> d() {
      return this.e;
   }

   public List<dvh> e() {
      return this.d;
   }

   public List<dhi> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dvh $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cvc.a));
   }

   public static dvk a(ic<csy> $$0, ic<dxn> $$1, ic<dwl> $$2) {
      ig<dxn> $$3 = ig.a($$1.b(dxa.r), $$1.b(dxa.a));
      dvk $$4 = new dvk(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dvh(1, cvc.F));
      $$4.e().add(new dvh(2, cvc.j));
      $$4.e().add(new dvh(1, cvc.i));
      $$4.g();
      return $$4;
   }

   public static ib<csy> a(ic<csy> $$0) {
      return $$0.b(ctf.b);
   }

   public static List<ib<dwl>> b(ic<dwl> $$0) {
      return List.of($$0.b(qh.g), $$0.b(qh.h));
   }
}
