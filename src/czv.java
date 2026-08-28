import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record czv(float d, cxr e, jq<axe> f, boolean g, List<dbb> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<czv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(czv::c),
               cxr.k.optionalFieldOf("animation", cxr.b).forGetter(czv::d),
               axe.b.optionalFieldOf("sound", axf.kx).forGetter(czv::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(czv::f),
               dbb.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(czv::g)
            )
            .apply($$0, czv::new)
   );
   public static final zt<xg, czv> c = zt.a(zr.l, czv::c, cxr.l, czv::d, axe.d, czv::e, zr.b, czv::f, dbb.e.a(zr.a()), czv::g, czv::new);

   public btj a(bwg $$0, cxp $$1, bti $$2) {
      if (!this.a($$0, $$1)) {
         return btj.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return btj.c;
         } else {
            cxp $$4 = this.a($$0.dW(), $$0, $$1);
            return btj.c.a($$4);
         }
      }
   }

   public cxp a(dhi $$0, bwg $$1, cxp $$2) {
      bam $$3 = $$1.dZ();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof asi $$4) {
         $$4.b(axp.c.b($$2.h()));
         ao.A.a($$4, $$2);
      }

      $$2.a(czw.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cxr.c ? ecr.l : ecr.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bwg $$0, cxp $$1) {
      csz $$2 = $$1.a(ku.w);
      return $$2 != null && $$0 instanceof cpx $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(bam $$0, bwg $$1, cxp $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = bae.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cxr.c ? 0.5F : $$4;
      float $$9 = this.e == cxr.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      axe $$11 = $$1 instanceof czv.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static czv.a b() {
      return new czv.a();
   }

   public float c() {
      return this.d;
   }

   public cxr d() {
      return this.e;
   }

   public jq<axe> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dbb> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cxr b;
      private jq<axe> c;
      private boolean d;
      private final List<dbb> e;

      a() {
         this.b = cxr.b;
         this.c = axf.kx;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public czv.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public czv.a a(cxr $$0) {
         this.b = $$0;
         return this;
      }

      public czv.a a(jq<axe> $$0) {
         this.c = $$0;
         return this;
      }

      public czv.a b(jq<axe> $$0) {
         return this.a(new dbc($$0));
      }

      public czv.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public czv.a a(dbb $$0) {
         this.e.add($$0);
         return this;
      }

      public czv a() {
         return new czv(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      axe j(cxp var1);
   }
}
