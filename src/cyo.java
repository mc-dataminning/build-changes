import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cyo {
   public static final int a = 20;
   public static final cyo b = new cyo(List.of(), List.of(), List.of());
   private final List<dbb> c;
   private final List<cyo.b<cyn>> d;
   private final List<cyo.b<cwm>> e;

   cyo(List<dbb> $$0, List<cyo.b<cyn>> $$1, List<cyo.b<cwm>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cwq $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cwq $$0) {
      for (dbb $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cwq $$0) {
      for (cyo.b<cwm> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwq $$0) {
      for (cyo.b<cyn> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jr<cyn> $$0) {
      for (cyo.b<cyn> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cwq $$0, cwq $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cwq $$0, cwq $$1) {
      for (cyo.b<cwm> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwq $$0, cwq $$1) {
      Optional<jr<cyn>> $$2 = $$0.a(kv.Q, cyp.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cyo.b<cyn> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cwq d(cwq $$0, cwq $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jr<cyn>> $$2 = $$1.a(kv.Q, cyp.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cyo.b<cwm> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cyp.a($$3.c.a(), $$2.get());
               }
            }

            for (cyo.b<cyn> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cyp.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cyo a(cru $$0) {
      cyo.a $$1 = new cyo.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cyo.a $$0) {
      $$0.a(cwu.ti);
      $$0.a(cwu.wo);
      $$0.a(cwu.wr);
      $$0.a(cwu.ti, cwu.pZ, cwu.wo);
      $$0.a(cwu.wo, cwu.wn, cwu.wr);
      $$0.a(cyq.a, cwu.rV, cyq.c);
      $$0.a(cyq.a, cwu.me, cyq.b);
      $$0.a(cyq.a, cwu.tg, cyq.d);
      $$0.a(cwu.uZ, cyq.Q);
      $$0.a(cwu.ml, cyq.S);
      $$0.a(cwu.b, cyq.T);
      $$0.a(cwu.cT, cyq.R);
      $$0.a(cyq.d, cwu.vj, cyq.e);
      $$0.a(cyq.e, cwu.me, cyq.f);
      $$0.a(cyq.e, cwu.tk, cyq.g);
      $$0.a(cyq.f, cwu.tk, cyq.h);
      $$0.a(cyq.g, cwu.me, cyq.h);
      $$0.a(cwu.tm, cyq.l);
      $$0.a(cyq.l, cwu.me, cyq.m);
      $$0.a(cwu.vD, cyq.i);
      $$0.a(cyq.i, cwu.me, cyq.j);
      $$0.a(cyq.i, cwu.rV, cyq.k);
      $$0.a(cyq.i, cwu.tk, cyq.q);
      $$0.a(cyq.j, cwu.tk, cyq.r);
      $$0.a(cyq.q, cwu.me, cyq.r);
      $$0.a(cyq.q, cwu.rV, cyq.s);
      $$0.a(cyq.d, cwu.oT, cyq.t);
      $$0.a(cyq.t, cwu.me, cyq.u);
      $$0.a(cyq.t, cwu.rV, cyq.v);
      $$0.a(cyq.n, cwu.tk, cyq.q);
      $$0.a(cyq.o, cwu.tk, cyq.r);
      $$0.a(cwu.sx, cyq.n);
      $$0.a(cyq.n, cwu.me, cyq.o);
      $$0.a(cyq.n, cwu.rV, cyq.p);
      $$0.a(cyq.d, cwu.rZ, cyq.w);
      $$0.a(cyq.w, cwu.me, cyq.x);
      $$0.a(cwu.tq, cyq.y);
      $$0.a(cyq.y, cwu.rV, cyq.z);
      $$0.a(cyq.y, cwu.tk, cyq.A);
      $$0.a(cyq.z, cwu.tk, cyq.B);
      $$0.a(cyq.A, cwu.rV, cyq.B);
      $$0.a(cyq.C, cwu.tk, cyq.A);
      $$0.a(cyq.D, cwu.tk, cyq.A);
      $$0.a(cyq.E, cwu.tk, cyq.B);
      $$0.a(cwu.tj, cyq.C);
      $$0.a(cyq.C, cwu.me, cyq.D);
      $$0.a(cyq.C, cwu.rV, cyq.E);
      $$0.a(cwu.te, cyq.F);
      $$0.a(cyq.F, cwu.me, cyq.G);
      $$0.a(cyq.F, cwu.rV, cyq.H);
      $$0.a(cwu.tl, cyq.I);
      $$0.a(cyq.I, cwu.me, cyq.J);
      $$0.a(cyq.I, cwu.rV, cyq.K);
      $$0.a(cyq.a, cwu.tk, cyq.L);
      $$0.a(cyq.L, cwu.me, cyq.M);
      $$0.a(cyq.d, cwu.ov, cyq.O);
      $$0.a(cyq.O, cwu.me, cyq.P);
   }

   public static class a {
      private final List<dbb> a = new ArrayList<>();
      private final List<cyo.b<cyn>> b = new ArrayList<>();
      private final List<cyo.b<cwm>> c = new ArrayList<>();
      private final cru d;

      public a(cru $$0) {
         this.d = $$0;
      }

      private static void b(cwm $$0) {
         if (!($$0 instanceof cxk)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mb.g.b($$0));
         }
      }

      public void a(cwm $$0, cwm $$1, cwm $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cyo.b<>($$0.f(), dbb.a($$1), $$2.f()));
         }
      }

      public void a(cwm $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dbb.a($$0));
         }
      }

      public void a(jr<cyn> $$0, cwm $$1, jr<cyn> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cyo.b<>($$0, dbb.a($$1), $$2));
         }
      }

      public void a(cwm $$0, jr<cyn> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cyq.a, $$0, cyq.b);
            this.a(cyq.d, $$0, $$1);
         }
      }

      public cyo a() {
         return new cyo(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jr<T> a, dbb b, jr<T> c) {
   }
}
