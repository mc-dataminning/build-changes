import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cyk {
   public static final int a = 20;
   public static final cyk b = new cyk(List.of(), List.of(), List.of());
   private final List<daw> c;
   private final List<cyk.b<cyj>> d;
   private final List<cyk.b<cwi>> e;

   cyk(List<daw> $$0, List<cyk.b<cyj>> $$1, List<cyk.b<cwi>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cwm $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cwm $$0) {
      for (daw $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cwm $$0) {
      for (cyk.b<cwi> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwm $$0) {
      for (cyk.b<cyj> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jq<cyj> $$0) {
      for (cyk.b<cyj> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cwm $$0, cwm $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cwm $$0, cwm $$1) {
      for (cyk.b<cwi> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwm $$0, cwm $$1) {
      Optional<jq<cyj>> $$2 = $$0.a(ku.Q, cyl.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cyk.b<cyj> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cwm d(cwm $$0, cwm $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jq<cyj>> $$2 = $$1.a(ku.Q, cyl.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cyk.b<cwi> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cyl.a($$3.c.a(), $$2.get());
               }
            }

            for (cyk.b<cyj> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cyl.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cyk a(crq $$0) {
      cyk.a $$1 = new cyk.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cyk.a $$0) {
      $$0.a(cwq.sC);
      $$0.a(cwq.vG);
      $$0.a(cwq.vJ);
      $$0.a(cwq.sC, cwq.pv, cwq.vG);
      $$0.a(cwq.vG, cwq.vF, cwq.vJ);
      $$0.a(cym.a, cwq.rp, cym.c);
      $$0.a(cym.a, cwq.lH, cym.b);
      $$0.a(cym.a, cwq.sA, cym.d);
      $$0.a(cwq.us, cym.Q);
      $$0.a(cwq.lO, cym.S);
      $$0.a(cwq.b, cym.T);
      $$0.a(cwq.cM, cym.R);
      $$0.a(cym.d, cwq.uC, cym.e);
      $$0.a(cym.e, cwq.lH, cym.f);
      $$0.a(cym.e, cwq.sE, cym.g);
      $$0.a(cym.f, cwq.sE, cym.h);
      $$0.a(cym.g, cwq.lH, cym.h);
      $$0.a(cwq.sG, cym.l);
      $$0.a(cym.l, cwq.lH, cym.m);
      $$0.a(cwq.uV, cym.i);
      $$0.a(cym.i, cwq.lH, cym.j);
      $$0.a(cym.i, cwq.rp, cym.k);
      $$0.a(cym.i, cwq.sE, cym.q);
      $$0.a(cym.j, cwq.sE, cym.r);
      $$0.a(cym.q, cwq.lH, cym.r);
      $$0.a(cym.q, cwq.rp, cym.s);
      $$0.a(cym.d, cwq.op, cym.t);
      $$0.a(cym.t, cwq.lH, cym.u);
      $$0.a(cym.t, cwq.rp, cym.v);
      $$0.a(cym.n, cwq.sE, cym.q);
      $$0.a(cym.o, cwq.sE, cym.r);
      $$0.a(cwq.rR, cym.n);
      $$0.a(cym.n, cwq.lH, cym.o);
      $$0.a(cym.n, cwq.rp, cym.p);
      $$0.a(cym.d, cwq.rt, cym.w);
      $$0.a(cym.w, cwq.lH, cym.x);
      $$0.a(cwq.sK, cym.y);
      $$0.a(cym.y, cwq.rp, cym.z);
      $$0.a(cym.y, cwq.sE, cym.A);
      $$0.a(cym.z, cwq.sE, cym.B);
      $$0.a(cym.A, cwq.rp, cym.B);
      $$0.a(cym.C, cwq.sE, cym.A);
      $$0.a(cym.D, cwq.sE, cym.A);
      $$0.a(cym.E, cwq.sE, cym.B);
      $$0.a(cwq.sD, cym.C);
      $$0.a(cym.C, cwq.lH, cym.D);
      $$0.a(cym.C, cwq.rp, cym.E);
      $$0.a(cwq.sy, cym.F);
      $$0.a(cym.F, cwq.lH, cym.G);
      $$0.a(cym.F, cwq.rp, cym.H);
      $$0.a(cwq.sF, cym.I);
      $$0.a(cym.I, cwq.lH, cym.J);
      $$0.a(cym.I, cwq.rp, cym.K);
      $$0.a(cym.a, cwq.sE, cym.L);
      $$0.a(cym.L, cwq.lH, cym.M);
      $$0.a(cym.d, cwq.nT, cym.O);
      $$0.a(cym.O, cwq.lH, cym.P);
   }

   public static class a {
      private final List<daw> a = new ArrayList<>();
      private final List<cyk.b<cyj>> b = new ArrayList<>();
      private final List<cyk.b<cwi>> c = new ArrayList<>();
      private final crq d;

      public a(crq $$0) {
         this.d = $$0;
      }

      private static void b(cwi $$0) {
         if (!($$0 instanceof cxg)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lz.g.b($$0));
         }
      }

      public void a(cwi $$0, cwi $$1, cwi $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cyk.b<>($$0.f(), daw.a($$1), $$2.f()));
         }
      }

      public void a(cwi $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(daw.a($$0));
         }
      }

      public void a(jq<cyj> $$0, cwi $$1, jq<cyj> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cyk.b<>($$0, daw.a($$1), $$2));
         }
      }

      public void a(cwi $$0, jq<cyj> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cym.a, $$0, cym.b);
            this.a(cym.d, $$0, $$1);
         }
      }

      public cyk a() {
         return new cyk(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jq<T> a, daw b, jq<T> c) {
   }
}
