import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cym {
   public static final int a = 20;
   public static final cym b = new cym(List.of(), List.of(), List.of());
   private final List<daz> c;
   private final List<cym.b<cyl>> d;
   private final List<cym.b<cwk>> e;

   cym(List<daz> $$0, List<cym.b<cyl>> $$1, List<cym.b<cwk>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cwo $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cwo $$0) {
      for (daz $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cwo $$0) {
      for (cym.b<cwk> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwo $$0) {
      for (cym.b<cyl> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jr<cyl> $$0) {
      for (cym.b<cyl> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cwo $$0, cwo $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cwo $$0, cwo $$1) {
      for (cym.b<cwk> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwo $$0, cwo $$1) {
      Optional<jr<cyl>> $$2 = $$0.a(kv.Q, cyn.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cym.b<cyl> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cwo d(cwo $$0, cwo $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jr<cyl>> $$2 = $$1.a(kv.Q, cyn.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cym.b<cwk> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cyn.a($$3.c.a(), $$2.get());
               }
            }

            for (cym.b<cyl> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cyn.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cym a(crs $$0) {
      cym.a $$1 = new cym.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cym.a $$0) {
      $$0.a(cws.ti);
      $$0.a(cws.wo);
      $$0.a(cws.wr);
      $$0.a(cws.ti, cws.pZ, cws.wo);
      $$0.a(cws.wo, cws.wn, cws.wr);
      $$0.a(cyo.a, cws.rV, cyo.c);
      $$0.a(cyo.a, cws.me, cyo.b);
      $$0.a(cyo.a, cws.tg, cyo.d);
      $$0.a(cws.uZ, cyo.Q);
      $$0.a(cws.ml, cyo.S);
      $$0.a(cws.b, cyo.T);
      $$0.a(cws.cT, cyo.R);
      $$0.a(cyo.d, cws.vj, cyo.e);
      $$0.a(cyo.e, cws.me, cyo.f);
      $$0.a(cyo.e, cws.tk, cyo.g);
      $$0.a(cyo.f, cws.tk, cyo.h);
      $$0.a(cyo.g, cws.me, cyo.h);
      $$0.a(cws.tm, cyo.l);
      $$0.a(cyo.l, cws.me, cyo.m);
      $$0.a(cws.vD, cyo.i);
      $$0.a(cyo.i, cws.me, cyo.j);
      $$0.a(cyo.i, cws.rV, cyo.k);
      $$0.a(cyo.i, cws.tk, cyo.q);
      $$0.a(cyo.j, cws.tk, cyo.r);
      $$0.a(cyo.q, cws.me, cyo.r);
      $$0.a(cyo.q, cws.rV, cyo.s);
      $$0.a(cyo.d, cws.oT, cyo.t);
      $$0.a(cyo.t, cws.me, cyo.u);
      $$0.a(cyo.t, cws.rV, cyo.v);
      $$0.a(cyo.n, cws.tk, cyo.q);
      $$0.a(cyo.o, cws.tk, cyo.r);
      $$0.a(cws.sx, cyo.n);
      $$0.a(cyo.n, cws.me, cyo.o);
      $$0.a(cyo.n, cws.rV, cyo.p);
      $$0.a(cyo.d, cws.rZ, cyo.w);
      $$0.a(cyo.w, cws.me, cyo.x);
      $$0.a(cws.tq, cyo.y);
      $$0.a(cyo.y, cws.rV, cyo.z);
      $$0.a(cyo.y, cws.tk, cyo.A);
      $$0.a(cyo.z, cws.tk, cyo.B);
      $$0.a(cyo.A, cws.rV, cyo.B);
      $$0.a(cyo.C, cws.tk, cyo.A);
      $$0.a(cyo.D, cws.tk, cyo.A);
      $$0.a(cyo.E, cws.tk, cyo.B);
      $$0.a(cws.tj, cyo.C);
      $$0.a(cyo.C, cws.me, cyo.D);
      $$0.a(cyo.C, cws.rV, cyo.E);
      $$0.a(cws.te, cyo.F);
      $$0.a(cyo.F, cws.me, cyo.G);
      $$0.a(cyo.F, cws.rV, cyo.H);
      $$0.a(cws.tl, cyo.I);
      $$0.a(cyo.I, cws.me, cyo.J);
      $$0.a(cyo.I, cws.rV, cyo.K);
      $$0.a(cyo.a, cws.tk, cyo.L);
      $$0.a(cyo.L, cws.me, cyo.M);
      $$0.a(cyo.d, cws.ov, cyo.O);
      $$0.a(cyo.O, cws.me, cyo.P);
   }

   public static class a {
      private final List<daz> a = new ArrayList<>();
      private final List<cym.b<cyl>> b = new ArrayList<>();
      private final List<cym.b<cwk>> c = new ArrayList<>();
      private final crs d;

      public a(crs $$0) {
         this.d = $$0;
      }

      private static void b(cwk $$0) {
         if (!($$0 instanceof cxi)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mb.g.b($$0));
         }
      }

      public void a(cwk $$0, cwk $$1, cwk $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cym.b<>($$0.f(), daz.a($$1), $$2.f()));
         }
      }

      public void a(cwk $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(daz.a($$0));
         }
      }

      public void a(jr<cyl> $$0, cwk $$1, jr<cyl> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cym.b<>($$0, daz.a($$1), $$2));
         }
      }

      public void a(cwk $$0, jr<cyl> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cyo.a, $$0, cyo.b);
            this.a(cyo.d, $$0, $$1);
         }
      }

      public cym a() {
         return new cym(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jr<T> a, daz b, jr<T> c) {
   }
}
