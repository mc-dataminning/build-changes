import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ehv {
   private static final int b = 30;
   private static final int c = 10;
   public static final int a = 64;
   static final ehv.n[] d = new ehv.n[]{
      new ehv.n(ehv.c.class, 30, 0, true),
      new ehv.n(ehv.a.class, 10, 4),
      new ehv.n(ehv.o.class, 10, 4),
      new ehv.n(ehv.p.class, 10, 3),
      new ehv.n(ehv.l.class, 5, 2),
      new ehv.n(ehv.f.class, 5, 1)
   };
   static final ehv.n[] e = new ehv.n[]{
      new ehv.n(ehv.i.class, 25, 0, true),
      new ehv.n(ehv.g.class, 15, 5),
      new ehv.n(ehv.j.class, 5, 10),
      new ehv.n(ehv.h.class, 5, 10),
      new ehv.n(ehv.d.class, 10, 3, true),
      new ehv.n(ehv.e.class, 7, 2),
      new ehv.n(ehv.k.class, 5, 2)
   };

   static ehv.m a(ehv.n $$0, efv $$1, axt $$2, int $$3, int $$4, int $$5, ij $$6, int $$7) {
      Class<? extends ehv.m> $$8 = $$0.a;
      ehv.m $$9 = null;
      if ($$8 == ehv.c.class) {
         $$9 = ehv.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.a.class) {
         $$9 = ehv.a.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.o.class) {
         $$9 = ehv.o.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.p.class) {
         $$9 = ehv.p.a($$1, $$3, $$4, $$5, $$7, $$6);
      } else if ($$8 == ehv.l.class) {
         $$9 = ehv.l.a($$1, $$3, $$4, $$5, $$7, $$6);
      } else if ($$8 == ehv.f.class) {
         $$9 = ehv.f.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.i.class) {
         $$9 = ehv.i.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.j.class) {
         $$9 = ehv.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.h.class) {
         $$9 = ehv.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.d.class) {
         $$9 = ehv.d.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.e.class) {
         $$9 = ehv.e.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.g.class) {
         $$9 = ehv.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ehv.k.class) {
         $$9 = ehv.k.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$9;
   }

   public static class a extends ehv.m {
      private static final int a = 19;
      private static final int b = 10;
      private static final int c = 19;

      public a(int $$0, efi $$1, ij $$2) {
         super(egh.e, $$0, $$1);
         this.a($$2);
      }

      protected a(int $$0, int $$1, ij $$2) {
         super(egh.e, 0, efu.a($$0, 64, $$1, $$2, 19, 10, 19));
         this.a($$2);
      }

      protected a(egh $$0, to $$1) {
         super($$0, $$1);
      }

      public a(to $$0) {
         this(egh.e, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((ehv.q)$$0, $$1, $$2, 8, 3, false);
         this.b((ehv.q)$$0, $$1, $$2, 3, 8, false);
         this.c((ehv.q)$$0, $$1, $$2, 3, 8, false);
      }

      public static ehv.a a(efv $$0, int $$1, int $$2, int $$3, ij $$4, int $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -8, -3, 0, 19, 10, 19, $$4);
         return a($$6) && $$0.a($$6) == null ? new ehv.a($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 7, 3, 0, 11, 4, 18, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 3, 7, 18, 4, 11, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 7, 18, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 0, 5, 8, 18, 7, 10, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 7, 5, 0, 7, 5, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 7, 5, 11, 7, 5, 18, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 11, 5, 0, 11, 5, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 11, 5, 11, 11, 5, 18, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 5, 7, 7, 5, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 11, 5, 7, 18, 5, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 5, 11, 7, 5, 11, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 11, 5, 11, 18, 5, 11, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 7, 2, 0, 11, 2, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 7, 2, 13, 11, 2, 18, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 7, 0, 0, 11, 1, 3, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 7, 0, 15, 11, 1, 18, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$7 = 7; $$7 <= 11; $$7++) {
            for (int $$8 = 0; $$8 <= 2; $$8++) {
               this.b($$0, dcj.fn.n(), $$7, -1, $$8, $$4);
               this.b($$0, dcj.fn.n(), $$7, -1, 18 - $$8, $$4);
            }
         }

         this.a($$0, $$4, 0, 2, 7, 5, 2, 11, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 13, 2, 7, 18, 2, 11, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 0, 7, 3, 1, 11, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 15, 0, 7, 18, 1, 11, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$9 = 0; $$9 <= 2; $$9++) {
            for (int $$10 = 7; $$10 <= 11; $$10++) {
               this.b($$0, dcj.fn.n(), $$9, -1, $$10, $$4);
               this.b($$0, dcj.fn.n(), 18 - $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class b extends ehv.m {
      private static final int a = 5;
      private static final int b = 10;
      private static final int c = 8;
      private final int d;

      public b(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.f, $$0, $$2);
         this.a($$3);
         this.d = $$1.f();
      }

      public b(to $$0) {
         super(egh.f, $$0);
         this.d = $$0.h("Seed");
      }

      public static ehv.b a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new ehv.b($$6, $$1, $$7, $$5) : null;
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Seed", this.d);
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         axt $$7 = axt.a((long)this.d);

         for (int $$8 = 0; $$8 <= 4; $$8++) {
            for (int $$9 = 3; $$9 <= 4; $$9++) {
               int $$10 = $$7.a(8);
               this.a($$0, $$4, $$8, $$9, 0, $$8, $$9, $$10, dcj.fn.n(), dcj.fn.n(), false);
            }
         }

         int $$11 = $$7.a(8);
         this.a($$0, $$4, 0, 5, 0, 0, 5, $$11, dcj.fn.n(), dcj.fn.n(), false);
         $$11 = $$7.a(8);
         this.a($$0, $$4, 4, 5, 0, 4, 5, $$11, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$13 = 0; $$13 <= 4; $$13++) {
            int $$14 = $$7.a(5);
            this.a($$0, $$4, $$13, 2, 0, $$13, 2, $$14, dcj.fn.n(), dcj.fn.n(), false);
         }

         for (int $$15 = 0; $$15 <= 4; $$15++) {
            for (int $$16 = 0; $$16 <= 1; $$16++) {
               int $$17 = $$7.a(3);
               this.a($$0, $$4, $$15, $$16, 0, $$15, $$16, $$17, dcj.fn.n(), dcj.fn.n(), false);
            }
         }
      }
   }

   public static class c extends ehv.m {
      private static final int a = 5;
      private static final int b = 10;
      private static final int c = 19;

      public c(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.g, $$0, $$2);
         this.a($$3);
      }

      public c(to $$0) {
         super(egh.g, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((ehv.q)$$0, $$1, $$2, 1, 3, false);
      }

      public static ehv.c a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 19, $$5);
         return a($$7) && $$0.a($$7) == null ? new ehv.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 3, 0, 4, 4, 18, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 5, 0, 3, 7, 18, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 0, 5, 0, 0, 5, 18, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 5, 0, 4, 5, 18, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 2, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 13, 4, 2, 18, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 0, 0, 4, 1, 3, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 0, 15, 4, 1, 18, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$7 = 0; $$7 <= 4; $$7++) {
            for (int $$8 = 0; $$8 <= 2; $$8++) {
               this.b($$0, dcj.fn.n(), $$7, -1, $$8, $$4);
               this.b($$0, dcj.fn.n(), $$7, -1, 18 - $$8, $$4);
            }
         }

         dpi $$9 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         dpi $$10 = $$9.a(dff.b, Boolean.valueOf(true));
         dpi $$11 = $$9.a(dff.d, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 1, 1, 0, 4, 1, $$10, $$10, false);
         this.a($$0, $$4, 0, 3, 4, 0, 4, 4, $$10, $$10, false);
         this.a($$0, $$4, 0, 3, 14, 0, 4, 14, $$10, $$10, false);
         this.a($$0, $$4, 0, 1, 17, 0, 4, 17, $$10, $$10, false);
         this.a($$0, $$4, 4, 1, 1, 4, 4, 1, $$11, $$11, false);
         this.a($$0, $$4, 4, 3, 4, 4, 4, 4, $$11, $$11, false);
         this.a($$0, $$4, 4, 3, 14, 4, 4, 14, $$11, $$11, false);
         this.a($$0, $$4, 4, 1, 17, 4, 4, 17, $$11, $$11, false);
      }
   }

   public static class d extends ehv.m {
      private static final int a = 5;
      private static final int b = 14;
      private static final int c = 10;

      public d(int $$0, efi $$1, ij $$2) {
         super(egh.h, $$0, $$1);
         this.a($$2);
      }

      public d(to $$0) {
         super(egh.h, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((ehv.q)$$0, $$1, $$2, 1, 0, true);
      }

      public static ehv.d a(efv $$0, int $$1, int $$2, int $$3, ij $$4, int $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -1, -7, 0, 5, 14, 10, $$4);
         return a($$6) && $$0.a($$6) == null ? new ehv.d($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         dpi $$7 = dcj.fp.n().a(dka.b, ij.d);
         dpi $$8 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));

         for (int $$9 = 0; $$9 <= 9; $$9++) {
            int $$10 = Math.max(1, 7 - $$9);
            int $$11 = Math.min(Math.max($$10 + 5, 14 - $$9), 13);
            int $$12 = $$9;
            this.a($$0, $$4, 0, 0, $$9, 4, $$10, $$9, dcj.fn.n(), dcj.fn.n(), false);
            this.a($$0, $$4, 1, $$10 + 1, $$9, 3, $$11 - 1, $$9, dcj.a.n(), dcj.a.n(), false);
            if ($$9 <= 6) {
               this.a($$0, $$7, 1, $$10 + 1, $$9, $$4);
               this.a($$0, $$7, 2, $$10 + 1, $$9, $$4);
               this.a($$0, $$7, 3, $$10 + 1, $$9, $$4);
            }

            this.a($$0, $$4, 0, $$11, $$9, 4, $$11, $$9, dcj.fn.n(), dcj.fn.n(), false);
            this.a($$0, $$4, 0, $$10 + 1, $$9, 0, $$11 - 1, $$9, dcj.fn.n(), dcj.fn.n(), false);
            this.a($$0, $$4, 4, $$10 + 1, $$9, 4, $$11 - 1, $$9, dcj.fn.n(), dcj.fn.n(), false);
            if (($$9 & 1) == 0) {
               this.a($$0, $$4, 0, $$10 + 2, $$9, 0, $$10 + 3, $$9, $$8, $$8, false);
               this.a($$0, $$4, 4, $$10 + 2, $$9, 4, $$10 + 3, $$9, $$8, $$8, false);
            }

            for (int $$13 = 0; $$13 <= 4; $$13++) {
               this.b($$0, dcj.fn.n(), $$13, -1, $$12, $$4);
            }
         }
      }
   }

   public static class e extends ehv.m {
      private static final int a = 9;
      private static final int b = 7;
      private static final int c = 9;

      public e(int $$0, efi $$1, ij $$2) {
         super(egh.i, $$0, $$1);
         this.a($$2);
      }

      public e(to $$0) {
         super(egh.i, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         int $$3 = 1;
         ij $$4 = this.i();
         if ($$4 == ij.e || $$4 == ij.c) {
            $$3 = 5;
         }

         this.b((ehv.q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
         this.c((ehv.q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
      }

      public static ehv.e a(efv $$0, int $$1, int $$2, int $$3, ij $$4, int $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -3, 0, 0, 9, 7, 9, $$4);
         return a($$6) && $$0.a($$6) == null ? new ehv.e($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         dpi $$7 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         dpi $$8 = dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 0, 0, 8, 1, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 8, 5, 8, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 0, 6, 0, 8, 6, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 2, 5, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 2, 0, 8, 5, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 3, 0, 1, 4, 0, $$8, $$8, false);
         this.a($$0, $$4, 7, 3, 0, 7, 4, 0, $$8, $$8, false);
         this.a($$0, $$4, 0, 2, 4, 8, 2, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 1, 4, 2, 2, 4, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 6, 1, 4, 7, 2, 4, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 1, 3, 8, 7, 3, 8, $$8, $$8, false);
         this.a($$0, dcj.fo.n().a(dff.b, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true)), 0, 3, 8, $$4);
         this.a($$0, dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true)), 8, 3, 8, $$4);
         this.a($$0, $$4, 0, 3, 6, 0, 3, 7, $$7, $$7, false);
         this.a($$0, $$4, 8, 3, 6, 8, 3, 7, $$7, $$7, false);
         this.a($$0, $$4, 0, 3, 4, 0, 5, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 8, 3, 4, 8, 5, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 3, 5, 2, 5, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 3, 5, 7, 5, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 4, 5, 1, 5, 5, $$8, $$8, false);
         this.a($$0, $$4, 7, 4, 5, 7, 5, 5, $$8, $$8, false);

         for (int $$9 = 0; $$9 <= 5; $$9++) {
            for (int $$10 = 0; $$10 <= 8; $$10++) {
               this.b($$0, dcj.fn.n(), $$10, -1, $$9, $$4);
            }
         }
      }
   }

   public static class f extends ehv.m {
      private static final int a = 13;
      private static final int b = 14;
      private static final int c = 13;

      public f(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.j, $$0, $$2);
         this.a($$3);
      }

      public f(to $$0) {
         super(egh.j, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((ehv.q)$$0, $$1, $$2, 5, 3, true);
      }

      public static ehv.f a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -5, -3, 0, 13, 14, 13, $$5);
         return a($$7) && $$0.a($$7) == null ? new ehv.f($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 3, 0, 12, 4, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 5, 0, 12, 13, 12, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 0, 5, 0, 1, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 11, 5, 0, 12, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 11, 4, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 8, 5, 11, 10, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 9, 11, 7, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 12, 1, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 12, 1, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 9, 0, 7, 12, 1, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 11, 2, 10, 12, 10, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 8, 0, 7, 8, 0, dcj.fo.n(), dcj.fo.n(), false);
         dpi $$7 = dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
         dpi $$8 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));

         for (int $$9 = 1; $$9 <= 11; $$9 += 2) {
            this.a($$0, $$4, $$9, 10, 0, $$9, 11, 0, $$7, $$7, false);
            this.a($$0, $$4, $$9, 10, 12, $$9, 11, 12, $$7, $$7, false);
            this.a($$0, $$4, 0, 10, $$9, 0, 11, $$9, $$8, $$8, false);
            this.a($$0, $$4, 12, 10, $$9, 12, 11, $$9, $$8, $$8, false);
            this.a($$0, dcj.fn.n(), $$9, 13, 0, $$4);
            this.a($$0, dcj.fn.n(), $$9, 13, 12, $$4);
            this.a($$0, dcj.fn.n(), 0, 13, $$9, $$4);
            this.a($$0, dcj.fn.n(), 12, 13, $$9, $$4);
            if ($$9 != 11) {
               this.a($$0, $$7, $$9 + 1, 13, 0, $$4);
               this.a($$0, $$7, $$9 + 1, 13, 12, $$4);
               this.a($$0, $$8, 0, 13, $$9 + 1, $$4);
               this.a($$0, $$8, 12, 13, $$9 + 1, $$4);
            }
         }

         this.a($$0, dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true)), 0, 13, 0, $$4);
         this.a($$0, dcj.fo.n().a(dff.c, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true)), 0, 13, 12, $$4);
         this.a($$0, dcj.fo.n().a(dff.c, Boolean.valueOf(true)).a(dff.d, Boolean.valueOf(true)), 12, 13, 12, $$4);
         this.a($$0, dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.d, Boolean.valueOf(true)), 12, 13, 0, $$4);

         for (int $$10 = 3; $$10 <= 9; $$10 += 2) {
            this.a($$0, $$4, 1, 7, $$10, 1, 8, $$10, $$8.a(dff.d, Boolean.valueOf(true)), $$8.a(dff.d, Boolean.valueOf(true)), false);
            this.a($$0, $$4, 11, 7, $$10, 11, 8, $$10, $$8.a(dff.b, Boolean.valueOf(true)), $$8.a(dff.b, Boolean.valueOf(true)), false);
         }

         this.a($$0, $$4, 4, 2, 0, 8, 2, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 4, 12, 2, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 0, 0, 8, 1, 3, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 0, 9, 8, 1, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 0, 4, 3, 1, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 9, 0, 4, 12, 1, 8, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$11 = 4; $$11 <= 8; $$11++) {
            for (int $$12 = 0; $$12 <= 2; $$12++) {
               this.b($$0, dcj.fn.n(), $$11, -1, $$12, $$4);
               this.b($$0, dcj.fn.n(), $$11, -1, 12 - $$12, $$4);
            }
         }

         for (int $$13 = 0; $$13 <= 2; $$13++) {
            for (int $$14 = 4; $$14 <= 8; $$14++) {
               this.b($$0, dcj.fn.n(), $$13, -1, $$14, $$4);
               this.b($$0, dcj.fn.n(), 12 - $$13, -1, $$14, $$4);
            }
         }

         this.a($$0, $$4, 5, 5, 5, 7, 5, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 1, 6, 6, 4, 6, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, dcj.fn.n(), 6, 0, 6, $$4);
         this.a($$0, dcj.H.n(), 6, 5, 6, $$4);
         id $$15 = this.b(6, 5, 6);
         if ($$4.b($$15)) {
            $$0.a($$15, elc.e, 0);
         }
      }
   }

   public static class g extends ehv.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;

      public g(int $$0, efi $$1, ij $$2) {
         super(egh.k, $$0, $$1);
         this.a($$2);
      }

      public g(to $$0) {
         super(egh.k, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((ehv.q)$$0, $$1, $$2, 1, 0, true);
         this.b((ehv.q)$$0, $$1, $$2, 0, 1, true);
         this.c((ehv.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static ehv.g a(efv $$0, int $$1, int $$2, int $$3, ij $$4, int $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
         return a($$6) && $$0.a($$6) == null ? new ehv.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 0, 2, 0, 0, 5, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 4, 0, 5, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 2, 4, 4, 5, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$7 = 0; $$7 <= 4; $$7++) {
            for (int $$8 = 0; $$8 <= 4; $$8++) {
               this.b($$0, dcj.fn.n(), $$7, -1, $$8, $$4);
            }
         }
      }
   }

   public static class h extends ehv.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;
      private boolean d;

      public h(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.l, $$0, $$2);
         this.a($$3);
         this.d = $$1.a(3) == 0;
      }

      public h(to $$0) {
         super(egh.l, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.b((ehv.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static ehv.h a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ehv.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dcj.a.n(), dcj.a.n(), false);
         dpi $$7 = dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
         dpi $$8 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         this.a($$0, $$4, 4, 2, 0, 4, 5, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$8, $$8, false);
         this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$8, $$8, false);
         this.a($$0, $$4, 0, 2, 0, 0, 5, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 4, 3, 5, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
         this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
         if (this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = false;
            this.a($$0, $$4, $$3, 3, 2, 3, eni.v);
         }

         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$9 = 0; $$9 <= 4; $$9++) {
            for (int $$10 = 0; $$10 <= 4; $$10++) {
               this.b($$0, dcj.fn.n(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class i extends ehv.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;

      public i(int $$0, efi $$1, ij $$2) {
         super(egh.m, $$0, $$1);
         this.a($$2);
      }

      public i(to $$0) {
         super(egh.m, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((ehv.q)$$0, $$1, $$2, 1, 0, true);
      }

      public static ehv.i a(efv $$0, int $$1, int $$2, int $$3, ij $$4, int $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
         return a($$6) && $$0.a($$6) == null ? new ehv.i($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dcj.a.n(), dcj.a.n(), false);
         dpi $$7 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 2, 0, 0, 5, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$7, $$7, false);
         this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$7, $$7, false);
         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$8 = 0; $$8 <= 4; $$8++) {
            for (int $$9 = 0; $$9 <= 4; $$9++) {
               this.b($$0, dcj.fn.n(), $$8, -1, $$9, $$4);
            }
         }
      }
   }

   public static class j extends ehv.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;
      private boolean d;

      public j(int $$0, axt $$1, efi $$2, ij $$3) {
         super(egh.n, $$0, $$2);
         this.a($$3);
         this.d = $$1.a(3) == 0;
      }

      public j(to $$0) {
         super(egh.n, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.c((ehv.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static ehv.j a(efv $$0, axt $$1, int $$2, int $$3, int $$4, ij $$5, int $$6) {
         efi $$7 = efi.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ehv.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dcj.a.n(), dcj.a.n(), false);
         dpi $$7 = dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
         dpi $$8 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 2, 0, 0, 5, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$8, $$8, false);
         this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$8, $$8, false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 2, 4, 4, 5, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
         this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
         if (this.d && $$4.b(this.b(1, 2, 3))) {
            this.d = false;
            this.a($$0, $$4, $$3, 1, 2, 3, eni.v);
         }

         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$9 = 0; $$9 <= 4; $$9++) {
            for (int $$10 = 0; $$10 <= 4; $$10++) {
               this.b($$0, dcj.fn.n(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class k extends ehv.m {
      private static final int a = 13;
      private static final int b = 14;
      private static final int c = 13;

      public k(int $$0, efi $$1, ij $$2) {
         super(egh.o, $$0, $$1);
         this.a($$2);
      }

      public k(to $$0) {
         super(egh.o, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((ehv.q)$$0, $$1, $$2, 5, 3, true);
         this.a((ehv.q)$$0, $$1, $$2, 5, 11, true);
      }

      public static ehv.k a(efv $$0, int $$1, int $$2, int $$3, ij $$4, int $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -5, -3, 0, 13, 14, 13, $$4);
         return a($$6) && $$0.a($$6) == null ? new ehv.k($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 3, 0, 12, 4, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 5, 0, 12, 13, 12, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 0, 5, 0, 1, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 11, 5, 0, 12, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 11, 4, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 8, 5, 11, 10, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 9, 11, 7, 12, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 12, 1, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 12, 1, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 9, 0, 7, 12, 1, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 11, 2, 10, 12, 10, dcj.fn.n(), dcj.fn.n(), false);
         dpi $$7 = dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
         dpi $$8 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         dpi $$9 = $$8.a(dff.d, Boolean.valueOf(true));
         dpi $$10 = $$8.a(dff.b, Boolean.valueOf(true));

         for (int $$11 = 1; $$11 <= 11; $$11 += 2) {
            this.a($$0, $$4, $$11, 10, 0, $$11, 11, 0, $$7, $$7, false);
            this.a($$0, $$4, $$11, 10, 12, $$11, 11, 12, $$7, $$7, false);
            this.a($$0, $$4, 0, 10, $$11, 0, 11, $$11, $$8, $$8, false);
            this.a($$0, $$4, 12, 10, $$11, 12, 11, $$11, $$8, $$8, false);
            this.a($$0, dcj.fn.n(), $$11, 13, 0, $$4);
            this.a($$0, dcj.fn.n(), $$11, 13, 12, $$4);
            this.a($$0, dcj.fn.n(), 0, 13, $$11, $$4);
            this.a($$0, dcj.fn.n(), 12, 13, $$11, $$4);
            if ($$11 != 11) {
               this.a($$0, $$7, $$11 + 1, 13, 0, $$4);
               this.a($$0, $$7, $$11 + 1, 13, 12, $$4);
               this.a($$0, $$8, 0, 13, $$11 + 1, $$4);
               this.a($$0, $$8, 12, 13, $$11 + 1, $$4);
            }
         }

         this.a($$0, dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true)), 0, 13, 0, $$4);
         this.a($$0, dcj.fo.n().a(dff.c, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true)), 0, 13, 12, $$4);
         this.a($$0, dcj.fo.n().a(dff.c, Boolean.valueOf(true)).a(dff.d, Boolean.valueOf(true)), 12, 13, 12, $$4);
         this.a($$0, dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.d, Boolean.valueOf(true)), 12, 13, 0, $$4);

         for (int $$12 = 3; $$12 <= 9; $$12 += 2) {
            this.a($$0, $$4, 1, 7, $$12, 1, 8, $$12, $$9, $$9, false);
            this.a($$0, $$4, 11, 7, $$12, 11, 8, $$12, $$10, $$10, false);
         }

         dpi $$13 = dcj.fp.n().a(dka.b, ij.c);

         for (int $$14 = 0; $$14 <= 6; $$14++) {
            int $$15 = $$14 + 4;

            for (int $$16 = 5; $$16 <= 7; $$16++) {
               this.a($$0, $$13, $$16, 5 + $$14, $$15, $$4);
            }

            if ($$15 >= 5 && $$15 <= 8) {
               this.a($$0, $$4, 5, 5, $$15, 7, $$14 + 4, $$15, dcj.fn.n(), dcj.fn.n(), false);
            } else if ($$15 >= 9 && $$15 <= 10) {
               this.a($$0, $$4, 5, 8, $$15, 7, $$14 + 4, $$15, dcj.fn.n(), dcj.fn.n(), false);
            }

            if ($$14 >= 1) {
               this.a($$0, $$4, 5, 6 + $$14, $$15, 7, 9 + $$14, $$15, dcj.a.n(), dcj.a.n(), false);
            }
         }

         for (int $$17 = 5; $$17 <= 7; $$17++) {
            this.a($$0, $$13, $$17, 12, 11, $$4);
         }

         this.a($$0, $$4, 5, 6, 7, 5, 7, 7, $$10, $$10, false);
         this.a($$0, $$4, 7, 6, 7, 7, 7, 7, $$9, $$9, false);
         this.a($$0, $$4, 5, 13, 12, 7, 13, 12, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 2, 5, 2, 3, 5, 3, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 9, 3, 5, 10, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 4, 2, 5, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 9, 5, 2, 10, 5, 3, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 9, 5, 9, 10, 5, 10, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 10, 5, 4, 10, 5, 8, dcj.fn.n(), dcj.fn.n(), false);
         dpi $$18 = $$13.a(dka.b, ij.f);
         dpi $$19 = $$13.a(dka.b, ij.e);
         this.a($$0, $$19, 4, 5, 2, $$4);
         this.a($$0, $$19, 4, 5, 3, $$4);
         this.a($$0, $$19, 4, 5, 9, $$4);
         this.a($$0, $$19, 4, 5, 10, $$4);
         this.a($$0, $$18, 8, 5, 2, $$4);
         this.a($$0, $$18, 8, 5, 3, $$4);
         this.a($$0, $$18, 8, 5, 9, $$4);
         this.a($$0, $$18, 8, 5, 10, $$4);
         this.a($$0, $$4, 3, 4, 4, 4, 4, 8, dcj.dW.n(), dcj.dW.n(), false);
         this.a($$0, $$4, 8, 4, 4, 9, 4, 8, dcj.dW.n(), dcj.dW.n(), false);
         this.a($$0, $$4, 3, 5, 4, 4, 5, 8, dcj.fq.n(), dcj.fq.n(), false);
         this.a($$0, $$4, 8, 5, 4, 9, 5, 8, dcj.fq.n(), dcj.fq.n(), false);
         this.a($$0, $$4, 4, 2, 0, 8, 2, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 4, 12, 2, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 0, 0, 8, 1, 3, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 4, 0, 9, 8, 1, 12, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 0, 4, 3, 1, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 9, 0, 4, 12, 1, 8, dcj.fn.n(), dcj.fn.n(), false);

         for (int $$20 = 4; $$20 <= 8; $$20++) {
            for (int $$21 = 0; $$21 <= 2; $$21++) {
               this.b($$0, dcj.fn.n(), $$20, -1, $$21, $$4);
               this.b($$0, dcj.fn.n(), $$20, -1, 12 - $$21, $$4);
            }
         }

         for (int $$22 = 0; $$22 <= 2; $$22++) {
            for (int $$23 = 4; $$23 <= 8; $$23++) {
               this.b($$0, dcj.fn.n(), $$22, -1, $$23, $$4);
               this.b($$0, dcj.fn.n(), 12 - $$22, -1, $$23, $$4);
            }
         }
      }
   }

   public static class l extends ehv.m {
      private static final int a = 7;
      private static final int b = 8;
      private static final int c = 9;
      private boolean d;

      public l(int $$0, efi $$1, ij $$2) {
         super(egh.p, $$0, $$1);
         this.a($$2);
      }

      public l(to $$0) {
         super(egh.p, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      public static ehv.l a(efv $$0, int $$1, int $$2, int $$3, int $$4, ij $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -2, 0, 0, 7, 8, 9, $$5);
         return a($$6) && $$0.a($$6) == null ? new ehv.l($$4, $$6, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 2, 0, 6, 7, 7, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 1, 0, 0, 5, 1, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 2, 1, 5, 2, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 3, 2, 5, 3, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 4, 3, 5, 4, 7, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 2, 0, 1, 4, 2, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 2, 0, 5, 4, 2, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 5, 2, 1, 5, 3, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 5, 2, 5, 5, 3, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 5, 3, 0, 5, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 5, 3, 6, 5, 8, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 5, 8, 5, 5, 8, dcj.fn.n(), dcj.fn.n(), false);
         dpi $$7 = dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
         dpi $$8 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         this.a($$0, dcj.fo.n().a(dff.d, Boolean.valueOf(true)), 1, 6, 3, $$4);
         this.a($$0, dcj.fo.n().a(dff.b, Boolean.valueOf(true)), 5, 6, 3, $$4);
         this.a($$0, dcj.fo.n().a(dff.b, Boolean.valueOf(true)).a(dff.a, Boolean.valueOf(true)), 0, 6, 3, $$4);
         this.a($$0, dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.a, Boolean.valueOf(true)), 6, 6, 3, $$4);
         this.a($$0, $$4, 0, 6, 4, 0, 6, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 6, 4, 6, 6, 7, $$8, $$8, false);
         this.a($$0, dcj.fo.n().a(dff.b, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true)), 0, 6, 8, $$4);
         this.a($$0, dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true)), 6, 6, 8, $$4);
         this.a($$0, $$4, 1, 6, 8, 5, 6, 8, $$7, $$7, false);
         this.a($$0, dcj.fo.n().a(dff.b, Boolean.valueOf(true)), 1, 7, 8, $$4);
         this.a($$0, $$4, 2, 7, 8, 4, 7, 8, $$7, $$7, false);
         this.a($$0, dcj.fo.n().a(dff.d, Boolean.valueOf(true)), 5, 7, 8, $$4);
         this.a($$0, dcj.fo.n().a(dff.b, Boolean.valueOf(true)), 2, 8, 8, $$4);
         this.a($$0, $$7, 3, 8, 8, $$4);
         this.a($$0, dcj.fo.n().a(dff.d, Boolean.valueOf(true)), 4, 8, 8, $$4);
         if (!this.d) {
            id $$9 = this.b(3, 5, 5);
            if ($$4.b($$9)) {
               this.d = true;
               $$0.a($$9, dcj.ct.n(), 2);
               if ($$0.c_($$9) instanceof doc $$11) {
                  $$11.a(bqg.i, $$3);
               }
            }
         }

         for (int $$12 = 0; $$12 <= 6; $$12++) {
            for (int $$13 = 0; $$13 <= 6; $$13++) {
               this.b($$0, dcj.fn.n(), $$12, -1, $$13, $$4);
            }
         }
      }
   }

   abstract static class m extends efu {
      protected m(egh $$0, int $$1, efi $$2) {
         super($$0, $$1, $$2);
      }

      public m(egh $$0, to $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(egg $$0, to $$1) {
      }

      private int a(List<ehv.n> $$0) {
         boolean $$1 = false;
         int $$2 = 0;

         for (ehv.n $$3 : $$0) {
            if ($$3.d > 0 && $$3.c < $$3.d) {
               $$1 = true;
            }

            $$2 += $$3.b;
         }

         return $$1 ? $$2 : -1;
      }

      private ehv.m a(ehv.q $$0, List<ehv.n> $$1, efv $$2, axt $$3, int $$4, int $$5, int $$6, ij $$7, int $$8) {
         int $$9 = this.a($$1);
         boolean $$10 = $$9 > 0 && $$8 <= 30;
         int $$11 = 0;

         while ($$11 < 5 && $$10) {
            $$11++;
            int $$12 = $$3.a($$9);

            for (ehv.n $$13 : $$1) {
               $$12 -= $$13.b;
               if ($$12 < 0) {
                  if (!$$13.a($$8) || $$13 == $$0.a && !$$13.e) {
                     break;
                  }

                  ehv.m $$14 = ehv.a($$13, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
                  if ($$14 != null) {
                     $$13.c++;
                     $$0.a = $$13;
                     if (!$$13.a()) {
                        $$1.remove($$13);
                     }

                     return $$14;
                  }
               }
            }
         }

         return ehv.b.a($$2, $$3, $$4, $$5, $$6, $$7, $$8);
      }

      private efu a(ehv.q $$0, efv $$1, axt $$2, int $$3, int $$4, int $$5, @Nullable ij $$6, int $$7, boolean $$8) {
         if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
            List<ehv.n> $$9 = $$0.b;
            if ($$8) {
               $$9 = $$0.c;
            }

            efu $$10 = this.a($$0, $$9, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
            if ($$10 != null) {
               $$1.a($$10);
               $$0.d.add($$10);
            }

            return $$10;
         } else {
            return ehv.b.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }

      @Nullable
      protected efu a(ehv.q $$0, efv $$1, axt $$2, int $$3, int $$4, boolean $$5) {
         ij $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$6, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$6, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$6, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$6, this.g(), $$5);
            }
         }

         return null;
      }

      @Nullable
      protected efu b(ehv.q $$0, efv $$1, axt $$2, int $$3, int $$4, boolean $$5) {
         ij $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ij.e, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ij.e, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ij.c, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ij.c, this.g(), $$5);
            }
         }

         return null;
      }

      @Nullable
      protected efu c(ehv.q $$0, efv $$1, axt $$2, int $$3, int $$4, boolean $$5) {
         ij $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ij.f, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ij.f, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ij.d, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ij.d, this.g(), $$5);
            }
         }

         return null;
      }

      protected static boolean a(efi $$0) {
         return $$0 != null && $$0.i() > 10;
      }
   }

   static class n {
      public final Class<? extends ehv.m> a;
      public final int b;
      public int c;
      public final int d;
      public final boolean e;

      public n(Class<? extends ehv.m> $$0, int $$1, int $$2, boolean $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
      }

      public n(Class<? extends ehv.m> $$0, int $$1, int $$2) {
         this($$0, $$1, $$2, false);
      }

      public boolean a(int $$0) {
         return this.d == 0 || this.c < this.d;
      }

      public boolean a() {
         return this.d == 0 || this.c < this.d;
      }
   }

   public static class o extends ehv.m {
      private static final int a = 7;
      private static final int b = 9;
      private static final int c = 7;

      public o(int $$0, efi $$1, ij $$2) {
         super(egh.q, $$0, $$1);
         this.a($$2);
      }

      public o(to $$0) {
         super(egh.q, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.a((ehv.q)$$0, $$1, $$2, 2, 0, false);
         this.b((ehv.q)$$0, $$1, $$2, 0, 2, false);
         this.c((ehv.q)$$0, $$1, $$2, 0, 2, false);
      }

      public static ehv.o a(efv $$0, int $$1, int $$2, int $$3, ij $$4, int $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -2, 0, 0, 7, 9, 7, $$4);
         return a($$6) && $$0.a($$6) == null ? new ehv.o($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 6, 1, 6, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 6, 7, 6, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 0, 2, 0, 1, 6, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 6, 1, 6, 6, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 2, 0, 6, 6, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 2, 6, 6, 6, 6, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 0, 6, 1, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 5, 0, 6, 6, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 2, 0, 6, 6, 1, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 2, 5, 6, 6, 6, dcj.fn.n(), dcj.fn.n(), false);
         dpi $$7 = dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
         dpi $$8 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         this.a($$0, $$4, 2, 6, 0, 4, 6, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);
         this.a($$0, $$4, 2, 6, 6, 4, 6, 6, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 6, 4, 5, 6, $$7, $$7, false);
         this.a($$0, $$4, 0, 6, 2, 0, 6, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 5, 2, 0, 5, 4, $$8, $$8, false);
         this.a($$0, $$4, 6, 6, 2, 6, 6, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 5, 2, 6, 5, 4, $$8, $$8, false);

         for (int $$9 = 0; $$9 <= 6; $$9++) {
            for (int $$10 = 0; $$10 <= 6; $$10++) {
               this.b($$0, dcj.fn.n(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class p extends ehv.m {
      private static final int a = 7;
      private static final int b = 11;
      private static final int c = 7;

      public p(int $$0, efi $$1, ij $$2) {
         super(egh.r, $$0, $$1);
         this.a($$2);
      }

      public p(to $$0) {
         super(egh.r, $$0);
      }

      @Override
      public void a(efu $$0, efv $$1, axt $$2) {
         this.c((ehv.q)$$0, $$1, $$2, 6, 2, false);
      }

      public static ehv.p a(efv $$0, int $$1, int $$2, int $$3, int $$4, ij $$5) {
         efi $$6 = efi.a($$1, $$2, $$3, -2, 0, 0, 7, 11, 7, $$5);
         return a($$6) && $$0.a($$6) == null ? new ehv.p($$4, $$6, $$5) : null;
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         this.a($$0, $$4, 0, 0, 0, 6, 1, 6, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 0, 6, 10, 6, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 0, 2, 0, 1, 8, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 5, 2, 0, 6, 8, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 0, 2, 1, 0, 8, 6, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 2, 1, 6, 8, 6, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 2, 6, 5, 8, 6, dcj.fn.n(), dcj.fn.n(), false);
         dpi $$7 = dcj.fo.n().a(dff.d, Boolean.valueOf(true)).a(dff.b, Boolean.valueOf(true));
         dpi $$8 = dcj.fo.n().a(dff.a, Boolean.valueOf(true)).a(dff.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 3, 2, 0, 5, 4, $$8, $$8, false);
         this.a($$0, $$4, 6, 3, 2, 6, 5, 2, $$8, $$8, false);
         this.a($$0, $$4, 6, 3, 4, 6, 5, 4, $$8, $$8, false);
         this.a($$0, dcj.fn.n(), 5, 2, 5, $$4);
         this.a($$0, $$4, 4, 2, 5, 4, 3, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 3, 2, 5, 3, 4, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 2, 5, 2, 5, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 2, 5, 1, 6, 5, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 1, 7, 1, 5, 7, 4, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 6, 8, 2, 6, 8, 4, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 2, 6, 0, 4, 8, 0, dcj.fn.n(), dcj.fn.n(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);

         for (int $$9 = 0; $$9 <= 6; $$9++) {
            for (int $$10 = 0; $$10 <= 6; $$10++) {
               this.b($$0, dcj.fn.n(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class q extends ehv.a {
      public ehv.n a;
      public List<ehv.n> b;
      public List<ehv.n> c;
      public final List<efu> d = Lists.newArrayList();

      public q(axt $$0, int $$1, int $$2) {
         super($$1, $$2, a($$0));
         this.b = Lists.newArrayList();

         for (ehv.n $$3 : ehv.d) {
            $$3.c = 0;
            this.b.add($$3);
         }

         this.c = Lists.newArrayList();

         for (ehv.n $$4 : ehv.e) {
            $$4.c = 0;
            this.c.add($$4);
         }
      }

      public q(to $$0) {
         super(egh.s, $$0);
      }
   }
}
