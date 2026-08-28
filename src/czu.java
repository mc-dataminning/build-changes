import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record czu(float d, cxq e, jq<axe> f, boolean g, List<dba> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<czu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(czu::c),
               cxq.k.optionalFieldOf("animation", cxq.b).forGetter(czu::d),
               axe.b.optionalFieldOf("sound", axf.kx).forGetter(czu::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(czu::f),
               dba.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(czu::g)
            )
            .apply($$0, czu::new)
   );
   public static final zt<xg, czu> c = zt.a(zr.l, czu::c, cxq.l, czu::d, axe.d, czu::e, zr.b, czu::f, dba.e.a(zr.a()), czu::g, czu::new);

   public bti a(bwf $$0, cxo $$1, bth $$2) {
      if (!this.a($$0, $$1)) {
         return bti.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bti.c;
         } else {
            cxo $$4 = this.a($$0.dV(), $$0, $$1);
            return bti.c.a($$4);
         }
      }
   }

   public cxo a(dhh $$0, bwf $$1, cxo $$2) {
      bam $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof asi $$4) {
         $$4.b(axp.c.b($$2.h()));
         ao.A.a($$4, $$2);
      }

      $$2.a(czv.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cxq.c ? ecq.l : ecq.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bwf $$0, cxo $$1) {
      csy $$2 = $$1.a(ku.w);
      return $$2 != null && $$0 instanceof cpw $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(bam $$0, bwf $$1, cxo $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = bae.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cxq.c ? 0.5F : $$4;
      float $$9 = this.e == cxq.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      axe $$11 = $$1 instanceof czu.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static czu.a b() {
      return new czu.a();
   }

   public float c() {
      return this.d;
   }

   public cxq d() {
      return this.e;
   }

   public jq<axe> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dba> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cxq b;
      private jq<axe> c;
      private boolean d;
      private final List<dba> e;

      a() {
         this.b = cxq.b;
         this.c = axf.kx;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public czu.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public czu.a a(cxq $$0) {
         this.b = $$0;
         return this;
      }

      public czu.a a(jq<axe> $$0) {
         this.c = $$0;
         return this;
      }

      public czu.a b(jq<axe> $$0) {
         return this.a(new dbb($$0));
      }

      public czu.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public czu.a a(dba $$0) {
         this.e.add($$0);
         return this;
      }

      public czu a() {
         return new czu(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      axe j(cxo var1);
   }
}
