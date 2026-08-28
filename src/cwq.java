import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwq {
   public static final int a = 20;
   public static final cwq b = new cwq(List.of(), List.of(), List.of());
   private final List<cyt> c;
   private final List<cwq.b<cwp>> d;
   private final List<cwq.b<cul>> e;

   cwq(List<cyt> $$0, List<cwq.b<cwp>> $$1, List<cwq.b<cul>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cuq $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cuq $$0) {
      for (cyt $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cuq $$0) {
      for (cwq.b<cul> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuq $$0) {
      for (cwq.b<cwp> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji<cwp> $$0) {
      for (cwq.b<cwp> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cuq $$0, cuq $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cuq $$0, cuq $$1) {
      for (cwq.b<cul> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuq $$0, cuq $$1) {
      Optional<ji<cwp>> $$2 = $$0.a(km.G, cwr.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwq.b<cwp> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cuq d(cuq $$0, cuq $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<ji<cwp>> $$2 = $$1.a(km.G, cwr.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwq.b<cul> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwr.a($$3.c.a(), $$2.get());
               }
            }

            for (cwq.b<cwp> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwr.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwq a(cpm $$0) {
      cwq.a $$1 = new cwq.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwq.a $$0) {
      $$0.a(cut.sk);
      $$0.a(cut.vo);
      $$0.a(cut.vr);
      $$0.a(cut.sk, cut.pu, cut.vo);
      $$0.a(cut.vo, cut.vn, cut.vr);
      $$0.a(cws.a, cut.qY, cws.c);
      $$0.a(cws.a, cut.lH, cws.b);
      $$0.a(cws.a, cut.sj, cws.d);
      $$0.a(cut.yD, cws.Q);
      $$0.a(cut.lO, cws.S);
      $$0.a(cut.b, cws.T);
      $$0.a(cut.cM, cws.R);
      $$0.a(cws.d, cut.uk, cws.e);
      $$0.a(cws.e, cut.lH, cws.f);
      $$0.a(cws.e, cut.sn, cws.g);
      $$0.a(cws.f, cut.sn, cws.h);
      $$0.a(cws.g, cut.lH, cws.h);
      $$0.a(cut.sp, cws.l);
      $$0.a(cws.l, cut.lH, cws.m);
      $$0.a(cut.uD, cws.i);
      $$0.a(cws.i, cut.lH, cws.j);
      $$0.a(cws.i, cut.qY, cws.k);
      $$0.a(cws.i, cut.sn, cws.q);
      $$0.a(cws.j, cut.sn, cws.r);
      $$0.a(cws.q, cut.lH, cws.r);
      $$0.a(cws.q, cut.qY, cws.s);
      $$0.a(cws.d, cut.oo, cws.t);
      $$0.a(cws.t, cut.lH, cws.u);
      $$0.a(cws.t, cut.qY, cws.v);
      $$0.a(cws.n, cut.sn, cws.q);
      $$0.a(cws.o, cut.sn, cws.r);
      $$0.a(cut.rA, cws.n);
      $$0.a(cws.n, cut.lH, cws.o);
      $$0.a(cws.n, cut.qY, cws.p);
      $$0.a(cws.d, cut.rc, cws.w);
      $$0.a(cws.w, cut.lH, cws.x);
      $$0.a(cut.st, cws.y);
      $$0.a(cws.y, cut.qY, cws.z);
      $$0.a(cws.y, cut.sn, cws.A);
      $$0.a(cws.z, cut.sn, cws.B);
      $$0.a(cws.A, cut.qY, cws.B);
      $$0.a(cws.C, cut.sn, cws.A);
      $$0.a(cws.D, cut.sn, cws.A);
      $$0.a(cws.E, cut.sn, cws.B);
      $$0.a(cut.sm, cws.C);
      $$0.a(cws.C, cut.lH, cws.D);
      $$0.a(cws.C, cut.qY, cws.E);
      $$0.a(cut.sh, cws.F);
      $$0.a(cws.F, cut.lH, cws.G);
      $$0.a(cws.F, cut.qY, cws.H);
      $$0.a(cut.so, cws.I);
      $$0.a(cws.I, cut.lH, cws.J);
      $$0.a(cws.I, cut.qY, cws.K);
      $$0.a(cws.a, cut.sn, cws.L);
      $$0.a(cws.L, cut.lH, cws.M);
      $$0.a(cws.d, cut.vQ, cws.O);
      $$0.a(cws.O, cut.lH, cws.P);
   }

   public static class a {
      private final List<cyt> a = new ArrayList<>();
      private final List<cwq.b<cwp>> b = new ArrayList<>();
      private final List<cwq.b<cul>> c = new ArrayList<>();
      private final cpm d;

      public a(cpm $$0) {
         this.d = $$0;
      }

      private static void b(cul $$0) {
         if (!($$0 instanceof cvh)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lp.h.b($$0));
         }
      }

      public void a(cul $$0, cul $$1, cul $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwq.b<>($$0.o(), cyt.a($$1), $$2.o()));
         }
      }

      public void a(cul $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyt.a($$0));
         }
      }

      public void a(ji<cwp> $$0, cul $$1, ji<cwp> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwq.b<>($$0, cyt.a($$1), $$2));
         }
      }

      public void a(cul $$0, ji<cwp> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cws.a, $$0, cws.b);
            this.a(cws.d, $$0, $$1);
         }
      }

      public cwq a() {
         return new cwq(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(ji<T> a, cyt b, ji<T> c) {
   }
}
