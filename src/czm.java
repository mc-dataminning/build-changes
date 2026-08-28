import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class czm {
   public static final int a = 20;
   public static final czm b = new czm(List.of(), List.of(), List.of());
   private final List<dbz> c;
   private final List<czm.b<czl>> d;
   private final List<czm.b<cxk>> e;

   czm(List<dbz> $$0, List<czm.b<czl>> $$1, List<czm.b<cxk>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cxo $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cxo $$0) {
      for (dbz $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cxo $$0) {
      for (czm.b<cxk> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxo $$0) {
      for (czm.b<czl> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jq<czl> $$0) {
      for (czm.b<czl> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cxo $$0, cxo $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cxo $$0, cxo $$1) {
      for (czm.b<cxk> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxo $$0, cxo $$1) {
      Optional<jq<czl>> $$2 = $$0.a(ku.Q, czn.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (czm.b<czl> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cxo d(cxo $$0, cxo $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jq<czl>> $$2 = $$1.a(ku.Q, czn.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (czm.b<cxk> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return czn.a($$3.c.a(), $$2.get());
               }
            }

            for (czm.b<czl> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return czn.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static czm a(css $$0) {
      czm.a $$1 = new czm.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(czm.a $$0) {
      $$0.a(cxs.sZ);
      $$0.a(cxs.we);
      $$0.a(cxs.wh);
      $$0.a(cxs.sZ, cxs.pQ, cxs.we);
      $$0.a(cxs.we, cxs.wd, cxs.wh);
      $$0.a(czo.a, cxs.rM, czo.c);
      $$0.a(czo.a, cxs.lV, czo.b);
      $$0.a(czo.a, cxs.sX, czo.d);
      $$0.a(cxs.uQ, czo.Q);
      $$0.a(cxs.mc, czo.S);
      $$0.a(cxs.b, czo.T);
      $$0.a(cxs.cT, czo.R);
      $$0.a(czo.d, cxs.va, czo.e);
      $$0.a(czo.e, cxs.lV, czo.f);
      $$0.a(czo.e, cxs.tb, czo.g);
      $$0.a(czo.f, cxs.tb, czo.h);
      $$0.a(czo.g, cxs.lV, czo.h);
      $$0.a(cxs.td, czo.l);
      $$0.a(czo.l, cxs.lV, czo.m);
      $$0.a(cxs.vt, czo.i);
      $$0.a(czo.i, cxs.lV, czo.j);
      $$0.a(czo.i, cxs.rM, czo.k);
      $$0.a(czo.i, cxs.tb, czo.q);
      $$0.a(czo.j, cxs.tb, czo.r);
      $$0.a(czo.q, cxs.lV, czo.r);
      $$0.a(czo.q, cxs.rM, czo.s);
      $$0.a(czo.d, cxs.oK, czo.t);
      $$0.a(czo.t, cxs.lV, czo.u);
      $$0.a(czo.t, cxs.rM, czo.v);
      $$0.a(czo.n, cxs.tb, czo.q);
      $$0.a(czo.o, cxs.tb, czo.r);
      $$0.a(cxs.so, czo.n);
      $$0.a(czo.n, cxs.lV, czo.o);
      $$0.a(czo.n, cxs.rM, czo.p);
      $$0.a(czo.d, cxs.rQ, czo.w);
      $$0.a(czo.w, cxs.lV, czo.x);
      $$0.a(cxs.th, czo.y);
      $$0.a(czo.y, cxs.rM, czo.z);
      $$0.a(czo.y, cxs.tb, czo.A);
      $$0.a(czo.z, cxs.tb, czo.B);
      $$0.a(czo.A, cxs.rM, czo.B);
      $$0.a(czo.C, cxs.tb, czo.A);
      $$0.a(czo.D, cxs.tb, czo.A);
      $$0.a(czo.E, cxs.tb, czo.B);
      $$0.a(cxs.ta, czo.C);
      $$0.a(czo.C, cxs.lV, czo.D);
      $$0.a(czo.C, cxs.rM, czo.E);
      $$0.a(cxs.sV, czo.F);
      $$0.a(czo.F, cxs.lV, czo.G);
      $$0.a(czo.F, cxs.rM, czo.H);
      $$0.a(cxs.tc, czo.I);
      $$0.a(czo.I, cxs.lV, czo.J);
      $$0.a(czo.I, cxs.rM, czo.K);
      $$0.a(czo.a, cxs.tb, czo.L);
      $$0.a(czo.L, cxs.lV, czo.M);
      $$0.a(czo.d, cxs.om, czo.O);
      $$0.a(czo.O, cxs.lV, czo.P);
   }

   public static class a {
      private final List<dbz> a = new ArrayList<>();
      private final List<czm.b<czl>> b = new ArrayList<>();
      private final List<czm.b<cxk>> c = new ArrayList<>();
      private final css d;

      public a(css $$0) {
         this.d = $$0;
      }

      private static void b(cxk $$0) {
         if (!($$0 instanceof cyi)) {
            throw new IllegalArgumentException("Expected a potion, got: " + ma.g.b($$0));
         }
      }

      public void a(cxk $$0, cxk $$1, cxk $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new czm.b<>($$0.f(), dbz.a($$1), $$2.f()));
         }
      }

      public void a(cxk $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dbz.a($$0));
         }
      }

      public void a(jq<czl> $$0, cxk $$1, jq<czl> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new czm.b<>($$0, dbz.a($$1), $$2));
         }
      }

      public void a(cxk $$0, jq<czl> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(czo.a, $$0, czo.b);
            this.a(czo.d, $$0, $$1);
         }
      }

      public czm a() {
         return new czm(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jq<T> a, dbz b, jq<T> c) {
   }
}
