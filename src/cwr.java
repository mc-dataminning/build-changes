import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwr {
   public static final int a = 20;
   public static final cwr b = new cwr(List.of(), List.of(), List.of());
   private final List<cyu> c;
   private final List<cwr.b<cwq>> d;
   private final List<cwr.b<cum>> e;

   cwr(List<cyu> $$0, List<cwr.b<cwq>> $$1, List<cwr.b<cum>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cur $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cur $$0) {
      for (cyu $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cur $$0) {
      for (cwr.b<cum> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cur $$0) {
      for (cwr.b<cwq> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji<cwq> $$0) {
      for (cwr.b<cwq> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cur $$0, cur $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cur $$0, cur $$1) {
      for (cwr.b<cum> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cur $$0, cur $$1) {
      Optional<ji<cwq>> $$2 = $$0.a(km.G, cws.a).e();
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

   public cur d(cur $$0, cur $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<ji<cwq>> $$2 = $$1.a(km.G, cws.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwr.b<cum> $$3 : this.e) {
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

   public static cwr a(cpn $$0) {
      cwr.a $$1 = new cwr.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwr.a $$0) {
      $$0.a(cuu.sk);
      $$0.a(cuu.vo);
      $$0.a(cuu.vr);
      $$0.a(cuu.sk, cuu.pu, cuu.vo);
      $$0.a(cuu.vo, cuu.vn, cuu.vr);
      $$0.a(cwt.a, cuu.qY, cwt.c);
      $$0.a(cwt.a, cuu.lH, cwt.b);
      $$0.a(cwt.a, cuu.sj, cwt.d);
      $$0.a(cuu.yD, cwt.Q);
      $$0.a(cuu.lO, cwt.S);
      $$0.a(cuu.b, cwt.T);
      $$0.a(cuu.cM, cwt.R);
      $$0.a(cwt.d, cuu.uk, cwt.e);
      $$0.a(cwt.e, cuu.lH, cwt.f);
      $$0.a(cwt.e, cuu.sn, cwt.g);
      $$0.a(cwt.f, cuu.sn, cwt.h);
      $$0.a(cwt.g, cuu.lH, cwt.h);
      $$0.a(cuu.sp, cwt.l);
      $$0.a(cwt.l, cuu.lH, cwt.m);
      $$0.a(cuu.uD, cwt.i);
      $$0.a(cwt.i, cuu.lH, cwt.j);
      $$0.a(cwt.i, cuu.qY, cwt.k);
      $$0.a(cwt.i, cuu.sn, cwt.q);
      $$0.a(cwt.j, cuu.sn, cwt.r);
      $$0.a(cwt.q, cuu.lH, cwt.r);
      $$0.a(cwt.q, cuu.qY, cwt.s);
      $$0.a(cwt.d, cuu.oo, cwt.t);
      $$0.a(cwt.t, cuu.lH, cwt.u);
      $$0.a(cwt.t, cuu.qY, cwt.v);
      $$0.a(cwt.n, cuu.sn, cwt.q);
      $$0.a(cwt.o, cuu.sn, cwt.r);
      $$0.a(cuu.rA, cwt.n);
      $$0.a(cwt.n, cuu.lH, cwt.o);
      $$0.a(cwt.n, cuu.qY, cwt.p);
      $$0.a(cwt.d, cuu.rc, cwt.w);
      $$0.a(cwt.w, cuu.lH, cwt.x);
      $$0.a(cuu.st, cwt.y);
      $$0.a(cwt.y, cuu.qY, cwt.z);
      $$0.a(cwt.y, cuu.sn, cwt.A);
      $$0.a(cwt.z, cuu.sn, cwt.B);
      $$0.a(cwt.A, cuu.qY, cwt.B);
      $$0.a(cwt.C, cuu.sn, cwt.A);
      $$0.a(cwt.D, cuu.sn, cwt.A);
      $$0.a(cwt.E, cuu.sn, cwt.B);
      $$0.a(cuu.sm, cwt.C);
      $$0.a(cwt.C, cuu.lH, cwt.D);
      $$0.a(cwt.C, cuu.qY, cwt.E);
      $$0.a(cuu.sh, cwt.F);
      $$0.a(cwt.F, cuu.lH, cwt.G);
      $$0.a(cwt.F, cuu.qY, cwt.H);
      $$0.a(cuu.so, cwt.I);
      $$0.a(cwt.I, cuu.lH, cwt.J);
      $$0.a(cwt.I, cuu.qY, cwt.K);
      $$0.a(cwt.a, cuu.sn, cwt.L);
      $$0.a(cwt.L, cuu.lH, cwt.M);
      $$0.a(cwt.d, cuu.vQ, cwt.O);
      $$0.a(cwt.O, cuu.lH, cwt.P);
   }

   public static class a {
      private final List<cyu> a = new ArrayList<>();
      private final List<cwr.b<cwq>> b = new ArrayList<>();
      private final List<cwr.b<cum>> c = new ArrayList<>();
      private final cpn d;

      public a(cpn $$0) {
         this.d = $$0;
      }

      private static void b(cum $$0) {
         if (!($$0 instanceof cvi)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lp.h.b($$0));
         }
      }

      public void a(cum $$0, cum $$1, cum $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwr.b<>($$0.o(), cyu.a($$1), $$2.o()));
         }
      }

      public void a(cum $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyu.a($$0));
         }
      }

      public void a(ji<cwq> $$0, cum $$1, ji<cwq> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwr.b<>($$0, cyu.a($$1), $$2));
         }
      }

      public void a(cum $$0, ji<cwq> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwt.a, $$0, cwt.b);
            this.a(cwt.d, $$0, $$1);
         }
      }

      public cwr a() {
         return new cwr(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(ji<T> a, cyu b, ji<T> c) {
   }
}
