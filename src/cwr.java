import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwr {
   public static final int a = 20;
   public static final cwr b = new cwr(List.of(), List.of(), List.of());
   private final List<cyu> c;
   private final List<cwr.b<cwq>> d;
   private final List<cwr.b<cuj>> e;

   cwr(List<cyu> $$0, List<cwr.b<cwq>> $$1, List<cwr.b<cuj>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cuo $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cuo $$0) {
      for (cyu $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cuo $$0) {
      for (cwr.b<cuj> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuo $$0) {
      for (cwr.b<cwq> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jm<cwq> $$0) {
      for (cwr.b<cwq> $$1 : this.d) {
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
      for (cwr.b<cuj> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuo $$0, cuo $$1) {
      Optional<jm<cwq>> $$2 = $$0.a(kq.G, cws.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwr.b<cwq> $$3 : this.d) {
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
         Optional<jm<cwq>> $$2 = $$1.a(kq.G, cws.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwr.b<cuj> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cws.a($$3.c.a(), $$2.get());
               }
            }

            for (cwr.b<cwq> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cws.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwr a(cpj $$0) {
      cwr.a $$1 = new cwr.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwr.a $$0) {
      $$0.a(cur.sk);
      $$0.a(cur.vo);
      $$0.a(cur.vr);
      $$0.a(cur.sk, cur.pu, cur.vo);
      $$0.a(cur.vo, cur.vn, cur.vr);
      $$0.a(cwt.a, cur.qY, cwt.c);
      $$0.a(cwt.a, cur.lH, cwt.b);
      $$0.a(cwt.a, cur.sj, cwt.d);
      $$0.a(cur.yG, cwt.Q);
      $$0.a(cur.lO, cwt.S);
      $$0.a(cur.b, cwt.T);
      $$0.a(cur.cM, cwt.R);
      $$0.a(cwt.d, cur.uk, cwt.e);
      $$0.a(cwt.e, cur.lH, cwt.f);
      $$0.a(cwt.e, cur.sn, cwt.g);
      $$0.a(cwt.f, cur.sn, cwt.h);
      $$0.a(cwt.g, cur.lH, cwt.h);
      $$0.a(cur.sp, cwt.l);
      $$0.a(cwt.l, cur.lH, cwt.m);
      $$0.a(cur.uD, cwt.i);
      $$0.a(cwt.i, cur.lH, cwt.j);
      $$0.a(cwt.i, cur.qY, cwt.k);
      $$0.a(cwt.i, cur.sn, cwt.q);
      $$0.a(cwt.j, cur.sn, cwt.r);
      $$0.a(cwt.q, cur.lH, cwt.r);
      $$0.a(cwt.q, cur.qY, cwt.s);
      $$0.a(cwt.d, cur.oo, cwt.t);
      $$0.a(cwt.t, cur.lH, cwt.u);
      $$0.a(cwt.t, cur.qY, cwt.v);
      $$0.a(cwt.n, cur.sn, cwt.q);
      $$0.a(cwt.o, cur.sn, cwt.r);
      $$0.a(cur.rA, cwt.n);
      $$0.a(cwt.n, cur.lH, cwt.o);
      $$0.a(cwt.n, cur.qY, cwt.p);
      $$0.a(cwt.d, cur.rc, cwt.w);
      $$0.a(cwt.w, cur.lH, cwt.x);
      $$0.a(cur.st, cwt.y);
      $$0.a(cwt.y, cur.qY, cwt.z);
      $$0.a(cwt.y, cur.sn, cwt.A);
      $$0.a(cwt.z, cur.sn, cwt.B);
      $$0.a(cwt.A, cur.qY, cwt.B);
      $$0.a(cwt.C, cur.sn, cwt.A);
      $$0.a(cwt.D, cur.sn, cwt.A);
      $$0.a(cwt.E, cur.sn, cwt.B);
      $$0.a(cur.sm, cwt.C);
      $$0.a(cwt.C, cur.lH, cwt.D);
      $$0.a(cwt.C, cur.qY, cwt.E);
      $$0.a(cur.sh, cwt.F);
      $$0.a(cwt.F, cur.lH, cwt.G);
      $$0.a(cwt.F, cur.qY, cwt.H);
      $$0.a(cur.so, cwt.I);
      $$0.a(cwt.I, cur.lH, cwt.J);
      $$0.a(cwt.I, cur.qY, cwt.K);
      $$0.a(cwt.a, cur.sn, cwt.L);
      $$0.a(cwt.L, cur.lH, cwt.M);
      $$0.a(cwt.d, cur.vT, cwt.O);
      $$0.a(cwt.O, cur.lH, cwt.P);
   }

   public static class a {
      private final List<cyu> a = new ArrayList<>();
      private final List<cwr.b<cwq>> b = new ArrayList<>();
      private final List<cwr.b<cuj>> c = new ArrayList<>();
      private final cpj d;

      public a(cpj $$0) {
         this.d = $$0;
      }

      private static void b(cuj $$0) {
         if (!($$0 instanceof cvj)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lt.g.b($$0));
         }
      }

      public void a(cuj $$0, cuj $$1, cuj $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwr.b<>($$0.o(), cyu.a($$1), $$2.o()));
         }
      }

      public void a(cuj $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyu.a($$0));
         }
      }

      public void a(jm<cwq> $$0, cuj $$1, jm<cwq> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwr.b<>($$0, cyu.a($$1), $$2));
         }
      }

      public void a(cuj $$0, jm<cwq> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwt.a, $$0, cwt.b);
            this.a(cwt.d, $$0, $$1);
         }
      }

      public cwr a() {
         return new cwr(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jm<T> a, cyu b, jm<T> c) {
   }
}
