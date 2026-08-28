import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwc {
   public static final int a = 20;
   public static final cwc b = new cwc(List.of(), List.of(), List.of());
   private final List<cyf> c;
   private final List<cwc.b<cwb>> d;
   private final List<cwc.b<ctx>> e;

   cwc(List<cyf> $$0, List<cwc.b<cwb>> $$1, List<cwc.b<ctx>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cuc $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cuc $$0) {
      for (cyf $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cuc $$0) {
      for (cwc.b<ctx> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuc $$0) {
      for (cwc.b<cwb> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jj<cwb> $$0) {
      for (cwc.b<cwb> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cuc $$0, cuc $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cuc $$0, cuc $$1) {
      for (cwc.b<ctx> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cuc $$0, cuc $$1) {
      Optional<jj<cwb>> $$2 = $$0.a(kn.G, cwd.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwc.b<cwb> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cuc d(cuc $$0, cuc $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<jj<cwb>> $$2 = $$1.a(kn.G, cwd.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwc.b<ctx> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwd.a($$3.c.a(), $$2.get());
               }
            }

            for (cwc.b<cwb> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwd.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwc a(coy $$0) {
      cwc.a $$1 = new cwc.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwc.a $$0) {
      $$0.a(cuf.sk);
      $$0.a(cuf.vo);
      $$0.a(cuf.vr);
      $$0.a(cuf.sk, cuf.pu, cuf.vo);
      $$0.a(cuf.vo, cuf.vn, cuf.vr);
      $$0.a(cwe.a, cuf.qY, cwe.c);
      $$0.a(cwe.a, cuf.lH, cwe.b);
      $$0.a(cwe.a, cuf.sj, cwe.d);
      $$0.a(cuf.yG, cwe.Q);
      $$0.a(cuf.lO, cwe.S);
      $$0.a(cuf.b, cwe.T);
      $$0.a(cuf.cM, cwe.R);
      $$0.a(cwe.d, cuf.uk, cwe.e);
      $$0.a(cwe.e, cuf.lH, cwe.f);
      $$0.a(cwe.e, cuf.sn, cwe.g);
      $$0.a(cwe.f, cuf.sn, cwe.h);
      $$0.a(cwe.g, cuf.lH, cwe.h);
      $$0.a(cuf.sp, cwe.l);
      $$0.a(cwe.l, cuf.lH, cwe.m);
      $$0.a(cuf.uD, cwe.i);
      $$0.a(cwe.i, cuf.lH, cwe.j);
      $$0.a(cwe.i, cuf.qY, cwe.k);
      $$0.a(cwe.i, cuf.sn, cwe.q);
      $$0.a(cwe.j, cuf.sn, cwe.r);
      $$0.a(cwe.q, cuf.lH, cwe.r);
      $$0.a(cwe.q, cuf.qY, cwe.s);
      $$0.a(cwe.d, cuf.oo, cwe.t);
      $$0.a(cwe.t, cuf.lH, cwe.u);
      $$0.a(cwe.t, cuf.qY, cwe.v);
      $$0.a(cwe.n, cuf.sn, cwe.q);
      $$0.a(cwe.o, cuf.sn, cwe.r);
      $$0.a(cuf.rA, cwe.n);
      $$0.a(cwe.n, cuf.lH, cwe.o);
      $$0.a(cwe.n, cuf.qY, cwe.p);
      $$0.a(cwe.d, cuf.rc, cwe.w);
      $$0.a(cwe.w, cuf.lH, cwe.x);
      $$0.a(cuf.st, cwe.y);
      $$0.a(cwe.y, cuf.qY, cwe.z);
      $$0.a(cwe.y, cuf.sn, cwe.A);
      $$0.a(cwe.z, cuf.sn, cwe.B);
      $$0.a(cwe.A, cuf.qY, cwe.B);
      $$0.a(cwe.C, cuf.sn, cwe.A);
      $$0.a(cwe.D, cuf.sn, cwe.A);
      $$0.a(cwe.E, cuf.sn, cwe.B);
      $$0.a(cuf.sm, cwe.C);
      $$0.a(cwe.C, cuf.lH, cwe.D);
      $$0.a(cwe.C, cuf.qY, cwe.E);
      $$0.a(cuf.sh, cwe.F);
      $$0.a(cwe.F, cuf.lH, cwe.G);
      $$0.a(cwe.F, cuf.qY, cwe.H);
      $$0.a(cuf.so, cwe.I);
      $$0.a(cwe.I, cuf.lH, cwe.J);
      $$0.a(cwe.I, cuf.qY, cwe.K);
      $$0.a(cwe.a, cuf.sn, cwe.L);
      $$0.a(cwe.L, cuf.lH, cwe.M);
      $$0.a(cwe.d, cuf.vT, cwe.O);
      $$0.a(cwe.O, cuf.lH, cwe.P);
   }

   public static class a {
      private final List<cyf> a = new ArrayList<>();
      private final List<cwc.b<cwb>> b = new ArrayList<>();
      private final List<cwc.b<ctx>> c = new ArrayList<>();
      private final coy d;

      public a(coy $$0) {
         this.d = $$0;
      }

      private static void b(ctx $$0) {
         if (!($$0 instanceof cut)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lq.g.b($$0));
         }
      }

      public void a(ctx $$0, ctx $$1, ctx $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwc.b<>($$0.o(), cyf.a($$1), $$2.o()));
         }
      }

      public void a(ctx $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyf.a($$0));
         }
      }

      public void a(jj<cwb> $$0, ctx $$1, jj<cwb> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwc.b<>($$0, cyf.a($$1), $$2));
         }
      }

      public void a(ctx $$0, jj<cwb> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwe.a, $$0, cwe.b);
            this.a(cwe.d, $$0, $$1);
         }
      }

      public cwc a() {
         return new cwc(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jj<T> a, cyf b, jj<T> c) {
   }
}
