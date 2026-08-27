import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dxc {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dxc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iv.a(ke.aF).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dwz.a.listOf().fieldOf("layers").forGetter(dxc::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cuh.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ahb.d(cuo.b),
                  ahb.d(qt.g),
                  ahb.d(qt.h)
               )
               .apply($$0, dxc::new)
      )
      .comapFlatMap(dxc::a, Function.identity())
      .stable();
   private final Optional<il<dzf>> c;
   private final List<dwz> d = Lists.newArrayList();
   private final ih<cuh> e;
   private final List<dja> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ih<dyd>> j;

   private static DataResult<dxc> a(dxc $$0) {
      int $$1 = $$0.d.stream().mapToInt(dwz::a).sum();
      return $$1 > dmj.c ? DataResult.error(() -> "Sum of layer heights is > " + dmj.c, $$0) : DataResult.success($$0);
   }

   private dxc(Optional<il<dzf>> $$0, List<dwz> $$1, boolean $$2, boolean $$3, Optional<ih<cuh>> $$4, ih.c<cuh> $$5, ih<dyd> $$6, ih<dyd> $$7) {
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

   private static ih<cuh> a(Optional<? extends ih<cuh>> $$0, ih<cuh> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ih<cuh>)$$0.get();
      }
   }

   public dxc(Optional<il<dzf>> $$0, ih<cuh> $$1, List<ih<dyd>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dxc a(List<dwz> $$0, Optional<il<dzf>> $$1, ih<cuh> $$2) {
      dxc $$3 = new dxc($$1, $$2, this.j);

      for (dwz $$4 : $$0) {
         $$3.d.add(new dwz($$4.a(), $$4.b().b()));
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

   public cui a(ih<cuh> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cui $$1 = this.d().a().d();
         cui.b $$2 = new cui.b();
         if (this.i) {
            for (ih<dyd> $$3 : this.j) {
               $$2.a(dof.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cuo.a)) && this.h;
         if ($$4) {
            List<il<dyd>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dof.b.d.ordinal() && $$6 != dof.b.e.ordinal() && (!this.i || $$6 != dof.b.b.ordinal())) {
                  for (ih<dyd> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dja> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dja $$11 = $$9.get($$10);
            if (!doj.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dof.b.k, qw.a(drn.ab, new dtv($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<il<dzf>> c() {
      return this.c;
   }

   public ih<cuh> d() {
      return this.e;
   }

   public List<dwz> e() {
      return this.d;
   }

   public List<dja> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dwz $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cwl.a));
   }

   public static dxc a(ii<cuh> $$0, ii<dzf> $$1, ii<dyd> $$2) {
      il<dzf> $$3 = il.a($$1.b(dys.r), $$1.b(dys.a));
      dxc $$4 = new dxc(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dwz(1, cwl.F));
      $$4.e().add(new dwz(2, cwl.j));
      $$4.e().add(new dwz(1, cwl.i));
      $$4.g();
      return $$4;
   }

   public static ih<cuh> a(ii<cuh> $$0) {
      return $$0.b(cuo.b);
   }

   public static List<ih<dyd>> b(ii<dyd> $$0) {
      return List.of($$0.b(qt.g), $$0.b(qt.h));
   }
}
