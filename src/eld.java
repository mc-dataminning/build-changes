import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eld {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final eld.f[] g = new eld.f[]{
      new eld.f(eld.n.class, 40, 0),
      new eld.f(eld.h.class, 5, 5),
      new eld.f(eld.d.class, 20, 0),
      new eld.f(eld.i.class, 20, 0),
      new eld.f(eld.j.class, 10, 6),
      new eld.f(eld.o.class, 5, 5),
      new eld.f(eld.l.class, 5, 5),
      new eld.f(eld.c.class, 5, 4),
      new eld.f(eld.a.class, 5, 4),
      new eld.f(eld.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new eld.f(eld.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<eld.f> h;
   static Class<? extends eld.p> i;
   private static int j;
   static final eld.k k = new eld.k();

   public static void a() {
      h = Lists.newArrayList();

      for (eld.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (eld.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static eld.p a(Class<? extends eld.p> $$0, eir $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable je $$6, int $$7) {
      eld.p $$8 = null;
      if ($$0 == eld.n.class) {
         $$8 = eld.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.h.class) {
         $$8 = eld.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.d.class) {
         $$8 = eld.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.i.class) {
         $$8 = eld.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.j.class) {
         $$8 = eld.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.o.class) {
         $$8 = eld.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.l.class) {
         $$8 = eld.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.c.class) {
         $$8 = eld.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.a.class) {
         $$8 = eld.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.e.class) {
         $$8 = eld.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == eld.g.class) {
         $$8 = eld.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static eld.p a(eld.m $$0, eir $$1, azh $$2, int $$3, int $$4, int $$5, je $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            eld.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (eld.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  eld.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
                  if ($$12 != null) {
                     $$11.c++;
                     $$0.a = $$11;
                     if (!$$11.a()) {
                        h.remove($$11);
                     }

                     return $$12;
                  }
               }
            }
         }

         eie $$13 = eld.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new eld.b($$7, $$13, $$6) : null;
      }
   }

   static eiq b(eld.m $$0, eir $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable je $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eiq $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends eld.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(us $$0) {
         super(ejd.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         this.a((eld.m)$$0, $$1, $$2, 1, 1);
      }

      public static eld.a a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eld.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dfd.eH.o(), dfd.eH.o(), false);
         this.a($$0, dfd.jK.o(), 3, 1, 1, $$4);
         this.a($$0, dfd.jK.o(), 3, 1, 5, $$4);
         this.a($$0, dfd.jK.o(), 3, 2, 2, $$4);
         this.a($$0, dfd.jK.o(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dfd.jK.o(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, eqg.y);
         }
      }
   }

   public static class b extends eld.p {
      private final int a;

      public b(int $$0, eie $$1, je $$2) {
         super(ejd.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != je.c && $$2 != je.d ? $$1.d() : $$1.f();
      }

      public b(us $$0) {
         super(ejd.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eie a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5) {
         int $$6 = 3;
         eie $$7 = eie.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eiq $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eie.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eie.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dfd.eH.o(), 0, 0, $$7, $$4);
            this.a($$0, dfd.eH.o(), 1, 0, $$7, $$4);
            this.a($$0, dfd.eH.o(), 2, 0, $$7, $$4);
            this.a($$0, dfd.eH.o(), 3, 0, $$7, $$4);
            this.a($$0, dfd.eH.o(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dfd.eH.o(), 0, $$8, $$7, $$4);
               this.a($$0, dfd.nc.o(), 1, $$8, $$7, $$4);
               this.a($$0, dfd.nc.o(), 2, $$8, $$7, $$4);
               this.a($$0, dfd.nc.o(), 3, $$8, $$7, $$4);
               this.a($$0, dfd.eH.o(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dfd.eH.o(), 0, 4, $$7, $$4);
            this.a($$0, dfd.eH.o(), 1, 4, $$7, $$4);
            this.a($$0, dfd.eH.o(), 2, 4, $$7, $$4);
            this.a($$0, dfd.eH.o(), 3, 4, $$7, $$4);
            this.a($$0, dfd.eH.o(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends eld.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(us $$0) {
         super(ejd.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         int $$3 = 3;
         int $$4 = 5;
         je $$5 = this.i();
         if ($$5 == je.e || $$5 == je.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((eld.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((eld.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((eld.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((eld.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((eld.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static eld.c a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 4, 3, 0);
         if (this.d) {
            this.a($$0, $$4, 0, 3, 1, 0, 5, 3, e, e, false);
         }

         if (this.j) {
            this.a($$0, $$4, 9, 3, 1, 9, 5, 3, e, e, false);
         }

         if (this.i) {
            this.a($$0, $$4, 0, 5, 7, 0, 7, 9, e, e, false);
         }

         if (this.k) {
            this.a($$0, $$4, 9, 5, 7, 9, 7, 9, e, e, false);
         }

         this.a($$0, $$4, 5, 1, 10, 7, 3, 10, e, e, false);
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, eld.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, eld.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, eld.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, eld.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, eld.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dfd.jE.o(), dfd.jE.o(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dfd.jE.o(), dfd.jE.o(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, eld.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dfd.jE.o(), dfd.jE.o(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dfd.jE.o(), dfd.jE.o(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dfd.jE.o(), dfd.jE.o(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dfd.jE.o(), dfd.jE.o(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dfd.jE.o().a(dme.b, dtm.c), dfd.jE.o().a(dme.b, dtm.c), false);
         this.a($$0, dfd.cq.o().a(dod.g, je.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends eld.q {
      public d(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(us $$0) {
         super(ejd.w, $$0);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         je $$3 = this.i();
         if ($$3 != je.c && $$3 != je.f) {
            this.c((eld.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((eld.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eld.d a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         je $$7 = this.i();
         if ($$7 != je.c && $$7 != je.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends eld.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(us $$0) {
         super(ejd.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static eld.e a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eie.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new eld.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dfd.bs.o(), dfd.bs.o(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfd.n.o(), dfd.n.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfd.n.o(), dfd.n.o(), false);
               this.a($$0, dfd.cq.o().a(dod.g, je.f), 2, 3, $$10, $$4);
               this.a($$0, dfd.cq.o().a(dod.g, je.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfd.n.o(), dfd.n.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfd.n.o(), dfd.n.o(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dfd.cl.o(), dfd.cl.o(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dfd.cl.o(), dfd.cl.o(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dfd.cl.o(), dfd.cl.o(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dfd.cl.o(), dfd.cl.o(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dfd.cl.o(), dfd.cl.o(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dfd.cl.o(), dfd.cl.o(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dfd.cl.o(), dfd.cl.o(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dfd.n.o(), dfd.n.o(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dfd.n.o(), dfd.n.o(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dfd.n.o(), dfd.n.o(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dfd.n.o(), dfd.n.o(), false);
            this.a($$0, dfd.n.o(), 9, 5, 11, $$4);
            this.a($$0, dfd.n.o(), 8, 5, 11, $$4);
            this.a($$0, dfd.n.o(), 9, 5, 10, $$4);
            dse $$12 = dfd.dU.o().a(dhz.d, Boolean.valueOf(true)).a(dhz.b, Boolean.valueOf(true));
            dse $$13 = dfd.dU.o().a(dhz.a, Boolean.valueOf(true)).a(dhz.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dfd.dU.o().a(dhz.a, Boolean.valueOf(true)).a(dhz.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dfd.dU.o().a(dhz.c, Boolean.valueOf(true)).a(dhz.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dfd.dU.o().a(dhz.a, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dfd.dU.o().a(dhz.c, Boolean.valueOf(true)).a(dhz.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dfd.dU.o().a(dhz.a, Boolean.valueOf(true)).a(dhz.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dse $$15 = dfd.cO.o().a(djh.b, je.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dse $$18 = dfd.dU.o().a(dhz.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dse $$19 = dfd.dU.o().a(dhz.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dse $$20 = $$13.a(dhz.d, Boolean.valueOf(true)).a(dhz.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(dhz.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(dhz.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(dhz.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(dhz.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dse $$21 = dfd.cp.o();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, eqg.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, eqg.w);
         }
      }
   }

   static class f {
      public final Class<? extends eld.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends eld.p> $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
      }

      public boolean a(int $$0) {
         return this.d == 0 || this.c < this.d;
      }

      public boolean a() {
         return this.d == 0 || this.c < this.d;
      }
   }

   public static class g extends eld.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eie $$1, je $$2) {
         super(ejd.y, $$0, $$1);
         this.a($$2);
      }

      public g(us $$0) {
         super(ejd.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         if ($$0 != null) {
            ((eld.m)$$0).b = this;
         }
      }

      public static eld.g a(eir $$0, int $$1, int $$2, int $$3, je $$4, int $$5) {
         eie $$6 = eie.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new eld.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, eld.k);
         this.a($$0, $$3, $$4, eld.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, eld.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, eld.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, eld.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, eld.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, eld.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, eld.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dfd.H.o(), dfd.H.o(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dfd.H.o(), dfd.H.o(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, eld.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dfd.H.o(), dfd.H.o(), false);
         dse $$8 = dfd.eW.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true));
         dse $$9 = dfd.eW.o().a(djc.d, Boolean.valueOf(true)).a(djc.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dse $$12 = dfd.fj.o().a(dmv.b, je.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, eld.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, eld.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, eld.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dse $$14 = dfd.fy.o().a(dhq.b, je.c);
         dse $$15 = dfd.fy.o().a(dhq.b, je.d);
         dse $$16 = dfd.fy.o().a(dhq.b, je.f);
         dse $$17 = dfd.fy.o().a(dhq.b, je.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(dhq.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(dhq.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(dhq.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(dhq.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(dhq.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(dhq.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(dhq.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(dhq.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(dhq.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(dhq.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(dhq.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(dhq.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dse $$21 = dfd.fx.o();
            this.a($$0, $$21, 4, 3, 9, $$4);
            this.a($$0, $$21, 5, 3, 9, $$4);
            this.a($$0, $$21, 6, 3, 9, $$4);
            this.a($$0, $$21, 4, 3, 10, $$4);
            this.a($$0, $$21, 5, 3, 10, $$4);
            this.a($$0, $$21, 6, 3, 10, $$4);
            this.a($$0, $$21, 4, 3, 11, $$4);
            this.a($$0, $$21, 5, 3, 11, $$4);
            this.a($$0, $$21, 6, 3, 11, $$4);
         }

         if (!this.d) {
            iz $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dfd.ct.o(), 2);
               if ($$0.c_($$22) instanceof dqx $$24) {
                  $$24.a(btc.aM, $$3);
               }
            }
         }
      }
   }

   public static class h extends eld.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(us $$0) {
         super(ejd.z, $$0);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         this.a((eld.m)$$0, $$1, $$2, 1, 1);
      }

      public static eld.h a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, eld.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, eld.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, eld.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, eld.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dfd.eW.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dfd.eW.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true)).a(djc.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dfd.eW.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dfd.eW.o().a(djc.d, Boolean.valueOf(true)).a(djc.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dfd.eW.o().a(djc.d, Boolean.valueOf(true)).a(djc.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dfd.eW.o().a(djc.d, Boolean.valueOf(true)).a(djc.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dfd.eW.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dfd.eW.o().a(djc.a, Boolean.valueOf(true)).a(djc.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dse $$8 = dfd.dy.o().a(dhh.b, je.e);
         dse $$9 = dfd.dy.o().a(dhh.b, je.e).a(dhh.f, dta.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends eld.q {
      public i(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(us $$0) {
         super(ejd.A, $$0);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         je $$3 = this.i();
         if ($$3 != je.c && $$3 != je.f) {
            this.b((eld.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((eld.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static eld.i a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         je $$7 = this.i();
         if ($$7 != je.c && $$7 != je.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends eld.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(us $$0) {
         super(ejd.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         this.a((eld.m)$$0, $$1, $$2, 4, 1);
         this.b((eld.m)$$0, $$1, $$2, 1, 4);
         this.c((eld.m)$$0, $$1, $$2, 1, 4);
      }

      public static eld.j a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dfd.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfd.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfd.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfd.cq.o().a(dod.g, je.e), 4, 3, 5, $$4);
               this.a($$0, dfd.cq.o().a(dod.g, je.f), 6, 3, 5, $$4);
               this.a($$0, dfd.cq.o().a(dod.g, je.d), 5, 3, 4, $$4);
               this.a($$0, dfd.cq.o().a(dod.g, je.c), 5, 3, 6, $$4);
               this.a($$0, dfd.jE.o(), 4, 1, 4, $$4);
               this.a($$0, dfd.jE.o(), 4, 1, 5, $$4);
               this.a($$0, dfd.jE.o(), 4, 1, 6, $$4);
               this.a($$0, dfd.jE.o(), 6, 1, 4, $$4);
               this.a($$0, dfd.jE.o(), 6, 1, 5, $$4);
               this.a($$0, dfd.jE.o(), 6, 1, 6, $$4);
               this.a($$0, dfd.jE.o(), 5, 1, 4, $$4);
               this.a($$0, dfd.jE.o(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dfd.eH.o(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dfd.eH.o(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dfd.eH.o(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dfd.eH.o(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dfd.eH.o(), 5, 1, 5, $$4);
               this.a($$0, dfd.eH.o(), 5, 2, 5, $$4);
               this.a($$0, dfd.eH.o(), 5, 3, 5, $$4);
               this.a($$0, dfd.G.o(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dfd.m.o(), 1, 3, $$8, $$4);
                  this.a($$0, dfd.m.o(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dfd.m.o(), $$9, 3, 1, $$4);
                  this.a($$0, dfd.m.o(), $$9, 3, 9, $$4);
               }

               this.a($$0, dfd.m.o(), 5, 1, 4, $$4);
               this.a($$0, dfd.m.o(), 5, 1, 6, $$4);
               this.a($$0, dfd.m.o(), 5, 3, 4, $$4);
               this.a($$0, dfd.m.o(), 5, 3, 6, $$4);
               this.a($$0, dfd.m.o(), 4, 1, 5, $$4);
               this.a($$0, dfd.m.o(), 6, 1, 5, $$4);
               this.a($$0, dfd.m.o(), 4, 3, 5, $$4);
               this.a($$0, dfd.m.o(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dfd.m.o(), 4, $$10, 4, $$4);
                  this.a($$0, dfd.m.o(), 6, $$10, 4, $$4);
                  this.a($$0, dfd.m.o(), 4, $$10, 6, $$4);
                  this.a($$0, dfd.m.o(), 6, $$10, 6, $$4);
               }

               this.a($$0, dfd.cq.o(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dfd.n.o(), 2, 3, $$11, $$4);
                  this.a($$0, dfd.n.o(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dfd.n.o(), 4, 3, $$11, $$4);
                     this.a($$0, dfd.n.o(), 5, 3, $$11, $$4);
                     this.a($$0, dfd.n.o(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dfd.n.o(), 7, 3, $$11, $$4);
                  this.a($$0, dfd.n.o(), 8, 3, $$11, $$4);
               }

               dse $$12 = dfd.cO.o().a(djh.b, je.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, eqg.x);
         }
      }
   }

   static class k extends eiq.a {
      @Override
      public void a(azh $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dfd.eJ.o();
            } else if ($$5 < 0.5F) {
               this.a = dfd.eI.o();
            } else if ($$5 < 0.55F) {
               this.a = dfd.eP.o();
            } else {
               this.a = dfd.eH.o();
            }
         } else {
            this.a = dfd.nc.o();
         }
      }
   }

   public static class l extends eld.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(ejd $$0, int $$1, int $$2, int $$3, je $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = eld.p.a.a;
      }

      public l(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(ejd $$0, us $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(us $$0) {
         this(ejd.C, $$0);
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         if (this.d) {
            eld.i = eld.c.class;
         }

         this.a((eld.m)$$0, $$1, $$2, 1, 1);
      }

      public static eld.l a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eld.p.a.a, 1, 1, 4);
         this.a($$0, dfd.eH.o(), 2, 6, 1, $$4);
         this.a($$0, dfd.eH.o(), 1, 5, 1, $$4);
         this.a($$0, dfd.jE.o(), 1, 6, 1, $$4);
         this.a($$0, dfd.eH.o(), 1, 5, 2, $$4);
         this.a($$0, dfd.eH.o(), 1, 4, 3, $$4);
         this.a($$0, dfd.jE.o(), 1, 5, 3, $$4);
         this.a($$0, dfd.eH.o(), 2, 4, 3, $$4);
         this.a($$0, dfd.eH.o(), 3, 3, 3, $$4);
         this.a($$0, dfd.jE.o(), 3, 4, 3, $$4);
         this.a($$0, dfd.eH.o(), 3, 3, 2, $$4);
         this.a($$0, dfd.eH.o(), 3, 2, 1, $$4);
         this.a($$0, dfd.jE.o(), 3, 3, 1, $$4);
         this.a($$0, dfd.eH.o(), 2, 2, 1, $$4);
         this.a($$0, dfd.eH.o(), 1, 1, 1, $$4);
         this.a($$0, dfd.jE.o(), 1, 2, 1, $$4);
         this.a($$0, dfd.eH.o(), 1, 1, 2, $$4);
         this.a($$0, dfd.jE.o(), 1, 1, 3, $$4);
      }
   }

   public static class m extends eld.l {
      public eld.f a;
      @Nullable
      public eld.g b;
      public final List<eiq> c = Lists.newArrayList();

      public m(azh $$0, int $$1, int $$2) {
         super(ejd.D, 0, $$1, $$2, a($$0));
      }

      public m(us $$0) {
         super(ejd.D, $$0);
      }

      @Override
      public iz h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends eld.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(us $$0) {
         super(ejd.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         this.a((eld.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((eld.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((eld.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static eld.n a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, eld.p.a.a, 1, 1, 6);
         dse $$7 = dfd.cq.o().a(dod.g, je.f);
         dse $$8 = dfd.cq.o().a(dod.g, je.e);
         this.a($$0, $$4, $$3, 0.1F, 1, 2, 1, $$7);
         this.a($$0, $$4, $$3, 0.1F, 3, 2, 1, $$8);
         this.a($$0, $$4, $$3, 0.1F, 1, 2, 5, $$7);
         this.a($$0, $$4, $$3, 0.1F, 3, 2, 5, $$8);
         if (this.d) {
            this.a($$0, $$4, 0, 1, 2, 0, 3, 4, e, e, false);
         }

         if (this.i) {
            this.a($$0, $$4, 4, 1, 2, 4, 3, 4, e, e, false);
         }
      }
   }

   public static class o extends eld.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azh $$1, eie $$2, je $$3) {
         super(ejd.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(us $$0) {
         super(ejd.F, $$0);
      }

      @Override
      public void a(eiq $$0, eir $$1, azh $$2) {
         this.a((eld.m)$$0, $$1, $$2, 1, 1);
      }

      public static eld.o a(eir $$0, azh $$1, int $$2, int $$3, int $$4, je $$5, int $$6) {
         eie $$7 = eie.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new eld.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, eld.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, eld.p.a.a, 1, 1, 7);
         dse $$7 = dfd.cQ.o().a(dmv.b, je.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dfd.eH.o(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfd.eH.o(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dfd.eH.o(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eiq {
      protected eld.p.a h = eld.p.a.a;

      protected p(ejd $$0, int $$1, eie $$2) {
         super($$0, $$1, $$2);
      }

      public p(ejd $$0, us $$1) {
         super($$0, $$1);
         this.h = eld.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dcv $$0, azh $$1, eie $$2, eld.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dfd.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfd.cN.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfd.cN.o().a(dhh.f, dta.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dfd.nc.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfd.nc.o(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfd.eW.o().a(djc.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dfd.eW.o().a(djc.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfd.eW.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eW.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eW.o().a(djc.b, Boolean.valueOf(true)).a(djc.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eW.o().a(djc.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfd.eW.o().a(djc.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dfd.eH.o(), $$4, $$5, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dfd.eH.o(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dfd.dy.o(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dfd.dy.o().a(dhh.f, dta.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dfd.dM.o().a(dfl.aE, je.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dfd.dM.o().a(dfl.aE, je.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected eld.p.a b(azh $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return eld.p.a.a;
            case 2:
               return eld.p.a.b;
            case 3:
               return eld.p.a.c;
            case 4:
               return eld.p.a.d;
         }
      }

      @Nullable
      protected eiq a(eld.m $$0, eir $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eld.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return eld.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return eld.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return eld.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eiq b(eld.m $$0, eir $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eld.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, je.e, this.g());
               case d:
                  return eld.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, je.e, this.g());
               case e:
                  return eld.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, je.c, this.g());
               case f:
                  return eld.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, je.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eiq c(eld.m $$0, eir $$1, azh $$2, int $$3, int $$4) {
         je $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return eld.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, je.f, this.g());
               case d:
                  return eld.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, je.f, this.g());
               case e:
                  return eld.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, je.d, this.g());
               case f:
                  return eld.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, je.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eie $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends eld.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(ejd $$0, int $$1, eie $$2) {
         super($$0, $$1, $$2);
      }

      public q(ejd $$0, us $$1) {
         super($$0, $$1);
      }
   }
}
