import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cyn {
   public static final int a = 20;
   public static final cyn b = new cyn(List.of(), List.of(), List.of());
   private final List<dba> c;
   private final List<cyn.b<cym>> d;
   private final List<cyn.b<cwl>> e;

   cyn(List<dba> $$0, List<cyn.b<cym>> $$1, List<cyn.b<cwl>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cwp $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cwp $$0) {
      for (dba $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cwp $$0) {
      for (cyn.b<cwl> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwp $$0) {
      for (cyn.b<cym> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jr<cym> $$0) {
      for (cyn.b<cym> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cwp $$0, cwp $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cwp $$0, cwp $$1) {
      for (cyn.b<cwl> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwp $$0, cwp $$1) {
      Optional<jr<cym>> $$2 = $$0.a(kv.Q, cyo.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cyn.b<cym> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cwp d(cwp $$0, cwp $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jr<cym>> $$2 = $$1.a(kv.Q, cyo.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cyn.b<cwl> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cyo.a($$3.c.a(), $$2.get());
               }
            }

            for (cyn.b<cym> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cyo.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cyn a(crt $$0) {
      cyn.a $$1 = new cyn.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cyn.a $$0) {
      $$0.a(cwt.ti);
      $$0.a(cwt.wo);
      $$0.a(cwt.wr);
      $$0.a(cwt.ti, cwt.pZ, cwt.wo);
      $$0.a(cwt.wo, cwt.wn, cwt.wr);
      $$0.a(cyp.a, cwt.rV, cyp.c);
      $$0.a(cyp.a, cwt.me, cyp.b);
      $$0.a(cyp.a, cwt.tg, cyp.d);
      $$0.a(cwt.uZ, cyp.Q);
      $$0.a(cwt.ml, cyp.S);
      $$0.a(cwt.b, cyp.T);
      $$0.a(cwt.cT, cyp.R);
      $$0.a(cyp.d, cwt.vj, cyp.e);
      $$0.a(cyp.e, cwt.me, cyp.f);
      $$0.a(cyp.e, cwt.tk, cyp.g);
      $$0.a(cyp.f, cwt.tk, cyp.h);
      $$0.a(cyp.g, cwt.me, cyp.h);
      $$0.a(cwt.tm, cyp.l);
      $$0.a(cyp.l, cwt.me, cyp.m);
      $$0.a(cwt.vD, cyp.i);
      $$0.a(cyp.i, cwt.me, cyp.j);
      $$0.a(cyp.i, cwt.rV, cyp.k);
      $$0.a(cyp.i, cwt.tk, cyp.q);
      $$0.a(cyp.j, cwt.tk, cyp.r);
      $$0.a(cyp.q, cwt.me, cyp.r);
      $$0.a(cyp.q, cwt.rV, cyp.s);
      $$0.a(cyp.d, cwt.oT, cyp.t);
      $$0.a(cyp.t, cwt.me, cyp.u);
      $$0.a(cyp.t, cwt.rV, cyp.v);
      $$0.a(cyp.n, cwt.tk, cyp.q);
      $$0.a(cyp.o, cwt.tk, cyp.r);
      $$0.a(cwt.sx, cyp.n);
      $$0.a(cyp.n, cwt.me, cyp.o);
      $$0.a(cyp.n, cwt.rV, cyp.p);
      $$0.a(cyp.d, cwt.rZ, cyp.w);
      $$0.a(cyp.w, cwt.me, cyp.x);
      $$0.a(cwt.tq, cyp.y);
      $$0.a(cyp.y, cwt.rV, cyp.z);
      $$0.a(cyp.y, cwt.tk, cyp.A);
      $$0.a(cyp.z, cwt.tk, cyp.B);
      $$0.a(cyp.A, cwt.rV, cyp.B);
      $$0.a(cyp.C, cwt.tk, cyp.A);
      $$0.a(cyp.D, cwt.tk, cyp.A);
      $$0.a(cyp.E, cwt.tk, cyp.B);
      $$0.a(cwt.tj, cyp.C);
      $$0.a(cyp.C, cwt.me, cyp.D);
      $$0.a(cyp.C, cwt.rV, cyp.E);
      $$0.a(cwt.te, cyp.F);
      $$0.a(cyp.F, cwt.me, cyp.G);
      $$0.a(cyp.F, cwt.rV, cyp.H);
      $$0.a(cwt.tl, cyp.I);
      $$0.a(cyp.I, cwt.me, cyp.J);
      $$0.a(cyp.I, cwt.rV, cyp.K);
      $$0.a(cyp.a, cwt.tk, cyp.L);
      $$0.a(cyp.L, cwt.me, cyp.M);
      $$0.a(cyp.d, cwt.ov, cyp.O);
      $$0.a(cyp.O, cwt.me, cyp.P);
   }

   public static class a {
      private final List<dba> a = new ArrayList<>();
      private final List<cyn.b<cym>> b = new ArrayList<>();
      private final List<cyn.b<cwl>> c = new ArrayList<>();
      private final crt d;

      public a(crt $$0) {
         this.d = $$0;
      }

      private static void b(cwl $$0) {
         if (!($$0 instanceof cxj)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mb.g.b($$0));
         }
      }

      public void a(cwl $$0, cwl $$1, cwl $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cyn.b<>($$0.f(), dba.a($$1), $$2.f()));
         }
      }

      public void a(cwl $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dba.a($$0));
         }
      }

      public void a(jr<cym> $$0, cwl $$1, jr<cym> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cyn.b<>($$0, dba.a($$1), $$2));
         }
      }

      public void a(cwl $$0, jr<cym> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cyp.a, $$0, cyp.b);
            this.a(cyp.d, $$0, $$1);
         }
      }

      public cyn a() {
         return new cyn(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jr<T> a, dba b, jr<T> c) {
   }
}
