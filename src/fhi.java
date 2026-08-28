import javax.annotation.Nullable;

public class fhi extends fmd {
   private static final alj u = alj.b("widget/slot_frame");
   private static final alj v = alj.b("icon/checkmark");
   public static final alj a = alj.b("textures/gui/realms/empty_frame.png");
   public static final alj b = alj.b("textures/gui/title/background/panorama_0.png");
   public static final alj c = alj.b("textures/gui/title/background/panorama_2.png");
   public static final alj d = alj.b("textures/gui/title/background/panorama_3.png");
   private static final xj w = xj.c("mco.configure.world.slot.tooltip.active");
   private static final xj x = xj.c("mco.configure.world.slot.tooltip.minigame");
   private static final xj y = xj.c("mco.configure.world.slot.tooltip");
   static final xj z = xj.c("mco.worldSlot.minigame");
   private static final int A = 64;
   private static final String B = "...";
   private final int C;
   @Nullable
   private fhi.b D;

   public fhi(int $$0, int $$1, int $$2, int $$3, int $$4, fmd.c $$5) {
      super($$0, $$1, $$2, $$3, xi.a, $$5, q);
      this.C = $$4;
   }

   @Nullable
   public fhi.b a() {
      return this.D;
   }

   public void a(fgi $$0) {
      this.D = new fhi.b($$0, this.C);
      this.a(this.D, $$0.o);
   }

   private void a(fhi.b $$0, @Nullable String $$1) {
      xj $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fno.a($$2));
      }

      xx $$3 = xj.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xi.v).f($$1);
      }

      this.b($$3);
   }

   static fhi.a a(fgi $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fgi.c.c) {
         return fhi.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fhi.a.a : fhi.a.b;
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      if (this.D != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         alj $$7;
         if (this.D.b) {
            $$7 = fiu.a(String.valueOf(this.D.h), this.D.i);
         } else if (this.D.a) {
            $$7 = a;
         } else if (this.D.i != null && this.D.h != -1L) {
            $$7 = fiu.a(String.valueOf(this.D.h), this.D.i);
         } else if (this.C == 1) {
            $$7 = b;
         } else if (this.C == 2) {
            $$7 = c;
         } else if (this.C == 3) {
            $$7 = d;
         } else {
            $$7 = a;
         }

         int $$14 = -1;
         if (this.D.d) {
            $$14 = axx.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(gjq::B, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.D.c != fhi.a.a) {
            $$0.a(gjq::B, u, $$4, $$5, 80, 80);
         } else if (this.D.d) {
            $$0.a(gjq::B, u, $$4, $$5, 80, 80, axx.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(gjq::B, u, $$4, $$5, 80, 80, axx.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.D.d) {
            $$0.a(gjq::B, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         flo $$15 = fke.Q().h;
         String $$16 = this.D.e;
         if ($$15.b($$16) > 64) {
            $$16 = $$15.a($$16, 64 - $$15.b("...")) + "...";
         }

         $$0.a($$15, $$16, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, ffc.a(this.D.f, this.D.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fgi.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fhi.a c;

      public b(fgi $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = fhi.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = fgi.a.a;
         } else {
            fgn $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.k;
            this.i = $$2.l;
            this.a = $$2.m;
            this.f = $$2.i;
            this.g = $$2.j;
         }

         this.c = fhi.a($$0, this.d, this.b);
      }
   }
}
