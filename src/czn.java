import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class czn {
   public static final int a = 20;
   public static final czn b = new czn(List.of(), List.of(), List.of());
   private final List<dca> c;
   private final List<czn.b<czm>> d;
   private final List<czn.b<cxl>> e;

   czn(List<dca> $$0, List<czn.b<czm>> $$1, List<czn.b<cxl>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cxp $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cxp $$0) {
      for (dca $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cxp $$0) {
      for (czn.b<cxl> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxp $$0) {
      for (czn.b<czm> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jq<czm> $$0) {
      for (czn.b<czm> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cxp $$0, cxp $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cxp $$0, cxp $$1) {
      for (czn.b<cxl> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxp $$0, cxp $$1) {
      Optional<jq<czm>> $$2 = $$0.a(ku.Q, czo.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (czn.b<czm> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cxp d(cxp $$0, cxp $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jq<czm>> $$2 = $$1.a(ku.Q, czo.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (czn.b<cxl> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return czo.a($$3.c.a(), $$2.get());
               }
            }

            for (czn.b<czm> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return czo.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static czn a(cst $$0) {
      czn.a $$1 = new czn.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(czn.a $$0) {
      $$0.a(cxt.sZ);
      $$0.a(cxt.we);
      $$0.a(cxt.wh);
      $$0.a(cxt.sZ, cxt.pQ, cxt.we);
      $$0.a(cxt.we, cxt.wd, cxt.wh);
      $$0.a(czp.a, cxt.rM, czp.c);
      $$0.a(czp.a, cxt.lV, czp.b);
      $$0.a(czp.a, cxt.sX, czp.d);
      $$0.a(cxt.uQ, czp.Q);
      $$0.a(cxt.mc, czp.S);
      $$0.a(cxt.b, czp.T);
      $$0.a(cxt.cT, czp.R);
      $$0.a(czp.d, cxt.va, czp.e);
      $$0.a(czp.e, cxt.lV, czp.f);
      $$0.a(czp.e, cxt.tb, czp.g);
      $$0.a(czp.f, cxt.tb, czp.h);
      $$0.a(czp.g, cxt.lV, czp.h);
      $$0.a(cxt.td, czp.l);
      $$0.a(czp.l, cxt.lV, czp.m);
      $$0.a(cxt.vt, czp.i);
      $$0.a(czp.i, cxt.lV, czp.j);
      $$0.a(czp.i, cxt.rM, czp.k);
      $$0.a(czp.i, cxt.tb, czp.q);
      $$0.a(czp.j, cxt.tb, czp.r);
      $$0.a(czp.q, cxt.lV, czp.r);
      $$0.a(czp.q, cxt.rM, czp.s);
      $$0.a(czp.d, cxt.oK, czp.t);
      $$0.a(czp.t, cxt.lV, czp.u);
      $$0.a(czp.t, cxt.rM, czp.v);
      $$0.a(czp.n, cxt.tb, czp.q);
      $$0.a(czp.o, cxt.tb, czp.r);
      $$0.a(cxt.so, czp.n);
      $$0.a(czp.n, cxt.lV, czp.o);
      $$0.a(czp.n, cxt.rM, czp.p);
      $$0.a(czp.d, cxt.rQ, czp.w);
      $$0.a(czp.w, cxt.lV, czp.x);
      $$0.a(cxt.th, czp.y);
      $$0.a(czp.y, cxt.rM, czp.z);
      $$0.a(czp.y, cxt.tb, czp.A);
      $$0.a(czp.z, cxt.tb, czp.B);
      $$0.a(czp.A, cxt.rM, czp.B);
      $$0.a(czp.C, cxt.tb, czp.A);
      $$0.a(czp.D, cxt.tb, czp.A);
      $$0.a(czp.E, cxt.tb, czp.B);
      $$0.a(cxt.ta, czp.C);
      $$0.a(czp.C, cxt.lV, czp.D);
      $$0.a(czp.C, cxt.rM, czp.E);
      $$0.a(cxt.sV, czp.F);
      $$0.a(czp.F, cxt.lV, czp.G);
      $$0.a(czp.F, cxt.rM, czp.H);
      $$0.a(cxt.tc, czp.I);
      $$0.a(czp.I, cxt.lV, czp.J);
      $$0.a(czp.I, cxt.rM, czp.K);
      $$0.a(czp.a, cxt.tb, czp.L);
      $$0.a(czp.L, cxt.lV, czp.M);
      $$0.a(czp.d, cxt.om, czp.O);
      $$0.a(czp.O, cxt.lV, czp.P);
   }

   public static class a {
      private final List<dca> a = new ArrayList<>();
      private final List<czn.b<czm>> b = new ArrayList<>();
      private final List<czn.b<cxl>> c = new ArrayList<>();
      private final cst d;

      public a(cst $$0) {
         this.d = $$0;
      }

      private static void b(cxl $$0) {
         if (!($$0 instanceof cyj)) {
            throw new IllegalArgumentException("Expected a potion, got: " + ma.g.b($$0));
         }
      }

      public void a(cxl $$0, cxl $$1, cxl $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new czn.b<>($$0.f(), dca.a($$1), $$2.f()));
         }
      }

      public void a(cxl $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dca.a($$0));
         }
      }

      public void a(jq<czm> $$0, cxl $$1, jq<czm> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new czn.b<>($$0, dca.a($$1), $$2));
         }
      }

      public void a(cxl $$0, jq<czm> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(czp.a, $$0, czp.b);
            this.a(czp.d, $$0, $$1);
         }
      }

      public czn a() {
         return new czn(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jq<T> a, dca b, jq<T> c) {
   }
}
