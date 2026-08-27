import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ept extends eum {
   private static final agg t = new agg("widget/slot_frame");
   private static final agg u = new agg("icon/checkmark");
   public static final agg a = new agg("textures/gui/realms/empty_frame.png");
   public static final agg b = new agg("minecraft", "textures/gui/title/background/panorama_0.png");
   public static final agg c = new agg("minecraft", "textures/gui/title/background/panorama_2.png");
   public static final agg d = new agg("minecraft", "textures/gui/title/background/panorama_3.png");
   private static final ur v = ur.c("mco.configure.world.slot.tooltip.active");
   private static final ur w = ur.c("mco.configure.world.slot.tooltip.minigame");
   private static final ur x = ur.c("mco.configure.world.slot.tooltip");
   static final ur y = ur.c("mco.worldSlot.minigame");
   private final int z;
   @Nullable
   private ept.b A;
   @Nullable
   private evx B;

   public ept(int $$0, int $$1, int $$2, int $$3, int $$4, eum.c $$5) {
      super($$0, $$1, $$2, $$3, uq.a, $$5, p);
      this.z = $$4;
   }

   @Nullable
   public ept.b a() {
      return this.A;
   }

   public void a(eor $$0) {
      this.A = new ept.b($$0, this.z);
      this.a(this.A, $$0.o);
   }

   private void a(ept.b $$0, String $$1) {
      ur $$2 = switch ($$0.c) {
         case c -> v;
         case b -> $$0.b ? w : x;
         default -> null;
      };
      if ($$2 == null) {
         this.b(ur.b($$0.e));
      } else {
         this.B = evx.a($$2);
         if ($$0.a) {
            this.b($$2);
         } else {
            vf $$3 = $$2.f().b(uq.a()).b(ur.b($$0.e));
            if ($$0.b) {
               $$3 = $$3.b(uq.u).f($$1);
            }

            this.b($$3);
         }
      }
   }

   static ept.a a(eor $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != eor.c.c) {
         return ept.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? ept.a.a : ept.a.b;
      }
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      if (this.A != null) {
         int $$4 = this.p();
         int $$5 = this.r();
         boolean $$6 = this.n();
         if (this.B != null) {
            this.B.a(this.m(), this.aI_(), this.s());
         }

         agg $$7;
         if (this.A.b) {
            $$7 = erg.a(String.valueOf(this.A.h), this.A.i);
         } else if (this.A.a) {
            $$7 = a;
         } else if (this.A.i != null && this.A.h != -1L) {
            $$7 = erg.a(String.valueOf(this.A.h), this.A.i);
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
         boolean $$14 = $$6 && this.A.c != ept.a.a;
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

         etz $$15 = esr.N().h;
         $$0.a($$15, this.A.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, env.a(this.A.f, this.A.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final eor.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final ept.a c;

      public b(eor $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.m == eor.d.b;
            this.e = ept.y.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = eor.a.a;
         } else {
            eoy $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && $$0.m != eor.d.b;
            this.e = $$2.a($$1);
            this.h = $$2.l;
            this.i = $$2.m;
            this.a = $$2.n;
            this.f = $$2.j;
            this.g = $$2.k;
         }

         this.c = ept.a($$0, this.d, this.b);
      }
   }
}
