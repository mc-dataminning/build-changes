import javax.annotation.Nullable;

public class ffp extends fko {
   private static final ale u = ale.b("widget/slot_frame");
   private static final ale v = ale.b("icon/checkmark");
   public static final ale a = ale.b("textures/gui/realms/empty_frame.png");
   public static final ale b = ale.b("textures/gui/title/background/panorama_0.png");
   public static final ale c = ale.b("textures/gui/title/background/panorama_2.png");
   public static final ale d = ale.b("textures/gui/title/background/panorama_3.png");
   private static final xe w = xe.c("mco.configure.world.slot.tooltip.active");
   private static final xe x = xe.c("mco.configure.world.slot.tooltip.minigame");
   private static final xe y = xe.c("mco.configure.world.slot.tooltip");
   static final xe z = xe.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private ffp.b B;

   public ffp(int $$0, int $$1, int $$2, int $$3, int $$4, fko.c $$5) {
      super($$0, $$1, $$2, $$3, xd.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public ffp.b a() {
      return this.B;
   }

   public void a(fep $$0) {
      this.B = new ffp.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(ffp.b $$0, @Nullable String $$1) {
      xe $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(flz.a($$2));
      }

      xs $$3 = xe.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xd.v).f($$1);
      }

      this.b($$3);
   }

   static ffp.a a(fep $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != fep.c.c) {
         return ffp.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? ffp.a.a : ffp.a.b;
      }
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         ale $$7;
         if (this.B.b) {
            $$7 = fhc.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fhc.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.A == 1) {
            $$7 = b;
         } else if (this.A == 2) {
            $$7 = c;
         } else if (this.A == 3) {
            $$7 = d;
         } else {
            $$7 = a;
         }

         int $$14 = -1;
         if (this.B.d) {
            $$14 = axq.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(ghv::B, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.B.c != ffp.a.a) {
            $$0.a(ghv::B, u, $$4, $$5, 80, 80);
         } else if (this.B.d) {
            $$0.a(ghv::B, u, $$4, $$5, 80, 80, axq.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(ghv::B, u, $$4, $$5, 80, 80, axq.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.B.d) {
            $$0.a(ghv::B, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         fjz $$15 = fip.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fdt.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final fep.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final ffp.a c;

      public b(fep $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = ffp.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = fep.a.a;
         } else {
            feu $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.j;
            this.i = $$2.k;
            this.a = $$2.l;
            this.f = $$2.h;
            this.g = $$2.i;
         }

         this.c = ffp.a($$0, this.d, this.b);
      }
   }
}
