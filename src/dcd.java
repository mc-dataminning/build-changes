import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dcd(float d, daa e, jf<awo> f, boolean g, List<ddm> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dcd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(dcd::c),
               daa.l.optionalFieldOf("animation", daa.b).forGetter(dcd::d),
               awo.b.optionalFieldOf("sound", awp.kH).forGetter(dcd::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dcd::f),
               ddm.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dcd::g)
            )
            .apply($$0, dcd::new)
   );
   public static final yy<wl, dcd> c = yy.a(yw.l, dcd::c, daa.m, dcd::d, awo.d, dcd::e, yw.b, dcd::f, ddm.e.a(yw.a()), dcd::g, dcd::new);

   public bur a(bxu $$0, czy $$1, buq $$2) {
      if (!this.a($$0, $$1)) {
         return bur.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bur.c;
         } else {
            czy $$4 = this.a($$0.dV(), $$0, $$1);
            return bur.c.a($$4);
         }
      }
   }

   public czy a(djx $$0, bxu $$1, czy $$2) {
      azx $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof art $$4) {
         $$4.b(awz.c.b($$2.h()));
         aq.A.a($$4, $$2);
      }

      $$2.a(dce.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == daa.c ? ege.l : ege.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bxu $$0, czy $$1) {
      cvn $$2 = $$1.a(kk.v);
      return $$2 != null && $$0 instanceof crx $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azx $$0, bxu $$1, czy $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azo.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == daa.c ? 0.5F : $$4;
      float $$9 = this.e == daa.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awo $$11 = $$1 instanceof dcd.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dcd.a b() {
      return new dcd.a();
   }

   public float c() {
      return this.d;
   }

   public daa d() {
      return this.e;
   }

   public jf<awo> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<ddm> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private daa b;
      private jf<awo> c;
      private boolean d;
      private final List<ddm> e;

      a() {
         this.b = daa.b;
         this.c = awp.kH;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dcd.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dcd.a a(daa $$0) {
         this.b = $$0;
         return this;
      }

      public dcd.a a(jf<awo> $$0) {
         this.c = $$0;
         return this;
      }

      public dcd.a b(jf<awo> $$0) {
         return this.a(new ddn($$0));
      }

      public dcd.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dcd.a a(ddm $$0) {
         this.e.add($$0);
         return this;
      }

      public dcd a() {
         return new dcd(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awo j(czy var1);
   }
}
