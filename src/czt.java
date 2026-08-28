import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class czt {
   public static final int a = 20;
   public static final czt b = new czt(List.of(), List.of(), List.of());
   private final List<dch> c;
   private final List<czt.b<czs>> d;
   private final List<czt.b<cxu>> e;

   czt(List<dch> $$0, List<czt.b<czs>> $$1, List<czt.b<cxu>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cxy $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cxy $$0) {
      for (dch $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cxy $$0) {
      for (czt.b<cxu> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxy $$0) {
      for (czt.b<czs> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(js<czs> $$0) {
      for (czt.b<czs> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cxy $$0, cxy $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cxy $$0, cxy $$1) {
      for (czt.b<cxu> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxy $$0, cxy $$1) {
      Optional<js<czs>> $$2 = $$0.a(kx.R, czu.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (czt.b<czs> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cxy d(cxy $$0, cxy $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<js<czs>> $$2 = $$1.a(kx.R, czu.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (czt.b<cxu> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return czu.a($$3.c.a(), $$2.get());
               }
            }

            for (czt.b<czs> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return czu.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static czt a(cte $$0) {
      czt.a $$1 = new czt.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(czt.a $$0) {
      $$0.a(cyc.tm);
      $$0.a(cyc.ws);
      $$0.a(cyc.wv);
      $$0.a(cyc.tm, cyc.qd, cyc.ws);
      $$0.a(cyc.ws, cyc.wr, cyc.wv);
      $$0.a(czv.a, cyc.rZ, czv.c);
      $$0.a(czv.a, cyc.mg, czv.b);
      $$0.a(czv.a, cyc.tk, czv.d);
      $$0.a(cyc.vd, czv.Q);
      $$0.a(cyc.mn, czv.S);
      $$0.a(cyc.b, czv.T);
      $$0.a(cyc.cT, czv.R);
      $$0.a(czv.d, cyc.vn, czv.e);
      $$0.a(czv.e, cyc.mg, czv.f);
      $$0.a(czv.e, cyc.to, czv.g);
      $$0.a(czv.f, cyc.to, czv.h);
      $$0.a(czv.g, cyc.mg, czv.h);
      $$0.a(cyc.tq, czv.l);
      $$0.a(czv.l, cyc.mg, czv.m);
      $$0.a(cyc.vH, czv.i);
      $$0.a(czv.i, cyc.mg, czv.j);
      $$0.a(czv.i, cyc.rZ, czv.k);
      $$0.a(czv.i, cyc.to, czv.q);
      $$0.a(czv.j, cyc.to, czv.r);
      $$0.a(czv.q, cyc.mg, czv.r);
      $$0.a(czv.q, cyc.rZ, czv.s);
      $$0.a(czv.d, cyc.oX, czv.t);
      $$0.a(czv.t, cyc.mg, czv.u);
      $$0.a(czv.t, cyc.rZ, czv.v);
      $$0.a(czv.n, cyc.to, czv.q);
      $$0.a(czv.o, cyc.to, czv.r);
      $$0.a(cyc.sB, czv.n);
      $$0.a(czv.n, cyc.mg, czv.o);
      $$0.a(czv.n, cyc.rZ, czv.p);
      $$0.a(czv.d, cyc.sd, czv.w);
      $$0.a(czv.w, cyc.mg, czv.x);
      $$0.a(cyc.tu, czv.y);
      $$0.a(czv.y, cyc.rZ, czv.z);
      $$0.a(czv.y, cyc.to, czv.A);
      $$0.a(czv.z, cyc.to, czv.B);
      $$0.a(czv.A, cyc.rZ, czv.B);
      $$0.a(czv.C, cyc.to, czv.A);
      $$0.a(czv.D, cyc.to, czv.A);
      $$0.a(czv.E, cyc.to, czv.B);
      $$0.a(cyc.tn, czv.C);
      $$0.a(czv.C, cyc.mg, czv.D);
      $$0.a(czv.C, cyc.rZ, czv.E);
      $$0.a(cyc.ti, czv.F);
      $$0.a(czv.F, cyc.mg, czv.G);
      $$0.a(czv.F, cyc.rZ, czv.H);
      $$0.a(cyc.tp, czv.I);
      $$0.a(czv.I, cyc.mg, czv.J);
      $$0.a(czv.I, cyc.rZ, czv.K);
      $$0.a(czv.a, cyc.to, czv.L);
      $$0.a(czv.L, cyc.mg, czv.M);
      $$0.a(czv.d, cyc.ox, czv.O);
      $$0.a(czv.O, cyc.mg, czv.P);
   }

   public static class a {
      private final List<dch> a = new ArrayList<>();
      private final List<czt.b<czs>> b = new ArrayList<>();
      private final List<czt.b<cxu>> c = new ArrayList<>();
      private final cte d;

      public a(cte $$0) {
         this.d = $$0;
      }

      private static void b(cxu $$0) {
         if (!($$0 instanceof cyr)) {
            throw new IllegalArgumentException("Expected a potion, got: " + md.g.b($$0));
         }
      }

      public void a(cxu $$0, cxu $$1, cxu $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new czt.b<>($$0.f(), dch.a($$1), $$2.f()));
         }
      }

      public void a(cxu $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dch.a($$0));
         }
      }

      public void a(js<czs> $$0, cxu $$1, js<czs> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new czt.b<>($$0, dch.a($$1), $$2));
         }
      }

      public void a(cxu $$0, js<czs> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(czv.a, $$0, czv.b);
            this.a(czv.d, $$0, $$1);
         }
      }

      public czt a() {
         return new czt(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(js<T> a, dch b, js<T> c) {
   }
}
