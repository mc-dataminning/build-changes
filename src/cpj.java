import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cpj extends cqk {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final Logger s = LogUtils.getLogger();
   private static final boolean t = false;
   public static final int n = 50;
   private int u;
   @Nullable
   private String v;
   private final cqa w = cqa.a();
   private static final int x = 0;
   private static final int y = 1;
   private static final int z = 1;
   private static final int A = 1;
   private static final int B = 2;
   private static final int C = 1;
   private static final int D = 1;
   private static final int E = 27;
   private static final int F = 76;
   private static final int G = 134;
   private static final int H = 47;

   public cpj(int $$0, cmj $$1) {
      this($$0, $$1, cpt.a);
   }

   public cpj(int $$0, cmj $$1, cpt $$2) {
      super(cqp.i, $$0, $$1, $$2);
      this.a(this.w);
   }

   @Override
   protected cql l() {
      return cql.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(dsk $$0) {
      return $$0.a(avw.M);
   }

   @Override
   protected boolean a(cmk $$0, boolean $$1) {
      return ($$0.fM() || $$0.cq >= this.w.b()) && this.w.b() > 0;
   }

   @Override
   protected void a(cmk $$0, cuc $$1) {
      if (!$$0.ga().d) {
         $$0.c(-this.w.b());
      }

      this.q.a(0, cuc.l);
      if (this.u > 0) {
         cuc $$2 = this.q.a(1);
         if (!$$2.e() && $$2.H() > this.u) {
            $$2.h(this.u);
            this.q.a(1, $$2);
         } else {
            this.q.a(1, cuc.l);
         }
      } else {
         this.q.a(1, cuc.l);
      }

      this.w.a(0);
      this.o.a(($$1x, $$2x) -> {
         dsk $$3 = $$1x.a_($$2x);
         if (!$$0.fM() && $$3.a(avw.M) && $$0.dT().i() < 0.12F) {
            dsk $$4 = deh.e($$3);
            if ($$4 == null) {
               $$1x.a($$2x, false);
               $$1x.c(1029, $$2x, 0);
            } else {
               $$1x.a($$2x, $$4, 2);
               $$1x.c(1030, $$2x, 0);
            }
         } else {
            $$1x.c(1030, $$2x, 0);
         }
      });
   }

   @Override
   public void m() {
      cuc $$0 = this.q.a(0);
      this.w.a(1);
      int $$1 = 0;
      long $$2 = 0L;
      int $$3 = 0;
      if (!$$0.e() && czn.a($$0)) {
         cuc $$4 = $$0.s();
         cuc $$5 = this.q.a(1);
         czr.a $$6 = new czr.a(czn.b($$4));
         $$2 += (long)$$0.a(kn.r, Integer.valueOf(0)).intValue() + (long)$$5.a(kn.r, Integer.valueOf(0)).intValue();
         this.u = 0;
         if (!$$5.e()) {
            boolean $$7 = $$5.b(kn.y);
            if ($$4.l() && $$4.g().a($$0, $$5)) {
               int $$8 = Math.min($$4.n(), $$4.o() / 4);
               if ($$8 <= 0) {
                  this.r.a(0, cuc.l);
                  this.w.a(0);
                  return;
               }

               int $$9;
               for ($$9 = 0; $$8 > 0 && $$9 < $$5.H(); $$9++) {
                  int $$10 = $$4.n() - $$8;
                  $$4.b($$10);
                  $$1++;
                  $$8 = Math.min($$4.n(), $$4.o() / 4);
               }

               this.u = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.g()) || !$$4.l())) {
                  this.r.a(0, cuc.l);
                  this.w.a(0);
                  return;
               }

               if ($$4.l() && !$$7) {
                  int $$11 = $$0.o() - $$0.n();
                  int $$12 = $$5.o() - $$5.n();
                  int $$13 = $$12 + $$4.o() * 12 / 100;
                  int $$14 = $$11 + $$13;
                  int $$15 = $$4.o() - $$14;
                  if ($$15 < 0) {
                     $$15 = 0;
                  }

                  if ($$15 < $$4.n()) {
                     $$4.b($$15);
                     $$1 += 2;
                  }
               }

               czr $$16 = czn.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<jj<czl>> $$19 : $$16.b()) {
                  jj<czl> $$20 = (jj<czl>)$$19.getKey();
                  int $$21 = $$6.a($$20);
                  int $$22 = $$19.getIntValue();
                  $$22 = $$21 == $$22 ? $$22 + 1 : Math.max($$22, $$21);
                  czl $$23 = $$20.a();
                  boolean $$24 = $$23.c($$0);
                  if (this.p.ga().d || $$0.a(cuf.uw)) {
                     $$24 = true;
                  }

                  for (jj<czl> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !czl.a($$20, $$25)) {
                        $$24 = false;
                        $$1++;
                     }
                  }

                  if (!$$24) {
                     $$18 = true;
                  } else {
                     $$17 = true;
                     if ($$22 > $$23.e()) {
                        $$22 = $$23.e();
                     }

                     $$6.a($$20, $$22);
                     int $$26 = $$23.c();
                     if ($$7) {
                        $$26 = Math.max(1, $$26 / 2);
                     }

                     $$1 += $$26 * $$22;
                     if ($$0.H() > 1) {
                        $$1 = 40;
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.r.a(0, cuc.l);
                  this.w.a(0);
                  return;
               }
            }
         }

         if (this.v != null && !azd.h(this.v)) {
            if (!this.v.equals($$0.w().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.b(kn.g, wu.b(this.v));
            }
         } else if ($$0.b(kn.g)) {
            $$3 = 1;
            $$1 += $$3;
            $$4.c(kn.g);
         }

         int $$27 = (int)ayg.a($$2 + (long)$$1, 0L, 2147483647L);
         this.w.a($$27);
         if ($$1 <= 0) {
            $$4 = cuc.l;
         }

         if ($$3 == $$1 && $$3 > 0 && this.w.b() >= 40) {
            this.w.a(39);
         }

         if (this.w.b() >= 40 && !this.p.ga().d) {
            $$4 = cuc.l;
         }

         if (!$$4.e()) {
            int $$28 = $$4.a(kn.r, Integer.valueOf(0));
            if ($$28 < $$5.a(kn.r, Integer.valueOf(0))) {
               $$28 = $$5.a(kn.r, Integer.valueOf(0));
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$28 = e($$28);
            }

            $$4.b(kn.r, Integer.valueOf($$28));
            czn.a($$4, $$6.b());
         }

         this.r.a(0, $$4);
         this.d();
      } else {
         this.r.a(0, cuc.l);
         this.w.a(0);
      }
   }

   public static int e(int $$0) {
      return (int)Math.min((long)$$0 * 2L + 1L, 2147483647L);
   }

   public boolean a(String $$0) {
      String $$1 = b($$0);
      if ($$1 != null && !$$1.equals(this.v)) {
         this.v = $$1;
         if (this.b(2).h()) {
            cuc $$2 = this.b(2).g();
            if (azd.h($$1)) {
               $$2.c(kn.g);
            } else {
               $$2.b(kn.g, wu.b($$1));
            }
         }

         this.m();
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   private static String b(String $$0) {
      String $$1 = azd.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int n() {
      return this.w.b();
   }
}
