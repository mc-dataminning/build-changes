import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eaj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eaj> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iz.a(ki.aG).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eag.a.listOf().fieldOf("layers").forGetter(eaj::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cxd.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aja.d(cxk.b),
                  aja.d(ra.g),
                  aja.d(ra.h)
               )
               .apply($$0, eaj::new)
      )
      .comapFlatMap(eaj::a, Function.identity())
      .stable();
   private final Optional<ip<ecm>> c;
   private final List<eag> d = Lists.newArrayList();
   private final il<cxd> e;
   private final List<dme> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<il<ebk>> j;

   private static DataResult<eaj> a(eaj $$0) {
      int $$1 = $$0.d.stream().mapToInt(eag::a).sum();
      return $$1 > dpq.c ? DataResult.error(() -> "Sum of layer heights is > " + dpq.c, $$0) : DataResult.success($$0);
   }

   private eaj(Optional<ip<ecm>> $$0, List<eag> $$1, boolean $$2, boolean $$3, Optional<il<cxd>> $$4, il.c<cxd> $$5, il<ebk> $$6, il<ebk> $$7) {
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

   private static il<cxd> a(Optional<? extends il<cxd>> $$0, il<cxd> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (il<cxd>)$$0.get();
      }
   }

   public eaj(Optional<ip<ecm>> $$0, il<cxd> $$1, List<il<ebk>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eaj a(List<eag> $$0, Optional<ip<ecm>> $$1, il<cxd> $$2) {
      eaj $$3 = new eaj($$1, $$2, this.j);

      for (eag $$4 : $$0) {
         $$3.d.add(new eag($$4.a(), $$4.b().b()));
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

   public cxe a(il<cxd> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cxe $$1 = this.d().a().d();
         cxe.b $$2 = new cxe.b();
         if (this.i) {
            for (il<ebk> $$3 : this.j) {
               $$2.a(drm.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cxk.a)) && this.h;
         if ($$4) {
            List<ip<ebk>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != drm.b.d.ordinal() && $$6 != drm.b.e.ordinal() && (!this.i || $$6 != drm.b.b.ordinal())) {
                  for (il<ebk> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dme> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dme $$11 = $$9.get($$10);
            if (!drq.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(drm.b.k, rd.a(duu.ab, new dxc($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ip<ecm>> c() {
      return this.c;
   }

   public il<cxd> d() {
      return this.e;
   }

   public List<eag> e() {
      return this.d;
   }

   public List<dme> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eag $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(czh.a));
   }

   public static eaj a(im<cxd> $$0, im<ecm> $$1, im<ebk> $$2) {
      ip<ecm> $$3 = ip.a($$1.b(ebz.r), $$1.b(ebz.a));
      eaj $$4 = new eaj(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eag(1, czh.F));
      $$4.e().add(new eag(2, czh.j));
      $$4.e().add(new eag(1, czh.i));
      $$4.g();
      return $$4;
   }

   public static il<cxd> a(im<cxd> $$0) {
      return $$0.b(cxk.b);
   }

   public static List<il<ebk>> b(im<ebk> $$0) {
      return List.of($$0.b(ra.g), $$0.b(ra.h));
   }
}
