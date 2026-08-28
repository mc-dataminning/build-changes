import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fdj extends fig {
   private static final akq u = akq.b("widget/slot_frame");
   private static final akq v = akq.b("icon/checkmark");
   public static final akq a = akq.b("textures/gui/realms/empty_frame.png");
   public static final akq b = akq.b("textures/gui/title/background/panorama_0.png");
   public static final akq c = akq.b("textures/gui/title/background/panorama_2.png");
   public static final akq d = akq.b("textures/gui/title/background/panorama_3.png");
   private static final wy w = wy.c("mco.configure.world.slot.tooltip.active");
   private static final wy x = wy.c("mco.configure.world.slot.tooltip.minigame");
   private static final wy y = wy.c("mco.configure.world.slot.tooltip");
   static final wy z = wy.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private fdj.b B;

   public fdj(int $$0, int $$1, int $$2, int $$3, int $$4, fig.c $$5) {
      super($$0, $$1, $$2, $$3, wx.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public fdj.b a() {
      return this.B;
   }

   public void a(fcj $$0) {
      this.B = new fdj.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(fdj.b $$0, @Nullable String $$1) {
      wy $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fjr.a($$2));
      }

      xm $$3 = wy.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(wx.v).f($$1);
      }

      this.b($$3);
   }

   static fdj.a a(fcj $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fcj.c.c) {
         return fdj.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fdj.a.a : fdj.a.b;
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         akq $$7;
         if (this.B.b) {
            $$7 = few.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = few.a(String.valueOf(this.B.h), this.B.i);
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
         boolean $$14 = $$6 && this.B.c != fdj.a.a;
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

         fhr $$15 = fgi.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fbn.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fcj.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fdj.a c;

      public b(fcj $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = fdj.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = fcj.a.a;
         } else {
            fco $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = fdj.a($$0, this.d, this.b);
      }
   }
}
