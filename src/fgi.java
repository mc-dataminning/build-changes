import javax.annotation.Nullable;

public class fgi extends flh {
   private static final ali u = ali.b("widget/slot_frame");
   private static final ali v = ali.b("icon/checkmark");
   public static final ali a = ali.b("textures/gui/realms/empty_frame.png");
   public static final ali b = ali.b("textures/gui/title/background/panorama_0.png");
   public static final ali c = ali.b("textures/gui/title/background/panorama_2.png");
   public static final ali d = ali.b("textures/gui/title/background/panorama_3.png");
   private static final xi w = xi.c("mco.configure.world.slot.tooltip.active");
   private static final xi x = xi.c("mco.configure.world.slot.tooltip.minigame");
   private static final xi y = xi.c("mco.configure.world.slot.tooltip");
   static final xi z = xi.c("mco.worldSlot.minigame");
   private final int A;
   @Nullable
   private fgi.b B;

   public fgi(int $$0, int $$1, int $$2, int $$3, int $$4, flh.c $$5) {
      super($$0, $$1, $$2, $$3, xh.a, $$5, q);
      this.A = $$4;
   }

   @Nullable
   public fgi.b a() {
      return this.B;
   }

   public void a(ffi $$0) {
      this.B = new fgi.b($$0, this.A);
      this.a(this.B, $$0.o);
   }

   private void a(fgi.b $$0, @Nullable String $$1) {
      xi $$2 = switch ($$0.c) {
         case b -> $$0.b ? x : y;
         case c -> w;
         default -> null;
      };
      if ($$2 != null) {
         this.a(fms.a($$2));
      }

      xw $$3 = xi.b($$0.e);
      if ($$0.b && $$1 != null) {
         $$3 = $$3.b(xh.v).f($$1);
      }

      this.b($$3);
   }

   static fgi.a a(ffi $$0, boolean $$1, boolean $$2) {
      if ($$1 && !$$0.j && $$0.e != ffi.c.c) {
         return fgi.a.c;
      } else {
         return $$1 || $$2 && $$0.j ? fgi.a.a : fgi.a.b;
      }
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      if (this.B != null) {
         int $$4 = this.D();
         int $$5 = this.E();
         boolean $$6 = this.B();
         ali $$7;
         if (this.B.b) {
            $$7 = fhv.a(String.valueOf(this.B.h), this.B.i);
         } else if (this.B.a) {
            $$7 = a;
         } else if (this.B.i != null && this.B.h != -1L) {
            $$7 = fhv.a(String.valueOf(this.B.h), this.B.i);
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
            $$14 = axv.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         $$0.a(gir::B, $$7, $$4 + 3, $$5 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$14);
         if ($$6 && this.B.c != fgi.a.a) {
            $$0.a(gir::B, u, $$4, $$5, 80, 80);
         } else if (this.B.d) {
            $$0.a(gir::B, u, $$4, $$5, 80, 80, axv.a(1.0F, 0.8F, 0.8F, 0.8F));
         } else {
            $$0.a(gir::B, u, $$4, $$5, 80, 80, axv.a(1.0F, 0.56F, 0.56F, 0.56F));
         }

         if (this.B.d) {
            $$0.a(gir::B, v, $$4 + 67, $$5 + 4, 9, 8);
         }

         fks $$15 = fji.Q().h;
         $$0.a($$15, this.B.e, $$4 + 40, $$5 + 66, -1);
         $$0.a($$15, fem.a(this.B.f, this.B.g.a()), $$4 + 40, $$5 + 80 + 2, -1);
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
      final ffi.a g;
      final long h;
      @Nullable
      final String i;
      public final boolean a;
      public final boolean b;
      public final fgi.a c;

      public b(ffi $$0, int $$1) {
         this.b = $$1 == 4;
         if (this.b) {
            this.d = $$0.i();
            this.e = fgi.z.getString();
            this.h = (long)$$0.p;
            this.i = $$0.q;
            this.a = $$0.p == -1;
            this.f = "";
            this.g = ffi.a.a;
         } else {
            ffn $$2 = $$0.i.get($$1);
            this.d = $$0.n == $$1 && !$$0.i();
            this.e = $$2.a($$1);
            this.h = $$2.j;
            this.i = $$2.k;
            this.a = $$2.l;
            this.f = $$2.h;
            this.g = $$2.i;
         }

         this.c = fgi.a($$0, this.d, this.b);
      }
   }
}
