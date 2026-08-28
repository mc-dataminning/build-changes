import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwa {
   public static final int a = 20;
   public static final cwa b = new cwa(List.of(), List.of(), List.of());
   private final List<cyd> c;
   private final List<cwa.b<cvz>> d;
   private final List<cwa.b<ctv>> e;

   cwa(List<cyd> $$0, List<cwa.b<cvz>> $$1, List<cwa.b<ctv>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cua $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cua $$0) {
      for (cyd $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cua $$0) {
      for (cwa.b<ctv> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cua $$0) {
      for (cwa.b<cvz> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jj<cvz> $$0) {
      for (cwa.b<cvz> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cua $$0, cua $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cua $$0, cua $$1) {
      for (cwa.b<ctv> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cua $$0, cua $$1) {
      Optional<jj<cvz>> $$2 = $$0.a(kn.G, cwb.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwa.b<cvz> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cua d(cua $$0, cua $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<jj<cvz>> $$2 = $$1.a(kn.G, cwb.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwa.b<ctv> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwb.a($$3.c.a(), $$2.get());
               }
            }

            for (cwa.b<cvz> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwb.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwa a(cov $$0) {
      cwa.a $$1 = new cwa.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwa.a $$0) {
      $$0.a(cud.sk);
      $$0.a(cud.vo);
      $$0.a(cud.vr);
      $$0.a(cud.sk, cud.pu, cud.vo);
      $$0.a(cud.vo, cud.vn, cud.vr);
      $$0.a(cwc.a, cud.qY, cwc.c);
      $$0.a(cwc.a, cud.lH, cwc.b);
      $$0.a(cwc.a, cud.sj, cwc.d);
      $$0.a(cud.yG, cwc.Q);
      $$0.a(cud.lO, cwc.S);
      $$0.a(cud.b, cwc.T);
      $$0.a(cud.cM, cwc.R);
      $$0.a(cwc.d, cud.uk, cwc.e);
      $$0.a(cwc.e, cud.lH, cwc.f);
      $$0.a(cwc.e, cud.sn, cwc.g);
      $$0.a(cwc.f, cud.sn, cwc.h);
      $$0.a(cwc.g, cud.lH, cwc.h);
      $$0.a(cud.sp, cwc.l);
      $$0.a(cwc.l, cud.lH, cwc.m);
      $$0.a(cud.uD, cwc.i);
      $$0.a(cwc.i, cud.lH, cwc.j);
      $$0.a(cwc.i, cud.qY, cwc.k);
      $$0.a(cwc.i, cud.sn, cwc.q);
      $$0.a(cwc.j, cud.sn, cwc.r);
      $$0.a(cwc.q, cud.lH, cwc.r);
      $$0.a(cwc.q, cud.qY, cwc.s);
      $$0.a(cwc.d, cud.oo, cwc.t);
      $$0.a(cwc.t, cud.lH, cwc.u);
      $$0.a(cwc.t, cud.qY, cwc.v);
      $$0.a(cwc.n, cud.sn, cwc.q);
      $$0.a(cwc.o, cud.sn, cwc.r);
      $$0.a(cud.rA, cwc.n);
      $$0.a(cwc.n, cud.lH, cwc.o);
      $$0.a(cwc.n, cud.qY, cwc.p);
      $$0.a(cwc.d, cud.rc, cwc.w);
      $$0.a(cwc.w, cud.lH, cwc.x);
      $$0.a(cud.st, cwc.y);
      $$0.a(cwc.y, cud.qY, cwc.z);
      $$0.a(cwc.y, cud.sn, cwc.A);
      $$0.a(cwc.z, cud.sn, cwc.B);
      $$0.a(cwc.A, cud.qY, cwc.B);
      $$0.a(cwc.C, cud.sn, cwc.A);
      $$0.a(cwc.D, cud.sn, cwc.A);
      $$0.a(cwc.E, cud.sn, cwc.B);
      $$0.a(cud.sm, cwc.C);
      $$0.a(cwc.C, cud.lH, cwc.D);
      $$0.a(cwc.C, cud.qY, cwc.E);
      $$0.a(cud.sh, cwc.F);
      $$0.a(cwc.F, cud.lH, cwc.G);
      $$0.a(cwc.F, cud.qY, cwc.H);
      $$0.a(cud.so, cwc.I);
      $$0.a(cwc.I, cud.lH, cwc.J);
      $$0.a(cwc.I, cud.qY, cwc.K);
      $$0.a(cwc.a, cud.sn, cwc.L);
      $$0.a(cwc.L, cud.lH, cwc.M);
      $$0.a(cwc.d, cud.vT, cwc.O);
      $$0.a(cwc.O, cud.lH, cwc.P);
   }

   public static class a {
      private final List<cyd> a = new ArrayList<>();
      private final List<cwa.b<cvz>> b = new ArrayList<>();
      private final List<cwa.b<ctv>> c = new ArrayList<>();
      private final cov d;

      public a(cov $$0) {
         this.d = $$0;
      }

      private static void b(ctv $$0) {
         if (!($$0 instanceof cur)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lq.g.b($$0));
         }
      }

      public void a(ctv $$0, ctv $$1, ctv $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwa.b<>($$0.o(), cyd.a($$1), $$2.o()));
         }
      }

      public void a(ctv $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyd.a($$0));
         }
      }

      public void a(jj<cvz> $$0, ctv $$1, jj<cvz> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwa.b<>($$0, cyd.a($$1), $$2));
         }
      }

      public void a(ctv $$0, jj<cvz> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwc.a, $$0, cwc.b);
            this.a(cwc.d, $$0, $$1);
         }
      }

      public cwa a() {
         return new cwa(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jj<T> a, cyd b, jj<T> c) {
   }
}
