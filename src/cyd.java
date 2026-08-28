import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cyd(float d, cvz e, jp<awj> f, boolean g, List<czh> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cyd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(cyd::c),
               cvz.k.optionalFieldOf("animation", cvz.b).forGetter(cyd::d),
               awj.b.optionalFieldOf("sound", awk.ke).forGetter(cyd::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cyd::f),
               czh.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cyd::g)
            )
            .apply($$0, cyd::new)
   );
   public static final zf<ws, cyd> c = zf.a(zd.j, cyd::c, cvz.l, cyd::d, awj.d, cyd::e, zd.b, cyd::f, czh.e.a(zd.a()), cyd::g, cyd::new);

   public bry a(buv $$0, cvx $$1, brx $$2) {
      if (!this.a($$0, $$1)) {
         return bry.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bry.c;
         } else {
            cvx $$4 = this.a($$0.dX(), $$0, $$1);
            return bry.c.a($$4);
         }
      }
   }

   public cvx a(dev $$0, buv $$1, cvx $$2) {
      azr $$3 = $$1.ea();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof arn $$4) {
         $$4.b(awu.c.b($$2.h()));
         an.A.a($$4, $$2);
      }

      $$2.a(cye.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cvz.c ? eaa.l : eaa.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(buv $$0, cvx $$1) {
      crg $$2 = $$1.a(kt.w);
      return $$2 != null && $$0 instanceof coh $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azr $$0, buv $$1, cvx $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azj.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cvz.c ? 0.5F : $$4;
      float $$9 = this.e == cvz.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awj $$11 = $$1 instanceof cyd.b $$10 ? $$10.l($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cyd.a b() {
      return new cyd.a();
   }

   public float c() {
      return this.d;
   }

   public cvz d() {
      return this.e;
   }

   public jp<awj> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<czh> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cvz b;
      private jp<awj> c;
      private boolean d;
      private final List<czh> e;

      a() {
         this.b = cvz.b;
         this.c = awk.ke;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cyd.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cyd.a a(cvz $$0) {
         this.b = $$0;
         return this;
      }

      public cyd.a a(jp<awj> $$0) {
         this.c = $$0;
         return this;
      }

      public cyd.a b(jp<awj> $$0) {
         return this.a(new czi($$0));
      }

      public cyd.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cyd.a a(czh $$0) {
         this.e.add($$0);
         return this;
      }

      public cyd a() {
         return new cyd(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awj l(cvx var1);
   }
}
