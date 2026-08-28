import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fci extends fhf {
   private static final alf u = new alf("widget/slot_frame");
   private static final alf v = new alf("icon/checkmark");
   public static final alf a = new alf("textures/gui/realms/empty_frame.png");
   public static final alf b = new alf("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final alf c = new alf("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final alf d = new alf("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final xp w = xp.c("mco.configure.world.slot.tooltip.active");
   private static final xp x = xp.c("mco.configure.world.slot.tooltip.minigame");
   private static final xp y = xp.c("mco.configure.world.slot.tooltip");
   static final xp z = xp.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private fci.b B;

   public fci(int $$0, int $$1, int $$2, int $$3, int $$4, fhf.c $$5) {
      super($$0, $$1, $$2, $$3, xo.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public fci.b a() {
      return this.B;
   }

   public void a(fbg $$0) {
      this.B = new fci.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(fci.b $$0, @Nullable String $$1) {
      xp $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fiq.a($$2));
      }

      yd $$3 = xp.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xo.v).f($$1);
      }

      this.b($$3);
   }

   static fci.a a(fbg $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fbg.c.c) {
         return fci.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fci.a.a : fci.a.b;
      }
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.C();
         int $$5 = this.D();
         boolean $$6 = this.A();
         alf $$7;
         if (this.B.b) {
            $$7 = fdv.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fdv.a(String.valueOf(this.B.h), this.B.i);
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
         boolean $$14 = $$6 && this.B.c != fci.a.a;
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

         fgq $$15 = ffg.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fak.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fbg.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fci.a c;

      public b(fbg $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.m == fbg.d.b;
            this.e = fci.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = fbg.a.a;
         } else {
            fbn $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && $$0.m != fbg.d.b;
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = fci.a($$0, this.d, this.b);
      }
   }
}
