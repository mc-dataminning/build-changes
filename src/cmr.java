import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmr extends cnr {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   private static final Logger s = LogUtils.getLogger();
   private static final boolean t = false;
   public static final int n = 50;
   private int u;
   @Nullable
   private String v;
   private final cnh w = cnh.a();
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

   public cmr(int $$0, cjs $$1) {
      this($$0, $$1, cna.a);
   }

   public cmr(int $$0, cjs $$1, cna $$2) {
      super(cnw.i, $$0, $$1, $$2);
      this.a(this.w);
   }

   @Override
   protected cns l() {
      return cns.a().a(0, 27, 47, $$0 -> true).a(1, 76, 47, $$0 -> true).a(2, 134, 47).a();
   }

   @Override
   protected boolean a(doz $$0) {
      return $$0.a(avc.M);
   }

   @Override
   protected boolean a(cjt $$0, boolean $$1) {
      return ($$0.fM() || $$0.cl >= this.w.b()) && this.w.b() > 0;
   }

   @Override
   protected void a(cjt $$0, crj $$1) {
      if (!$$0.ga().d) {
         $$0.c(-this.w.b());
      }

      this.q.a(0, crj.i);
      if (this.u > 0) {
         crj $$2 = this.q.a(1);
         if (!$$2.d() && $$2.G() > this.u) {
            $$2.g(this.u);
            this.q.a(1, $$2);
         } else {
            this.q.a(1, crj.i);
         }
      } else {
         this.q.a(1, crj.i);
      }

      this.w.a(0);
      this.o.a(($$1x, $$2x) -> {
         doz $$3 = $$1x.a_($$2x);
         if (!$$0.fM() && $$3.a(avc.M) && $$0.ei().i() < 0.12F) {
            doz $$4 = day.e($$3);
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
      crj $$0 = this.q.a(0);
      this.w.a(1);
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      if (!$$0.d() && cwr.a($$0)) {
         crj $$4 = $$0.r();
         crj $$5 = this.q.a(1);
         cwx.a $$6 = new cwx.a(cwr.b($$4));
         $$2 += $$0.a(jp.l, Integer.valueOf(0)) + $$5.a(jp.l, Integer.valueOf(0));
         this.u = 0;
         if (!$$5.d()) {
            boolean $$7 = $$5.b(jp.p);
            if ($$4.k() && $$4.f().a($$0, $$5)) {
               int $$8 = Math.min($$4.m(), $$4.n() / 4);
               if ($$8 <= 0) {
                  this.r.a(0, crj.i);
                  this.w.a(0);
                  return;
               }

               int $$9;
               for ($$9 = 0; $$8 > 0 && $$9 < $$5.G(); $$9++) {
                  int $$10 = $$4.m() - $$8;
                  $$4.b($$10);
                  $$1++;
                  $$8 = Math.min($$4.m(), $$4.n() / 4);
               }

               this.u = $$9;
            } else {
               if (!$$7 && (!$$4.a($$5.f()) || !$$4.k())) {
                  this.r.a(0, crj.i);
                  this.w.a(0);
                  return;
               }

               if ($$4.k() && !$$7) {
                  int $$11 = $$0.n() - $$0.m();
                  int $$12 = $$5.n() - $$5.m();
                  int $$13 = $$12 + $$4.n() * 12 / 100;
                  int $$14 = $$11 + $$13;
                  int $$15 = $$4.n() - $$14;
                  if ($$15 < 0) {
                     $$15 = 0;
                  }

                  if ($$15 < $$4.m()) {
                     $$4.b($$15);
                     $$1 += 2;
                  }
               }

               cwx $$16 = cwr.b($$5);
               boolean $$17 = false;
               boolean $$18 = false;

               for (Entry<il<cwq>> $$19 : $$16.b()) {
                  il<cwq> $$20 = (il<cwq>)$$19.getKey();
                  cwq $$21 = $$20.a();
                  int $$22 = $$6.a($$21);
                  int $$23 = $$19.getIntValue();
                  $$23 = $$22 == $$23 ? $$23 + 1 : Math.max($$23, $$22);
                  boolean $$24 = $$21.a($$0);
                  if (this.p.ga().d || $$0.a(crm.uu)) {
                     $$24 = true;
                  }

                  for (il<cwq> $$25 : $$6.a()) {
                     if (!$$25.equals($$20) && !$$21.b($$25.a())) {
                        $$24 = false;
                        $$1++;
                     }
                  }

                  if (!$$24) {
                     $$18 = true;
                  } else {
                     $$17 = true;
                     if ($$23 > $$21.a()) {
                        $$23 = $$21.a();
                     }

                     $$6.a($$21, $$23);

                     int $$26 = switch ($$21.e()) {
                        case a -> 1;
                        case b -> 2;
                        case c -> 4;
                        case d -> 8;
                     };
                     if ($$7) {
                        $$26 = Math.max(1, $$26 / 2);
                     }

                     $$1 += $$26 * $$23;
                     if ($$0.G() > 1) {
                        $$1 = 40;
                     }
                  }
               }

               if ($$18 && !$$17) {
                  this.r.a(0, crj.i);
                  this.w.a(0);
                  return;
               }
            }
         }

         if (this.v != null && !ayf.h(this.v)) {
            if (!this.v.equals($$0.w().getString())) {
               $$3 = 1;
               $$1 += $$3;
               $$4.b(jp.d, wg.b(this.v));
            }
         } else if ($$0.b(jp.d)) {
            $$3 = 1;
            $$1 += $$3;
            $$4.c(jp.d);
         }

         this.w.a($$2 + $$1);
         if ($$1 <= 0) {
            $$4 = crj.i;
         }

         if ($$3 == $$1 && $$3 > 0 && this.w.b() >= 40) {
            this.w.a(39);
         }

         if (this.w.b() >= 40 && !this.p.ga().d) {
            $$4 = crj.i;
         }

         if (!$$4.d()) {
            int $$27 = $$4.a(jp.l, Integer.valueOf(0));
            if ($$27 < $$5.a(jp.l, Integer.valueOf(0))) {
               $$27 = $$5.a(jp.l, Integer.valueOf(0));
            }

            if ($$3 != $$1 || $$3 == 0) {
               $$27 = e($$27);
            }

            $$4.b(jp.l, Integer.valueOf($$27));
            cwr.a($$4, $$6.b());
         }

         this.r.a(0, $$4);
         this.d();
      } else {
         this.r.a(0, crj.i);
         this.w.a(0);
      }
   }

   public static int e(int $$0) {
      return $$0 * 2 + 1;
   }

   public boolean a(String $$0) {
      String $$1 = b($$0);
      if ($$1 != null && !$$1.equals(this.v)) {
         this.v = $$1;
         if (this.b(2).h()) {
            crj $$2 = this.b(2).g();
            if (ayf.h($$1)) {
               $$2.c(jp.d);
            } else {
               $$2.b(jp.d, wg.b($$1));
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
      String $$1 = ayf.g($$0);
      return $$1.length() <= 50 ? $$1 : null;
   }

   @Override
   public int n() {
      return this.w.b();
   }
}
