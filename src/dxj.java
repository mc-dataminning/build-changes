import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dxj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dxj> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iv.a(ke.aF).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dxg.a.listOf().fieldOf("layers").forGetter(dxj::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cuo.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ahe.d(cuv.b),
                  ahe.d(qv.g),
                  ahe.d(qv.h)
               )
               .apply($$0, dxj::new)
      )
      .comapFlatMap(dxj::a, Function.identity())
      .stable();
   private final Optional<il<dzm>> c;
   private final List<dxg> d = Lists.newArrayList();
   private final ih<cuo> e;
   private final List<djh> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ih<dyk>> j;

   private static DataResult<dxj> a(dxj $$0) {
      int $$1 = $$0.d.stream().mapToInt(dxg::a).sum();
      return $$1 > dmq.c ? DataResult.error(() -> "Sum of layer heights is > " + dmq.c, $$0) : DataResult.success($$0);
   }

   private dxj(Optional<il<dzm>> $$0, List<dxg> $$1, boolean $$2, boolean $$3, Optional<ih<cuo>> $$4, ih.c<cuo> $$5, ih<dyk> $$6, ih<dyk> $$7) {
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

   private static ih<cuo> a(Optional<? extends ih<cuo>> $$0, ih<cuo> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ih<cuo>)$$0.get();
      }
   }

   public dxj(Optional<il<dzm>> $$0, ih<cuo> $$1, List<ih<dyk>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dxj a(List<dxg> $$0, Optional<il<dzm>> $$1, ih<cuo> $$2) {
      dxj $$3 = new dxj($$1, $$2, this.j);

      for (dxg $$4 : $$0) {
         $$3.d.add(new dxg($$4.a(), $$4.b().b()));
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

   public cup a(ih<cuo> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cup $$1 = this.d().a().d();
         cup.b $$2 = new cup.b();
         if (this.i) {
            for (ih<dyk> $$3 : this.j) {
               $$2.a(dom.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cuv.a)) && this.h;
         if ($$4) {
            List<il<dyk>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dom.b.d.ordinal() && $$6 != dom.b.e.ordinal() && (!this.i || $$6 != dom.b.b.ordinal())) {
                  for (ih<dyk> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<djh> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            djh $$11 = $$9.get($$10);
            if (!doq.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dom.b.k, qy.a(dru.ab, new duc($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<il<dzm>> c() {
      return this.c;
   }

   public ih<cuo> d() {
      return this.e;
   }

   public List<dxg> e() {
      return this.d;
   }

   public List<djh> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dxg $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cws.a));
   }

   public static dxj a(ii<cuo> $$0, ii<dzm> $$1, ii<dyk> $$2) {
      il<dzm> $$3 = il.a($$1.b(dyz.r), $$1.b(dyz.a));
      dxj $$4 = new dxj(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dxg(1, cws.F));
      $$4.e().add(new dxg(2, cws.j));
      $$4.e().add(new dxg(1, cws.i));
      $$4.g();
      return $$4;
   }

   public static ih<cuo> a(ii<cuo> $$0) {
      return $$0.b(cuv.b);
   }

   public static List<ih<dyk>> b(ii<dyk> $$0) {
      return List.of($$0.b(qv.g), $$0.b(qv.h));
   }
}
