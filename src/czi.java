import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class czi {
   public static final int a = 20;
   public static final czi b = new czi(List.of(), List.of(), List.of());
   private final List<dbv> c;
   private final List<czi.b<czh>> d;
   private final List<czi.b<cxg>> e;

   czi(List<dbv> $$0, List<czi.b<czh>> $$1, List<czi.b<cxg>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cxk $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cxk $$0) {
      for (dbv $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cxk $$0) {
      for (czi.b<cxg> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxk $$0) {
      for (czi.b<czh> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jq<czh> $$0) {
      for (czi.b<czh> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cxk $$0, cxk $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cxk $$0, cxk $$1) {
      for (czi.b<cxg> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxk $$0, cxk $$1) {
      Optional<jq<czh>> $$2 = $$0.a(ku.Q, czj.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (czi.b<czh> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cxk d(cxk $$0, cxk $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jq<czh>> $$2 = $$1.a(ku.Q, czj.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (czi.b<cxg> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return czj.a($$3.c.a(), $$2.get());
               }
            }

            for (czi.b<czh> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return czj.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static czi a(cso $$0) {
      czi.a $$1 = new czi.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(czi.a $$0) {
      $$0.a(cxo.sZ);
      $$0.a(cxo.we);
      $$0.a(cxo.wh);
      $$0.a(cxo.sZ, cxo.pQ, cxo.we);
      $$0.a(cxo.we, cxo.wd, cxo.wh);
      $$0.a(czk.a, cxo.rM, czk.c);
      $$0.a(czk.a, cxo.lV, czk.b);
      $$0.a(czk.a, cxo.sX, czk.d);
      $$0.a(cxo.uQ, czk.Q);
      $$0.a(cxo.mc, czk.S);
      $$0.a(cxo.b, czk.T);
      $$0.a(cxo.cT, czk.R);
      $$0.a(czk.d, cxo.va, czk.e);
      $$0.a(czk.e, cxo.lV, czk.f);
      $$0.a(czk.e, cxo.tb, czk.g);
      $$0.a(czk.f, cxo.tb, czk.h);
      $$0.a(czk.g, cxo.lV, czk.h);
      $$0.a(cxo.td, czk.l);
      $$0.a(czk.l, cxo.lV, czk.m);
      $$0.a(cxo.vt, czk.i);
      $$0.a(czk.i, cxo.lV, czk.j);
      $$0.a(czk.i, cxo.rM, czk.k);
      $$0.a(czk.i, cxo.tb, czk.q);
      $$0.a(czk.j, cxo.tb, czk.r);
      $$0.a(czk.q, cxo.lV, czk.r);
      $$0.a(czk.q, cxo.rM, czk.s);
      $$0.a(czk.d, cxo.oK, czk.t);
      $$0.a(czk.t, cxo.lV, czk.u);
      $$0.a(czk.t, cxo.rM, czk.v);
      $$0.a(czk.n, cxo.tb, czk.q);
      $$0.a(czk.o, cxo.tb, czk.r);
      $$0.a(cxo.so, czk.n);
      $$0.a(czk.n, cxo.lV, czk.o);
      $$0.a(czk.n, cxo.rM, czk.p);
      $$0.a(czk.d, cxo.rQ, czk.w);
      $$0.a(czk.w, cxo.lV, czk.x);
      $$0.a(cxo.th, czk.y);
      $$0.a(czk.y, cxo.rM, czk.z);
      $$0.a(czk.y, cxo.tb, czk.A);
      $$0.a(czk.z, cxo.tb, czk.B);
      $$0.a(czk.A, cxo.rM, czk.B);
      $$0.a(czk.C, cxo.tb, czk.A);
      $$0.a(czk.D, cxo.tb, czk.A);
      $$0.a(czk.E, cxo.tb, czk.B);
      $$0.a(cxo.ta, czk.C);
      $$0.a(czk.C, cxo.lV, czk.D);
      $$0.a(czk.C, cxo.rM, czk.E);
      $$0.a(cxo.sV, czk.F);
      $$0.a(czk.F, cxo.lV, czk.G);
      $$0.a(czk.F, cxo.rM, czk.H);
      $$0.a(cxo.tc, czk.I);
      $$0.a(czk.I, cxo.lV, czk.J);
      $$0.a(czk.I, cxo.rM, czk.K);
      $$0.a(czk.a, cxo.tb, czk.L);
      $$0.a(czk.L, cxo.lV, czk.M);
      $$0.a(czk.d, cxo.om, czk.O);
      $$0.a(czk.O, cxo.lV, czk.P);
   }

   public static class a {
      private final List<dbv> a = new ArrayList<>();
      private final List<czi.b<czh>> b = new ArrayList<>();
      private final List<czi.b<cxg>> c = new ArrayList<>();
      private final cso d;

      public a(cso $$0) {
         this.d = $$0;
      }

      private static void b(cxg $$0) {
         if (!($$0 instanceof cye)) {
            throw new IllegalArgumentException("Expected a potion, got: " + ma.g.b($$0));
         }
      }

      public void a(cxg $$0, cxg $$1, cxg $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new czi.b<>($$0.f(), dbv.a($$1), $$2.f()));
         }
      }

      public void a(cxg $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dbv.a($$0));
         }
      }

      public void a(jq<czh> $$0, cxg $$1, jq<czh> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new czi.b<>($$0, dbv.a($$1), $$2));
         }
      }

      public void a(cxg $$0, jq<czh> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(czk.a, $$0, czk.b);
            this.a(czk.d, $$0, $$1);
         }
      }

      public czi a() {
         return new czi(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jq<T> a, dbv b, jq<T> c) {
   }
}
