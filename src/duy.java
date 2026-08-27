import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class duy {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<duy> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iq.a(jz.aD).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  duv.a.listOf().fieldOf("layers").forGetter(duy::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  csq.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  age.d(csx.b),
                  age.d(qg.g),
                  age.d(qg.h)
               )
               .apply($$0, duy::new)
      )
      .comapFlatMap(duy::a, Function.identity())
      .stable();
   private final Optional<ig<dxb>> c;
   private final List<duv> d = Lists.newArrayList();
   private final ib<csq> e;
   private final List<dgw> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ib<dvz>> j;

   private static DataResult<duy> a(duy $$0) {
      int $$1 = $$0.d.stream().mapToInt(duv::a).sum();
      return $$1 > dkf.c ? DataResult.error(() -> "Sum of layer heights is > " + dkf.c, $$0) : DataResult.success($$0);
   }

   private duy(Optional<ig<dxb>> $$0, List<duv> $$1, boolean $$2, boolean $$3, Optional<ib<csq>> $$4, ib.c<csq> $$5, ib<dvz> $$6, ib<dvz> $$7) {
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

   private static ib<csq> a(Optional<? extends ib<csq>> $$0, ib<csq> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ib<csq>)$$0.get();
      }
   }

   public duy(Optional<ig<dxb>> $$0, ib<csq> $$1, List<ib<dvz>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public duy a(List<duv> $$0, Optional<ig<dxb>> $$1, ib<csq> $$2) {
      duy $$3 = new duy($$1, $$2, this.j);

      for (duv $$4 : $$0) {
         $$3.d.add(new duv($$4.a(), $$4.b().b()));
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

   public csr a(ib<csq> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         csr $$1 = this.d().a().d();
         csr.b $$2 = new csr.b();
         if (this.i) {
            for (ib<dvz> $$3 : this.j) {
               $$2.a(dmb.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(csx.a)) && this.h;
         if ($$4) {
            List<ig<dvz>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dmb.b.d.ordinal() && $$6 != dmb.b.e.ordinal() && (!this.i || $$6 != dmb.b.b.ordinal())) {
                  for (ib<dvz> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dgw> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dgw $$11 = $$9.get($$10);
            if (!dmf.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dmb.b.k, qj.a(dpj.ab, new drr($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ig<dxb>> c() {
      return this.c;
   }

   public ib<csq> d() {
      return this.e;
   }

   public List<duv> e() {
      return this.d;
   }

   public List<dgw> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (duv $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cuv.a));
   }

   public static duy a(ic<csq> $$0, ic<dxb> $$1, ic<dvz> $$2) {
      ig<dxb> $$3 = ig.a($$1.b(dwo.r), $$1.b(dwo.a));
      duy $$4 = new duy(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new duv(1, cuv.F));
      $$4.e().add(new duv(2, cuv.j));
      $$4.e().add(new duv(1, cuv.i));
      $$4.g();
      return $$4;
   }

   public static ib<csq> a(ic<csq> $$0) {
      return $$0.b(csx.b);
   }

   public static List<ib<dvz>> b(ic<dvz> $$0) {
      return List.of($$0.b(qg.g), $$0.b(qg.h));
   }
}
