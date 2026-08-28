import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dcp(float d, dam e, jg<awx> f, boolean g, List<ddy> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dcp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(dcp::c),
               dam.l.optionalFieldOf("animation", dam.b).forGetter(dcp::d),
               awx.b.optionalFieldOf("sound", awy.kH).forGetter(dcp::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dcp::f),
               ddy.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dcp::g)
            )
            .apply($$0, dcp::new)
   );
   public static final ze<wp, dcp> c = ze.a(zc.l, dcp::c, dam.m, dcp::d, awx.d, dcp::e, zc.b, dcp::f, ddy.e.a(zc.a()), dcp::g, dcp::new);

   public bvc a(byf $$0, dak $$1, bvb $$2) {
      if (!this.a($$0, $$1)) {
         return bvc.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bvc.c;
         } else {
            dak $$4 = this.a($$0.dV(), $$0, $$1);
            return bvc.c.a($$4);
         }
      }
   }

   public dak a(dkj $$0, byf $$1, dak $$2) {
      bai $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof asc $$4) {
         $$4.b(axi.c.b($$2.h()));
         aq.A.a($$4, $$2);
      }

      $$2.a(dcq.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == dam.c ? egq.l : egq.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(byf $$0, dak $$1) {
      cvy $$2 = $$1.a(kl.v);
      return $$2 != null && $$0 instanceof csi $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(bai $$0, byf $$1, dak $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azz.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == dam.c ? 0.5F : $$4;
      float $$9 = this.e == dam.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awx $$11 = $$1 instanceof dcp.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dcp.a b() {
      return new dcp.a();
   }

   public float c() {
      return this.d;
   }

   public dam d() {
      return this.e;
   }

   public jg<awx> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<ddy> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private dam b;
      private jg<awx> c;
      private boolean d;
      private final List<ddy> e;

      a() {
         this.b = dam.b;
         this.c = awy.kH;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dcp.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dcp.a a(dam $$0) {
         this.b = $$0;
         return this;
      }

      public dcp.a a(jg<awx> $$0) {
         this.c = $$0;
         return this;
      }

      public dcp.a b(jg<awx> $$0) {
         return this.a(new ddz($$0));
      }

      public dcp.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dcp.a a(ddy $$0) {
         this.e.add($$0);
         return this;
      }

      public dcp a() {
         return new dcp(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awx j(dak var1);
   }
}
