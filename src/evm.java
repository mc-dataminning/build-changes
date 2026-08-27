import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class evm extends fak {
   private static final ajc t = new ajc("widget/slot_frame");
   private static final ajc u = new ajc("icon/checkmark");
   public static final ajc a = new ajc("textures/gui/realms/empty_frame.png");
   public static final ajc b = new ajc("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final ajc c = new ajc("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final ajc d = new ajc("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final vs v = vs.c("mco.configure.world.slot.tooltip.active");
   private static final vs w = vs.c("mco.configure.world.slot.tooltip.minigame");
   private static final vs x = vs.c("mco.configure.world.slot.tooltip");
   static final vs y = vs.c("mco.worldSlot.minigame");
   private final int z;
   @Nullable
   private evm.b A;

   public evm(int $$0, int $$1, int $$2, int $$3, int $$4, fak.c $$5) {
      super($$0, $$1, $$2, $$3, vr.a, $$5, p);
      this.z = $$4;
   }

   @Nullable
   public evm.b a() {
      return this.A;
   }

   public void a(euk $$0) {
      this.A = new evm.b($$0, this.z);
      this.a(this.A, $$0.o);
   }

   private void a(evm.b $$0, @Nullable String $$1) {
      vs $$2 = switch ($$0.c) {
         case c -> v;
         case b -> $$0.b ? w : x;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fbv.a($$2));
      }

      wg $$3 = vs.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(vr.v).f($$1);
      }

      this.b($$3);
   }

   static evm.a a(euk $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != euk.c.c) {
         return evm.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? evm.a.a : evm.a.b;
      }
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      if (this.A != null) {
         int $$4 = this.B();
         int $$5 = this.C();
         boolean $$6 = this.z();
         ajc $$7;
         if (this.A.b) {
            $$7 = ewz.a(String.valueOf(this.A.h), this.A.i);
         } else if (this.A.a) {
            $$7 = a;
         } else if (this.A.i != null && this.A.h != -1L) {
            $$7 = ewz.a(String.valueOf(this.A.h), this.A.i);
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
         boolean $$14 = $$6 && this.A.c != evm.a.a;
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

         ezv $$15 = eyk.P().h;
         $$0.a($$15, this.A.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, eto.a(this.A.f, this.A.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final euk.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final evm.a c;

      public b(euk $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.m == euk.d.b;
            this.e = evm.y.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = euk.a.a;
         } else {
            eur $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && $$0.m != euk.d.b;
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = evm.a($$0, this.d, this.b);
      }
   }
}
