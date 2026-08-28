import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fcf extends fhc {
   private static final ale u = new ale("widget/slot_frame");
   private static final ale v = new ale("icon/checkmark");
   public static final ale a = new ale("textures/gui/realms/empty_frame.png");
   public static final ale b = new ale("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final ale c = new ale("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final ale d = new ale("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final xo w = xo.c("mco.configure.world.slot.tooltip.active");
   private static final xo x = xo.c("mco.configure.world.slot.tooltip.minigame");
   private static final xo y = xo.c("mco.configure.world.slot.tooltip");
   static final xo z = xo.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private fcf.b B;

   public fcf(int $$0, int $$1, int $$2, int $$3, int $$4, fhc.c $$5) {
      super($$0, $$1, $$2, $$3, xn.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public fcf.b a() {
      return this.B;
   }

   public void a(fbd $$0) {
      this.B = new fcf.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(fcf.b $$0, @Nullable String $$1) {
      xo $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fin.a($$2));
      }

      yc $$3 = xo.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xn.v).f($$1);
      }

      this.b($$3);
   }

   static fcf.a a(fbd $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fbd.c.c) {
         return fcf.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fcf.a.a : fcf.a.b;
      }
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.C();
         int $$5 = this.D();
         boolean $$6 = this.A();
         ale $$7;
         if (this.B.b) {
            $$7 = fds.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fds.a(String.valueOf(this.B.h), this.B.i);
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
         boolean $$14 = $$6 && this.B.c != fcf.a.a;
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

         fgn $$15 = ffd.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fah.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fbd.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fcf.a c;

      public b(fbd $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.m == fbd.d.b;
            this.e = fcf.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = fbd.a.a;
         } else {
            fbk $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && $$0.m != fbd.d.b;
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = fcf.a($$0, this.d, this.b);
      }
   }
}
