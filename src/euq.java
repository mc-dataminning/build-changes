import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class euq extends ezo {
   private static final aiy t = new aiy("widget/slot_frame");
   private static final aiy u = new aiy("icon/checkmark");
   public static final aiy a = new aiy("textures/gui/realms/empty_frame.png");
   public static final aiy b = new aiy("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final aiy c = new aiy("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final aiy d = new aiy("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final vq v = vq.c("mco.configure.world.slot.tooltip.active");
   private static final vq w = vq.c("mco.configure.world.slot.tooltip.minigame");
   private static final vq x = vq.c("mco.configure.world.slot.tooltip");
   static final vq y = vq.c("mco.worldSlot.minigame");
   private final int z;
   @Nullable
   private euq.b A;

   public euq(int $$0, int $$1, int $$2, int $$3, int $$4, ezo.c $$5) {
      super($$0, $$1, $$2, $$3, vp.a, $$5, p);
      this.z = $$4;
   }

   @Nullable
   public euq.b a() {
      return this.A;
   }

   public void a(eto $$0) {
      this.A = new euq.b($$0, this.z);
      this.a(this.A, $$0.o);
   }

   private void a(euq.b $$0, @Nullable String $$1) {
      vq $$2 = switch ($$0.c) {
         case c -> v;
         case b -> $$0.b ? w : x;
         default -> null;
      };
      if ($$2 != null) {
         this.a(faz.a($$2));
      }

      we $$3 = vq.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(vp.v).f($$1);
      }

      this.b($$3);
   }

   static euq.a a(eto $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != eto.c.c) {
         return euq.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? euq.a.a : euq.a.b;
      }
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      if (this.A != null) {
         int $$4 = this.B();
         int $$5 = this.C();
         boolean $$6 = this.z();
         aiy $$7;
         if (this.A.b) {
            $$7 = ewd.a(String.valueOf(this.A.h), this.A.i);
         } else if (this.A.a) {
            $$7 = a;
         } else if (this.A.i != null && this.A.h != -1L) {
            $$7 = ewd.a(String.valueOf(this.A.h), this.A.i);
         } else if (this.z == 1) {
            $$7 = b;
         } else if (this.z == 2) {
            $$7 = c;
         } else if (this.z == 3) {
            $$7 = d;
         } else {
            $$7 = a;
         }

         if (this.A.d) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         $$0.a($$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
         boolean $$14 = $$6 && this.A.c != euq.a.a;
         if ($$14) {
            $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         } else if (this.A.d) {
            $$0.a(0.8F, 0.8F, 0.8F, 1.0F);
         } else {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         $$0.a(t, $$4, $$5, 80, 80);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         if (this.A.d) {
            RenderSystem.enableBlend();
            $$0.a(u, $$4 + 67, $$5 + 4, 9, 8);
            RenderSystem.disableBlend();
         }

         eyz $$15 = exo.P().h;
         $$0.a($$15, this.A.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, ess.a(this.A.f, this.A.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final eto.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final euq.a c;

      public b(eto $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.m == eto.d.b;
            this.e = euq.y.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = eto.a.a;
         } else {
            etv $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && $$0.m != eto.d.b;
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = euq.a($$0, this.d, this.b);
      }
   }
}
