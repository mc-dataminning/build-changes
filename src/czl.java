import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record czl(float d, cxj e, jr<avz> f, boolean g, List<das> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<czl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(czl::c),
               cxj.l.optionalFieldOf("animation", cxj.b).forGetter(czl::d),
               avz.b.optionalFieldOf("sound", awa.kD).forGetter(czl::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(czl::f),
               das.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(czl::g)
            )
            .apply($$0, czl::new)
   );
   public static final yn<wa, czl> c = yn.a(yl.l, czl::c, cxj.m, czl::d, avz.d, czl::e, yl.b, czl::f, das.e.a(yl.a()), czl::g, czl::new);

   public bsy a(bvy $$0, cxh $$1, bsx $$2) {
      if (!this.a($$0, $$1)) {
         return bsy.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bsy.c;
         } else {
            cxh $$4 = this.a($$0.dU(), $$0, $$1);
            return bsy.c.a($$4);
         }
      }
   }

   public cxh a(dgz $$0, bvy $$1, cxh $$2) {
      azh $$3 = $$1.dX();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof are $$4) {
         $$4.b(awk.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(czm.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cxj.c ? ecp.l : ecp.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bvy $$0, cxh $$1) {
      cst $$2 = $$1.a(kv.w);
      return $$2 != null && $$0 instanceof cpr $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azh $$0, bvy $$1, cxh $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = ayz.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cxj.c ? 0.5F : $$4;
      float $$9 = this.e == cxj.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      avz $$11 = $$1 instanceof czl.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static czl.a b() {
      return new czl.a();
   }

   public float c() {
      return this.d;
   }

   public cxj d() {
      return this.e;
   }

   public jr<avz> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<das> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cxj b;
      private jr<avz> c;
      private boolean d;
      private final List<das> e;

      a() {
         this.b = cxj.b;
         this.c = awa.kD;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public czl.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public czl.a a(cxj $$0) {
         this.b = $$0;
         return this;
      }

      public czl.a a(jr<avz> $$0) {
         this.c = $$0;
         return this;
      }

      public czl.a b(jr<avz> $$0) {
         return this.a(new dat($$0));
      }

      public czl.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public czl.a a(das $$0) {
         this.e.add($$0);
         return this;
      }

      public czl a() {
         return new czl(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      avz j(cxh var1);
   }
}
