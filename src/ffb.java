import javax.annotation.Nullable;

public class ffb extends fka {
   private static final alb u = alb.b("widget/slot_frame");
   private static final alb v = alb.b("icon/checkmark");
   public static final alb a = alb.b("textures/gui/realms/empty_frame.png");
   public static final alb b = alb.b("textures/gui/title/background/panorama_0.png");
   public static final alb c = alb.b("textures/gui/title/background/panorama_2.png");
   public static final alb d = alb.b("textures/gui/title/background/panorama_3.png");
   private static final xd w = xd.c("mco.configure.world.slot.tooltip.active");
   private static final xd x = xd.c("mco.configure.world.slot.tooltip.minigame");
   private static final xd y = xd.c("mco.configure.world.slot.tooltip");
   static final xd z = xd.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private ffb.b B;

   public ffb(int $$0, int $$1, int $$2, int $$3, int $$4, fka.c $$5) {
      super($$0, $$1, $$2, $$3, xc.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public ffb.b a() {
      return this.B;
   }

   public void a(feb $$0) {
      this.B = new ffb.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(ffb.b $$0, @Nullable String $$1) {
      xd $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fll.a($$2));
      }

      xr $$3 = xd.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xc.v).f($$1);
      }

      this.b($$3);
   }

   static ffb.a a(feb $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != feb.c.c) {
         return ffb.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? ffb.a.a : ffb.a.b;
      }
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         alb $$7;
         if (this.B.b) {
            $$7 = fgo.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fgo.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.A == 1) {
            $$7 = b;
         } else if (this.A == 2) {
            $$7 = c;
         } else if (this.A == 3) {
            $$7 = d;
         } else {
            $$7 = a;
         }

         int $$14 = -1;
         if (this.B.d) {
            $$14 = axn.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(ghe::C, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.B.c != ffb.a.a) {
            $$0.a(ghe::C, u, $$4, $$5, 80, 80);
         } else if (this.B.d) {
            $$0.a(ghe::C, u, $$4, $$5, 80, 80, axn.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(ghe::C, u, $$4, $$5, 80, 80, axn.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.B.d) {
            $$0.a(ghe::C, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         fjl $$15 = fib.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fdf.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final feb.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final ffb.a c;

      public b(feb $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = ffb.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = feb.a.a;
         } else {
            feg $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.j;
            this.i = $$2.k;
            this.a = $$2.l;
            this.f = $$2.h;
            this.g = $$2.i;
         }

         this.c = ffb.a($$0, this.d, this.b);
      }
   }
}
