import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cze {
   public static final int a = 20;
   public static final cze b = new cze(List.of(), List.of(), List.of());
   private final List<dbr> c;
   private final List<cze.b<czd>> d;
   private final List<cze.b<cxc>> e;

   cze(List<dbr> $$0, List<cze.b<czd>> $$1, List<cze.b<cxc>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cxg $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cxg $$0) {
      for (dbr $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cxg $$0) {
      for (cze.b<cxc> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxg $$0) {
      for (cze.b<czd> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jq<czd> $$0) {
      for (cze.b<czd> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cxg $$0, cxg $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cxg $$0, cxg $$1) {
      for (cze.b<cxc> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxg $$0, cxg $$1) {
      Optional<jq<czd>> $$2 = $$0.a(ku.Q, czf.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cze.b<czd> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cxg d(cxg $$0, cxg $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jq<czd>> $$2 = $$1.a(ku.Q, czf.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cze.b<cxc> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return czf.a($$3.c.a(), $$2.get());
               }
            }

            for (cze.b<czd> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return czf.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cze a(csk $$0) {
      cze.a $$1 = new cze.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cze.a $$0) {
      $$0.a(cxk.ti);
      $$0.a(cxk.wo);
      $$0.a(cxk.wr);
      $$0.a(cxk.ti, cxk.pZ, cxk.wo);
      $$0.a(cxk.wo, cxk.wn, cxk.wr);
      $$0.a(czg.a, cxk.rV, czg.c);
      $$0.a(czg.a, cxk.me, czg.b);
      $$0.a(czg.a, cxk.tg, czg.d);
      $$0.a(cxk.uZ, czg.Q);
      $$0.a(cxk.ml, czg.S);
      $$0.a(cxk.b, czg.T);
      $$0.a(cxk.cT, czg.R);
      $$0.a(czg.d, cxk.vj, czg.e);
      $$0.a(czg.e, cxk.me, czg.f);
      $$0.a(czg.e, cxk.tk, czg.g);
      $$0.a(czg.f, cxk.tk, czg.h);
      $$0.a(czg.g, cxk.me, czg.h);
      $$0.a(cxk.tm, czg.l);
      $$0.a(czg.l, cxk.me, czg.m);
      $$0.a(cxk.vD, czg.i);
      $$0.a(czg.i, cxk.me, czg.j);
      $$0.a(czg.i, cxk.rV, czg.k);
      $$0.a(czg.i, cxk.tk, czg.q);
      $$0.a(czg.j, cxk.tk, czg.r);
      $$0.a(czg.q, cxk.me, czg.r);
      $$0.a(czg.q, cxk.rV, czg.s);
      $$0.a(czg.d, cxk.oT, czg.t);
      $$0.a(czg.t, cxk.me, czg.u);
      $$0.a(czg.t, cxk.rV, czg.v);
      $$0.a(czg.n, cxk.tk, czg.q);
      $$0.a(czg.o, cxk.tk, czg.r);
      $$0.a(cxk.sx, czg.n);
      $$0.a(czg.n, cxk.me, czg.o);
      $$0.a(czg.n, cxk.rV, czg.p);
      $$0.a(czg.d, cxk.rZ, czg.w);
      $$0.a(czg.w, cxk.me, czg.x);
      $$0.a(cxk.tq, czg.y);
      $$0.a(czg.y, cxk.rV, czg.z);
      $$0.a(czg.y, cxk.tk, czg.A);
      $$0.a(czg.z, cxk.tk, czg.B);
      $$0.a(czg.A, cxk.rV, czg.B);
      $$0.a(czg.C, cxk.tk, czg.A);
      $$0.a(czg.D, cxk.tk, czg.A);
      $$0.a(czg.E, cxk.tk, czg.B);
      $$0.a(cxk.tj, czg.C);
      $$0.a(czg.C, cxk.me, czg.D);
      $$0.a(czg.C, cxk.rV, czg.E);
      $$0.a(cxk.te, czg.F);
      $$0.a(czg.F, cxk.me, czg.G);
      $$0.a(czg.F, cxk.rV, czg.H);
      $$0.a(cxk.tl, czg.I);
      $$0.a(czg.I, cxk.me, czg.J);
      $$0.a(czg.I, cxk.rV, czg.K);
      $$0.a(czg.a, cxk.tk, czg.L);
      $$0.a(czg.L, cxk.me, czg.M);
      $$0.a(czg.d, cxk.ov, czg.O);
      $$0.a(czg.O, cxk.me, czg.P);
   }

   public static class a {
      private final List<dbr> a = new ArrayList<>();
      private final List<cze.b<czd>> b = new ArrayList<>();
      private final List<cze.b<cxc>> c = new ArrayList<>();
      private final csk d;

      public a(csk $$0) {
         this.d = $$0;
      }

      private static void b(cxc $$0) {
         if (!($$0 instanceof cya)) {
            throw new IllegalArgumentException("Expected a potion, got: " + ma.g.b($$0));
         }
      }

      public void a(cxc $$0, cxc $$1, cxc $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cze.b<>($$0.f(), dbr.a($$1), $$2.f()));
         }
      }

      public void a(cxc $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dbr.a($$0));
         }
      }

      public void a(jq<czd> $$0, cxc $$1, jq<czd> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cze.b<>($$0, dbr.a($$1), $$2));
         }
      }

      public void a(cxc $$0, jq<czd> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(czg.a, $$0, czg.b);
            this.a(czg.d, $$0, $$1);
         }
      }

      public cze a() {
         return new cze(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jq<T> a, dbr b, jq<T> c) {
   }
}
