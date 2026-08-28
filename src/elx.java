import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class elx {
   private static final int b = 30;
   private static final int c = 10;
   public static final int a = 64;
   static final elx.n[] d = new elx.n[]{
      new elx.n(elx.c.class, 30, 0, true),
      new elx.n(elx.a.class, 10, 4),
      new elx.n(elx.o.class, 10, 4),
      new elx.n(elx.p.class, 10, 3),
      new elx.n(elx.l.class, 5, 2),
      new elx.n(elx.f.class, 5, 1)
   };
   static final elx.n[] e = new elx.n[]{
      new elx.n(elx.i.class, 25, 0, true),
      new elx.n(elx.g.class, 15, 5),
      new elx.n(elx.j.class, 5, 10),
      new elx.n(elx.h.class, 5, 10),
      new elx.n(elx.d.class, 10, 3, true),
      new elx.n(elx.e.class, 7, 2),
      new elx.n(elx.k.class, 5, 2)
   };

   static elx.m a(elx.n $$0, ejw $$1, ayw $$2, int $$3, int $$4, int $$5, ji $$6, int $$7) {
      Class<? extends elx.m> $$8 = $$0.a;
      elx.m $$9 = null;
      if ($$8 == elx.c.class) {
         $$9 = elx.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.a.class) {
         $$9 = elx.a.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.o.class) {
         $$9 = elx.o.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.p.class) {
         $$9 = elx.p.a($$1, $$3, $$4, $$5, $$7, $$6);
      } else if ($$8 == elx.l.class) {
         $$9 = elx.l.a($$1, $$3, $$4, $$5, $$7, $$6);
      } else if ($$8 == elx.f.class) {
         $$9 = elx.f.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.i.class) {
         $$9 = elx.i.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.j.class) {
         $$9 = elx.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.h.class) {
         $$9 = elx.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.d.class) {
         $$9 = elx.d.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.e.class) {
         $$9 = elx.e.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.g.class) {
         $$9 = elx.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == elx.k.class) {
         $$9 = elx.k.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$9;
   }

   public static class a extends elx.m {
      private static final int a = 19;
      private static final int b = 10;
      private static final int c = 19;

      public a(int $$0, ejj $$1, ji $$2) {
         super(eki.e, $$0, $$1);
         this.a($$2);
      }

      protected a(int $$0, int $$1, ji $$2) {
         super(eki.e, 0, ejv.a($$0, 64, $$1, $$2, 19, 10, 19));
         this.a($$2);
      }

      protected a(eki $$0, ub $$1) {
         super($$0, $$1);
      }

      public a(ub $$0) {
         this(eki.e, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.a((elx.q)$$0, $$1, $$2, 8, 3, false);
         this.b((elx.q)$$0, $$1, $$2, 3, 8, false);
         this.c((elx.q)$$0, $$1, $$2, 3, 8, false);
      }

      public static elx.a a(ejw $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -8, -3, 0, 19, 10, 19, $$4);
         return a($$6) && $$0.a($$6) == null ? new elx.a($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 7, 3, 0, 11, 4, 18, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 3, 7, 18, 4, 11, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 7, 18, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 0, 5, 8, 18, 7, 10, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 7, 5, 0, 7, 5, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 7, 5, 11, 7, 5, 18, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 11, 5, 0, 11, 5, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 11, 5, 11, 11, 5, 18, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 5, 7, 7, 5, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 11, 5, 7, 18, 5, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 5, 11, 7, 5, 11, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 11, 5, 11, 18, 5, 11, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 7, 2, 0, 11, 2, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 7, 2, 13, 11, 2, 18, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 7, 0, 0, 11, 1, 3, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 7, 0, 15, 11, 1, 18, dga.fn.o(), dga.fn.o(), false);

         for (int $$7 = 7; $$7 <= 11; $$7++) {
            for (int $$8 = 0; $$8 <= 2; $$8++) {
               this.b($$0, dga.fn.o(), $$7, -1, $$8, $$4);
               this.b($$0, dga.fn.o(), $$7, -1, 18 - $$8, $$4);
            }
         }

         this.a($$0, $$4, 0, 2, 7, 5, 2, 11, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 13, 2, 7, 18, 2, 11, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 0, 7, 3, 1, 11, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 15, 0, 7, 18, 1, 11, dga.fn.o(), dga.fn.o(), false);

         for (int $$9 = 0; $$9 <= 2; $$9++) {
            for (int $$10 = 7; $$10 <= 11; $$10++) {
               this.b($$0, dga.fn.o(), $$9, -1, $$10, $$4);
               this.b($$0, dga.fn.o(), 18 - $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class b extends elx.m {
      private static final int a = 5;
      private static final int b = 10;
      private static final int c = 8;
      private final int d;

      public b(int $$0, ayw $$1, ejj $$2, ji $$3) {
         super(eki.f, $$0, $$2);
         this.a($$3);
         this.d = $$1.f();
      }

      public b(ub $$0) {
         super(eki.f, $$0);
         this.d = $$0.h("Seed");
      }

      public static elx.b a(ejw $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejj $$7 = ejj.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new elx.b($$6, $$1, $$7, $$5) : null;
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Seed", this.d);
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         ayw $$7 = ayw.a((long)this.d);

         for (int $$8 = 0; $$8 <= 4; $$8++) {
            for (int $$9 = 3; $$9 <= 4; $$9++) {
               int $$10 = $$7.a(8);
               this.a($$0, $$4, $$8, $$9, 0, $$8, $$9, $$10, dga.fn.o(), dga.fn.o(), false);
            }
         }

         int $$11 = $$7.a(8);
         this.a($$0, $$4, 0, 5, 0, 0, 5, $$11, dga.fn.o(), dga.fn.o(), false);
         $$11 = $$7.a(8);
         this.a($$0, $$4, 4, 5, 0, 4, 5, $$11, dga.fn.o(), dga.fn.o(), false);

         for (int $$13 = 0; $$13 <= 4; $$13++) {
            int $$14 = $$7.a(5);
            this.a($$0, $$4, $$13, 2, 0, $$13, 2, $$14, dga.fn.o(), dga.fn.o(), false);
         }

         for (int $$15 = 0; $$15 <= 4; $$15++) {
            for (int $$16 = 0; $$16 <= 1; $$16++) {
               int $$17 = $$7.a(3);
               this.a($$0, $$4, $$15, $$16, 0, $$15, $$16, $$17, dga.fn.o(), dga.fn.o(), false);
            }
         }
      }
   }

   public static class c extends elx.m {
      private static final int a = 5;
      private static final int b = 10;
      private static final int c = 19;

      public c(int $$0, ayw $$1, ejj $$2, ji $$3) {
         super(eki.g, $$0, $$2);
         this.a($$3);
      }

      public c(ub $$0) {
         super(eki.g, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.a((elx.q)$$0, $$1, $$2, 1, 3, false);
      }

      public static elx.c a(ejw $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejj $$7 = ejj.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 19, $$5);
         return a($$7) && $$0.a($$7) == null ? new elx.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 3, 0, 4, 4, 18, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 5, 0, 3, 7, 18, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 0, 5, 0, 0, 5, 18, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 5, 0, 4, 5, 18, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 2, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 13, 4, 2, 18, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 0, 0, 4, 1, 3, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 0, 15, 4, 1, 18, dga.fn.o(), dga.fn.o(), false);

         for (int $$7 = 0; $$7 <= 4; $$7++) {
            for (int $$8 = 0; $$8 <= 2; $$8++) {
               this.b($$0, dga.fn.o(), $$7, -1, $$8, $$4);
               this.b($$0, dga.fn.o(), $$7, -1, 18 - $$8, $$4);
            }
         }

         dtc $$9 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         dtc $$10 = $$9.a(diw.b, Boolean.valueOf(true));
         dtc $$11 = $$9.a(diw.d, Boolean.valueOf(true));
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

   public static class d extends elx.m {
      private static final int a = 5;
      private static final int b = 14;
      private static final int c = 10;

      public d(int $$0, ejj $$1, ji $$2) {
         super(eki.h, $$0, $$1);
         this.a($$2);
      }

      public d(ub $$0) {
         super(eki.h, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.a((elx.q)$$0, $$1, $$2, 1, 0, true);
      }

      public static elx.d a(ejw $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -1, -7, 0, 5, 14, 10, $$4);
         return a($$6) && $$0.a($$6) == null ? new elx.d($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         dtc $$7 = dga.fp.o().a(dnt.b, ji.d);
         dtc $$8 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));

         for (int $$9 = 0; $$9 <= 9; $$9++) {
            int $$10 = Math.max(1, 7 - $$9);
            int $$11 = Math.min(Math.max($$10 + 5, 14 - $$9), 13);
            int $$12 = $$9;
            this.a($$0, $$4, 0, 0, $$9, 4, $$10, $$9, dga.fn.o(), dga.fn.o(), false);
            this.a($$0, $$4, 1, $$10 + 1, $$9, 3, $$11 - 1, $$9, dga.a.o(), dga.a.o(), false);
            if ($$9 <= 6) {
               this.a($$0, $$7, 1, $$10 + 1, $$9, $$4);
               this.a($$0, $$7, 2, $$10 + 1, $$9, $$4);
               this.a($$0, $$7, 3, $$10 + 1, $$9, $$4);
            }

            this.a($$0, $$4, 0, $$11, $$9, 4, $$11, $$9, dga.fn.o(), dga.fn.o(), false);
            this.a($$0, $$4, 0, $$10 + 1, $$9, 0, $$11 - 1, $$9, dga.fn.o(), dga.fn.o(), false);
            this.a($$0, $$4, 4, $$10 + 1, $$9, 4, $$11 - 1, $$9, dga.fn.o(), dga.fn.o(), false);
            if (($$9 & 1) == 0) {
               this.a($$0, $$4, 0, $$10 + 2, $$9, 0, $$10 + 3, $$9, $$8, $$8, false);
               this.a($$0, $$4, 4, $$10 + 2, $$9, 4, $$10 + 3, $$9, $$8, $$8, false);
            }

            for (int $$13 = 0; $$13 <= 4; $$13++) {
               this.b($$0, dga.fn.o(), $$13, -1, $$12, $$4);
            }
         }
      }
   }

   public static class e extends elx.m {
      private static final int a = 9;
      private static final int b = 7;
      private static final int c = 9;

      public e(int $$0, ejj $$1, ji $$2) {
         super(eki.i, $$0, $$1);
         this.a($$2);
      }

      public e(ub $$0) {
         super(eki.i, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         int $$3 = 1;
         ji $$4 = this.i();
         if ($$4 == ji.e || $$4 == ji.c) {
            $$3 = 5;
         }

         this.b((elx.q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
         this.c((elx.q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
      }

      public static elx.e a(ejw $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -3, 0, 0, 9, 7, 9, $$4);
         return a($$6) && $$0.a($$6) == null ? new elx.e($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         dtc $$7 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         dtc $$8 = dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 0, 0, 8, 1, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 8, 5, 8, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 0, 6, 0, 8, 6, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 2, 5, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 2, 0, 8, 5, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 3, 0, 1, 4, 0, $$8, $$8, false);
         this.a($$0, $$4, 7, 3, 0, 7, 4, 0, $$8, $$8, false);
         this.a($$0, $$4, 0, 2, 4, 8, 2, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 1, 4, 2, 2, 4, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 6, 1, 4, 7, 2, 4, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 1, 3, 8, 7, 3, 8, $$8, $$8, false);
         this.a($$0, dga.fo.o().a(diw.b, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true)), 0, 3, 8, $$4);
         this.a($$0, dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true)), 8, 3, 8, $$4);
         this.a($$0, $$4, 0, 3, 6, 0, 3, 7, $$7, $$7, false);
         this.a($$0, $$4, 8, 3, 6, 8, 3, 7, $$7, $$7, false);
         this.a($$0, $$4, 0, 3, 4, 0, 5, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 8, 3, 4, 8, 5, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 3, 5, 2, 5, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 3, 5, 7, 5, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 4, 5, 1, 5, 5, $$8, $$8, false);
         this.a($$0, $$4, 7, 4, 5, 7, 5, 5, $$8, $$8, false);

         for (int $$9 = 0; $$9 <= 5; $$9++) {
            for (int $$10 = 0; $$10 <= 8; $$10++) {
               this.b($$0, dga.fn.o(), $$10, -1, $$9, $$4);
            }
         }
      }
   }

   public static class f extends elx.m {
      private static final int a = 13;
      private static final int b = 14;
      private static final int c = 13;

      public f(int $$0, ayw $$1, ejj $$2, ji $$3) {
         super(eki.j, $$0, $$2);
         this.a($$3);
      }

      public f(ub $$0) {
         super(eki.j, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.a((elx.q)$$0, $$1, $$2, 5, 3, true);
      }

      public static elx.f a(ejw $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejj $$7 = ejj.a($$2, $$3, $$4, -5, -3, 0, 13, 14, 13, $$5);
         return a($$7) && $$0.a($$7) == null ? new elx.f($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 3, 0, 12, 4, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 5, 0, 12, 13, 12, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 0, 5, 0, 1, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 11, 5, 0, 12, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 11, 4, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 8, 5, 11, 10, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 9, 11, 7, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 12, 1, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 12, 1, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 9, 0, 7, 12, 1, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 11, 2, 10, 12, 10, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 8, 0, 7, 8, 0, dga.fo.o(), dga.fo.o(), false);
         dtc $$7 = dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
         dtc $$8 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));

         for (int $$9 = 1; $$9 <= 11; $$9 += 2) {
            this.a($$0, $$4, $$9, 10, 0, $$9, 11, 0, $$7, $$7, false);
            this.a($$0, $$4, $$9, 10, 12, $$9, 11, 12, $$7, $$7, false);
            this.a($$0, $$4, 0, 10, $$9, 0, 11, $$9, $$8, $$8, false);
            this.a($$0, $$4, 12, 10, $$9, 12, 11, $$9, $$8, $$8, false);
            this.a($$0, dga.fn.o(), $$9, 13, 0, $$4);
            this.a($$0, dga.fn.o(), $$9, 13, 12, $$4);
            this.a($$0, dga.fn.o(), 0, 13, $$9, $$4);
            this.a($$0, dga.fn.o(), 12, 13, $$9, $$4);
            if ($$9 != 11) {
               this.a($$0, $$7, $$9 + 1, 13, 0, $$4);
               this.a($$0, $$7, $$9 + 1, 13, 12, $$4);
               this.a($$0, $$8, 0, 13, $$9 + 1, $$4);
               this.a($$0, $$8, 12, 13, $$9 + 1, $$4);
            }
         }

         this.a($$0, dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true)), 0, 13, 0, $$4);
         this.a($$0, dga.fo.o().a(diw.c, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true)), 0, 13, 12, $$4);
         this.a($$0, dga.fo.o().a(diw.c, Boolean.valueOf(true)).a(diw.d, Boolean.valueOf(true)), 12, 13, 12, $$4);
         this.a($$0, dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.d, Boolean.valueOf(true)), 12, 13, 0, $$4);

         for (int $$10 = 3; $$10 <= 9; $$10 += 2) {
            this.a($$0, $$4, 1, 7, $$10, 1, 8, $$10, $$8.a(diw.d, Boolean.valueOf(true)), $$8.a(diw.d, Boolean.valueOf(true)), false);
            this.a($$0, $$4, 11, 7, $$10, 11, 8, $$10, $$8.a(diw.b, Boolean.valueOf(true)), $$8.a(diw.b, Boolean.valueOf(true)), false);
         }

         this.a($$0, $$4, 4, 2, 0, 8, 2, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 4, 12, 2, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 0, 0, 8, 1, 3, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 0, 9, 8, 1, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 0, 4, 3, 1, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 9, 0, 4, 12, 1, 8, dga.fn.o(), dga.fn.o(), false);

         for (int $$11 = 4; $$11 <= 8; $$11++) {
            for (int $$12 = 0; $$12 <= 2; $$12++) {
               this.b($$0, dga.fn.o(), $$11, -1, $$12, $$4);
               this.b($$0, dga.fn.o(), $$11, -1, 12 - $$12, $$4);
            }
         }

         for (int $$13 = 0; $$13 <= 2; $$13++) {
            for (int $$14 = 4; $$14 <= 8; $$14++) {
               this.b($$0, dga.fn.o(), $$13, -1, $$14, $$4);
               this.b($$0, dga.fn.o(), 12 - $$13, -1, $$14, $$4);
            }
         }

         this.a($$0, $$4, 5, 5, 5, 7, 5, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 1, 6, 6, 4, 6, dga.a.o(), dga.a.o(), false);
         this.a($$0, dga.fn.o(), 6, 0, 6, $$4);
         this.a($$0, dga.H.o(), 6, 5, 6, $$4);
         jd $$15 = this.b(6, 5, 6);
         if ($$4.b($$15)) {
            $$0.a($$15, epf.e, 0);
         }
      }
   }

   public static class g extends elx.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;

      public g(int $$0, ejj $$1, ji $$2) {
         super(eki.k, $$0, $$1);
         this.a($$2);
      }

      public g(ub $$0) {
         super(eki.k, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.a((elx.q)$$0, $$1, $$2, 1, 0, true);
         this.b((elx.q)$$0, $$1, $$2, 0, 1, true);
         this.c((elx.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static elx.g a(ejw $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
         return a($$6) && $$0.a($$6) == null ? new elx.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 0, 2, 0, 0, 5, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 4, 0, 5, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 2, 4, 4, 5, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dga.fn.o(), dga.fn.o(), false);

         for (int $$7 = 0; $$7 <= 4; $$7++) {
            for (int $$8 = 0; $$8 <= 4; $$8++) {
               this.b($$0, dga.fn.o(), $$7, -1, $$8, $$4);
            }
         }
      }
   }

   public static class h extends elx.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;
      private boolean d;

      public h(int $$0, ayw $$1, ejj $$2, ji $$3) {
         super(eki.l, $$0, $$2);
         this.a($$3);
         this.d = $$1.a(3) == 0;
      }

      public h(ub $$0) {
         super(eki.l, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.b((elx.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static elx.h a(ejw $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejj $$7 = ejj.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elx.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dga.a.o(), dga.a.o(), false);
         dtc $$7 = dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
         dtc $$8 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         this.a($$0, $$4, 4, 2, 0, 4, 5, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$8, $$8, false);
         this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$8, $$8, false);
         this.a($$0, $$4, 0, 2, 0, 0, 5, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 4, 3, 5, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
         this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
         if (this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = false;
            this.a($$0, $$4, $$3, 3, 2, 3, ern.v);
         }

         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dga.fn.o(), dga.fn.o(), false);

         for (int $$9 = 0; $$9 <= 4; $$9++) {
            for (int $$10 = 0; $$10 <= 4; $$10++) {
               this.b($$0, dga.fn.o(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class i extends elx.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;

      public i(int $$0, ejj $$1, ji $$2) {
         super(eki.m, $$0, $$1);
         this.a($$2);
      }

      public i(ub $$0) {
         super(eki.m, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.a((elx.q)$$0, $$1, $$2, 1, 0, true);
      }

      public static elx.i a(ejw $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
         return a($$6) && $$0.a($$6) == null ? new elx.i($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dga.a.o(), dga.a.o(), false);
         dtc $$7 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 2, 0, 0, 5, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$7, $$7, false);
         this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$7, $$7, false);
         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dga.fn.o(), dga.fn.o(), false);

         for (int $$8 = 0; $$8 <= 4; $$8++) {
            for (int $$9 = 0; $$9 <= 4; $$9++) {
               this.b($$0, dga.fn.o(), $$8, -1, $$9, $$4);
            }
         }
      }
   }

   public static class j extends elx.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;
      private boolean d;

      public j(int $$0, ayw $$1, ejj $$2, ji $$3) {
         super(eki.n, $$0, $$2);
         this.a($$3);
         this.d = $$1.a(3) == 0;
      }

      public j(ub $$0) {
         super(eki.n, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.c((elx.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static elx.j a(ejw $$0, ayw $$1, int $$2, int $$3, int $$4, ji $$5, int $$6) {
         ejj $$7 = ejj.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new elx.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, dga.a.o(), dga.a.o(), false);
         dtc $$7 = dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
         dtc $$8 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 2, 0, 0, 5, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$8, $$8, false);
         this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$8, $$8, false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 2, 4, 4, 5, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
         this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
         if (this.d && $$4.b(this.b(1, 2, 3))) {
            this.d = false;
            this.a($$0, $$4, $$3, 1, 2, 3, ern.v);
         }

         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, dga.fn.o(), dga.fn.o(), false);

         for (int $$9 = 0; $$9 <= 4; $$9++) {
            for (int $$10 = 0; $$10 <= 4; $$10++) {
               this.b($$0, dga.fn.o(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class k extends elx.m {
      private static final int a = 13;
      private static final int b = 14;
      private static final int c = 13;

      public k(int $$0, ejj $$1, ji $$2) {
         super(eki.o, $$0, $$1);
         this.a($$2);
      }

      public k(ub $$0) {
         super(eki.o, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.a((elx.q)$$0, $$1, $$2, 5, 3, true);
         this.a((elx.q)$$0, $$1, $$2, 5, 11, true);
      }

      public static elx.k a(ejw $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -5, -3, 0, 13, 14, 13, $$4);
         return a($$6) && $$0.a($$6) == null ? new elx.k($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 3, 0, 12, 4, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 5, 0, 12, 13, 12, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 0, 5, 0, 1, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 11, 5, 0, 12, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 11, 4, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 8, 5, 11, 10, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 9, 11, 7, 12, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 12, 1, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 12, 1, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 9, 0, 7, 12, 1, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 11, 2, 10, 12, 10, dga.fn.o(), dga.fn.o(), false);
         dtc $$7 = dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
         dtc $$8 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         dtc $$9 = $$8.a(diw.d, Boolean.valueOf(true));
         dtc $$10 = $$8.a(diw.b, Boolean.valueOf(true));

         for (int $$11 = 1; $$11 <= 11; $$11 += 2) {
            this.a($$0, $$4, $$11, 10, 0, $$11, 11, 0, $$7, $$7, false);
            this.a($$0, $$4, $$11, 10, 12, $$11, 11, 12, $$7, $$7, false);
            this.a($$0, $$4, 0, 10, $$11, 0, 11, $$11, $$8, $$8, false);
            this.a($$0, $$4, 12, 10, $$11, 12, 11, $$11, $$8, $$8, false);
            this.a($$0, dga.fn.o(), $$11, 13, 0, $$4);
            this.a($$0, dga.fn.o(), $$11, 13, 12, $$4);
            this.a($$0, dga.fn.o(), 0, 13, $$11, $$4);
            this.a($$0, dga.fn.o(), 12, 13, $$11, $$4);
            if ($$11 != 11) {
               this.a($$0, $$7, $$11 + 1, 13, 0, $$4);
               this.a($$0, $$7, $$11 + 1, 13, 12, $$4);
               this.a($$0, $$8, 0, 13, $$11 + 1, $$4);
               this.a($$0, $$8, 12, 13, $$11 + 1, $$4);
            }
         }

         this.a($$0, dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true)), 0, 13, 0, $$4);
         this.a($$0, dga.fo.o().a(diw.c, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true)), 0, 13, 12, $$4);
         this.a($$0, dga.fo.o().a(diw.c, Boolean.valueOf(true)).a(diw.d, Boolean.valueOf(true)), 12, 13, 12, $$4);
         this.a($$0, dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.d, Boolean.valueOf(true)), 12, 13, 0, $$4);

         for (int $$12 = 3; $$12 <= 9; $$12 += 2) {
            this.a($$0, $$4, 1, 7, $$12, 1, 8, $$12, $$9, $$9, false);
            this.a($$0, $$4, 11, 7, $$12, 11, 8, $$12, $$10, $$10, false);
         }

         dtc $$13 = dga.fp.o().a(dnt.b, ji.c);

         for (int $$14 = 0; $$14 <= 6; $$14++) {
            int $$15 = $$14 + 4;

            for (int $$16 = 5; $$16 <= 7; $$16++) {
               this.a($$0, $$13, $$16, 5 + $$14, $$15, $$4);
            }

            if ($$15 >= 5 && $$15 <= 8) {
               this.a($$0, $$4, 5, 5, $$15, 7, $$14 + 4, $$15, dga.fn.o(), dga.fn.o(), false);
            } else if ($$15 >= 9 && $$15 <= 10) {
               this.a($$0, $$4, 5, 8, $$15, 7, $$14 + 4, $$15, dga.fn.o(), dga.fn.o(), false);
            }

            if ($$14 >= 1) {
               this.a($$0, $$4, 5, 6 + $$14, $$15, 7, 9 + $$14, $$15, dga.a.o(), dga.a.o(), false);
            }
         }

         for (int $$17 = 5; $$17 <= 7; $$17++) {
            this.a($$0, $$13, $$17, 12, 11, $$4);
         }

         this.a($$0, $$4, 5, 6, 7, 5, 7, 7, $$10, $$10, false);
         this.a($$0, $$4, 7, 6, 7, 7, 7, 7, $$9, $$9, false);
         this.a($$0, $$4, 5, 13, 12, 7, 13, 12, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 2, 5, 2, 3, 5, 3, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 9, 3, 5, 10, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 4, 2, 5, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 9, 5, 2, 10, 5, 3, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 9, 5, 9, 10, 5, 10, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 10, 5, 4, 10, 5, 8, dga.fn.o(), dga.fn.o(), false);
         dtc $$18 = $$13.a(dnt.b, ji.f);
         dtc $$19 = $$13.a(dnt.b, ji.e);
         this.a($$0, $$19, 4, 5, 2, $$4);
         this.a($$0, $$19, 4, 5, 3, $$4);
         this.a($$0, $$19, 4, 5, 9, $$4);
         this.a($$0, $$19, 4, 5, 10, $$4);
         this.a($$0, $$18, 8, 5, 2, $$4);
         this.a($$0, $$18, 8, 5, 3, $$4);
         this.a($$0, $$18, 8, 5, 9, $$4);
         this.a($$0, $$18, 8, 5, 10, $$4);
         this.a($$0, $$4, 3, 4, 4, 4, 4, 8, dga.dW.o(), dga.dW.o(), false);
         this.a($$0, $$4, 8, 4, 4, 9, 4, 8, dga.dW.o(), dga.dW.o(), false);
         this.a($$0, $$4, 3, 5, 4, 4, 5, 8, dga.fq.o(), dga.fq.o(), false);
         this.a($$0, $$4, 8, 5, 4, 9, 5, 8, dga.fq.o(), dga.fq.o(), false);
         this.a($$0, $$4, 4, 2, 0, 8, 2, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 4, 12, 2, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 0, 0, 8, 1, 3, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 4, 0, 9, 8, 1, 12, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 0, 4, 3, 1, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 9, 0, 4, 12, 1, 8, dga.fn.o(), dga.fn.o(), false);

         for (int $$20 = 4; $$20 <= 8; $$20++) {
            for (int $$21 = 0; $$21 <= 2; $$21++) {
               this.b($$0, dga.fn.o(), $$20, -1, $$21, $$4);
               this.b($$0, dga.fn.o(), $$20, -1, 12 - $$21, $$4);
            }
         }

         for (int $$22 = 0; $$22 <= 2; $$22++) {
            for (int $$23 = 4; $$23 <= 8; $$23++) {
               this.b($$0, dga.fn.o(), $$22, -1, $$23, $$4);
               this.b($$0, dga.fn.o(), 12 - $$22, -1, $$23, $$4);
            }
         }
      }
   }

   public static class l extends elx.m {
      private static final int a = 7;
      private static final int b = 8;
      private static final int c = 9;
      private boolean d;

      public l(int $$0, ejj $$1, ji $$2) {
         super(eki.p, $$0, $$1);
         this.a($$2);
      }

      public l(ub $$0) {
         super(eki.p, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      public static elx.l a(ejw $$0, int $$1, int $$2, int $$3, int $$4, ji $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -2, 0, 0, 7, 8, 9, $$5);
         return a($$6) && $$0.a($$6) == null ? new elx.l($$4, $$6, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 2, 0, 6, 7, 7, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 1, 0, 0, 5, 1, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 2, 1, 5, 2, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 3, 2, 5, 3, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 4, 3, 5, 4, 7, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 2, 0, 1, 4, 2, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 2, 0, 5, 4, 2, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 5, 2, 1, 5, 3, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 5, 2, 5, 5, 3, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 5, 3, 0, 5, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 5, 3, 6, 5, 8, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 5, 8, 5, 5, 8, dga.fn.o(), dga.fn.o(), false);
         dtc $$7 = dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
         dtc $$8 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         this.a($$0, dga.fo.o().a(diw.d, Boolean.valueOf(true)), 1, 6, 3, $$4);
         this.a($$0, dga.fo.o().a(diw.b, Boolean.valueOf(true)), 5, 6, 3, $$4);
         this.a($$0, dga.fo.o().a(diw.b, Boolean.valueOf(true)).a(diw.a, Boolean.valueOf(true)), 0, 6, 3, $$4);
         this.a($$0, dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.a, Boolean.valueOf(true)), 6, 6, 3, $$4);
         this.a($$0, $$4, 0, 6, 4, 0, 6, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 6, 4, 6, 6, 7, $$8, $$8, false);
         this.a($$0, dga.fo.o().a(diw.b, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true)), 0, 6, 8, $$4);
         this.a($$0, dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true)), 6, 6, 8, $$4);
         this.a($$0, $$4, 1, 6, 8, 5, 6, 8, $$7, $$7, false);
         this.a($$0, dga.fo.o().a(diw.b, Boolean.valueOf(true)), 1, 7, 8, $$4);
         this.a($$0, $$4, 2, 7, 8, 4, 7, 8, $$7, $$7, false);
         this.a($$0, dga.fo.o().a(diw.d, Boolean.valueOf(true)), 5, 7, 8, $$4);
         this.a($$0, dga.fo.o().a(diw.b, Boolean.valueOf(true)), 2, 8, 8, $$4);
         this.a($$0, $$7, 3, 8, 8, $$4);
         this.a($$0, dga.fo.o().a(diw.d, Boolean.valueOf(true)), 4, 8, 8, $$4);
         if (!this.d) {
            jd $$9 = this.b(3, 5, 5);
            if ($$4.b($$9)) {
               this.d = true;
               $$0.a($$9, dga.ct.o(), 2);
               if ($$0.c_($$9) instanceof drw $$11) {
                  $$11.a(bsx.i, $$3);
               }
            }
         }

         for (int $$12 = 0; $$12 <= 6; $$12++) {
            for (int $$13 = 0; $$13 <= 6; $$13++) {
               this.b($$0, dga.fn.o(), $$12, -1, $$13, $$4);
            }
         }
      }
   }

   abstract static class m extends ejv {
      protected m(eki $$0, int $$1, ejj $$2) {
         super($$0, $$1, $$2);
      }

      public m(eki $$0, ub $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
      }

      private int a(List<elx.n> $$0) {
         boolean $$1 = false;
         int $$2 = 0;

         for (elx.n $$3 : $$0) {
            if ($$3.d > 0 && $$3.c < $$3.d) {
               $$1 = true;
            }

            $$2 += $$3.b;
         }

         return $$1 ? $$2 : -1;
      }

      private elx.m a(elx.q $$0, List<elx.n> $$1, ejw $$2, ayw $$3, int $$4, int $$5, int $$6, ji $$7, int $$8) {
         int $$9 = this.a($$1);
         boolean $$10 = $$9 > 0 && $$8 <= 30;
         int $$11 = 0;

         while ($$11 < 5 && $$10) {
            $$11++;
            int $$12 = $$3.a($$9);

            for (elx.n $$13 : $$1) {
               $$12 -= $$13.b;
               if ($$12 < 0) {
                  if (!$$13.a($$8) || $$13 == $$0.a && !$$13.e) {
                     break;
                  }

                  elx.m $$14 = elx.a($$13, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
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

         return elx.b.a($$2, $$3, $$4, $$5, $$6, $$7, $$8);
      }

      private ejv a(elx.q $$0, ejw $$1, ayw $$2, int $$3, int $$4, int $$5, @Nullable ji $$6, int $$7, boolean $$8) {
         if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
            List<elx.n> $$9 = $$0.b;
            if ($$8) {
               $$9 = $$0.c;
            }

            ejv $$10 = this.a($$0, $$9, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
            if ($$10 != null) {
               $$1.a($$10);
               $$0.d.add($$10);
            }

            return $$10;
         } else {
            return elx.b.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }

      @Nullable
      protected ejv a(elx.q $$0, ejw $$1, ayw $$2, int $$3, int $$4, boolean $$5) {
         ji $$6 = this.i();
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
      protected ejv b(elx.q $$0, ejw $$1, ayw $$2, int $$3, int $$4, boolean $$5) {
         ji $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ji.e, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, ji.e, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ji.c, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, ji.c, this.g(), $$5);
            }
         }

         return null;
      }

      @Nullable
      protected ejv c(elx.q $$0, ejw $$1, ayw $$2, int $$3, int $$4, boolean $$5) {
         ji $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ji.f, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, ji.f, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ji.d, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, ji.d, this.g(), $$5);
            }
         }

         return null;
      }

      protected static boolean a(ejj $$0) {
         return $$0 != null && $$0.i() > 10;
      }
   }

   static class n {
      public final Class<? extends elx.m> a;
      public final int b;
      public int c;
      public final int d;
      public final boolean e;

      public n(Class<? extends elx.m> $$0, int $$1, int $$2, boolean $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
      }

      public n(Class<? extends elx.m> $$0, int $$1, int $$2) {
         this($$0, $$1, $$2, false);
      }

      public boolean a(int $$0) {
         return this.d == 0 || this.c < this.d;
      }

      public boolean a() {
         return this.d == 0 || this.c < this.d;
      }
   }

   public static class o extends elx.m {
      private static final int a = 7;
      private static final int b = 9;
      private static final int c = 7;

      public o(int $$0, ejj $$1, ji $$2) {
         super(eki.q, $$0, $$1);
         this.a($$2);
      }

      public o(ub $$0) {
         super(eki.q, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.a((elx.q)$$0, $$1, $$2, 2, 0, false);
         this.b((elx.q)$$0, $$1, $$2, 0, 2, false);
         this.c((elx.q)$$0, $$1, $$2, 0, 2, false);
      }

      public static elx.o a(ejw $$0, int $$1, int $$2, int $$3, ji $$4, int $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -2, 0, 0, 7, 9, 7, $$4);
         return a($$6) && $$0.a($$6) == null ? new elx.o($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 6, 1, 6, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 6, 7, 6, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 0, 2, 0, 1, 6, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 6, 1, 6, 6, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 2, 0, 6, 6, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 2, 6, 6, 6, 6, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 0, 6, 1, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 5, 0, 6, 6, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 2, 0, 6, 6, 1, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 2, 5, 6, 6, 6, dga.fn.o(), dga.fn.o(), false);
         dtc $$7 = dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
         dtc $$8 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         this.a($$0, $$4, 2, 6, 0, 4, 6, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);
         this.a($$0, $$4, 2, 6, 6, 4, 6, 6, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 6, 4, 5, 6, $$7, $$7, false);
         this.a($$0, $$4, 0, 6, 2, 0, 6, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 5, 2, 0, 5, 4, $$8, $$8, false);
         this.a($$0, $$4, 6, 6, 2, 6, 6, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 5, 2, 6, 5, 4, $$8, $$8, false);

         for (int $$9 = 0; $$9 <= 6; $$9++) {
            for (int $$10 = 0; $$10 <= 6; $$10++) {
               this.b($$0, dga.fn.o(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class p extends elx.m {
      private static final int a = 7;
      private static final int b = 11;
      private static final int c = 7;

      public p(int $$0, ejj $$1, ji $$2) {
         super(eki.r, $$0, $$1);
         this.a($$2);
      }

      public p(ub $$0) {
         super(eki.r, $$0);
      }

      @Override
      public void a(ejv $$0, ejw $$1, ayw $$2) {
         this.c((elx.q)$$0, $$1, $$2, 6, 2, false);
      }

      public static elx.p a(ejw $$0, int $$1, int $$2, int $$3, int $$4, ji $$5) {
         ejj $$6 = ejj.a($$1, $$2, $$3, -2, 0, 0, 7, 11, 7, $$5);
         return a($$6) && $$0.a($$6) == null ? new elx.p($$4, $$6, $$5) : null;
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         this.a($$0, $$4, 0, 0, 0, 6, 1, 6, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 0, 6, 10, 6, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 0, 2, 0, 1, 8, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 5, 2, 0, 6, 8, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 0, 2, 1, 0, 8, 6, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 2, 1, 6, 8, 6, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 2, 6, 5, 8, 6, dga.fn.o(), dga.fn.o(), false);
         dtc $$7 = dga.fo.o().a(diw.d, Boolean.valueOf(true)).a(diw.b, Boolean.valueOf(true));
         dtc $$8 = dga.fo.o().a(diw.a, Boolean.valueOf(true)).a(diw.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 3, 2, 0, 5, 4, $$8, $$8, false);
         this.a($$0, $$4, 6, 3, 2, 6, 5, 2, $$8, $$8, false);
         this.a($$0, $$4, 6, 3, 4, 6, 5, 4, $$8, $$8, false);
         this.a($$0, dga.fn.o(), 5, 2, 5, $$4);
         this.a($$0, $$4, 4, 2, 5, 4, 3, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 3, 2, 5, 3, 4, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 2, 5, 2, 5, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 2, 5, 1, 6, 5, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 1, 7, 1, 5, 7, 4, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 6, 8, 2, 6, 8, 4, dga.a.o(), dga.a.o(), false);
         this.a($$0, $$4, 2, 6, 0, 4, 8, 0, dga.fn.o(), dga.fn.o(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);

         for (int $$9 = 0; $$9 <= 6; $$9++) {
            for (int $$10 = 0; $$10 <= 6; $$10++) {
               this.b($$0, dga.fn.o(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class q extends elx.a {
      public elx.n a;
      public List<elx.n> b;
      public List<elx.n> c;
      public final List<ejv> d = Lists.newArrayList();

      public q(ayw $$0, int $$1, int $$2) {
         super($$1, $$2, a($$0));
         this.b = Lists.newArrayList();

         for (elx.n $$3 : elx.d) {
            $$3.c = 0;
            this.b.add($$3);
         }

         this.c = Lists.newArrayList();

         for (elx.n $$4 : elx.e) {
            $$4.c = 0;
            this.c.add($$4);
         }
      }

      public q(ub $$0) {
         super(eki.s, $$0);
      }
   }
}
