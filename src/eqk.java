import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eqk extends eve {
   private static final agm t = new agm("widget/slot_frame");
   private static final agm u = new agm("icon/checkmark");
   public static final agm a = new agm("textures/gui/realms/empty_frame.png");
   public static final agm b = new agm("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final agm c = new agm("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final agm d = new agm("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final uv v = uv.c("mco.configure.world.slot.tooltip.active");
   private static final uv w = uv.c("mco.configure.world.slot.tooltip.minigame");
   private static final uv x = uv.c("mco.configure.world.slot.tooltip");
   static final uv y = uv.c("mco.worldSlot.minigame");
   private final int z;
   @Nullable
   private eqk.b A;
   @Nullable
   private ewp B;

   public eqk(int $$0, int $$1, int $$2, int $$3, int $$4, eve.c $$5) {
      super($$0, $$1, $$2, $$3, uu.a, $$5, p);
      this.z = $$4;
   }

   @Nullable
   public eqk.b a() {
      return this.A;
   }

   public void a(epi $$0) {
      this.A = new eqk.b($$0, this.z);
      this.a(this.A, $$0.o);
   }

   private void a(eqk.b $$0, String $$1) {
      uv $$2 = switch ($$0.c) {
         case c -> v;
         case b -> $$0.b ? w : x;
         default -> null;
      };
      if ($$2 == null) {
         this.b(uv.b($$0.e));
      } else {
         this.B = ewp.a($$2);
         if ($$0.a) {
            this.b($$2);
         } else {
            vj $$3 = $$2.f().b(uu.a()).b(uv.b($$0.e));
            if ($$0.b) {
               $$3 = $$3.b(uu.u).f($$1);
            }

            this.b($$3);
         }
      }
   }

   static eqk.a a(epi $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != epi.c.c) {
         return eqk.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? eqk.a.a : eqk.a.b;
      }
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      if (this.A != null) {
         int $$4 = this.p();
         int $$5 = this.r();
         boolean $$6 = this.n();
         if (this.B != null) {
            this.B.a(this.m(), this.aK_(), this.s());
         }

         agm $$7;
         if (this.A.b) {
            $$7 = erx.a(String.valueOf(this.A.h), this.A.i);
         } else if (this.A.a) {
            $$7 = a;
         } else if (this.A.i != null && this.A.h != -1L) {
            $$7 = erx.a(String.valueOf(this.A.h), this.A.i);
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
         boolean $$14 = $$6 && this.A.c != eqk.a.a;
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

         eur $$15 = eti.N().h;
         $$0.a($$15, this.A.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, eom.a(this.A.f, this.A.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final epi.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final eqk.a c;

      public b(epi $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.m == epi.d.b;
            this.e = eqk.y.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = epi.a.a;
         } else {
            epp $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && $$0.m != epi.d.b;
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = eqk.a($$0, this.d, this.b);
      }
   }
}
