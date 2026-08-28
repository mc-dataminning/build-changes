import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cyb(float d, cvr e, jn<awd> f, boolean g, List<czf> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cyb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.m.optionalFieldOf("consume_seconds", 1.6F).forGetter(cyb::c),
               cvr.k.optionalFieldOf("animation", cvr.b).forGetter(cyb::d),
               awd.b.optionalFieldOf("sound", awe.ke).forGetter(cyb::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cyb::f),
               czf.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cyb::g)
            )
            .apply($$0, cyb::new)
   );
   public static final zb<wo, cyb> c = zb.a(yz.i, cyb::c, cvr.l, cyb::d, awd.d, cyb::e, yz.b, cyb::f, czf.e.a(yz.a()), cyb::g, cyb::new);

   public brp a(buk $$0, cvp $$1, bro $$2) {
      if (!this.a($$0, $$1)) {
         return brp.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return brp.c;
         } else {
            cvp $$4 = this.a($$0.dS(), $$0, $$1);
            return brp.c.a($$4);
         }
      }
   }

   public cvp a(deg $$0, buk $$1, cvp $$2) {
      azl $$3 = $$1.dV();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof ari $$4) {
         $$4.b(awo.c.b($$2.h()));
         an.A.a($$4, $$2);
      }

      $$2.a(cyc.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.B) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cvr.c ? dzl.l : dzl.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(buk $$0, cvp $$1) {
      cqt $$2 = $$1.a(kr.v);
      return $$2 != null && $$0 instanceof cnu $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azl $$0, buk $$1, cvp $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azd.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cvr.c ? 0.5F : $$4;
      float $$9 = this.e == cvr.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awd $$11 = $$1 instanceof cyb.b $$10 ? $$10.n($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cyb.a b() {
      return new cyb.a();
   }

   public float c() {
      return this.d;
   }

   public cvr d() {
      return this.e;
   }

   public jn<awd> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<czf> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cvr b;
      private jn<awd> c;
      private boolean d;
      private final List<czf> e;

      a() {
         this.b = cvr.b;
         this.c = awe.ke;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cyb.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cyb.a a(cvr $$0) {
         this.b = $$0;
         return this;
      }

      public cyb.a a(jn<awd> $$0) {
         this.c = $$0;
         return this;
      }

      public cyb.a b(jn<awd> $$0) {
         return this.a(new czg($$0));
      }

      public cyb.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cyb.a a(czf $$0) {
         this.e.add($$0);
         return this;
      }

      public cyb a() {
         return new cyb(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awd n(cvp var1);
   }
}
