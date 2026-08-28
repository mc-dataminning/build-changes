import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class epr {
   private static final int b = 30;
   private static final int c = 10;
   public static final int a = 64;
   static final epr.n[] d = new epr.n[]{
      new epr.n(epr.c.class, 30, 0, true),
      new epr.n(epr.a.class, 10, 4),
      new epr.n(epr.o.class, 10, 4),
      new epr.n(epr.p.class, 10, 3),
      new epr.n(epr.l.class, 5, 2),
      new epr.n(epr.f.class, 5, 1)
   };
   static final epr.n[] e = new epr.n[]{
      new epr.n(epr.i.class, 25, 0, true),
      new epr.n(epr.g.class, 15, 5),
      new epr.n(epr.j.class, 5, 10),
      new epr.n(epr.h.class, 5, 10),
      new epr.n(epr.d.class, 10, 3, true),
      new epr.n(epr.e.class, 7, 2),
      new epr.n(epr.k.class, 5, 2)
   };

   static epr.m a(epr.n $$0, enq $$1, azh $$2, int $$3, int $$4, int $$5, jn $$6, int $$7) {
      Class<? extends epr.m> $$8 = $$0.a;
      epr.m $$9 = null;
      if ($$8 == epr.c.class) {
         $$9 = epr.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.a.class) {
         $$9 = epr.a.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.o.class) {
         $$9 = epr.o.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.p.class) {
         $$9 = epr.p.a($$1, $$3, $$4, $$5, $$7, $$6);
      } else if ($$8 == epr.l.class) {
         $$9 = epr.l.a($$1, $$3, $$4, $$5, $$7, $$6);
      } else if ($$8 == epr.f.class) {
         $$9 = epr.f.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.i.class) {
         $$9 = epr.i.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.j.class) {
         $$9 = epr.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.h.class) {
         $$9 = epr.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.d.class) {
         $$9 = epr.d.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.e.class) {
         $$9 = epr.e.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.g.class) {
         $$9 = epr.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      } else if ($$8 == epr.k.class) {
         $$9 = epr.k.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$9;
   }

   public static class a extends epr.m {
      private static final int a = 19;
      private static final int b = 10;
      private static final int c = 19;

      public a(int $$0, end $$1, jn $$2) {
         super(eoc.e, $$0, $$1);
         this.a($$2);
      }

      protected a(int $$0, int $$1, jn $$2) {
         super(eoc.e, 0, enp.a($$0, 64, $$1, $$2, 19, 10, 19));
         this.a($$2);
      }

      protected a(eoc $$0, tq $$1) {
         super($$0, $$1);
      }

      public a(tq $$0) {
         this(eoc.e, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.a((epr.q)$$0, $$1, $$2, 8, 3, false);
         this.b((epr.q)$$0, $$1, $$2, 3, 8, false);
         this.c((epr.q)$$0, $$1, $$2, 3, 8, false);
      }

      public static epr.a a(enq $$0, int $$1, int $$2, int $$3, jn $$4, int $$5) {
         end $$6 = end.a($$1, $$2, $$3, -8, -3, 0, 19, 10, 19, $$4);
         return a($$6) && $$0.a($$6) == null ? new epr.a($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 7, 3, 0, 11, 4, 18, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 3, 7, 18, 4, 11, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 7, 18, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 0, 5, 8, 18, 7, 10, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 7, 5, 0, 7, 5, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 7, 5, 11, 7, 5, 18, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 11, 5, 0, 11, 5, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 11, 5, 11, 11, 5, 18, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 5, 7, 7, 5, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 11, 5, 7, 18, 5, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 5, 11, 7, 5, 11, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 11, 5, 11, 18, 5, 11, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 7, 2, 0, 11, 2, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 7, 2, 13, 11, 2, 18, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 7, 0, 0, 11, 1, 3, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 7, 0, 15, 11, 1, 18, djn.fI.m(), djn.fI.m(), false);

         for (int $$7 = 7; $$7 <= 11; $$7++) {
            for (int $$8 = 0; $$8 <= 2; $$8++) {
               this.b($$0, djn.fI.m(), $$7, -1, $$8, $$4);
               this.b($$0, djn.fI.m(), $$7, -1, 18 - $$8, $$4);
            }
         }

         this.a($$0, $$4, 0, 2, 7, 5, 2, 11, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 13, 2, 7, 18, 2, 11, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 0, 7, 3, 1, 11, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 15, 0, 7, 18, 1, 11, djn.fI.m(), djn.fI.m(), false);

         for (int $$9 = 0; $$9 <= 2; $$9++) {
            for (int $$10 = 7; $$10 <= 11; $$10++) {
               this.b($$0, djn.fI.m(), $$9, -1, $$10, $$4);
               this.b($$0, djn.fI.m(), 18 - $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class b extends epr.m {
      private static final int a = 5;
      private static final int b = 10;
      private static final int c = 8;
      private final int d;

      public b(int $$0, azh $$1, end $$2, jn $$3) {
         super(eoc.f, $$0, $$2);
         this.a($$3);
         this.d = $$1.f();
      }

      public b(tq $$0) {
         super(eoc.f, $$0);
         this.d = $$0.h("Seed");
      }

      public static epr.b a(enq $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         end $$7 = end.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new epr.b($$6, $$1, $$7, $$5) : null;
      }

      @Override
      protected void a(eob $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Seed", this.d);
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         azh $$7 = azh.a((long)this.d);

         for (int $$8 = 0; $$8 <= 4; $$8++) {
            for (int $$9 = 3; $$9 <= 4; $$9++) {
               int $$10 = $$7.a(8);
               this.a($$0, $$4, $$8, $$9, 0, $$8, $$9, $$10, djn.fI.m(), djn.fI.m(), false);
            }
         }

         int $$11 = $$7.a(8);
         this.a($$0, $$4, 0, 5, 0, 0, 5, $$11, djn.fI.m(), djn.fI.m(), false);
         $$11 = $$7.a(8);
         this.a($$0, $$4, 4, 5, 0, 4, 5, $$11, djn.fI.m(), djn.fI.m(), false);

         for (int $$13 = 0; $$13 <= 4; $$13++) {
            int $$14 = $$7.a(5);
            this.a($$0, $$4, $$13, 2, 0, $$13, 2, $$14, djn.fI.m(), djn.fI.m(), false);
         }

         for (int $$15 = 0; $$15 <= 4; $$15++) {
            for (int $$16 = 0; $$16 <= 1; $$16++) {
               int $$17 = $$7.a(3);
               this.a($$0, $$4, $$15, $$16, 0, $$15, $$16, $$17, djn.fI.m(), djn.fI.m(), false);
            }
         }
      }
   }

   public static class c extends epr.m {
      private static final int a = 5;
      private static final int b = 10;
      private static final int c = 19;

      public c(int $$0, azh $$1, end $$2, jn $$3) {
         super(eoc.g, $$0, $$2);
         this.a($$3);
      }

      public c(tq $$0) {
         super(eoc.g, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.a((epr.q)$$0, $$1, $$2, 1, 3, false);
      }

      public static epr.c a(enq $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         end $$7 = end.a($$2, $$3, $$4, -1, -3, 0, 5, 10, 19, $$5);
         return a($$7) && $$0.a($$7) == null ? new epr.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 3, 0, 4, 4, 18, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 5, 0, 3, 7, 18, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 0, 5, 0, 0, 5, 18, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 5, 0, 4, 5, 18, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 2, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 13, 4, 2, 18, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 0, 0, 4, 1, 3, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 0, 15, 4, 1, 18, djn.fI.m(), djn.fI.m(), false);

         for (int $$7 = 0; $$7 <= 4; $$7++) {
            for (int $$8 = 0; $$8 <= 2; $$8++) {
               this.b($$0, djn.fI.m(), $$7, -1, $$8, $$4);
               this.b($$0, djn.fI.m(), $$7, -1, 18 - $$8, $$4);
            }
         }

         dww $$9 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         dww $$10 = $$9.b(dmk.b, Boolean.valueOf(true));
         dww $$11 = $$9.b(dmk.d, Boolean.valueOf(true));
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

   public static class d extends epr.m {
      private static final int a = 5;
      private static final int b = 14;
      private static final int c = 10;

      public d(int $$0, end $$1, jn $$2) {
         super(eoc.h, $$0, $$1);
         this.a($$2);
      }

      public d(tq $$0) {
         super(eoc.h, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.a((epr.q)$$0, $$1, $$2, 1, 0, true);
      }

      public static epr.d a(enq $$0, int $$1, int $$2, int $$3, jn $$4, int $$5) {
         end $$6 = end.a($$1, $$2, $$3, -1, -7, 0, 5, 14, 10, $$4);
         return a($$6) && $$0.a($$6) == null ? new epr.d($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         dww $$7 = djn.fK.m().b(drk.b, jn.d);
         dww $$8 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));

         for (int $$9 = 0; $$9 <= 9; $$9++) {
            int $$10 = Math.max(1, 7 - $$9);
            int $$11 = Math.min(Math.max($$10 + 5, 14 - $$9), 13);
            int $$12 = $$9;
            this.a($$0, $$4, 0, 0, $$9, 4, $$10, $$9, djn.fI.m(), djn.fI.m(), false);
            this.a($$0, $$4, 1, $$10 + 1, $$9, 3, $$11 - 1, $$9, djn.a.m(), djn.a.m(), false);
            if ($$9 <= 6) {
               this.a($$0, $$7, 1, $$10 + 1, $$9, $$4);
               this.a($$0, $$7, 2, $$10 + 1, $$9, $$4);
               this.a($$0, $$7, 3, $$10 + 1, $$9, $$4);
            }

            this.a($$0, $$4, 0, $$11, $$9, 4, $$11, $$9, djn.fI.m(), djn.fI.m(), false);
            this.a($$0, $$4, 0, $$10 + 1, $$9, 0, $$11 - 1, $$9, djn.fI.m(), djn.fI.m(), false);
            this.a($$0, $$4, 4, $$10 + 1, $$9, 4, $$11 - 1, $$9, djn.fI.m(), djn.fI.m(), false);
            if (($$9 & 1) == 0) {
               this.a($$0, $$4, 0, $$10 + 2, $$9, 0, $$10 + 3, $$9, $$8, $$8, false);
               this.a($$0, $$4, 4, $$10 + 2, $$9, 4, $$10 + 3, $$9, $$8, $$8, false);
            }

            for (int $$13 = 0; $$13 <= 4; $$13++) {
               this.b($$0, djn.fI.m(), $$13, -1, $$12, $$4);
            }
         }
      }
   }

   public static class e extends epr.m {
      private static final int a = 9;
      private static final int b = 7;
      private static final int c = 9;

      public e(int $$0, end $$1, jn $$2) {
         super(eoc.i, $$0, $$1);
         this.a($$2);
      }

      public e(tq $$0) {
         super(eoc.i, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         int $$3 = 1;
         jn $$4 = this.i();
         if ($$4 == jn.e || $$4 == jn.c) {
            $$3 = 5;
         }

         this.b((epr.q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
         this.c((epr.q)$$0, $$1, $$2, 0, $$3, $$2.a(8) > 0);
      }

      public static epr.e a(enq $$0, int $$1, int $$2, int $$3, jn $$4, int $$5) {
         end $$6 = end.a($$1, $$2, $$3, -3, 0, 0, 9, 7, 9, $$4);
         return a($$6) && $$0.a($$6) == null ? new epr.e($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         dww $$7 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         dww $$8 = djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 0, 0, 8, 1, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 8, 5, 8, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 0, 6, 0, 8, 6, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 2, 5, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 2, 0, 8, 5, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 3, 0, 1, 4, 0, $$8, $$8, false);
         this.a($$0, $$4, 7, 3, 0, 7, 4, 0, $$8, $$8, false);
         this.a($$0, $$4, 0, 2, 4, 8, 2, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 1, 4, 2, 2, 4, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 6, 1, 4, 7, 2, 4, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 1, 3, 8, 7, 3, 8, $$8, $$8, false);
         this.a($$0, djn.fJ.m().b(dmk.b, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true)), 0, 3, 8, $$4);
         this.a($$0, djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true)), 8, 3, 8, $$4);
         this.a($$0, $$4, 0, 3, 6, 0, 3, 7, $$7, $$7, false);
         this.a($$0, $$4, 8, 3, 6, 8, 3, 7, $$7, $$7, false);
         this.a($$0, $$4, 0, 3, 4, 0, 5, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 8, 3, 4, 8, 5, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 3, 5, 2, 5, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 3, 5, 7, 5, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 4, 5, 1, 5, 5, $$8, $$8, false);
         this.a($$0, $$4, 7, 4, 5, 7, 5, 5, $$8, $$8, false);

         for (int $$9 = 0; $$9 <= 5; $$9++) {
            for (int $$10 = 0; $$10 <= 8; $$10++) {
               this.b($$0, djn.fI.m(), $$10, -1, $$9, $$4);
            }
         }
      }
   }

   public static class f extends epr.m {
      private static final int a = 13;
      private static final int b = 14;
      private static final int c = 13;

      public f(int $$0, azh $$1, end $$2, jn $$3) {
         super(eoc.j, $$0, $$2);
         this.a($$3);
      }

      public f(tq $$0) {
         super(eoc.j, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.a((epr.q)$$0, $$1, $$2, 5, 3, true);
      }

      public static epr.f a(enq $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         end $$7 = end.a($$2, $$3, $$4, -5, -3, 0, 13, 14, 13, $$5);
         return a($$7) && $$0.a($$7) == null ? new epr.f($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 3, 0, 12, 4, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 5, 0, 12, 13, 12, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 0, 5, 0, 1, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 11, 5, 0, 12, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 11, 4, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 8, 5, 11, 10, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 9, 11, 7, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 12, 1, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 12, 1, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 9, 0, 7, 12, 1, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 11, 2, 10, 12, 10, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 8, 0, 7, 8, 0, djn.fJ.m(), djn.fJ.m(), false);
         dww $$7 = djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true));
         dww $$8 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));

         for (int $$9 = 1; $$9 <= 11; $$9 += 2) {
            this.a($$0, $$4, $$9, 10, 0, $$9, 11, 0, $$7, $$7, false);
            this.a($$0, $$4, $$9, 10, 12, $$9, 11, 12, $$7, $$7, false);
            this.a($$0, $$4, 0, 10, $$9, 0, 11, $$9, $$8, $$8, false);
            this.a($$0, $$4, 12, 10, $$9, 12, 11, $$9, $$8, $$8, false);
            this.a($$0, djn.fI.m(), $$9, 13, 0, $$4);
            this.a($$0, djn.fI.m(), $$9, 13, 12, $$4);
            this.a($$0, djn.fI.m(), 0, 13, $$9, $$4);
            this.a($$0, djn.fI.m(), 12, 13, $$9, $$4);
            if ($$9 != 11) {
               this.a($$0, $$7, $$9 + 1, 13, 0, $$4);
               this.a($$0, $$7, $$9 + 1, 13, 12, $$4);
               this.a($$0, $$8, 0, 13, $$9 + 1, $$4);
               this.a($$0, $$8, 12, 13, $$9 + 1, $$4);
            }
         }

         this.a($$0, djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true)), 0, 13, 0, $$4);
         this.a($$0, djn.fJ.m().b(dmk.c, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true)), 0, 13, 12, $$4);
         this.a($$0, djn.fJ.m().b(dmk.c, Boolean.valueOf(true)).b(dmk.d, Boolean.valueOf(true)), 12, 13, 12, $$4);
         this.a($$0, djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.d, Boolean.valueOf(true)), 12, 13, 0, $$4);

         for (int $$10 = 3; $$10 <= 9; $$10 += 2) {
            this.a($$0, $$4, 1, 7, $$10, 1, 8, $$10, $$8.b(dmk.d, Boolean.valueOf(true)), $$8.b(dmk.d, Boolean.valueOf(true)), false);
            this.a($$0, $$4, 11, 7, $$10, 11, 8, $$10, $$8.b(dmk.b, Boolean.valueOf(true)), $$8.b(dmk.b, Boolean.valueOf(true)), false);
         }

         this.a($$0, $$4, 4, 2, 0, 8, 2, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 4, 12, 2, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 0, 0, 8, 1, 3, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 0, 9, 8, 1, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 0, 4, 3, 1, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 9, 0, 4, 12, 1, 8, djn.fI.m(), djn.fI.m(), false);

         for (int $$11 = 4; $$11 <= 8; $$11++) {
            for (int $$12 = 0; $$12 <= 2; $$12++) {
               this.b($$0, djn.fI.m(), $$11, -1, $$12, $$4);
               this.b($$0, djn.fI.m(), $$11, -1, 12 - $$12, $$4);
            }
         }

         for (int $$13 = 0; $$13 <= 2; $$13++) {
            for (int $$14 = 4; $$14 <= 8; $$14++) {
               this.b($$0, djn.fI.m(), $$13, -1, $$14, $$4);
               this.b($$0, djn.fI.m(), 12 - $$13, -1, $$14, $$4);
            }
         }

         this.a($$0, $$4, 5, 5, 5, 7, 5, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 1, 6, 6, 4, 6, djn.a.m(), djn.a.m(), false);
         this.a($$0, djn.fI.m(), 6, 0, 6, $$4);
         this.a($$0, djn.K.m(), 6, 5, 6, $$4);
         ji $$15 = this.b(6, 5, 6);
         if ($$4.b($$15)) {
            $$0.a($$15, esz.e, 0);
         }
      }
   }

   public static class g extends epr.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;

      public g(int $$0, end $$1, jn $$2) {
         super(eoc.k, $$0, $$1);
         this.a($$2);
      }

      public g(tq $$0) {
         super(eoc.k, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.a((epr.q)$$0, $$1, $$2, 1, 0, true);
         this.b((epr.q)$$0, $$1, $$2, 0, 1, true);
         this.c((epr.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static epr.g a(enq $$0, int $$1, int $$2, int $$3, jn $$4, int $$5) {
         end $$6 = end.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
         return a($$6) && $$0.a($$6) == null ? new epr.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 0, 2, 0, 0, 5, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 4, 0, 5, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 2, 4, 4, 5, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, djn.fI.m(), djn.fI.m(), false);

         for (int $$7 = 0; $$7 <= 4; $$7++) {
            for (int $$8 = 0; $$8 <= 4; $$8++) {
               this.b($$0, djn.fI.m(), $$7, -1, $$8, $$4);
            }
         }
      }
   }

   public static class h extends epr.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;
      private boolean d;

      public h(int $$0, azh $$1, end $$2, jn $$3) {
         super(eoc.l, $$0, $$2);
         this.a($$3);
         this.d = $$1.a(3) == 0;
      }

      public h(tq $$0) {
         super(eoc.l, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(eob $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.b((epr.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static epr.h a(enq $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         end $$7 = end.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new epr.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, djn.a.m(), djn.a.m(), false);
         dww $$7 = djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true));
         dww $$8 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         this.a($$0, $$4, 4, 2, 0, 4, 5, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$8, $$8, false);
         this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$8, $$8, false);
         this.a($$0, $$4, 0, 2, 0, 0, 5, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 4, 3, 5, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
         this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
         if (this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = false;
            this.a($$0, $$4, $$3, 3, 2, 3, evm.u);
         }

         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, djn.fI.m(), djn.fI.m(), false);

         for (int $$9 = 0; $$9 <= 4; $$9++) {
            for (int $$10 = 0; $$10 <= 4; $$10++) {
               this.b($$0, djn.fI.m(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class i extends epr.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;

      public i(int $$0, end $$1, jn $$2) {
         super(eoc.m, $$0, $$1);
         this.a($$2);
      }

      public i(tq $$0) {
         super(eoc.m, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.a((epr.q)$$0, $$1, $$2, 1, 0, true);
      }

      public static epr.i a(enq $$0, int $$1, int $$2, int $$3, jn $$4, int $$5) {
         end $$6 = end.a($$1, $$2, $$3, -1, 0, 0, 5, 7, 5, $$4);
         return a($$6) && $$0.a($$6) == null ? new epr.i($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, djn.a.m(), djn.a.m(), false);
         dww $$7 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 2, 0, 0, 5, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$7, $$7, false);
         this.a($$0, $$4, 4, 3, 1, 4, 4, 1, $$7, $$7, false);
         this.a($$0, $$4, 4, 3, 3, 4, 4, 3, $$7, $$7, false);
         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, djn.fI.m(), djn.fI.m(), false);

         for (int $$8 = 0; $$8 <= 4; $$8++) {
            for (int $$9 = 0; $$9 <= 4; $$9++) {
               this.b($$0, djn.fI.m(), $$8, -1, $$9, $$4);
            }
         }
      }
   }

   public static class j extends epr.m {
      private static final int a = 5;
      private static final int b = 7;
      private static final int c = 5;
      private boolean d;

      public j(int $$0, azh $$1, end $$2, jn $$3) {
         super(eoc.n, $$0, $$2);
         this.a($$3);
         this.d = $$1.a(3) == 0;
      }

      public j(tq $$0) {
         super(eoc.n, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(eob $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.c((epr.q)$$0, $$1, $$2, 0, 1, true);
      }

      public static epr.j a(enq $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         end $$7 = end.a($$2, $$3, $$4, -1, 0, 0, 5, 7, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new epr.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 1, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 4, 5, 4, djn.a.m(), djn.a.m(), false);
         dww $$7 = djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true));
         dww $$8 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 2, 0, 0, 5, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 3, 1, 0, 4, 1, $$8, $$8, false);
         this.a($$0, $$4, 0, 3, 3, 0, 4, 3, $$8, $$8, false);
         this.a($$0, $$4, 4, 2, 0, 4, 5, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 2, 4, 4, 5, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 3, 4, 1, 4, 4, $$7, $$7, false);
         this.a($$0, $$4, 3, 3, 4, 3, 4, 4, $$7, $$7, false);
         if (this.d && $$4.b(this.b(1, 2, 3))) {
            this.d = false;
            this.a($$0, $$4, $$3, 1, 2, 3, evm.u);
         }

         this.a($$0, $$4, 0, 6, 0, 4, 6, 4, djn.fI.m(), djn.fI.m(), false);

         for (int $$9 = 0; $$9 <= 4; $$9++) {
            for (int $$10 = 0; $$10 <= 4; $$10++) {
               this.b($$0, djn.fI.m(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class k extends epr.m {
      private static final int a = 13;
      private static final int b = 14;
      private static final int c = 13;

      public k(int $$0, end $$1, jn $$2) {
         super(eoc.o, $$0, $$1);
         this.a($$2);
      }

      public k(tq $$0) {
         super(eoc.o, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.a((epr.q)$$0, $$1, $$2, 5, 3, true);
         this.a((epr.q)$$0, $$1, $$2, 5, 11, true);
      }

      public static epr.k a(enq $$0, int $$1, int $$2, int $$3, jn $$4, int $$5) {
         end $$6 = end.a($$1, $$2, $$3, -5, -3, 0, 13, 14, 13, $$4);
         return a($$6) && $$0.a($$6) == null ? new epr.k($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 3, 0, 12, 4, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 5, 0, 12, 13, 12, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 0, 5, 0, 1, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 11, 5, 0, 12, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 11, 4, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 8, 5, 11, 10, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 9, 11, 7, 12, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 12, 1, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 8, 5, 0, 10, 12, 1, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 9, 0, 7, 12, 1, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 11, 2, 10, 12, 10, djn.fI.m(), djn.fI.m(), false);
         dww $$7 = djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true));
         dww $$8 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         dww $$9 = $$8.b(dmk.d, Boolean.valueOf(true));
         dww $$10 = $$8.b(dmk.b, Boolean.valueOf(true));

         for (int $$11 = 1; $$11 <= 11; $$11 += 2) {
            this.a($$0, $$4, $$11, 10, 0, $$11, 11, 0, $$7, $$7, false);
            this.a($$0, $$4, $$11, 10, 12, $$11, 11, 12, $$7, $$7, false);
            this.a($$0, $$4, 0, 10, $$11, 0, 11, $$11, $$8, $$8, false);
            this.a($$0, $$4, 12, 10, $$11, 12, 11, $$11, $$8, $$8, false);
            this.a($$0, djn.fI.m(), $$11, 13, 0, $$4);
            this.a($$0, djn.fI.m(), $$11, 13, 12, $$4);
            this.a($$0, djn.fI.m(), 0, 13, $$11, $$4);
            this.a($$0, djn.fI.m(), 12, 13, $$11, $$4);
            if ($$11 != 11) {
               this.a($$0, $$7, $$11 + 1, 13, 0, $$4);
               this.a($$0, $$7, $$11 + 1, 13, 12, $$4);
               this.a($$0, $$8, 0, 13, $$11 + 1, $$4);
               this.a($$0, $$8, 12, 13, $$11 + 1, $$4);
            }
         }

         this.a($$0, djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true)), 0, 13, 0, $$4);
         this.a($$0, djn.fJ.m().b(dmk.c, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true)), 0, 13, 12, $$4);
         this.a($$0, djn.fJ.m().b(dmk.c, Boolean.valueOf(true)).b(dmk.d, Boolean.valueOf(true)), 12, 13, 12, $$4);
         this.a($$0, djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.d, Boolean.valueOf(true)), 12, 13, 0, $$4);

         for (int $$12 = 3; $$12 <= 9; $$12 += 2) {
            this.a($$0, $$4, 1, 7, $$12, 1, 8, $$12, $$9, $$9, false);
            this.a($$0, $$4, 11, 7, $$12, 11, 8, $$12, $$10, $$10, false);
         }

         dww $$13 = djn.fK.m().b(drk.b, jn.c);

         for (int $$14 = 0; $$14 <= 6; $$14++) {
            int $$15 = $$14 + 4;

            for (int $$16 = 5; $$16 <= 7; $$16++) {
               this.a($$0, $$13, $$16, 5 + $$14, $$15, $$4);
            }

            if ($$15 >= 5 && $$15 <= 8) {
               this.a($$0, $$4, 5, 5, $$15, 7, $$14 + 4, $$15, djn.fI.m(), djn.fI.m(), false);
            } else if ($$15 >= 9 && $$15 <= 10) {
               this.a($$0, $$4, 5, 8, $$15, 7, $$14 + 4, $$15, djn.fI.m(), djn.fI.m(), false);
            }

            if ($$14 >= 1) {
               this.a($$0, $$4, 5, 6 + $$14, $$15, 7, 9 + $$14, $$15, djn.a.m(), djn.a.m(), false);
            }
         }

         for (int $$17 = 5; $$17 <= 7; $$17++) {
            this.a($$0, $$13, $$17, 12, 11, $$4);
         }

         this.a($$0, $$4, 5, 6, 7, 5, 7, 7, $$10, $$10, false);
         this.a($$0, $$4, 7, 6, 7, 7, 7, 7, $$9, $$9, false);
         this.a($$0, $$4, 5, 13, 12, 7, 13, 12, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 2, 5, 2, 3, 5, 3, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 9, 3, 5, 10, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 4, 2, 5, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 9, 5, 2, 10, 5, 3, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 9, 5, 9, 10, 5, 10, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 10, 5, 4, 10, 5, 8, djn.fI.m(), djn.fI.m(), false);
         dww $$18 = $$13.b(drk.b, jn.f);
         dww $$19 = $$13.b(drk.b, jn.e);
         this.a($$0, $$19, 4, 5, 2, $$4);
         this.a($$0, $$19, 4, 5, 3, $$4);
         this.a($$0, $$19, 4, 5, 9, $$4);
         this.a($$0, $$19, 4, 5, 10, $$4);
         this.a($$0, $$18, 8, 5, 2, $$4);
         this.a($$0, $$18, 8, 5, 3, $$4);
         this.a($$0, $$18, 8, 5, 9, $$4);
         this.a($$0, $$18, 8, 5, 10, $$4);
         this.a($$0, $$4, 3, 4, 4, 4, 4, 8, djn.ej.m(), djn.ej.m(), false);
         this.a($$0, $$4, 8, 4, 4, 9, 4, 8, djn.ej.m(), djn.ej.m(), false);
         this.a($$0, $$4, 3, 5, 4, 4, 5, 8, djn.fL.m(), djn.fL.m(), false);
         this.a($$0, $$4, 8, 5, 4, 9, 5, 8, djn.fL.m(), djn.fL.m(), false);
         this.a($$0, $$4, 4, 2, 0, 8, 2, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 4, 12, 2, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 0, 0, 8, 1, 3, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 4, 0, 9, 8, 1, 12, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 0, 4, 3, 1, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 9, 0, 4, 12, 1, 8, djn.fI.m(), djn.fI.m(), false);

         for (int $$20 = 4; $$20 <= 8; $$20++) {
            for (int $$21 = 0; $$21 <= 2; $$21++) {
               this.b($$0, djn.fI.m(), $$20, -1, $$21, $$4);
               this.b($$0, djn.fI.m(), $$20, -1, 12 - $$21, $$4);
            }
         }

         for (int $$22 = 0; $$22 <= 2; $$22++) {
            for (int $$23 = 4; $$23 <= 8; $$23++) {
               this.b($$0, djn.fI.m(), $$22, -1, $$23, $$4);
               this.b($$0, djn.fI.m(), 12 - $$22, -1, $$23, $$4);
            }
         }
      }
   }

   public static class l extends epr.m {
      private static final int a = 7;
      private static final int b = 8;
      private static final int c = 9;
      private boolean d;

      public l(int $$0, end $$1, jn $$2) {
         super(eoc.p, $$0, $$1);
         this.a($$2);
      }

      public l(tq $$0) {
         super(eoc.p, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(eob $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      public static epr.l a(enq $$0, int $$1, int $$2, int $$3, int $$4, jn $$5) {
         end $$6 = end.a($$1, $$2, $$3, -2, 0, 0, 7, 8, 9, $$5);
         return a($$6) && $$0.a($$6) == null ? new epr.l($$4, $$6, $$5) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 2, 0, 6, 7, 7, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 1, 0, 0, 5, 1, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 2, 1, 5, 2, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 3, 2, 5, 3, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 4, 3, 5, 4, 7, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 2, 0, 1, 4, 2, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 2, 0, 5, 4, 2, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 5, 2, 1, 5, 3, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 5, 2, 5, 5, 3, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 5, 3, 0, 5, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 5, 3, 6, 5, 8, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 5, 8, 5, 5, 8, djn.fI.m(), djn.fI.m(), false);
         dww $$7 = djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true));
         dww $$8 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         this.a($$0, djn.fJ.m().b(dmk.d, Boolean.valueOf(true)), 1, 6, 3, $$4);
         this.a($$0, djn.fJ.m().b(dmk.b, Boolean.valueOf(true)), 5, 6, 3, $$4);
         this.a($$0, djn.fJ.m().b(dmk.b, Boolean.valueOf(true)).b(dmk.a, Boolean.valueOf(true)), 0, 6, 3, $$4);
         this.a($$0, djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.a, Boolean.valueOf(true)), 6, 6, 3, $$4);
         this.a($$0, $$4, 0, 6, 4, 0, 6, 7, $$8, $$8, false);
         this.a($$0, $$4, 6, 6, 4, 6, 6, 7, $$8, $$8, false);
         this.a($$0, djn.fJ.m().b(dmk.b, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true)), 0, 6, 8, $$4);
         this.a($$0, djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true)), 6, 6, 8, $$4);
         this.a($$0, $$4, 1, 6, 8, 5, 6, 8, $$7, $$7, false);
         this.a($$0, djn.fJ.m().b(dmk.b, Boolean.valueOf(true)), 1, 7, 8, $$4);
         this.a($$0, $$4, 2, 7, 8, 4, 7, 8, $$7, $$7, false);
         this.a($$0, djn.fJ.m().b(dmk.d, Boolean.valueOf(true)), 5, 7, 8, $$4);
         this.a($$0, djn.fJ.m().b(dmk.b, Boolean.valueOf(true)), 2, 8, 8, $$4);
         this.a($$0, $$7, 3, 8, 8, $$4);
         this.a($$0, djn.fJ.m().b(dmk.d, Boolean.valueOf(true)), 4, 8, 8, $$4);
         if (!this.d) {
            ji $$9 = this.b(3, 5, 5);
            if ($$4.b($$9)) {
               this.d = true;
               $$0.a($$9, djn.cA.m(), 2);
               if ($$0.c_($$9) instanceof dvp $$11) {
                  $$11.a(bur.o, $$3);
               }
            }
         }

         for (int $$12 = 0; $$12 <= 6; $$12++) {
            for (int $$13 = 0; $$13 <= 6; $$13++) {
               this.b($$0, djn.fI.m(), $$12, -1, $$13, $$4);
            }
         }
      }
   }

   abstract static class m extends enp {
      protected m(eoc $$0, int $$1, end $$2) {
         super($$0, $$1, $$2);
      }

      public m(eoc $$0, tq $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(eob $$0, tq $$1) {
      }

      private int a(List<epr.n> $$0) {
         boolean $$1 = false;
         int $$2 = 0;

         for (epr.n $$3 : $$0) {
            if ($$3.d > 0 && $$3.c < $$3.d) {
               $$1 = true;
            }

            $$2 += $$3.b;
         }

         return $$1 ? $$2 : -1;
      }

      private epr.m a(epr.q $$0, List<epr.n> $$1, enq $$2, azh $$3, int $$4, int $$5, int $$6, jn $$7, int $$8) {
         int $$9 = this.a($$1);
         boolean $$10 = $$9 > 0 && $$8 <= 30;
         int $$11 = 0;

         while ($$11 < 5 && $$10) {
            $$11++;
            int $$12 = $$3.a($$9);

            for (epr.n $$13 : $$1) {
               $$12 -= $$13.b;
               if ($$12 < 0) {
                  if (!$$13.a($$8) || $$13 == $$0.a && !$$13.e) {
                     break;
                  }

                  epr.m $$14 = epr.a($$13, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
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

         return epr.b.a($$2, $$3, $$4, $$5, $$6, $$7, $$8);
      }

      private enp a(epr.q $$0, enq $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable jn $$6, int $$7, boolean $$8) {
         if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
            List<epr.n> $$9 = $$0.b;
            if ($$8) {
               $$9 = $$0.c;
            }

            enp $$10 = this.a($$0, $$9, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
            if ($$10 != null) {
               $$1.a($$10);
               $$0.d.add($$10);
            }

            return $$10;
         } else {
            return epr.b.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }

      @Nullable
      protected enp a(epr.q $$0, enq $$1, azh $$2, int $$3, int $$4, boolean $$5) {
         jn $$6 = this.i();
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
      protected enp b(epr.q $$0, enq $$1, azh $$2, int $$3, int $$4, boolean $$5) {
         jn $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jn.e, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jn.e, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jn.c, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jn.c, this.g(), $$5);
            }
         }

         return null;
      }

      @Nullable
      protected enp c(epr.q $$0, enq $$1, azh $$2, int $$3, int $$4, boolean $$5) {
         jn $$6 = this.i();
         if ($$6 != null) {
            switch ($$6) {
               case c:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jn.f, this.g(), $$5);
               case d:
                  return this.a($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jn.f, this.g(), $$5);
               case e:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jn.d, this.g(), $$5);
               case f:
                  return this.a($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jn.d, this.g(), $$5);
            }
         }

         return null;
      }

      protected static boolean a(end $$0) {
         return $$0 != null && $$0.i() > 10;
      }
   }

   static class n {
      public final Class<? extends epr.m> a;
      public final int b;
      public int c;
      public final int d;
      public final boolean e;

      public n(Class<? extends epr.m> $$0, int $$1, int $$2, boolean $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
      }

      public n(Class<? extends epr.m> $$0, int $$1, int $$2) {
         this($$0, $$1, $$2, false);
      }

      public boolean a(int $$0) {
         return this.d == 0 || this.c < this.d;
      }

      public boolean a() {
         return this.d == 0 || this.c < this.d;
      }
   }

   public static class o extends epr.m {
      private static final int a = 7;
      private static final int b = 9;
      private static final int c = 7;

      public o(int $$0, end $$1, jn $$2) {
         super(eoc.q, $$0, $$1);
         this.a($$2);
      }

      public o(tq $$0) {
         super(eoc.q, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.a((epr.q)$$0, $$1, $$2, 2, 0, false);
         this.b((epr.q)$$0, $$1, $$2, 0, 2, false);
         this.c((epr.q)$$0, $$1, $$2, 0, 2, false);
      }

      public static epr.o a(enq $$0, int $$1, int $$2, int $$3, jn $$4, int $$5) {
         end $$6 = end.a($$1, $$2, $$3, -2, 0, 0, 7, 9, 7, $$4);
         return a($$6) && $$0.a($$6) == null ? new epr.o($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 6, 1, 6, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 6, 7, 6, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 0, 2, 0, 1, 6, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 6, 1, 6, 6, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 2, 0, 6, 6, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 2, 6, 6, 6, 6, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 0, 6, 1, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 5, 0, 6, 6, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 2, 0, 6, 6, 1, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 2, 5, 6, 6, 6, djn.fI.m(), djn.fI.m(), false);
         dww $$7 = djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true));
         dww $$8 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         this.a($$0, $$4, 2, 6, 0, 4, 6, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);
         this.a($$0, $$4, 2, 6, 6, 4, 6, 6, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 6, 4, 5, 6, $$7, $$7, false);
         this.a($$0, $$4, 0, 6, 2, 0, 6, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 5, 2, 0, 5, 4, $$8, $$8, false);
         this.a($$0, $$4, 6, 6, 2, 6, 6, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 5, 2, 6, 5, 4, $$8, $$8, false);

         for (int $$9 = 0; $$9 <= 6; $$9++) {
            for (int $$10 = 0; $$10 <= 6; $$10++) {
               this.b($$0, djn.fI.m(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class p extends epr.m {
      private static final int a = 7;
      private static final int b = 11;
      private static final int c = 7;

      public p(int $$0, end $$1, jn $$2) {
         super(eoc.r, $$0, $$1);
         this.a($$2);
      }

      public p(tq $$0) {
         super(eoc.r, $$0);
      }

      @Override
      public void a(enp $$0, enq $$1, azh $$2) {
         this.c((epr.q)$$0, $$1, $$2, 6, 2, false);
      }

      public static epr.p a(enq $$0, int $$1, int $$2, int $$3, int $$4, jn $$5) {
         end $$6 = end.a($$1, $$2, $$3, -2, 0, 0, 7, 11, 7, $$5);
         return a($$6) && $$0.a($$6) == null ? new epr.p($$4, $$6, $$5) : null;
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 6, 1, 6, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 0, 6, 10, 6, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 0, 2, 0, 1, 8, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 5, 2, 0, 6, 8, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 0, 2, 1, 0, 8, 6, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 2, 1, 6, 8, 6, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 2, 6, 5, 8, 6, djn.fI.m(), djn.fI.m(), false);
         dww $$7 = djn.fJ.m().b(dmk.d, Boolean.valueOf(true)).b(dmk.b, Boolean.valueOf(true));
         dww $$8 = djn.fJ.m().b(dmk.a, Boolean.valueOf(true)).b(dmk.c, Boolean.valueOf(true));
         this.a($$0, $$4, 0, 3, 2, 0, 5, 4, $$8, $$8, false);
         this.a($$0, $$4, 6, 3, 2, 6, 5, 2, $$8, $$8, false);
         this.a($$0, $$4, 6, 3, 4, 6, 5, 4, $$8, $$8, false);
         this.a($$0, djn.fI.m(), 5, 2, 5, $$4);
         this.a($$0, $$4, 4, 2, 5, 4, 3, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 3, 2, 5, 3, 4, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 2, 5, 2, 5, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 2, 5, 1, 6, 5, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 1, 7, 1, 5, 7, 4, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 6, 8, 2, 6, 8, 4, djn.a.m(), djn.a.m(), false);
         this.a($$0, $$4, 2, 6, 0, 4, 8, 0, djn.fI.m(), djn.fI.m(), false);
         this.a($$0, $$4, 2, 5, 0, 4, 5, 0, $$7, $$7, false);

         for (int $$9 = 0; $$9 <= 6; $$9++) {
            for (int $$10 = 0; $$10 <= 6; $$10++) {
               this.b($$0, djn.fI.m(), $$9, -1, $$10, $$4);
            }
         }
      }
   }

   public static class q extends epr.a {
      public epr.n a;
      public List<epr.n> b;
      public List<epr.n> c;
      public final List<enp> d = Lists.newArrayList();

      public q(azh $$0, int $$1, int $$2) {
         super($$1, $$2, a($$0));
         this.b = Lists.newArrayList();

         for (epr.n $$3 : epr.d) {
            $$3.c = 0;
            this.b.add($$3);
         }

         this.c = Lists.newArrayList();

         for (epr.n $$4 : epr.e) {
            $$4.c = 0;
            this.c.add($$4);
         }
      }

      public q(tq $$0) {
         super(eoc.s, $$0);
      }
   }
}
