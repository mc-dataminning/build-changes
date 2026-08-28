import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwo {
   public static final int a = 20;
   public static final cwo b = new cwo(List.of(), List.of(), List.of());
   private final List<cyr> c;
   private final List<cwo.b<cwn>> d;
   private final List<cwo.b<cuj>> e;

   cwo(List<cyr> $$0, List<cwo.b<cwn>> $$1, List<cwo.b<cuj>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cuo $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cuo $$0) {
      for (cyr $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cuo $$0) {
      for (cwo.b<cuj> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuo $$0) {
      for (cwo.b<cwn> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji<cwn> $$0) {
      for (cwo.b<cwn> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cuo $$0, cuo $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cuo $$0, cuo $$1) {
      for (cwo.b<cuj> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuo $$0, cuo $$1) {
      Optional<ji<cwn>> $$2 = $$0.a(km.G, cwp.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwo.b<cwn> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cuo d(cuo $$0, cuo $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<ji<cwn>> $$2 = $$1.a(km.G, cwp.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwo.b<cuj> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwp.a($$3.c.a(), $$2.get());
               }
            }

            for (cwo.b<cwn> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwp.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwo a(cpk $$0) {
      cwo.a $$1 = new cwo.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwo.a $$0) {
      $$0.a(cur.sk);
      $$0.a(cur.vo);
      $$0.a(cur.vr);
      $$0.a(cur.sk, cur.pu, cur.vo);
      $$0.a(cur.vo, cur.vn, cur.vr);
      $$0.a(cwq.a, cur.qY, cwq.c);
      $$0.a(cwq.a, cur.lH, cwq.b);
      $$0.a(cwq.a, cur.sj, cwq.d);
      $$0.a(cur.yD, cwq.Q);
      $$0.a(cur.lO, cwq.S);
      $$0.a(cur.b, cwq.T);
      $$0.a(cur.cM, cwq.R);
      $$0.a(cwq.d, cur.uk, cwq.e);
      $$0.a(cwq.e, cur.lH, cwq.f);
      $$0.a(cwq.e, cur.sn, cwq.g);
      $$0.a(cwq.f, cur.sn, cwq.h);
      $$0.a(cwq.g, cur.lH, cwq.h);
      $$0.a(cur.sp, cwq.l);
      $$0.a(cwq.l, cur.lH, cwq.m);
      $$0.a(cur.uD, cwq.i);
      $$0.a(cwq.i, cur.lH, cwq.j);
      $$0.a(cwq.i, cur.qY, cwq.k);
      $$0.a(cwq.i, cur.sn, cwq.q);
      $$0.a(cwq.j, cur.sn, cwq.r);
      $$0.a(cwq.q, cur.lH, cwq.r);
      $$0.a(cwq.q, cur.qY, cwq.s);
      $$0.a(cwq.d, cur.oo, cwq.t);
      $$0.a(cwq.t, cur.lH, cwq.u);
      $$0.a(cwq.t, cur.qY, cwq.v);
      $$0.a(cwq.n, cur.sn, cwq.q);
      $$0.a(cwq.o, cur.sn, cwq.r);
      $$0.a(cur.rA, cwq.n);
      $$0.a(cwq.n, cur.lH, cwq.o);
      $$0.a(cwq.n, cur.qY, cwq.p);
      $$0.a(cwq.d, cur.rc, cwq.w);
      $$0.a(cwq.w, cur.lH, cwq.x);
      $$0.a(cur.st, cwq.y);
      $$0.a(cwq.y, cur.qY, cwq.z);
      $$0.a(cwq.y, cur.sn, cwq.A);
      $$0.a(cwq.z, cur.sn, cwq.B);
      $$0.a(cwq.A, cur.qY, cwq.B);
      $$0.a(cwq.C, cur.sn, cwq.A);
      $$0.a(cwq.D, cur.sn, cwq.A);
      $$0.a(cwq.E, cur.sn, cwq.B);
      $$0.a(cur.sm, cwq.C);
      $$0.a(cwq.C, cur.lH, cwq.D);
      $$0.a(cwq.C, cur.qY, cwq.E);
      $$0.a(cur.sh, cwq.F);
      $$0.a(cwq.F, cur.lH, cwq.G);
      $$0.a(cwq.F, cur.qY, cwq.H);
      $$0.a(cur.so, cwq.I);
      $$0.a(cwq.I, cur.lH, cwq.J);
      $$0.a(cwq.I, cur.qY, cwq.K);
      $$0.a(cwq.a, cur.sn, cwq.L);
      $$0.a(cwq.L, cur.lH, cwq.M);
      $$0.a(cwq.d, cur.vQ, cwq.O);
      $$0.a(cwq.O, cur.lH, cwq.P);
   }

   public static class a {
      private final List<cyr> a = new ArrayList<>();
      private final List<cwo.b<cwn>> b = new ArrayList<>();
      private final List<cwo.b<cuj>> c = new ArrayList<>();
      private final cpk d;

      public a(cpk $$0) {
         this.d = $$0;
      }

      private static void b(cuj $$0) {
         if (!($$0 instanceof cvf)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lp.h.b($$0));
         }
      }

      public void a(cuj $$0, cuj $$1, cuj $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwo.b<>($$0.o(), cyr.a($$1), $$2.o()));
         }
      }

      public void a(cuj $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyr.a($$0));
         }
      }

      public void a(ji<cwn> $$0, cuj $$1, ji<cwn> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwo.b<>($$0, cyr.a($$1), $$2));
         }
      }

      public void a(cuj $$0, ji<cwn> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwq.a, $$0, cwq.b);
            this.a(cwq.d, $$0, $$1);
         }
      }

      public cwo a() {
         return new cwo(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(ji<T> a, cyr b, ji<T> c) {
   }
}
