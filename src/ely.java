import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ely {
   private static final int b = 30;
   private static final int c = 10;
   public static final int a = 64;
   static final ely.n[] d = new ely.n[]{
      new ely.n(ely.c.class, 30, 0, true),
      new ely.n(ely.a.class, 10, 4),
      new ely.n(ely.o.class, 10, 4),
      new ely.n(ely.p.class, 10, 3),
      new ely.n(ely.l.class, 5, 2),
      new ely.n(ely.f.class, 5, 1)
   };
   static final ely.n[] e = new ely.n[]{
      new ely.n(ely.i.class, 25, 0, true),
      new ely.n(ely.g.class, 15, 5),
      new ely.n(ely.j.class, 5, 10),
      new ely.n(ely.h.class, 5, 10),
      new ely.n(ely.d.class, 10, 3, true),
      new ely.n(ely.e.class, 7, 2),
      new ely.n(ely.k.class, 5, 2)
   };

   static ely.m a(ely.n $$0, ejy $$1, ayt $$2, int $$3, int $$4, int $$5, iw $$6, int $$7) {
      Class<? extends ely.m> $$8 = $$0.a;
      ely.m $$9 = null;
      if ($$8 == ely.c.class) {
         $$9 = ely.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.a.class) {
         $$9 = ely.a.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.o.class) {
         $$9 = ely.o.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.p.class) {
         $$9 = ely.p.a($$1, $$3, $$4, $$5, $$7, $$6);
      } else if ($$8 == ely.l.class) {
         $$9 = ely.l.a($$1, $$3, $$4, $$5, $$7, $$6);
      } else if ($$8 == ely.f.class) {
         $$9 = ely.f.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.i.class) {
         $$9 = ely.i.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.j.class) {
         $$9 = ely.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.h.class) {
         $$9 = ely.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.d.class) {
         $$9 = ely.d.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.e.class) {
         $$9 = ely.e.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.g.class) {
         $$9 = ely.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == ely.k.class) {
         $$9 = ely.k.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$9;
   }

   public static class a extends ely.m {
      private static final int a = 19;
      private static final int b = 10;
      private static final int c = 19;

      public a(int $$0, ejl $$1, iw $$2) {
         super(ekk.e, $$0, $$1);
         this.a($$2);
      }

      protected a(int $$0, int $$1, iw $$2) {
         super(ekk.e, 0, ejx.a($$0, 64, $$1, $$2, 19, 10, 19));
         this.a($$2);
      }

      protected a(ekk $$0, uk $$1) {
         super($$0, $$1);
      }

      public a(uk $$0) {
         this(ekk.e, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.a((ely.q)$$0, $$1, $$2, 8, 3, false);
         this.b((ely.q)$$0, $$1, $$2, 3, 8, false);
         this.c((ely.q)$$0, $$1, $$2, 3, 8, false);
      }

      public static ely.a a(ejy $$0, int $$1, int $$2, int $$3, iw $$4, int $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -8, -3, 0, 19, 10, 19, $$4);
         return a($$6) && $$0.a($$6) == null ? new ely.a($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 7, 3, 0, 11, 4, 18, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 3, 7, 18, 4, 11, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 7, 18, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 0, 5, 8, 18, 7, 10, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 7, 5, 0, 7, 5, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 7, 5, 11, 7, 5, 18, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 11, 5, 0, 11, 5, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 11, 5, 11, 11, 5, 18, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 5, 7, 7, 5, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 11, 5, 7, 18, 5, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 5, 11, 7, 5, 11, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 11, 5, 11, 18, 5, 11, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 7, 2, 0, 11, 2, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 7, 2, 13, 11, 2, 18, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 7, 0, 0, 11, 1, 3, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 7, 0, 15, 11, 1, 18, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$7 = 7; $$7 <= 11; $$7++) {
            for (int $$8 = 0; $$8 <= 2; $$8++) {
               this.b($$0, dfe.gf.n(), $$7, -1, $$8, $$4);
               this.b($$0, dfe.gf.n(), $$7, -1, 18 - $$8, $$4);
            }
         }

         this.a($$0, $$4, 0, 2, 7, 5, 2, 11, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 13, 2, 7, 18, 2, 11, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 0, 7, 3, 1, 11, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 15, 0, 7, 18, 1, 11, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$9 = 0; $$9 <= 2; $$9++) {
            for (int $$10 = 7; $$10 <= 11; $$10++) {
               this.b($$0, dfe.gf.n(), $$9, -1, $$10, $$4);
               this.b($$0, dfe.gf.n(), 18 - $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class b extends ely.m {
      private static final int a = 5;
      private static final int b = 10;
      private static final int c = 8;
      private final int d;

      public b(int $$0, ayt $$1, ejl $$2, iw $$3) {
         super(ekk.f, $$0, $$2);
         this.a($$3);
         this.d = $$1.f();
      }

      public b(uk $$0) {
         super(ekk.f, $$0);
         this.d = $$0.h("Seed");
      }

      public static ely.b a(ejy $$0, ayt $$1, int $$2, int $$3, int $$4, iw $$5, int $$6) {
         ejl $$7 = ejl.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new ely.b($$6, $$1, $$7, $$5) : null;
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Seed", this.d);
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         ayt $$7 = ayt.a((long)this.d);

         for (int $$8 = 0; $$8 <= 4; $$8++) {
            for (int $$9 = 3; $$9 <= 4; $$9++) {
               int $$10 = $$7.a(8);
               this.a($$0, $$4, $$8, $$9, 0, $$8, $$9, $$10, dfe.gf.n(), dfe.gf.n(), false);
            }
         }

         int $$11 = $$7.a(8);
         this.a($$0, $$4, 0, 5, 0, 0, 5, $$11, dfe.gf.n(), dfe.gf.n(), false);
         $$11 = $$7.a(8);
         this.a($$0, $$4, 4, 5, 0, 4, 5, $$11, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$13 = 0; $$13 <= 4; $$13++) {
            int $$14 = $$7.a(5);
            this.a($$0, $$4, $$13, 2, 0, $$13, 2, $$14, dfe.gf.n(), dfe.gf.n(), false);
         }

         for (int $$15 = 0; $$15 <= 4; $$15++) {
            for (int $$16 = 0; $$16 <= 1; $$16++) {
               int $$17 = $$7.a(3);
               this.a($$0, $$4, $$15, $$16, 0, $$15, $$16, $$17, dfe.gf.n(), dfe.gf.n(), false);
            }
         }
      }
   }

   public static class c extends ely.m {
      private static final int a = 5;
      private static final int b = 10;
      private static final int c = 19;

      public c(int $$0, ayt $$1, ejl $$2, iw $$3) {
         super(ekk.g, $$0, $$2);
         this.a($$3);
      }

      public c(uk $$0) {
         super(ekk.g, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.a((ely.q)$$0, $$1, $$2, 1, 3, false);
      }

      public static ely.c a(ejy $$0, ayt $$1, int $$2, int $$3, int $$4, iw $$5, int $$6) {
         ejl $$7 = ejl.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 19, $$5);
         return a($$7) && $$0.a($$7) == null ? new ely.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 3, 0, 4, 4, 18, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 5, 0, 3, 7, 18, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 0, 5, 0, 0, 5, 18, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 5, 0, 4, 5, 18, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 2, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 13, 4, 2, 18, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 0, 0, 4, 1, 3, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 0, 15, 4, 1, 18, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$7 = 0; $$7 <= 4; $$7++) {
            for (int $$8 = 0; $$8 <= 2; $$8++) {
               this.b($$0, dfe.gf.n(), $$7, -1, $$8, $$4);
               this.b($$0, dfe.gf.n(), $$7, -1, 18 - $$8, $$4);
            }
         }

         dtc $$9 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         dtc $$10 = $$9.a(did.b, Boolean.valueOf(true));
         dtc $$11 = $$9.a(did.d, Boolean.valueOf(true));
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

   public static class d extends ely.m {
      private static final int a = 5;
      private static final int b = 14;
      private static final int c = 10;

      public d(int $$0, ejl $$1, iw $$2) {
         super(ekk.h, $$0, $$1);
         this.a($$2);
      }

      public d(uk $$0) {
         super(ekk.h, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.a((ely.q)$$0, $$1, $$2, 1, 0, true);
      }

      public static ely.d a(ejy $$0, int $$1, int $$2, int $$3, iw $$4, int $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -1, -7, 0, 5, 14, 10, $$4);
         return a($$6) && $$0.a($$6) == null ? new ely.d($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         dtc $$7 = dfe.gh.n().a(dnk.b, iw.d);
         dtc $$8 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));

         for (int $$9 = 0; $$9 <= 9; $$9++) {
            int $$10 = Math.max(1, 7 - $$9);
            int $$11 = Math.min(Math.max($$10 + 5, 14 - $$9), 13);
            int $$12 = $$9;
            this.a($$0, $$4, 0, 0, $$9, 4, $$10, $$9, dfe.gf.n(), dfe.gf.n(), false);
            this.a($$0, $$4, 1, $$10 + 1, $$9, 3, $$11 - 1, $$9, dfe.a.n(), dfe.a.n(), false);
            if ($$9 <= 6) {
               this.a($$0, $$7, 1, $$10 + 1, $$9, $$4);
               this.a($$0, $$7, 2, $$10 + 1, $$9, $$4);
               this.a($$0, $$7, 3, $$10 + 1, $$9, $$4);
            }

            this.a($$0, $$4, 0, $$11, $$9, 4, $$11, $$9, dfe.gf.n(), dfe.gf.n(), false);
            this.a($$0, $$4, 0, $$10 + 1, $$9, 0, $$11 - 1, $$9, dfe.gf.n(), dfe.gf.n(), false);
            this.a($$0, $$4, 4, $$10 + 1, $$9, 4, $$11 - 1, $$9, dfe.gf.n(), dfe.gf.n(), false);
            if (($$9 & 1) == 0) {
               this.a($$0, $$4, 0, $$10 + 2, $$9, 0, $$10 + 3, $$9, $$8, $$8, false);
               this.a($$0, $$4, 4, $$10 + 2, $$9, 4, $$10 + 3, $$9, $$8, $$8, false);
            }

            for (int $$13 = 0; $$13 <= 4; $$13++) {
               this.b($$0, dfe.gf.n(), $$13, -1, $$12, $$4);
            }
         }
      }
   }

   public static class e extends ely.m {
      private static final int a = 9;
      private static final int b = 7;
      private static final int c = 9;

      public e(int $$0, ejl $$1, iw $$2) {
         super(ekk.i, $$0, $$1);
         this.a($$2);
      }

      public e(uk $$0) {
         super(ekk.i, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         int $$3 = 1;
         iw $$4 = this.i();
         if ($$4 == iw.e || $$4 == iw.c) {
            $$3 = 5;
         }

         this.b((ely.q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
         this.c((ely.q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
      }

      public static ely.e a(ejy $$0, int $$1, int $$2, int $$3, iw $$4, int $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -3, 0, 0, 9, 7, 9, $$4);
         return a($$6) && $$0.a($$6) == null ? new ely.e($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         dtc $$7 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         dtc $$8 = dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 0, 0, 8, 1, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 8, 5, 8, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 0, 6, 0, 8, 6, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 2, 5, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 2, 0, 8, 5, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 3, 0, 1, 4, 0, $$8, $$8, false);
         this.a($$0, $$4, 7, 3, 0, 7, 4, 0, $$8, $$8, false);
         this.a($$0, $$4, 0, 2, 4, 8, 2, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 1, 4, 2, 2, 4, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 6, 1, 4, 7, 2, 4, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 1, 3, 8, 7, 3, 8, $$8, $$8, false);
         this.a($$0, dfe.gg.n().a(did.b, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true)), 0, 3, 8, $$4);
         this.a($$0, dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true)), 8, 3, 8, $$4);
         this.a($$0, $$4, 0, 3, 6, 0, 3, 7, $$7, $$7, false);
         this.a($$0, $$4, 8, 3, 6, 8, 3, 7, $$7, $$7, false);
         this.a($$0, $$4, 0, 3, 4, 0, 5, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 8, 3, 4, 8, 5, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 3, 5, 2, 5, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 3, 5, 7, 5, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 4, 5, 1, 5, 5, $$8, $$8, false);
         this.a($$0, $$4, 7, 4, 5, 7, 5, 5, $$8, $$8, false);

         for (int $$9 = 0; $$9 <= 5; $$9++) {
            for (int $$10 = 0; $$10 <= 8; $$10++) {
               this.b($$0, dfe.gf.n(), $$10, -1, $$9, $$4);
            }
         }
      }
   }

   public static class f extends ely.m {
      private static final int a = 13;
      private static final int b = 14;
      private static final int c = 13;

      public f(int $$0, ayt $$1, ejl $$2, iw $$3) {
         super(ekk.j, $$0, $$2);
         this.a($$3);
      }

      public f(uk $$0) {
         super(ekk.j, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.a((ely.q)$$0, $$1, $$2, 5, 3, true);
      }

      public static ely.f a(ejy $$0, ayt $$1, int $$2, int $$3, int $$4, iw $$5, int $$6) {
         ejl $$7 = ejl.a($$2, $$3, $$4, -5, -3, 0, 13, 14, 13, $$5);
         return a($$7) && $$0.a($$7) == null ? new ely.f($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 3, 0, 12, 4, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 5, 0, 12, 13, 12, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 0, 5, 0, 1, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 11, 5, 0, 12, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 11, 4, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 8, 5, 11, 10, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 9, 11, 7, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 12, 1, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 12, 1, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 9, 0, 7, 12, 1, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 11, 2, 10, 12, 10, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 8, 0, 7, 8, 0, dfe.gg.n(), dfe.gg.n(), false);
         dtc $$7 = dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true));
         dtc $$8 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));

         for (int $$9 = 1; $$9 <= 11; $$9 += 2) {
            this.a($$0, $$4, $$9, 10, 0, $$9, 11, 0, $$7, $$7, false);
            this.a($$0, $$4, $$9, 10, 12, $$9, 11, 12, $$7, $$7, false);
            this.a($$0, $$4, 0, 10, $$9, 0, 11, $$9, $$8, $$8, false);
            this.a($$0, $$4, 12, 10, $$9, 12, 11, $$9, $$8, $$8, false);
            this.a($$0, dfe.gf.n(), $$9, 13, 0, $$4);
            this.a($$0, dfe.gf.n(), $$9, 13, 12, $$4);
            this.a($$0, dfe.gf.n(), 0, 13, $$9, $$4);
            this.a($$0, dfe.gf.n(), 12, 13, $$9, $$4);
            if ($$9 != 11) {
               this.a($$0, $$7, $$9 + 1, 13, 0, $$4);
               this.a($$0, $$7, $$9 + 1, 13, 12, $$4);
               this.a($$0, $$8, 0, 13, $$9 + 1, $$4);
               this.a($$0, $$8, 12, 13, $$9 + 1, $$4);
            }
         }

         this.a($$0, dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true)), 0, 13, 0, $$4);
         this.a($$0, dfe.gg.n().a(did.c, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true)), 0, 13, 12, $$4);
         this.a($$0, dfe.gg.n().a(did.c, Boolean.valueOf(true)).a(did.d, Boolean.valueOf(true)), 12, 13, 12, $$4);
         this.a($$0, dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.d, Boolean.valueOf(true)), 12, 13, 0, $$4);

         for (int $$10 = 3; $$10 <= 9; $$10 += 2) {
            this.a($$0, $$4, 1, 7, $$10, 1, 8, $$10, $$8.a(did.d, Boolean.valueOf(true)), $$8.a(did.d, Boolean.valueOf(true)), false);
            this.a($$0, $$4, 11, 7, $$10, 11, 8, $$10, $$8.a(did.b, Boolean.valueOf(true)), $$8.a(did.b, Boolean.valueOf(true)), false);
         }

         this.a($$0, $$4, 4, 2, 0, 8, 2, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 4, 12, 2, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 0, 0, 8, 1, 3, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 0, 9, 8, 1, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 0, 4, 3, 1, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 9, 0, 4, 12, 1, 8, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$11 = 4; $$11 <= 8; $$11++) {
            for (int $$12 = 0; $$12 <= 2; $$12++) {
               this.b($$0, dfe.gf.n(), $$11, -1, $$12, $$4);
               this.b($$0, dfe.gf.n(), $$11, -1, 12 - $$12, $$4);
            }
         }

         for (int $$13 = 0; $$13 <= 2; $$13++) {
            for (int $$14 = 4; $$14 <= 8; $$14++) {
               this.b($$0, dfe.gf.n(), $$13, -1, $$14, $$4);
               this.b($$0, dfe.gf.n(), 12 - $$13, -1, $$14, $$4);
            }
         }

         this.a($$0, $$4, 5, 5, 5, 7, 5, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 1, 6, 6, 4, 6, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, dfe.gf.n(), 6, 0, 6, $$4);
         this.a($$0, dfe.am.n(), 6, 5, 6, $$4);
         ir $$15 = this.b(6, 5, 6);
         if ($$4.b($$15)) {
            $$0.a($$15, epf.e, 0);
         }
      }
   }

   public static class g extends ely.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;

      public g(int $$0, ejl $$1, iw $$2) {
         super(ekk.k, $$0, $$1);
         this.a($$2);
      }

      public g(uk $$0) {
         super(ekk.k, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.a((ely.q)$$0, $$1, $$2, 1, 0, true);
         this.b((ely.q)$$0, $$1, $$2, 0, 1, true);
         this.c((ely.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static ely.g a(ejy $$0, int $$1, int $$2, int $$3, iw $$4, int $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
         return a($$6) && $$0.a($$6) == null ? new ely.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 0, 2, 0, 0, 5, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 4, 0, 5, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 2, 4, 4, 5, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$7 = 0; $$7 <= 4; $$7++) {
            for (int $$8 = 0; $$8 <= 4; $$8++) {
               this.b($$0, dfe.gf.n(), $$7, -1, $$8, $$4);
            }
         }
      }
   }

   public static class h extends ely.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;
      private boolean d;

      public h(int $$0, ayt $$1, ejl $$2, iw $$3) {
         super(ekk.l, $$0, $$2);
         this.a($$3);
         this.d = $$1.a(3) == 0;
      }

      public h(uk $$0) {
         super(ekk.l, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.b((ely.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static ely.h a(ejy $$0, ayt $$1, int $$2, int $$3, int $$4, iw $$5, int $$6) {
         ejl $$7 = ejl.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ely.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dfe.a.n(), dfe.a.n(), false);
         dtc $$7 = dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true));
         dtc $$8 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         this.a($$0, $$4, 4, 2, 0, 4, 5, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$8, $$8, false);
         this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$8, $$8, false);
         this.a($$0, $$4, 0, 2, 0, 0, 5, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 4, 3, 5, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
         this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
         if (this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = false;
            this.a($$0, $$4, $$3, 3, 2, 3, ern.x);
         }

         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$9 = 0; $$9 <= 4; $$9++) {
            for (int $$10 = 0; $$10 <= 4; $$10++) {
               this.b($$0, dfe.gf.n(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class i extends ely.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;

      public i(int $$0, ejl $$1, iw $$2) {
         super(ekk.m, $$0, $$1);
         this.a($$2);
      }

      public i(uk $$0) {
         super(ekk.m, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.a((ely.q)$$0, $$1, $$2, 1, 0, true);
      }

      public static ely.i a(ejy $$0, int $$1, int $$2, int $$3, iw $$4, int $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
         return a($$6) && $$0.a($$6) == null ? new ely.i($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dfe.a.n(), dfe.a.n(), false);
         dtc $$7 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 2, 0, 0, 5, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$7, $$7, false);
         this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$7, $$7, false);
         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$8 = 0; $$8 <= 4; $$8++) {
            for (int $$9 = 0; $$9 <= 4; $$9++) {
               this.b($$0, dfe.gf.n(), $$8, -1, $$9, $$4);
            }
         }
      }
   }

   public static class j extends ely.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;
      private boolean d;

      public j(int $$0, ayt $$1, ejl $$2, iw $$3) {
         super(ekk.n, $$0, $$2);
         this.a($$3);
         this.d = $$1.a(3) == 0;
      }

      public j(uk $$0) {
         super(ekk.n, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.c((ely.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static ely.j a(ejy $$0, ayt $$1, int $$2, int $$3, int $$4, iw $$5, int $$6) {
         ejl $$7 = ejl.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new ely.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dfe.a.n(), dfe.a.n(), false);
         dtc $$7 = dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true));
         dtc $$8 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 2, 0, 0, 5, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$8, $$8, false);
         this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$8, $$8, false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 2, 4, 4, 5, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
         this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
         if (this.d && $$4.b(this.b(1, 2, 3))) {
            this.d = false;
            this.a($$0, $$4, $$3, 1, 2, 3, ern.x);
         }

         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$9 = 0; $$9 <= 4; $$9++) {
            for (int $$10 = 0; $$10 <= 4; $$10++) {
               this.b($$0, dfe.gf.n(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class k extends ely.m {
      private static final int a = 13;
      private static final int b = 14;
      private static final int c = 13;

      public k(int $$0, ejl $$1, iw $$2) {
         super(ekk.o, $$0, $$1);
         this.a($$2);
      }

      public k(uk $$0) {
         super(ekk.o, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.a((ely.q)$$0, $$1, $$2, 5, 3, true);
         this.a((ely.q)$$0, $$1, $$2, 5, 11, true);
      }

      public static ely.k a(ejy $$0, int $$1, int $$2, int $$3, iw $$4, int $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -5, -3, 0, 13, 14, 13, $$4);
         return a($$6) && $$0.a($$6) == null ? new ely.k($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 3, 0, 12, 4, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 5, 0, 12, 13, 12, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 0, 5, 0, 1, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 11, 5, 0, 12, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 11, 4, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 8, 5, 11, 10, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 9, 11, 7, 12, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 12, 1, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 12, 1, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 9, 0, 7, 12, 1, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 11, 2, 10, 12, 10, dfe.gf.n(), dfe.gf.n(), false);
         dtc $$7 = dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true));
         dtc $$8 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         dtc $$9 = $$8.a(did.d, Boolean.valueOf(true));
         dtc $$10 = $$8.a(did.b, Boolean.valueOf(true));

         for (int $$11 = 1; $$11 <= 11; $$11 += 2) {
            this.a($$0, $$4, $$11, 10, 0, $$11, 11, 0, $$7, $$7, false);
            this.a($$0, $$4, $$11, 10, 12, $$11, 11, 12, $$7, $$7, false);
            this.a($$0, $$4, 0, 10, $$11, 0, 11, $$11, $$8, $$8, false);
            this.a($$0, $$4, 12, 10, $$11, 12, 11, $$11, $$8, $$8, false);
            this.a($$0, dfe.gf.n(), $$11, 13, 0, $$4);
            this.a($$0, dfe.gf.n(), $$11, 13, 12, $$4);
            this.a($$0, dfe.gf.n(), 0, 13, $$11, $$4);
            this.a($$0, dfe.gf.n(), 12, 13, $$11, $$4);
            if ($$11 != 11) {
               this.a($$0, $$7, $$11 + 1, 13, 0, $$4);
               this.a($$0, $$7, $$11 + 1, 13, 12, $$4);
               this.a($$0, $$8, 0, 13, $$11 + 1, $$4);
               this.a($$0, $$8, 12, 13, $$11 + 1, $$4);
            }
         }

         this.a($$0, dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true)), 0, 13, 0, $$4);
         this.a($$0, dfe.gg.n().a(did.c, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true)), 0, 13, 12, $$4);
         this.a($$0, dfe.gg.n().a(did.c, Boolean.valueOf(true)).a(did.d, Boolean.valueOf(true)), 12, 13, 12, $$4);
         this.a($$0, dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.d, Boolean.valueOf(true)), 12, 13, 0, $$4);

         for (int $$12 = 3; $$12 <= 9; $$12 += 2) {
            this.a($$0, $$4, 1, 7, $$12, 1, 8, $$12, $$9, $$9, false);
            this.a($$0, $$4, 11, 7, $$12, 11, 8, $$12, $$10, $$10, false);
         }

         dtc $$13 = dfe.gh.n().a(dnk.b, iw.c);

         for (int $$14 = 0; $$14 <= 6; $$14++) {
            int $$15 = $$14 + 4;

            for (int $$16 = 5; $$16 <= 7; $$16++) {
               this.a($$0, $$13, $$16, 5 + $$14, $$15, $$4);
            }

            if ($$15 >= 5 && $$15 <= 8) {
               this.a($$0, $$4, 5, 5, $$15, 7, $$14 + 4, $$15, dfe.gf.n(), dfe.gf.n(), false);
            } else if ($$15 >= 9 && $$15 <= 10) {
               this.a($$0, $$4, 5, 8, $$15, 7, $$14 + 4, $$15, dfe.gf.n(), dfe.gf.n(), false);
            }

            if ($$14 >= 1) {
               this.a($$0, $$4, 5, 6 + $$14, $$15, 7, 9 + $$14, $$15, dfe.a.n(), dfe.a.n(), false);
            }
         }

         for (int $$17 = 5; $$17 <= 7; $$17++) {
            this.a($$0, $$13, $$17, 12, 11, $$4);
         }

         this.a($$0, $$4, 5, 6, 7, 5, 7, 7, $$10, $$10, false);
         this.a($$0, $$4, 7, 6, 7, 7, 7, 7, $$9, $$9, false);
         this.a($$0, $$4, 5, 13, 12, 7, 13, 12, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 2, 5, 2, 3, 5, 3, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 9, 3, 5, 10, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 4, 2, 5, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 9, 5, 2, 10, 5, 3, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 9, 5, 9, 10, 5, 10, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 10, 5, 4, 10, 5, 8, dfe.gf.n(), dfe.gf.n(), false);
         dtc $$18 = $$13.a(dnk.b, iw.f);
         dtc $$19 = $$13.a(dnk.b, iw.e);
         this.a($$0, $$19, 4, 5, 2, $$4);
         this.a($$0, $$19, 4, 5, 3, $$4);
         this.a($$0, $$19, 4, 5, 9, $$4);
         this.a($$0, $$19, 4, 5, 10, $$4);
         this.a($$0, $$18, 8, 5, 2, $$4);
         this.a($$0, $$18, 8, 5, 3, $$4);
         this.a($$0, $$18, 8, 5, 9, $$4);
         this.a($$0, $$18, 8, 5, 10, $$4);
         this.a($$0, $$4, 3, 4, 4, 4, 4, 8, dfe.eK.n(), dfe.eK.n(), false);
         this.a($$0, $$4, 8, 4, 4, 9, 4, 8, dfe.eK.n(), dfe.eK.n(), false);
         this.a($$0, $$4, 3, 5, 4, 4, 5, 8, dfe.gi.n(), dfe.gi.n(), false);
         this.a($$0, $$4, 8, 5, 4, 9, 5, 8, dfe.gi.n(), dfe.gi.n(), false);
         this.a($$0, $$4, 4, 2, 0, 8, 2, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 4, 12, 2, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 0, 0, 8, 1, 3, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 4, 0, 9, 8, 1, 12, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 0, 4, 3, 1, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 9, 0, 4, 12, 1, 8, dfe.gf.n(), dfe.gf.n(), false);

         for (int $$20 = 4; $$20 <= 8; $$20++) {
            for (int $$21 = 0; $$21 <= 2; $$21++) {
               this.b($$0, dfe.gf.n(), $$20, -1, $$21, $$4);
               this.b($$0, dfe.gf.n(), $$20, -1, 12 - $$21, $$4);
            }
         }

         for (int $$22 = 0; $$22 <= 2; $$22++) {
            for (int $$23 = 4; $$23 <= 8; $$23++) {
               this.b($$0, dfe.gf.n(), $$22, -1, $$23, $$4);
               this.b($$0, dfe.gf.n(), 12 - $$22, -1, $$23, $$4);
            }
         }
      }
   }

   public static class l extends ely.m {
      private static final int a = 7;
      private static final int b = 8;
      private static final int c = 9;
      private boolean d;

      public l(int $$0, ejl $$1, iw $$2) {
         super(ekk.p, $$0, $$1);
         this.a($$2);
      }

      public l(uk $$0) {
         super(ekk.p, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      public static ely.l a(ejy $$0, int $$1, int $$2, int $$3, int $$4, iw $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -2, 0, 0, 7, 8, 9, $$5);
         return a($$6) && $$0.a($$6) == null ? new ely.l($$4, $$6, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 2, 0, 6, 7, 7, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 1, 0, 0, 5, 1, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 2, 1, 5, 2, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 3, 2, 5, 3, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 4, 3, 5, 4, 7, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 2, 0, 1, 4, 2, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 2, 0, 5, 4, 2, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 5, 2, 1, 5, 3, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 5, 2, 5, 5, 3, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 5, 3, 0, 5, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 5, 3, 6, 5, 8, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 5, 8, 5, 5, 8, dfe.gf.n(), dfe.gf.n(), false);
         dtc $$7 = dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true));
         dtc $$8 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         this.a($$0, dfe.gg.n().a(did.d, Boolean.valueOf(true)), 1, 6, 3, $$4);
         this.a($$0, dfe.gg.n().a(did.b, Boolean.valueOf(true)), 5, 6, 3, $$4);
         this.a($$0, dfe.gg.n().a(did.b, Boolean.valueOf(true)).a(did.a, Boolean.valueOf(true)), 0, 6, 3, $$4);
         this.a($$0, dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.a, Boolean.valueOf(true)), 6, 6, 3, $$4);
         this.a($$0, $$4, 0, 6, 4, 0, 6, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 6, 4, 6, 6, 7, $$8, $$8, false);
         this.a($$0, dfe.gg.n().a(did.b, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true)), 0, 6, 8, $$4);
         this.a($$0, dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true)), 6, 6, 8, $$4);
         this.a($$0, $$4, 1, 6, 8, 5, 6, 8, $$7, $$7, false);
         this.a($$0, dfe.gg.n().a(did.b, Boolean.valueOf(true)), 1, 7, 8, $$4);
         this.a($$0, $$4, 2, 7, 8, 4, 7, 8, $$7, $$7, false);
         this.a($$0, dfe.gg.n().a(did.d, Boolean.valueOf(true)), 5, 7, 8, $$4);
         this.a($$0, dfe.gg.n().a(did.b, Boolean.valueOf(true)), 2, 8, 8, $$4);
         this.a($$0, $$7, 3, 8, 8, $$4);
         this.a($$0, dfe.gg.n().a(did.d, Boolean.valueOf(true)), 4, 8, 8, $$4);
         if (!this.d) {
            ir $$9 = this.b(3, 5, 5);
            if ($$4.b($$9)) {
               this.d = true;
               $$0.a($$9, dfe.de.n(), 2);
               if ($$0.c_($$9) instanceof drv $$11) {
                  $$11.a(bsb.k, $$3);
               }
            }
         }

         for (int $$12 = 0; $$12 <= 6; $$12++) {
            for (int $$13 = 0; $$13 <= 6; $$13++) {
               this.b($$0, dfe.gf.n(), $$12, -1, $$13, $$4);
            }
         }
      }
   }

   abstract static class m extends ejx {
      protected m(ekk $$0, int $$1, ejl $$2) {
         super($$0, $$1, $$2);
      }

      public m(ekk $$0, uk $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
      }

      private int a(List<ely.n> $$0) {
         boolean $$1 = false;
         int $$2 = 0;

         for (ely.n $$3 : $$0) {
            if ($$3.d > 0 && $$3.c < $$3.d) {
               $$1 = true;
            }

            $$2 += $$3.b;
         }

         return $$1 ? $$2 : -1;
      }

      private ely.m a(ely.q $$0, List<ely.n> $$1, ejy $$2, ayt $$3, int $$4, int $$5, int $$6, iw $$7, int $$8) {
         int $$9 = this.a($$1);
         boolean $$10 = $$9 > 0 && $$8 <= 30;
         int $$11 = 0;

         while ($$11 < 5 && $$10) {
            $$11++;
            int $$12 = $$3.a($$9);

            for (ely.n $$13 : $$1) {
               $$12 -= $$13.b;
               if ($$12 < 0) {
                  if (!$$13.a($$8) || $$13 == $$0.a && !$$13.e) {
                     break;
                  }

                  ely.m $$14 = ely.a($$13, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
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

         return ely.b.a($$2, $$3, $$4, $$5, $$6, $$7, $$8);
      }

      private ejx a(ely.q $$0, ejy $$1, ayt $$2, int $$3, int $$4, int $$5, @Nullable iw $$6, int $$7, boolean $$8) {
         if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
            List<ely.n> $$9 = $$0.b;
            if ($$8) {
               $$9 = $$0.c;
            }

            ejx $$10 = this.a($$0, $$9, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
            if ($$10 != null) {
               $$1.a($$10);
               $$0.d.add($$10);
            }

            return $$10;
         } else {
            return ely.b.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }

      @Nullable
      protected ejx a(ely.q $$0, ejy $$1, ayt $$2, int $$3, int $$4, boolean $$5) {
         iw $$6 = this.i();
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
      protected ejx b(ely.q $$0, ejy $$1, ayt $$2, int $$3, int $$4, boolean $$5) {
         iw $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, iw.e, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, iw.e, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, iw.c, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, iw.c, this.g(), $$5);
            }
         }

         return null;
      }

      @Nullable
      protected ejx c(ely.q $$0, ejy $$1, ayt $$2, int $$3, int $$4, boolean $$5) {
         iw $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, iw.f, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, iw.f, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, iw.d, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, iw.d, this.g(), $$5);
            }
         }

         return null;
      }

      protected static boolean a(ejl $$0) {
         return $$0 != null && $$0.i() > 10;
      }
   }

   static class n {
      public final Class<? extends ely.m> a;
      public final int b;
      public int c;
      public final int d;
      public final boolean e;

      public n(Class<? extends ely.m> $$0, int $$1, int $$2, boolean $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
      }

      public n(Class<? extends ely.m> $$0, int $$1, int $$2) {
         this($$0, $$1, $$2, false);
      }

      public boolean a(int $$0) {
         return this.d == 0 || this.c < this.d;
      }

      public boolean a() {
         return this.d == 0 || this.c < this.d;
      }
   }

   public static class o extends ely.m {
      private static final int a = 7;
      private static final int b = 9;
      private static final int c = 7;

      public o(int $$0, ejl $$1, iw $$2) {
         super(ekk.q, $$0, $$1);
         this.a($$2);
      }

      public o(uk $$0) {
         super(ekk.q, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.a((ely.q)$$0, $$1, $$2, 2, 0, false);
         this.b((ely.q)$$0, $$1, $$2, 0, 2, false);
         this.c((ely.q)$$0, $$1, $$2, 0, 2, false);
      }

      public static ely.o a(ejy $$0, int $$1, int $$2, int $$3, iw $$4, int $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -2, 0, 0, 7, 9, 7, $$4);
         return a($$6) && $$0.a($$6) == null ? new ely.o($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 0, 0, 6, 1, 6, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 6, 7, 6, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 0, 2, 0, 1, 6, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 6, 1, 6, 6, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 2, 0, 6, 6, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 2, 6, 6, 6, 6, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 0, 6, 1, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 5, 0, 6, 6, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 2, 0, 6, 6, 1, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 2, 5, 6, 6, 6, dfe.gf.n(), dfe.gf.n(), false);
         dtc $$7 = dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true));
         dtc $$8 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         this.a($$0, $$4, 2, 6, 0, 4, 6, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);
         this.a($$0, $$4, 2, 6, 6, 4, 6, 6, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 6, 4, 5, 6, $$7, $$7, false);
         this.a($$0, $$4, 0, 6, 2, 0, 6, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 5, 2, 0, 5, 4, $$8, $$8, false);
         this.a($$0, $$4, 6, 6, 2, 6, 6, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 5, 2, 6, 5, 4, $$8, $$8, false);

         for (int $$9 = 0; $$9 <= 6; $$9++) {
            for (int $$10 = 0; $$10 <= 6; $$10++) {
               this.b($$0, dfe.gf.n(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class p extends ely.m {
      private static final int a = 7;
      private static final int b = 11;
      private static final int c = 7;

      public p(int $$0, ejl $$1, iw $$2) {
         super(ekk.r, $$0, $$1);
         this.a($$2);
      }

      public p(uk $$0) {
         super(ekk.r, $$0);
      }

      @Override
      public void a(ejx $$0, ejy $$1, ayt $$2) {
         this.c((ely.q)$$0, $$1, $$2, 6, 2, false);
      }

      public static ely.p a(ejy $$0, int $$1, int $$2, int $$3, int $$4, iw $$5) {
         ejl $$6 = ejl.a($$1, $$2, $$3, -2, 0, 0, 7, 11, 7, $$5);
         return a($$6) && $$0.a($$6) == null ? new ely.p($$4, $$6, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         this.a($$0, $$4, 0, 0, 0, 6, 1, 6, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 0, 6, 10, 6, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 0, 2, 0, 1, 8, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 5, 2, 0, 6, 8, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 0, 2, 1, 0, 8, 6, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 2, 1, 6, 8, 6, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 2, 6, 5, 8, 6, dfe.gf.n(), dfe.gf.n(), false);
         dtc $$7 = dfe.gg.n().a(did.d, Boolean.valueOf(true)).a(did.b, Boolean.valueOf(true));
         dtc $$8 = dfe.gg.n().a(did.a, Boolean.valueOf(true)).a(did.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 3, 2, 0, 5, 4, $$8, $$8, false);
         this.a($$0, $$4, 6, 3, 2, 6, 5, 2, $$8, $$8, false);
         this.a($$0, $$4, 6, 3, 4, 6, 5, 4, $$8, $$8, false);
         this.a($$0, dfe.gf.n(), 5, 2, 5, $$4);
         this.a($$0, $$4, 4, 2, 5, 4, 3, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 3, 2, 5, 3, 4, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 2, 5, 2, 5, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 2, 5, 1, 6, 5, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 1, 7, 1, 5, 7, 4, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 6, 8, 2, 6, 8, 4, dfe.a.n(), dfe.a.n(), false);
         this.a($$0, $$4, 2, 6, 0, 4, 8, 0, dfe.gf.n(), dfe.gf.n(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);

         for (int $$9 = 0; $$9 <= 6; $$9++) {
            for (int $$10 = 0; $$10 <= 6; $$10++) {
               this.b($$0, dfe.gf.n(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class q extends ely.a {
      public ely.n a;
      public List<ely.n> b;
      public List<ely.n> c;
      public final List<ejx> d = Lists.newArrayList();

      public q(ayt $$0, int $$1, int $$2) {
         super($$1, $$2, a($$0));
         this.b = Lists.newArrayList();

         for (ely.n $$3 : ely.d) {
            $$3.c = 0;
            this.b.add($$3);
         }

         this.c = Lists.newArrayList();

         for (ely.n $$4 : ely.e) {
            $$4.c = 0;
            this.c.add($$4);
         }
      }

      public q(uk $$0) {
         super(ekk.s, $$0);
      }
   }
}
