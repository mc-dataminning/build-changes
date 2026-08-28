import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cpg extends cqh {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final Logger s = LogUtils.getLogger();
   private static final boolean t = false;
   public static final int n = 50;
   private int u;
   @Nullable
   private String v;
   private final cpx w = cpx.a();
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

   public cpg(int $$0, cmg $$1) {
      this($$0, $$1, cpq.a);
   }

   public cpg(int $$0, cmg $$1, cpq $$2) {
      super(cqm.i, $$0, $$1, $$2);
      this.a(this.w);
   }

   @Override
   protected cqi l() {
      return cqi.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(dsh $$0) {
      return $$0.a(avu.M);
   }

   @Override
   protected boolean a(cmh $$0, boolean $$1) {
      return ($$0.fL() || $$0.cq >= this.w.b()) && this.w.b() > 0;
   }

   @Override
   protected void a(cmh $$0, cua $$1) {
      if (!$$0.fZ().d) {
         $$0.c(-this.w.b());
      }

      this.q.a(0, cua.l);
      if (this.u > 0) {
         cua $$2 = this.q.a(1);
         if (!$$2.e() && $$2.H() > this.u) {
            $$2.h(this.u);
            this.q.a(1, $$2);
         } else {
            this.q.a(1, cua.l);
         }
      } else {
         this.q.a(1, cua.l);
      }

      this.w.a(0);
      this.o.a(($$1x, $$2x) -> {
         dsh $$3 = $$1x.a_($$2x);
         if (!$$0.fL() && $$3.a(avu.M) && $$0.dS().i() < 0.12F) {
            dsh $$4 = def.e($$3);
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
      cua $$0 = this.q.a(0);
      this.w.a(1);
      int $$1 = 0;
      long $$2 = 0L;
      int $$3 = 0;
      if (!$$0.e() && czl.a($$0)) {
         cua $$4 = $$0.s();
         cua $$5 = this.q.a(1);
         czp.a $$6 = new czp.a(czl.b($$4));
         $$2 += (long)$$0.a(kn.r, Integer.valueOf(0)).intValue() + (long)$$5.a(kn.r, Integer.valueOf(0)).intValue();
         this.u = 0;
         if (!$$5.e()) {
            boolean $$7 = $$5.b(kn.y);
            if ($$4.l() && $$4.g().a($$0, $$5)) {
               int $$8 = Math.min($$4.n(), $$4.o() / 4);
               if ($$8 <= 0) {
                  this.r.a(0, cua.l);
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
                  this.r.a(0, cua.l);
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

               czp $$16 = czl.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<jj<czj>> $$19 : $$16.b()) {
                  jj<czj> $$20 = (jj<czj>)$$19.getKey();
                  int $$21 = $$6.a($$20);
                  int $$22 = $$19.getIntValue();
                  $$22 = $$21 == $$22 ? $$22 + 1 : Math.max($$22, $$21);
                  czj $$23 = $$20.a();
                  boolean $$24 = $$23.c($$0);
                  if (this.p.fZ().d || $$0.a(cud.uw)) {
                     $$24 = true;
                  }

                  for (jj<czj> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !czj.a($$20, $$25)) {
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
                  this.r.a(0, cua.l);
                  this.w.a(0);
                  return;
               }
            }
         }

         if (this.v != null && !aza.h(this.v)) {
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

         int $$27 = (int)aye.a($$2 + (long)$$1, 0L, 2147483647L);
         this.w.a($$27);
         if ($$1 <= 0) {
            $$4 = cua.l;
         }

         if ($$3 == $$1 && $$3 > 0 && this.w.b() >= 40) {
            this.w.a(39);
         }

         if (this.w.b() >= 40 && !this.p.fZ().d) {
            $$4 = cua.l;
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
            czl.a($$4, $$6.b());
         }

         this.r.a(0, $$4);
         this.d();
      } else {
         this.r.a(0, cua.l);
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
            cua $$2 = this.b(2).g();
            if (aza.h($$1)) {
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
      String $$1 = aza.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int n() {
      return this.w.b();
   }
}
