import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwt {
   public static final int a = 20;
   public static final cwt b = new cwt(List.of(), List.of(), List.of());
   private final List<cyw> c;
   private final List<cwt.b<cws>> d;
   private final List<cwt.b<cul>> e;

   cwt(List<cyw> $$0, List<cwt.b<cws>> $$1, List<cwt.b<cul>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cuq $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cuq $$0) {
      for (cyw $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cuq $$0) {
      for (cwt.b<cul> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuq $$0) {
      for (cwt.b<cws> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jm<cws> $$0) {
      for (cwt.b<cws> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cuq $$0, cuq $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cuq $$0, cuq $$1) {
      for (cwt.b<cul> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuq $$0, cuq $$1) {
      Optional<jm<cws>> $$2 = $$0.a(kq.G, cwu.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwt.b<cws> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cuq d(cuq $$0, cuq $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<jm<cws>> $$2 = $$1.a(kq.G, cwu.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwt.b<cul> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwu.a($$3.c.a(), $$2.get());
               }
            }

            for (cwt.b<cws> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwu.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwt a(cpl $$0) {
      cwt.a $$1 = new cwt.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwt.a $$0) {
      $$0.a(cut.sk);
      $$0.a(cut.vo);
      $$0.a(cut.vr);
      $$0.a(cut.sk, cut.pu, cut.vo);
      $$0.a(cut.vo, cut.vn, cut.vr);
      $$0.a(cwv.a, cut.qY, cwv.c);
      $$0.a(cwv.a, cut.lH, cwv.b);
      $$0.a(cwv.a, cut.sj, cwv.d);
      $$0.a(cut.yG, cwv.Q);
      $$0.a(cut.lO, cwv.S);
      $$0.a(cut.b, cwv.T);
      $$0.a(cut.cM, cwv.R);
      $$0.a(cwv.d, cut.uk, cwv.e);
      $$0.a(cwv.e, cut.lH, cwv.f);
      $$0.a(cwv.e, cut.sn, cwv.g);
      $$0.a(cwv.f, cut.sn, cwv.h);
      $$0.a(cwv.g, cut.lH, cwv.h);
      $$0.a(cut.sp, cwv.l);
      $$0.a(cwv.l, cut.lH, cwv.m);
      $$0.a(cut.uD, cwv.i);
      $$0.a(cwv.i, cut.lH, cwv.j);
      $$0.a(cwv.i, cut.qY, cwv.k);
      $$0.a(cwv.i, cut.sn, cwv.q);
      $$0.a(cwv.j, cut.sn, cwv.r);
      $$0.a(cwv.q, cut.lH, cwv.r);
      $$0.a(cwv.q, cut.qY, cwv.s);
      $$0.a(cwv.d, cut.oo, cwv.t);
      $$0.a(cwv.t, cut.lH, cwv.u);
      $$0.a(cwv.t, cut.qY, cwv.v);
      $$0.a(cwv.n, cut.sn, cwv.q);
      $$0.a(cwv.o, cut.sn, cwv.r);
      $$0.a(cut.rA, cwv.n);
      $$0.a(cwv.n, cut.lH, cwv.o);
      $$0.a(cwv.n, cut.qY, cwv.p);
      $$0.a(cwv.d, cut.rc, cwv.w);
      $$0.a(cwv.w, cut.lH, cwv.x);
      $$0.a(cut.st, cwv.y);
      $$0.a(cwv.y, cut.qY, cwv.z);
      $$0.a(cwv.y, cut.sn, cwv.A);
      $$0.a(cwv.z, cut.sn, cwv.B);
      $$0.a(cwv.A, cut.qY, cwv.B);
      $$0.a(cwv.C, cut.sn, cwv.A);
      $$0.a(cwv.D, cut.sn, cwv.A);
      $$0.a(cwv.E, cut.sn, cwv.B);
      $$0.a(cut.sm, cwv.C);
      $$0.a(cwv.C, cut.lH, cwv.D);
      $$0.a(cwv.C, cut.qY, cwv.E);
      $$0.a(cut.sh, cwv.F);
      $$0.a(cwv.F, cut.lH, cwv.G);
      $$0.a(cwv.F, cut.qY, cwv.H);
      $$0.a(cut.so, cwv.I);
      $$0.a(cwv.I, cut.lH, cwv.J);
      $$0.a(cwv.I, cut.qY, cwv.K);
      $$0.a(cwv.a, cut.sn, cwv.L);
      $$0.a(cwv.L, cut.lH, cwv.M);
      $$0.a(cwv.d, cut.vT, cwv.O);
      $$0.a(cwv.O, cut.lH, cwv.P);
   }

   public static class a {
      private final List<cyw> a = new ArrayList<>();
      private final List<cwt.b<cws>> b = new ArrayList<>();
      private final List<cwt.b<cul>> c = new ArrayList<>();
      private final cpl d;

      public a(cpl $$0) {
         this.d = $$0;
      }

      private static void b(cul $$0) {
         if (!($$0 instanceof cvl)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lt.g.b($$0));
         }
      }

      public void a(cul $$0, cul $$1, cul $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwt.b<>($$0.o(), cyw.a($$1), $$2.o()));
         }
      }

      public void a(cul $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyw.a($$0));
         }
      }

      public void a(jm<cws> $$0, cul $$1, jm<cws> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwt.b<>($$0, cyw.a($$1), $$2));
         }
      }

      public void a(cul $$0, jm<cws> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwv.a, $$0, cwv.b);
            this.a(cwv.d, $$0, $$1);
         }
      }

      public cwt a() {
         return new cwt(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jm<T> a, cyw b, jm<T> c) {
   }
}
