import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dxr {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dxr> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iv.a(ke.aF).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dxo.a.listOf().fieldOf("layers").forGetter(dxr::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cuw.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ahf.d(cvd.b),
                  ahf.d(qw.g),
                  ahf.d(qw.h)
               )
               .apply($$0, dxr::new)
      )
      .comapFlatMap(dxr::a, Function.identity())
      .stable();
   private final Optional<il<dzu>> c;
   private final List<dxo> d = Lists.newArrayList();
   private final ih<cuw> e;
   private final List<djp> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ih<dys>> j;

   private static DataResult<dxr> a(dxr $$0) {
      int $$1 = $$0.d.stream().mapToInt(dxo::a).sum();
      return $$1 > dmy.c ? DataResult.error(() -> "Sum of layer heights is > " + dmy.c, $$0) : DataResult.success($$0);
   }

   private dxr(Optional<il<dzu>> $$0, List<dxo> $$1, boolean $$2, boolean $$3, Optional<ih<cuw>> $$4, ih.c<cuw> $$5, ih<dys> $$6, ih<dys> $$7) {
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

   private static ih<cuw> a(Optional<? extends ih<cuw>> $$0, ih<cuw> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ih<cuw>)$$0.get();
      }
   }

   public dxr(Optional<il<dzu>> $$0, ih<cuw> $$1, List<ih<dys>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dxr a(List<dxo> $$0, Optional<il<dzu>> $$1, ih<cuw> $$2) {
      dxr $$3 = new dxr($$1, $$2, this.j);

      for (dxo $$4 : $$0) {
         $$3.d.add(new dxo($$4.a(), $$4.b().b()));
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

   public cux a(ih<cuw> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cux $$1 = this.d().a().d();
         cux.b $$2 = new cux.b();
         if (this.i) {
            for (ih<dys> $$3 : this.j) {
               $$2.a(dou.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cvd.a)) && this.h;
         if ($$4) {
            List<il<dys>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dou.b.d.ordinal() && $$6 != dou.b.e.ordinal() && (!this.i || $$6 != dou.b.b.ordinal())) {
                  for (ih<dys> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<djp> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            djp $$11 = $$9.get($$10);
            if (!doy.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dou.b.k, qz.a(dsc.ab, new duk($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<il<dzu>> c() {
      return this.c;
   }

   public ih<cuw> d() {
      return this.e;
   }

   public List<dxo> e() {
      return this.d;
   }

   public List<djp> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dxo $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cxa.a));
   }

   public static dxr a(ii<cuw> $$0, ii<dzu> $$1, ii<dys> $$2) {
      il<dzu> $$3 = il.a($$1.b(dzh.r), $$1.b(dzh.a));
      dxr $$4 = new dxr(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dxo(1, cxa.F));
      $$4.e().add(new dxo(2, cxa.j));
      $$4.e().add(new dxo(1, cxa.i));
      $$4.g();
      return $$4;
   }

   public static ih<cuw> a(ii<cuw> $$0) {
      return $$0.b(cvd.b);
   }

   public static List<ih<dys>> b(ii<dys> $$0) {
      return List.of($$0.b(qw.g), $$0.b(qw.h));
   }
}
