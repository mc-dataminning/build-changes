import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class erb {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final erb.f[] g = new erb.f[]{
      new erb.f(erb.n.class, 40, 0),
      new erb.f(erb.h.class, 5, 5),
      new erb.f(erb.d.class, 20, 0),
      new erb.f(erb.i.class, 20, 0),
      new erb.f(erb.j.class, 10, 6),
      new erb.f(erb.o.class, 5, 5),
      new erb.f(erb.l.class, 5, 5),
      new erb.f(erb.c.class, 5, 4),
      new erb.f(erb.a.class, 5, 4),
      new erb.f(erb.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new erb.f(erb.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<erb.f> h;
   static Class<? extends erb.p> i;
   private static int j;
   static final erb.k k = new erb.k();

   public static void a() {
      h = Lists.newArrayList();

      for (erb.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for (erb.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j = j + $$1.b;
      }

      return $$0;
   }

   private static erb.p a(Class<? extends erb.p> $$0, eoo $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable jn $$6, int $$7) {
      erb.p $$8 = null;
      if ($$0 == erb.n.class) {
         $$8 = erb.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.h.class) {
         $$8 = erb.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.d.class) {
         $$8 = erb.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.i.class) {
         $$8 = erb.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.j.class) {
         $$8 = erb.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.o.class) {
         $$8 = erb.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.l.class) {
         $$8 = erb.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.c.class) {
         $$8 = erb.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.a.class) {
         $$8 = erb.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.e.class) {
         $$8 = erb.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == erb.g.class) {
         $$8 = erb.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static erb.p a(erb.m $$0, eoo $$1, azh $$2, int $$3, int $$4, int $$5, jn $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            erb.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while ($$9 < 5) {
            $$9++;
            int $$10 = $$2.a(j);

            for (erb.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  erb.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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

         eob $$13 = erb.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.i() > 1 ? new erb.b($$7, $$13, $$6) : null;
      }
   }

   static eon b(erb.m $$0, eoo $$1, azh $$2, int $$3, int $$4, int $$5, @Nullable jn $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().h()) <= 112 && Math.abs($$5 - $$0.f().j()) <= 112) {
         eon $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends erb.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(tq $$0) {
         super(epa.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         this.a((erb.m)$$0, $$1, $$2, 1, 1);
      }

      public static erb.a a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, erb.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, dkg.eV.m(), dkg.eV.m(), false);
         this.a($$0, dkg.kj.m(), 3, 1, 1, $$4);
         this.a($$0, dkg.kj.m(), 3, 1, 5, $$4);
         this.a($$0, dkg.kj.m(), 3, 2, 2, $$4);
         this.a($$0, dkg.kj.m(), 3, 2, 4, $$4);

         for (int $$7 = 2; $$7 <= 4; $$7++) {
            this.a($$0, dkg.kj.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, ewk.x);
         }
      }
   }

   public static class b extends erb.p {
      private final int a;

      public b(int $$0, eob $$1, jn $$2) {
         super(epa.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != jn.c && $$2 != jn.d ? $$1.d() : $$1.f();
      }

      public b(tq $$0) {
         super(epa.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static eob a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5) {
         int $$6 = 3;
         eob $$7 = eob.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         eon $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().i() == $$7.i()) {
               for (int $$9 = 2; $$9 >= 1; $$9--) {
                  $$7 = eob.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return eob.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         for (int $$7 = 0; $$7 < this.a; $$7++) {
            this.a($$0, dkg.eV.m(), 0, 0, $$7, $$4);
            this.a($$0, dkg.eV.m(), 1, 0, $$7, $$4);
            this.a($$0, dkg.eV.m(), 2, 0, $$7, $$4);
            this.a($$0, dkg.eV.m(), 3, 0, $$7, $$4);
            this.a($$0, dkg.eV.m(), 4, 0, $$7, $$4);

            for (int $$8 = 1; $$8 <= 3; $$8++) {
               this.a($$0, dkg.eV.m(), 0, $$8, $$7, $$4);
               this.a($$0, dkg.nE.m(), 1, $$8, $$7, $$4);
               this.a($$0, dkg.nE.m(), 2, $$8, $$7, $$4);
               this.a($$0, dkg.nE.m(), 3, $$8, $$7, $$4);
               this.a($$0, dkg.eV.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, dkg.eV.m(), 0, 4, $$7, $$4);
            this.a($$0, dkg.eV.m(), 1, 4, $$7, $$4);
            this.a($$0, dkg.eV.m(), 2, 4, $$7, $$4);
            this.a($$0, dkg.eV.m(), 3, 4, $$7, $$4);
            this.a($$0, dkg.eV.m(), 4, 4, $$7, $$4);
         }
      }
   }

   public static class c extends erb.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(tq $$0) {
         super(epa.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         int $$3 = 3;
         int $$4 = 5;
         jn $$5 = this.i();
         if ($$5 == jn.e || $$5 == jn.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((erb.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((erb.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((erb.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((erb.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((erb.m)$$0, $$1, $$2, $$4, 7);
         }
      }

      public static erb.c a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, erb.k);
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
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, erb.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, erb.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, erb.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, erb.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, erb.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, dkg.kd.m(), dkg.kd.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, dkg.kd.m(), dkg.kd.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, erb.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, dkg.kd.m(), dkg.kd.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, dkg.kd.m(), dkg.kd.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, dkg.kd.m(), dkg.kd.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, dkg.kd.m(), dkg.kd.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, dkg.kd.m().b(drn.b, dyy.c), dkg.kd.m().b(drn.b, dyy.c), false);
         this.a($$0, dkg.cx.m().b(dtm.e, jn.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends erb.q {
      public d(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(tq $$0) {
         super(epa.w, $$0);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         jn $$3 = this.i();
         if ($$3 != jn.c && $$3 != jn.f) {
            this.c((erb.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((erb.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static erb.d a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jn $$7 = this.i();
         if ($$7 != jn.c && $$7 != jn.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }
      }
   }

   public static class e extends erb.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.e() > 6;
      }

      public e(tq $$0) {
         super(epa.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static erb.e a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = eob.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new erb.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, dkg.bz.m(), dkg.bz.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for (int $$10 = 1; $$10 <= 13; $$10++) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dkg.n.m(), dkg.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dkg.n.m(), dkg.n.m(), false);
               this.a($$0, dkg.cx.m().b(dtm.e, jn.f), 2, 3, $$10, $$4);
               this.a($$0, dkg.cx.m().b(dtm.e, jn.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dkg.n.m(), dkg.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dkg.n.m(), dkg.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, dkg.cs.m(), dkg.cs.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, dkg.cs.m(), dkg.cs.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, dkg.cs.m(), dkg.cs.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, dkg.cs.m(), dkg.cs.m(), false);
               }
            }
         }

         for (int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, dkg.cs.m(), dkg.cs.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, dkg.cs.m(), dkg.cs.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, dkg.cs.m(), dkg.cs.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, dkg.n.m(), dkg.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, dkg.n.m(), dkg.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, dkg.n.m(), dkg.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, dkg.n.m(), dkg.n.m(), false);
            this.a($$0, dkg.n.m(), 9, 5, 11, $$4);
            this.a($$0, dkg.n.m(), 8, 5, 11, $$4);
            this.a($$0, dkg.n.m(), 9, 5, 10, $$4);
            dxq $$12 = dkg.eh.m().b(dnd.d, Boolean.valueOf(true)).b(dnd.b, Boolean.valueOf(true));
            dxq $$13 = dkg.eh.m().b(dnd.a, Boolean.valueOf(true)).b(dnd.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, dkg.eh.m().b(dnd.a, Boolean.valueOf(true)).b(dnd.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, dkg.eh.m().b(dnd.c, Boolean.valueOf(true)).b(dnd.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, dkg.eh.m().b(dnd.a, Boolean.valueOf(true)).b(dnd.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for (int $$14 = 0; $$14 <= 2; $$14++) {
               this.a($$0, dkg.eh.m().b(dnd.c, Boolean.valueOf(true)).b(dnd.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, dkg.eh.m().b(dnd.a, Boolean.valueOf(true)).b(dnd.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            dxq $$15 = dkg.cX.m().b(don.b, jn.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            dxq $$18 = dkg.eh.m().b(dnd.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            dxq $$19 = dkg.eh.m().b(dnd.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            dxq $$20 = $$13.b(dnd.d, Boolean.valueOf(true)).b(dnd.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.b(dnd.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.b(dnd.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.b(dnd.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.b(dnd.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            dxq $$21 = dkg.cw.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, ewk.v);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, ewk.v);
         }
      }
   }

   static class f {
      public final Class<? extends erb.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends erb.p> $$0, int $$1, int $$2) {
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

   public static class g extends erb.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, eob $$1, jn $$2) {
         super(epa.y, $$0, $$1);
         this.a($$2);
      }

      public g(tq $$0) {
         super(epa.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         if ($$0 != null) {
            ((erb.m)$$0).b = this;
         }
      }

      public static erb.g a(eoo $$0, int $$1, int $$2, int $$3, jn $$4, int $$5) {
         eob $$6 = eob.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new erb.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, erb.k);
         this.a($$0, $$3, $$4, erb.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, 6, 1, 1, 6, 14, false, $$3, erb.k);
         this.a($$0, $$4, 9, 6, 1, 9, 6, 14, false, $$3, erb.k);
         this.a($$0, $$4, 2, 6, 1, 8, 6, 2, false, $$3, erb.k);
         this.a($$0, $$4, 2, 6, 14, 8, 6, 14, false, $$3, erb.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, erb.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, erb.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, dkg.K.m(), dkg.K.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, dkg.K.m(), dkg.K.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, erb.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, dkg.K.m(), dkg.K.m(), false);
         dxq $$8 = dkg.fk.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true));
         dxq $$9 = dkg.fk.m().b(doi.d, Boolean.valueOf(true)).b(doi.b, Boolean.valueOf(true));

         for (int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for (int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         dxq $$12 = dkg.fy.m().b(dse.b, jn.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, erb.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, erb.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, erb.k);

         for (int $$13 = 4; $$13 <= 6; $$13++) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         dxq $$14 = dkg.fT.m().b(dmu.b, jn.c);
         dxq $$15 = dkg.fT.m().b(dmu.b, jn.d);
         dxq $$16 = dkg.fT.m().b(dmu.b, jn.f);
         dxq $$17 = dkg.fT.m().b(dmu.b, jn.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for (int $$20 = 0; $$20 < $$19.length; $$20++) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.b(dmu.c, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.b(dmu.c, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.b(dmu.c, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.b(dmu.c, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.b(dmu.c, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.b(dmu.c, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.b(dmu.c, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.b(dmu.c, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.b(dmu.c, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.b(dmu.c, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.b(dmu.c, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.b(dmu.c, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            dxq $$21 = dkg.fS.m();
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
            ji $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, dkg.cA.m(), 2);
               if ($$0.c_($$22) instanceof dwj $$24) {
                  $$24.a(bvi.bd, $$3);
               }
            }
         }
      }
   }

   public static class h extends erb.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(tq $$0) {
         super(epa.z, $$0);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         this.a((erb.m)$$0, $$1, $$2, 1, 1);
      }

      public static erb.h a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, erb.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, erb.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, erb.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, erb.k);

         for (int $$7 = 1; $$7 <= 3; $$7++) {
            this.a($$0, dkg.fk.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, dkg.fk.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true)).b(doi.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, dkg.fk.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, dkg.fk.m().b(doi.d, Boolean.valueOf(true)).b(doi.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, dkg.fk.m().b(doi.d, Boolean.valueOf(true)).b(doi.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, dkg.fk.m().b(doi.d, Boolean.valueOf(true)).b(doi.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, dkg.fk.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, dkg.fk.m().b(doi.a, Boolean.valueOf(true)).b(doi.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         dxq $$8 = dkg.dK.m().b(dml.b, jn.e);
         dxq $$9 = dkg.dK.m().b(dml.b, jn.e).b(dml.c, dym.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends erb.q {
      public i(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(tq $$0) {
         super(epa.A, $$0);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         jn $$3 = this.i();
         if ($$3 != jn.c && $$3 != jn.f) {
            this.b((erb.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((erb.m)$$0, $$1, $$2, 1, 1);
         }
      }

      public static erb.i a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         jn $$7 = this.i();
         if ($$7 != jn.c && $$7 != jn.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }
      }
   }

   public static class j extends erb.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(tq $$0) {
         super(epa.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         this.a((erb.m)$$0, $$1, $$2, 4, 1);
         this.b((erb.m)$$0, $$1, $$2, 1, 4);
         this.c((erb.m)$$0, $$1, $$2, 1, 4);
      }

      public static erb.j a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch (this.d) {
            case 0:
               this.a($$0, dkg.eV.m(), 5, 1, 5, $$4);
               this.a($$0, dkg.eV.m(), 5, 2, 5, $$4);
               this.a($$0, dkg.eV.m(), 5, 3, 5, $$4);
               this.a($$0, dkg.cx.m().b(dtm.e, jn.e), 4, 3, 5, $$4);
               this.a($$0, dkg.cx.m().b(dtm.e, jn.f), 6, 3, 5, $$4);
               this.a($$0, dkg.cx.m().b(dtm.e, jn.d), 5, 3, 4, $$4);
               this.a($$0, dkg.cx.m().b(dtm.e, jn.c), 5, 3, 6, $$4);
               this.a($$0, dkg.kd.m(), 4, 1, 4, $$4);
               this.a($$0, dkg.kd.m(), 4, 1, 5, $$4);
               this.a($$0, dkg.kd.m(), 4, 1, 6, $$4);
               this.a($$0, dkg.kd.m(), 6, 1, 4, $$4);
               this.a($$0, dkg.kd.m(), 6, 1, 5, $$4);
               this.a($$0, dkg.kd.m(), 6, 1, 6, $$4);
               this.a($$0, dkg.kd.m(), 5, 1, 4, $$4);
               this.a($$0, dkg.kd.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for (int $$7 = 0; $$7 < 5; $$7++) {
                  this.a($$0, dkg.eV.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, dkg.eV.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, dkg.eV.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, dkg.eV.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, dkg.eV.m(), 5, 1, 5, $$4);
               this.a($$0, dkg.eV.m(), 5, 2, 5, $$4);
               this.a($$0, dkg.eV.m(), 5, 3, 5, $$4);
               this.a($$0, dkg.J.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for (int $$8 = 1; $$8 <= 9; $$8++) {
                  this.a($$0, dkg.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, dkg.m.m(), 9, 3, $$8, $$4);
               }

               for (int $$9 = 1; $$9 <= 9; $$9++) {
                  this.a($$0, dkg.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, dkg.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, dkg.m.m(), 5, 1, 4, $$4);
               this.a($$0, dkg.m.m(), 5, 1, 6, $$4);
               this.a($$0, dkg.m.m(), 5, 3, 4, $$4);
               this.a($$0, dkg.m.m(), 5, 3, 6, $$4);
               this.a($$0, dkg.m.m(), 4, 1, 5, $$4);
               this.a($$0, dkg.m.m(), 6, 1, 5, $$4);
               this.a($$0, dkg.m.m(), 4, 3, 5, $$4);
               this.a($$0, dkg.m.m(), 6, 3, 5, $$4);

               for (int $$10 = 1; $$10 <= 3; $$10++) {
                  this.a($$0, dkg.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, dkg.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, dkg.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, dkg.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, dkg.cx.m(), 5, 3, 5, $$4);

               for (int $$11 = 2; $$11 <= 8; $$11++) {
                  this.a($$0, dkg.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, dkg.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, dkg.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, dkg.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, dkg.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, dkg.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, dkg.n.m(), 8, 3, $$11, $$4);
               }

               dxq $$12 = dkg.cX.m().b(don.b, jn.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, ewk.w);
         }
      }
   }

   static class k extends eon.a {
      @Override
      public void a(azh $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = dkg.eX.m();
            } else if ($$5 < 0.5F) {
               this.a = dkg.eW.m();
            } else if ($$5 < 0.55F) {
               this.a = dkg.fd.m();
            } else {
               this.a = dkg.eV.m();
            }
         } else {
            this.a = dkg.nE.m();
         }
      }
   }

   public static class l extends erb.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(epa $$0, int $$1, int $$2, int $$3, jn $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = erb.p.a.a;
      }

      public l(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(epa $$0, tq $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(tq $$0) {
         this(epa.C, $$0);
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         if (this.d) {
            erb.i = erb.c.class;
         }

         this.a((erb.m)$$0, $$1, $$2, 1, 1);
      }

      public static erb.l a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, erb.p.a.a, 1, 1, 4);
         this.a($$0, dkg.eV.m(), 2, 6, 1, $$4);
         this.a($$0, dkg.eV.m(), 1, 5, 1, $$4);
         this.a($$0, dkg.kd.m(), 1, 6, 1, $$4);
         this.a($$0, dkg.eV.m(), 1, 5, 2, $$4);
         this.a($$0, dkg.eV.m(), 1, 4, 3, $$4);
         this.a($$0, dkg.kd.m(), 1, 5, 3, $$4);
         this.a($$0, dkg.eV.m(), 2, 4, 3, $$4);
         this.a($$0, dkg.eV.m(), 3, 3, 3, $$4);
         this.a($$0, dkg.kd.m(), 3, 4, 3, $$4);
         this.a($$0, dkg.eV.m(), 3, 3, 2, $$4);
         this.a($$0, dkg.eV.m(), 3, 2, 1, $$4);
         this.a($$0, dkg.kd.m(), 3, 3, 1, $$4);
         this.a($$0, dkg.eV.m(), 2, 2, 1, $$4);
         this.a($$0, dkg.eV.m(), 1, 1, 1, $$4);
         this.a($$0, dkg.kd.m(), 1, 2, 1, $$4);
         this.a($$0, dkg.eV.m(), 1, 1, 2, $$4);
         this.a($$0, dkg.kd.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends erb.l {
      public erb.f a;
      @Nullable
      public erb.g b;
      public final List<eon> c = Lists.newArrayList();

      public m(azh $$0, int $$1, int $$2) {
         super(epa.D, 0, $$1, $$2, a($$0));
      }

      public m(tq $$0) {
         super(epa.D, $$0);
      }

      @Override
      public ji h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends erb.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(tq $$0) {
         super(epa.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         this.a((erb.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((erb.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((erb.m)$$0, $$1, $$2, 1, 2);
         }
      }

      public static erb.n a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, erb.p.a.a, 1, 1, 6);
         dxq $$7 = dkg.cx.m().b(dtm.e, jn.f);
         dxq $$8 = dkg.cx.m().b(dtm.e, jn.e);
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

   public static class o extends erb.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, azh $$1, eob $$2, jn $$3) {
         super(epa.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(tq $$0) {
         super(epa.F, $$0);
      }

      @Override
      public void a(eon $$0, eoo $$1, azh $$2) {
         this.a((erb.m)$$0, $$1, $$2, 1, 1);
      }

      public static erb.o a(eoo $$0, azh $$1, int $$2, int $$3, int $$4, jn $$5, int $$6) {
         eob $$7 = eob.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new erb.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, erb.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, erb.p.a.a, 1, 1, 7);
         dxq $$7 = dkg.cZ.m().b(dse.b, jn.d);

         for (int $$8 = 0; $$8 < 6; $$8++) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, dkg.eV.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dkg.eV.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, dkg.eV.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }
      }
   }

   abstract static class p extends eon {
      protected erb.p.a h = erb.p.a.a;

      protected p(epa $$0, int $$1, eob $$2) {
         super($$0, $$1, $$2);
      }

      public p(epa $$0, tq $$1) {
         super($$0, $$1);
         this.h = erb.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(dhy $$0, azh $$1, eob $$2, erb.p.a $$3, int $$4, int $$5, int $$6) {
         switch ($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, dkg.eV.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dkg.cW.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkg.cW.m().b(dml.c, dym.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, dkg.nE.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkg.nE.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dkg.fk.m().b(doi.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, dkg.fk.m().b(doi.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkg.fk.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.fk.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.fk.m().b(doi.b, Boolean.valueOf(true)).b(doi.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.fk.m().b(doi.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkg.fk.m().b(doi.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, dkg.eV.m(), $$4, $$5, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, dkg.eV.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, dkg.dK.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, dkg.dK.m().b(dml.c, dym.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, dkg.dZ.m().b(dkp.e, jn.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, dkg.dZ.m().b(dkp.e, jn.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }
      }

      protected erb.p.a b(azh $$0) {
         int $$1 = $$0.a(5);
         switch ($$1) {
            case 0:
            case 1:
            default:
               return erb.p.a.a;
            case 2:
               return erb.p.a.b;
            case 3:
               return erb.p.a.c;
            case 4:
               return erb.p.a.d;
         }
      }

      @Nullable
      protected eon a(erb.m $$0, eoo $$1, azh $$2, int $$3, int $$4) {
         jn $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return erb.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.j() - 1, $$5, this.g());
               case d:
                  return erb.b($$0, $$1, $$2, this.f.h() + $$3, this.f.i() + $$4, this.f.m() + 1, $$5, this.g());
               case e:
                  return erb.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
               case f:
                  return erb.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$4, this.f.j() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eon b(erb.m $$0, eoo $$1, azh $$2, int $$3, int $$4) {
         jn $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return erb.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jn.e, this.g());
               case d:
                  return erb.b($$0, $$1, $$2, this.f.h() - 1, this.f.i() + $$3, this.f.j() + $$4, jn.e, this.g());
               case e:
                  return erb.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jn.c, this.g());
               case f:
                  return erb.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.j() - 1, jn.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected eon c(erb.m $$0, eoo $$1, azh $$2, int $$3, int $$4) {
         jn $$5 = this.i();
         if ($$5 != null) {
            switch ($$5) {
               case c:
                  return erb.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jn.f, this.g());
               case d:
                  return erb.b($$0, $$1, $$2, this.f.k() + 1, this.f.i() + $$3, this.f.j() + $$4, jn.f, this.g());
               case e:
                  return erb.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jn.d, this.g());
               case f:
                  return erb.b($$0, $$1, $$2, this.f.h() + $$4, this.f.i() + $$3, this.f.m() + 1, jn.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(eob $$0) {
         return $$0 != null && $$0.i() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends erb.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(epa $$0, int $$1, eob $$2) {
         super($$0, $$1, $$2);
      }

      public q(epa $$0, tq $$1) {
         super($$0, $$1);
      }
   }
}
