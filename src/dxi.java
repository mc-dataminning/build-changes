import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dxi {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dxi> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iv.a(ke.aF).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dxf.a.listOf().fieldOf("layers").forGetter(dxi::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cun.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ahe.d(cuu.b),
                  ahe.d(qv.g),
                  ahe.d(qv.h)
               )
               .apply($$0, dxi::new)
      )
      .comapFlatMap(dxi::a, Function.identity())
      .stable();
   private final Optional<il<dzl>> c;
   private final List<dxf> d = Lists.newArrayList();
   private final ih<cun> e;
   private final List<djg> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ih<dyj>> j;

   private static DataResult<dxi> a(dxi $$0) {
      int $$1 = $$0.d.stream().mapToInt(dxf::a).sum();
      return $$1 > dmp.c ? DataResult.error(() -> "Sum of layer heights is > " + dmp.c, $$0) : DataResult.success($$0);
   }

   private dxi(Optional<il<dzl>> $$0, List<dxf> $$1, boolean $$2, boolean $$3, Optional<ih<cun>> $$4, ih.c<cun> $$5, ih<dyj> $$6, ih<dyj> $$7) {
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

   private static ih<cun> a(Optional<? extends ih<cun>> $$0, ih<cun> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ih<cun>)$$0.get();
      }
   }

   public dxi(Optional<il<dzl>> $$0, ih<cun> $$1, List<ih<dyj>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dxi a(List<dxf> $$0, Optional<il<dzl>> $$1, ih<cun> $$2) {
      dxi $$3 = new dxi($$1, $$2, this.j);

      for (dxf $$4 : $$0) {
         $$3.d.add(new dxf($$4.a(), $$4.b().b()));
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

   public cuo a(ih<cun> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cuo $$1 = this.d().a().d();
         cuo.b $$2 = new cuo.b();
         if (this.i) {
            for (ih<dyj> $$3 : this.j) {
               $$2.a(dol.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cuu.a)) && this.h;
         if ($$4) {
            List<il<dyj>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dol.b.d.ordinal() && $$6 != dol.b.e.ordinal() && (!this.i || $$6 != dol.b.b.ordinal())) {
                  for (ih<dyj> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<djg> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            djg $$11 = $$9.get($$10);
            if (!dop.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dol.b.k, qy.a(drt.ab, new dub($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<il<dzl>> c() {
      return this.c;
   }

   public ih<cun> d() {
      return this.e;
   }

   public List<dxf> e() {
      return this.d;
   }

   public List<djg> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dxf $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cwr.a));
   }

   public static dxi a(ii<cun> $$0, ii<dzl> $$1, ii<dyj> $$2) {
      il<dzl> $$3 = il.a($$1.b(dyy.r), $$1.b(dyy.a));
      dxi $$4 = new dxi(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dxf(1, cwr.F));
      $$4.e().add(new dxf(2, cwr.j));
      $$4.e().add(new dxf(1, cwr.i));
      $$4.g();
      return $$4;
   }

   public static ih<cun> a(ii<cun> $$0) {
      return $$0.b(cuu.b);
   }

   public static List<ih<dyj>> b(ii<dyj> $$0) {
      return List.of($$0.b(qv.g), $$0.b(qv.h));
   }
}
