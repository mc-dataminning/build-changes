import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ezw extends feu {
   private static final akf u = new akf("widget/slot_frame");
   private static final akf v = new akf("icon/checkmark");
   public static final akf a = new akf("textures/gui/realms/empty_frame.png");
   public static final akf b = new akf("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final akf c = new akf("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final akf d = new akf("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final ws w = ws.c("mco.configure.world.slot.tooltip.active");
   private static final ws x = ws.c("mco.configure.world.slot.tooltip.minigame");
   private static final ws y = ws.c("mco.configure.world.slot.tooltip");
   static final ws z = ws.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private ezw.b B;

   public ezw(int $$0, int $$1, int $$2, int $$3, int $$4, feu.c $$5) {
      super($$0, $$1, $$2, $$3, wr.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public ezw.b a() {
      return this.B;
   }

   public void a(eyu $$0) {
      this.B = new ezw.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(ezw.b $$0, @Nullable String $$1) {
      ws $$2 = switch ($$0.c) {
         case c -> w;
         case b -> $$0.b ? x : y;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fgf.a($$2));
      }

      xg $$3 = ws.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(wr.v).f($$1);
      }

      this.b($$3);
   }

   static ezw.a a(eyu $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != eyu.c.c) {
         return ezw.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? ezw.a.a : ezw.a.b;
      }
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.C();
         int $$5 = this.D();
         boolean $$6 = this.A();
         akf $$7;
         if (this.B.b) {
            $$7 = fbj.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fbj.a(String.valueOf(this.B.h), this.B.i);
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
         boolean $$14 = $$6 && this.B.c != ezw.a.a;
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

         fef $$15 = fcu.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, exy.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final eyu.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final ezw.a c;

      public b(eyu $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.m == eyu.d.b;
            this.e = ezw.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = eyu.a.a;
         } else {
            ezb $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && $$0.m != eyu.d.b;
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = ezw.a($$0, this.d, this.b);
      }
   }
}
