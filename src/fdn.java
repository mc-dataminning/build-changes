import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fdn extends fik {
   private static final akr u = akr.b("widget/slot_frame");
   private static final akr v = akr.b("icon/checkmark");
   public static final akr a = akr.b("textures/gui/realms/empty_frame.png");
   public static final akr b = akr.b("textures/gui/title/background/panorama_0.png");
   public static final akr c = akr.b("textures/gui/title/background/panorama_2.png");
   public static final akr d = akr.b("textures/gui/title/background/panorama_3.png");
   private static final wz w = wz.c("mco.configure.world.slot.tooltip.active");
   private static final wz x = wz.c("mco.configure.world.slot.tooltip.minigame");
   private static final wz y = wz.c("mco.configure.world.slot.tooltip");
   static final wz z = wz.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private fdn.b B;

   public fdn(int $$0, int $$1, int $$2, int $$3, int $$4, fik.c $$5) {
      super($$0, $$1, $$2, $$3, wy.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public fdn.b a() {
      return this.B;
   }

   public void a(fcn $$0) {
      this.B = new fdn.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(fdn.b $$0, @Nullable String $$1) {
      wz $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fjv.a($$2));
      }

      xn $$3 = wz.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(wy.v).f($$1);
      }

      this.b($$3);
   }

   static fdn.a a(fcn $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fcn.c.c) {
         return fdn.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fdn.a.a : fdn.a.b;
      }
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         akr $$7;
         if (this.B.b) {
            $$7 = ffa.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = ffa.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.A == 1) {
            $$7 = b;
         } else if (this.A == 2) {
            $$7 = c;
         } else if (this.A == 3) {
            $$7 = d;
         } else {
            $$7 = a;
         }

         if (this.B.d) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         $$0.a($$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
         boolean $$14 = $$6 && this.B.c != fdn.a.a;
         if ($$14) {
            $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         } else if (this.B.d) {
            $$0.a(0.8F, 0.8F, 0.8F, 1.0F);
         } else {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         $$0.a(u, $$4, $$5, 80, 80);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         if (this.B.d) {
            RenderSystem.enableBlend();
            $$0.a(v, $$4 + 67, $$5 + 4, 9, 8);
            RenderSystem.disableBlend();
         }

         fhv $$15 = fgm.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fbr.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static class b {
      final boolean d;
      final String e;
      final String f;
      final fcn.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fdn.a c;

      public b(fcn $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = fdn.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = fcn.a.a;
         } else {
            fcs $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = fdn.a($$0, this.d, this.b);
      }
   }
}
