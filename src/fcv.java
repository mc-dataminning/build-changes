import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fcv extends fhs {
   private static final akk u = new akk("widget/slot_frame");
   private static final akk v = new akk("icon/checkmark");
   public static final akk a = new akk("textures/gui/realms/empty_frame.png");
   public static final akk b = new akk("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final akk c = new akk("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final akk d = new akk("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final wu w = wu.c("mco.configure.world.slot.tooltip.active");
   private static final wu x = wu.c("mco.configure.world.slot.tooltip.minigame");
   private static final wu y = wu.c("mco.configure.world.slot.tooltip");
   static final wu z = wu.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private fcv.b B;

   public fcv(int $$0, int $$1, int $$2, int $$3, int $$4, fhs.c $$5) {
      super($$0, $$1, $$2, $$3, wt.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public fcv.b a() {
      return this.B;
   }

   public void a(fbt $$0) {
      this.B = new fcv.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(fcv.b $$0, @Nullable String $$1) {
      wu $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fjd.a($$2));
      }

      xi $$3 = wu.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(wt.v).f($$1);
      }

      this.b($$3);
   }

   static fcv.a a(fbt $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fbt.c.c) {
         return fcv.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fcv.a.a : fcv.a.b;
      }
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         akk $$7;
         if (this.B.b) {
            $$7 = fei.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fei.a(String.valueOf(this.B.h), this.B.i);
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
         boolean $$14 = $$6 && this.B.c != fcv.a.a;
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

         fhd $$15 = fft.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fax.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fbt.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fcv.a c;

      public b(fbt $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = fcv.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = fbt.a.a;
         } else {
            fca $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = fcv.a($$0, this.d, this.b);
      }
   }
}
