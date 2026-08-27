import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eyr extends fdp {
   private static final ajt u = new ajt("widget/slot_frame");
   private static final ajt v = new ajt("icon/checkmark");
   public static final ajt a = new ajt("textures/gui/realms/empty_frame.png");
   public static final ajt b = new ajt("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final ajt c = new ajt("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final ajt d = new ajt("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final wg w = wg.c("mco.configure.world.slot.tooltip.active");
   private static final wg x = wg.c("mco.configure.world.slot.tooltip.minigame");
   private static final wg y = wg.c("mco.configure.world.slot.tooltip");
   static final wg z = wg.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private eyr.b B;

   public eyr(int $$0, int $$1, int $$2, int $$3, int $$4, fdp.c $$5) {
      super($$0, $$1, $$2, $$3, wf.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public eyr.b a() {
      return this.B;
   }

   public void a(exp $$0) {
      this.B = new eyr.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(eyr.b $$0, @Nullable String $$1) {
      wg $$2 = switch ($$0.c) {
         case c -> w;
         case b -> $$0.b ? x : y;
         default -> null;
      };
      if ($$2 != null) {
         this.a(ffa.a($$2));
      }

      wu $$3 = wg.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(wf.v).f($$1);
      }

      this.b($$3);
   }

   static eyr.a a(exp $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != exp.c.c) {
         return eyr.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? eyr.a.a : eyr.a.b;
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.C();
         int $$5 = this.D();
         boolean $$6 = this.A();
         ajt $$7;
         if (this.B.b) {
            $$7 = fae.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fae.a(String.valueOf(this.B.h), this.B.i);
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
         boolean $$14 = $$6 && this.B.c != eyr.a.a;
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

         fda $$15 = fbp.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, ewt.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final exp.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final eyr.a c;

      public b(exp $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.m == exp.d.b;
            this.e = eyr.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = exp.a.a;
         } else {
            exw $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && $$0.m != exp.d.b;
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = eyr.a($$0, this.d, this.b);
      }
   }
}
