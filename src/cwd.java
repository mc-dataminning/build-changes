import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwd {
   public static final int a = 20;
   public static final cwd b = new cwd(List.of(), List.of(), List.of());
   private final List<cyg> c;
   private final List<cwd.b<cwc>> d;
   private final List<cwd.b<cty>> e;

   cwd(List<cyg> $$0, List<cwd.b<cwc>> $$1, List<cwd.b<cty>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cud $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cud $$0) {
      for (cyg $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cud $$0) {
      for (cwd.b<cty> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cud $$0) {
      for (cwd.b<cwc> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jj<cwc> $$0) {
      for (cwd.b<cwc> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cud $$0, cud $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cud $$0, cud $$1) {
      for (cwd.b<cty> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cud $$0, cud $$1) {
      Optional<jj<cwc>> $$2 = $$0.a(kn.G, cwe.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwd.b<cwc> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cud d(cud $$0, cud $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<jj<cwc>> $$2 = $$1.a(kn.G, cwe.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwd.b<cty> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwe.a($$3.c.a(), $$2.get());
               }
            }

            for (cwd.b<cwc> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwe.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwd a(coz $$0) {
      cwd.a $$1 = new cwd.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwd.a $$0) {
      $$0.a(cug.sk);
      $$0.a(cug.vo);
      $$0.a(cug.vr);
      $$0.a(cug.sk, cug.pu, cug.vo);
      $$0.a(cug.vo, cug.vn, cug.vr);
      $$0.a(cwf.a, cug.qY, cwf.c);
      $$0.a(cwf.a, cug.lH, cwf.b);
      $$0.a(cwf.a, cug.sj, cwf.d);
      $$0.a(cug.yG, cwf.Q);
      $$0.a(cug.lO, cwf.S);
      $$0.a(cug.b, cwf.T);
      $$0.a(cug.cM, cwf.R);
      $$0.a(cwf.d, cug.uk, cwf.e);
      $$0.a(cwf.e, cug.lH, cwf.f);
      $$0.a(cwf.e, cug.sn, cwf.g);
      $$0.a(cwf.f, cug.sn, cwf.h);
      $$0.a(cwf.g, cug.lH, cwf.h);
      $$0.a(cug.sp, cwf.l);
      $$0.a(cwf.l, cug.lH, cwf.m);
      $$0.a(cug.uD, cwf.i);
      $$0.a(cwf.i, cug.lH, cwf.j);
      $$0.a(cwf.i, cug.qY, cwf.k);
      $$0.a(cwf.i, cug.sn, cwf.q);
      $$0.a(cwf.j, cug.sn, cwf.r);
      $$0.a(cwf.q, cug.lH, cwf.r);
      $$0.a(cwf.q, cug.qY, cwf.s);
      $$0.a(cwf.d, cug.oo, cwf.t);
      $$0.a(cwf.t, cug.lH, cwf.u);
      $$0.a(cwf.t, cug.qY, cwf.v);
      $$0.a(cwf.n, cug.sn, cwf.q);
      $$0.a(cwf.o, cug.sn, cwf.r);
      $$0.a(cug.rA, cwf.n);
      $$0.a(cwf.n, cug.lH, cwf.o);
      $$0.a(cwf.n, cug.qY, cwf.p);
      $$0.a(cwf.d, cug.rc, cwf.w);
      $$0.a(cwf.w, cug.lH, cwf.x);
      $$0.a(cug.st, cwf.y);
      $$0.a(cwf.y, cug.qY, cwf.z);
      $$0.a(cwf.y, cug.sn, cwf.A);
      $$0.a(cwf.z, cug.sn, cwf.B);
      $$0.a(cwf.A, cug.qY, cwf.B);
      $$0.a(cwf.C, cug.sn, cwf.A);
      $$0.a(cwf.D, cug.sn, cwf.A);
      $$0.a(cwf.E, cug.sn, cwf.B);
      $$0.a(cug.sm, cwf.C);
      $$0.a(cwf.C, cug.lH, cwf.D);
      $$0.a(cwf.C, cug.qY, cwf.E);
      $$0.a(cug.sh, cwf.F);
      $$0.a(cwf.F, cug.lH, cwf.G);
      $$0.a(cwf.F, cug.qY, cwf.H);
      $$0.a(cug.so, cwf.I);
      $$0.a(cwf.I, cug.lH, cwf.J);
      $$0.a(cwf.I, cug.qY, cwf.K);
      $$0.a(cwf.a, cug.sn, cwf.L);
      $$0.a(cwf.L, cug.lH, cwf.M);
      $$0.a(cwf.d, cug.vT, cwf.O);
      $$0.a(cwf.O, cug.lH, cwf.P);
   }

   public static class a {
      private final List<cyg> a = new ArrayList<>();
      private final List<cwd.b<cwc>> b = new ArrayList<>();
      private final List<cwd.b<cty>> c = new ArrayList<>();
      private final coz d;

      public a(coz $$0) {
         this.d = $$0;
      }

      private static void b(cty $$0) {
         if (!($$0 instanceof cuu)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lq.g.b($$0));
         }
      }

      public void a(cty $$0, cty $$1, cty $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwd.b<>($$0.o(), cyg.a($$1), $$2.o()));
         }
      }

      public void a(cty $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyg.a($$0));
         }
      }

      public void a(jj<cwc> $$0, cty $$1, jj<cwc> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwd.b<>($$0, cyg.a($$1), $$2));
         }
      }

      public void a(cty $$0, jj<cwc> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwf.a, $$0, cwf.b);
            this.a(cwf.d, $$0, $$1);
         }
      }

      public cwd a() {
         return new cwd(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jj<T> a, cyg b, jj<T> c) {
   }
}
