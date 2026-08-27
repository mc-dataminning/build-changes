import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ebf {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ebf> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ja.a(kj.aG).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ebc.a.listOf().fieldOf("layers").forGetter(ebf::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cxy.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ajf.d(cyf.b),
                  ajf.d(rc.g),
                  ajf.d(rc.h)
               )
               .apply($$0, ebf::new)
      )
      .comapFlatMap(ebf::a, Function.identity())
      .stable();
   private final Optional<ip<edi>> c;
   private final List<ebc> d = Lists.newArrayList();
   private final il<cxy> e;
   private final List<dmz> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<il<ecg>> j;

   private static DataResult<ebf> a(ebf $$0) {
      int $$1 = $$0.d.stream().mapToInt(ebc::a).sum();
      return $$1 > dqm.c ? DataResult.error(() -> "Sum of layer heights is > " + dqm.c, $$0) : DataResult.success($$0);
   }

   private ebf(Optional<ip<edi>> $$0, List<ebc> $$1, boolean $$2, boolean $$3, Optional<il<cxy>> $$4, il.c<cxy> $$5, il<ecg> $$6, il<ecg> $$7) {
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

   private static il<cxy> a(Optional<? extends il<cxy>> $$0, il<cxy> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (il<cxy>)$$0.get();
      }
   }

   public ebf(Optional<ip<edi>> $$0, il<cxy> $$1, List<il<ecg>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ebf a(List<ebc> $$0, Optional<ip<edi>> $$1, il<cxy> $$2) {
      ebf $$3 = new ebf($$1, $$2, this.j);

      for (ebc $$4 : $$0) {
         $$3.d.add(new ebc($$4.a(), $$4.b().b()));
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

   public cxz a(il<cxy> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cxz $$1 = this.d().a().d();
         cxz.b $$2 = new cxz.b();
         if (this.i) {
            for (il<ecg> $$3 : this.j) {
               $$2.a(dsi.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cyf.a)) && this.h;
         if ($$4) {
            List<ip<ecg>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dsi.b.d.ordinal() && $$6 != dsi.b.e.ordinal() && (!this.i || $$6 != dsi.b.b.ordinal())) {
                  for (il<ecg> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dmz> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dmz $$11 = $$9.get($$10);
            if (!dsm.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dsi.b.k, rf.a(dvq.ab, new dxy($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ip<edi>> c() {
      return this.c;
   }

   public il<cxy> d() {
      return this.e;
   }

   public List<ebc> e() {
      return this.d;
   }

   public List<dmz> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ebc $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dac.a));
   }

   public static ebf a(im<cxy> $$0, im<edi> $$1, im<ecg> $$2) {
      ip<edi> $$3 = ip.a($$1.b(ecv.r), $$1.b(ecv.a));
      ebf $$4 = new ebf(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ebc(1, dac.F));
      $$4.e().add(new ebc(2, dac.j));
      $$4.e().add(new ebc(1, dac.i));
      $$4.g();
      return $$4;
   }

   public static il<cxy> a(im<cxy> $$0) {
      return $$0.b(cyf.b);
   }

   public static List<il<ecg>> b(im<ecg> $$0) {
      return List.of($$0.b(rc.g), $$0.b(rc.h));
   }
}
