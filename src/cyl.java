import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cyl {
   public static final int a = 20;
   public static final cyl b = new cyl(List.of(), List.of(), List.of());
   private final List<day> c;
   private final List<cyl.b<cyk>> d;
   private final List<cyl.b<cwj>> e;

   cyl(List<day> $$0, List<cyl.b<cyk>> $$1, List<cyl.b<cwj>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cwn $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cwn $$0) {
      for (day $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cwn $$0) {
      for (cyl.b<cwj> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwn $$0) {
      for (cyl.b<cyk> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jr<cyk> $$0) {
      for (cyl.b<cyk> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cwn $$0, cwn $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cwn $$0, cwn $$1) {
      for (cyl.b<cwj> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwn $$0, cwn $$1) {
      Optional<jr<cyk>> $$2 = $$0.a(kv.Q, cym.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cyl.b<cyk> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cwn d(cwn $$0, cwn $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jr<cyk>> $$2 = $$1.a(kv.Q, cym.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cyl.b<cwj> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cym.a($$3.c.a(), $$2.get());
               }
            }

            for (cyl.b<cyk> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cym.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cyl a(crr $$0) {
      cyl.a $$1 = new cyl.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cyl.a $$0) {
      $$0.a(cwr.ti);
      $$0.a(cwr.wo);
      $$0.a(cwr.wr);
      $$0.a(cwr.ti, cwr.pZ, cwr.wo);
      $$0.a(cwr.wo, cwr.wn, cwr.wr);
      $$0.a(cyn.a, cwr.rV, cyn.c);
      $$0.a(cyn.a, cwr.me, cyn.b);
      $$0.a(cyn.a, cwr.tg, cyn.d);
      $$0.a(cwr.uZ, cyn.Q);
      $$0.a(cwr.ml, cyn.S);
      $$0.a(cwr.b, cyn.T);
      $$0.a(cwr.cT, cyn.R);
      $$0.a(cyn.d, cwr.vj, cyn.e);
      $$0.a(cyn.e, cwr.me, cyn.f);
      $$0.a(cyn.e, cwr.tk, cyn.g);
      $$0.a(cyn.f, cwr.tk, cyn.h);
      $$0.a(cyn.g, cwr.me, cyn.h);
      $$0.a(cwr.tm, cyn.l);
      $$0.a(cyn.l, cwr.me, cyn.m);
      $$0.a(cwr.vD, cyn.i);
      $$0.a(cyn.i, cwr.me, cyn.j);
      $$0.a(cyn.i, cwr.rV, cyn.k);
      $$0.a(cyn.i, cwr.tk, cyn.q);
      $$0.a(cyn.j, cwr.tk, cyn.r);
      $$0.a(cyn.q, cwr.me, cyn.r);
      $$0.a(cyn.q, cwr.rV, cyn.s);
      $$0.a(cyn.d, cwr.oT, cyn.t);
      $$0.a(cyn.t, cwr.me, cyn.u);
      $$0.a(cyn.t, cwr.rV, cyn.v);
      $$0.a(cyn.n, cwr.tk, cyn.q);
      $$0.a(cyn.o, cwr.tk, cyn.r);
      $$0.a(cwr.sx, cyn.n);
      $$0.a(cyn.n, cwr.me, cyn.o);
      $$0.a(cyn.n, cwr.rV, cyn.p);
      $$0.a(cyn.d, cwr.rZ, cyn.w);
      $$0.a(cyn.w, cwr.me, cyn.x);
      $$0.a(cwr.tq, cyn.y);
      $$0.a(cyn.y, cwr.rV, cyn.z);
      $$0.a(cyn.y, cwr.tk, cyn.A);
      $$0.a(cyn.z, cwr.tk, cyn.B);
      $$0.a(cyn.A, cwr.rV, cyn.B);
      $$0.a(cyn.C, cwr.tk, cyn.A);
      $$0.a(cyn.D, cwr.tk, cyn.A);
      $$0.a(cyn.E, cwr.tk, cyn.B);
      $$0.a(cwr.tj, cyn.C);
      $$0.a(cyn.C, cwr.me, cyn.D);
      $$0.a(cyn.C, cwr.rV, cyn.E);
      $$0.a(cwr.te, cyn.F);
      $$0.a(cyn.F, cwr.me, cyn.G);
      $$0.a(cyn.F, cwr.rV, cyn.H);
      $$0.a(cwr.tl, cyn.I);
      $$0.a(cyn.I, cwr.me, cyn.J);
      $$0.a(cyn.I, cwr.rV, cyn.K);
      $$0.a(cyn.a, cwr.tk, cyn.L);
      $$0.a(cyn.L, cwr.me, cyn.M);
      $$0.a(cyn.d, cwr.ov, cyn.O);
      $$0.a(cyn.O, cwr.me, cyn.P);
   }

   public static class a {
      private final List<day> a = new ArrayList<>();
      private final List<cyl.b<cyk>> b = new ArrayList<>();
      private final List<cyl.b<cwj>> c = new ArrayList<>();
      private final crr d;

      public a(crr $$0) {
         this.d = $$0;
      }

      private static void b(cwj $$0) {
         if (!($$0 instanceof cxh)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mb.g.b($$0));
         }
      }

      public void a(cwj $$0, cwj $$1, cwj $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cyl.b<>($$0.f(), day.a($$1), $$2.f()));
         }
      }

      public void a(cwj $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(day.a($$0));
         }
      }

      public void a(jr<cyk> $$0, cwj $$1, jr<cyk> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cyl.b<>($$0, day.a($$1), $$2));
         }
      }

      public void a(cwj $$0, jr<cyk> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cyn.a, $$0, cyn.b);
            this.a(cyn.d, $$0, $$1);
         }
      }

      public cyl a() {
         return new cyl(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jr<T> a, day b, jr<T> c) {
   }
}
