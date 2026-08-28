import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwk {
   public static final int a = 20;
   public static final cwk b = new cwk(List.of(), List.of(), List.of());
   private final List<cyn> c;
   private final List<cwk.b<cwj>> d;
   private final List<cwk.b<cuf>> e;

   cwk(List<cyn> $$0, List<cwk.b<cwj>> $$1, List<cwk.b<cuf>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cuk $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cuk $$0) {
      for (cyn $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cuk $$0) {
      for (cwk.b<cuf> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuk $$0) {
      for (cwk.b<cwj> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji<cwj> $$0) {
      for (cwk.b<cwj> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cuk $$0, cuk $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cuk $$0, cuk $$1) {
      for (cwk.b<cuf> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuk $$0, cuk $$1) {
      Optional<ji<cwj>> $$2 = $$0.a(km.F, cwl.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwk.b<cwj> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cuk d(cuk $$0, cuk $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<ji<cwj>> $$2 = $$1.a(km.F, cwl.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwk.b<cuf> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwl.a($$3.c.a(), $$2.get());
               }
            }

            for (cwk.b<cwj> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwl.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwk a(cpg $$0) {
      cwk.a $$1 = new cwk.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwk.a $$0) {
      $$0.a(cun.sk);
      $$0.a(cun.vo);
      $$0.a(cun.vr);
      $$0.a(cun.sk, cun.pu, cun.vo);
      $$0.a(cun.vo, cun.vn, cun.vr);
      $$0.a(cwm.a, cun.qY, cwm.c);
      $$0.a(cwm.a, cun.lH, cwm.b);
      $$0.a(cwm.a, cun.sj, cwm.d);
      $$0.a(cun.yD, cwm.Q);
      $$0.a(cun.lO, cwm.S);
      $$0.a(cun.b, cwm.T);
      $$0.a(cun.cM, cwm.R);
      $$0.a(cwm.d, cun.uk, cwm.e);
      $$0.a(cwm.e, cun.lH, cwm.f);
      $$0.a(cwm.e, cun.sn, cwm.g);
      $$0.a(cwm.f, cun.sn, cwm.h);
      $$0.a(cwm.g, cun.lH, cwm.h);
      $$0.a(cun.sp, cwm.l);
      $$0.a(cwm.l, cun.lH, cwm.m);
      $$0.a(cun.uD, cwm.i);
      $$0.a(cwm.i, cun.lH, cwm.j);
      $$0.a(cwm.i, cun.qY, cwm.k);
      $$0.a(cwm.i, cun.sn, cwm.q);
      $$0.a(cwm.j, cun.sn, cwm.r);
      $$0.a(cwm.q, cun.lH, cwm.r);
      $$0.a(cwm.q, cun.qY, cwm.s);
      $$0.a(cwm.d, cun.oo, cwm.t);
      $$0.a(cwm.t, cun.lH, cwm.u);
      $$0.a(cwm.t, cun.qY, cwm.v);
      $$0.a(cwm.n, cun.sn, cwm.q);
      $$0.a(cwm.o, cun.sn, cwm.r);
      $$0.a(cun.rA, cwm.n);
      $$0.a(cwm.n, cun.lH, cwm.o);
      $$0.a(cwm.n, cun.qY, cwm.p);
      $$0.a(cwm.d, cun.rc, cwm.w);
      $$0.a(cwm.w, cun.lH, cwm.x);
      $$0.a(cun.st, cwm.y);
      $$0.a(cwm.y, cun.qY, cwm.z);
      $$0.a(cwm.y, cun.sn, cwm.A);
      $$0.a(cwm.z, cun.sn, cwm.B);
      $$0.a(cwm.A, cun.qY, cwm.B);
      $$0.a(cwm.C, cun.sn, cwm.A);
      $$0.a(cwm.D, cun.sn, cwm.A);
      $$0.a(cwm.E, cun.sn, cwm.B);
      $$0.a(cun.sm, cwm.C);
      $$0.a(cwm.C, cun.lH, cwm.D);
      $$0.a(cwm.C, cun.qY, cwm.E);
      $$0.a(cun.sh, cwm.F);
      $$0.a(cwm.F, cun.lH, cwm.G);
      $$0.a(cwm.F, cun.qY, cwm.H);
      $$0.a(cun.so, cwm.I);
      $$0.a(cwm.I, cun.lH, cwm.J);
      $$0.a(cwm.I, cun.qY, cwm.K);
      $$0.a(cwm.a, cun.sn, cwm.L);
      $$0.a(cwm.L, cun.lH, cwm.M);
      $$0.a(cwm.d, cun.vQ, cwm.O);
      $$0.a(cwm.O, cun.lH, cwm.P);
   }

   public static class a {
      private final List<cyn> a = new ArrayList<>();
      private final List<cwk.b<cwj>> b = new ArrayList<>();
      private final List<cwk.b<cuf>> c = new ArrayList<>();
      private final cpg d;

      public a(cpg $$0) {
         this.d = $$0;
      }

      private static void b(cuf $$0) {
         if (!($$0 instanceof cvb)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lp.h.b($$0));
         }
      }

      public void a(cuf $$0, cuf $$1, cuf $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwk.b<>($$0.o(), cyn.a($$1), $$2.o()));
         }
      }

      public void a(cuf $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyn.a($$0));
         }
      }

      public void a(ji<cwj> $$0, cuf $$1, ji<cwj> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwk.b<>($$0, cyn.a($$1), $$2));
         }
      }

      public void a(cuf $$0, ji<cwj> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwm.a, $$0, cwm.b);
            this.a(cwm.d, $$0, $$1);
         }
      }

      public cwk a() {
         return new cwk(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(ji<T> a, cyn b, ji<T> c) {
   }
}
