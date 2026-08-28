import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dat {
   public static final int a = 20;
   public static final dat b = new dat(List.of(), List.of(), List.of());
   private final List<ddl> c;
   private final List<dat.b<das>> d;
   private final List<dat.b<cyu>> e;

   dat(List<ddl> $$0, List<dat.b<das>> $$1, List<dat.b<cyu>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cyy $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cyy $$0) {
      for (ddl $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cyy $$0) {
      for (dat.b<cyu> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cyy $$0) {
      for (dat.b<das> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(je<das> $$0) {
      for (dat.b<das> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cyy $$0, cyy $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cyy $$0, cyy $$1) {
      for (dat.b<cyu> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cyy $$0, cyy $$1) {
      Optional<je<das>> $$2 = $$0.a(kj.R, dau.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (dat.b<das> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cyy d(cyy $$0, cyy $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<je<das>> $$2 = $$1.a(kj.R, dau.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (dat.b<cyu> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return dau.a($$3.c.a(), $$2.get());
               }
            }

            for (dat.b<das> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return dau.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static dat a(cuh $$0) {
      dat.a $$1 = new dat.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(dat.a $$0) {
      $$0.a(czc.to);
      $$0.a(czc.wu);
      $$0.a(czc.wx);
      $$0.a(czc.to, czc.qf, czc.wu);
      $$0.a(czc.wu, czc.wt, czc.wx);
      $$0.a(dav.a, czc.sb, dav.c);
      $$0.a(dav.a, czc.mi, dav.b);
      $$0.a(dav.a, czc.tm, dav.d);
      $$0.a(czc.vf, dav.Q);
      $$0.a(czc.mp, dav.S);
      $$0.a(czc.b, dav.T);
      $$0.a(czc.cT, dav.R);
      $$0.a(dav.d, czc.vp, dav.e);
      $$0.a(dav.e, czc.mi, dav.f);
      $$0.a(dav.e, czc.tq, dav.g);
      $$0.a(dav.f, czc.tq, dav.h);
      $$0.a(dav.g, czc.mi, dav.h);
      $$0.a(czc.ts, dav.l);
      $$0.a(dav.l, czc.mi, dav.m);
      $$0.a(czc.vJ, dav.i);
      $$0.a(dav.i, czc.mi, dav.j);
      $$0.a(dav.i, czc.sb, dav.k);
      $$0.a(dav.i, czc.tq, dav.q);
      $$0.a(dav.j, czc.tq, dav.r);
      $$0.a(dav.q, czc.mi, dav.r);
      $$0.a(dav.q, czc.sb, dav.s);
      $$0.a(dav.d, czc.oZ, dav.t);
      $$0.a(dav.t, czc.mi, dav.u);
      $$0.a(dav.t, czc.sb, dav.v);
      $$0.a(dav.n, czc.tq, dav.q);
      $$0.a(dav.o, czc.tq, dav.r);
      $$0.a(czc.sD, dav.n);
      $$0.a(dav.n, czc.mi, dav.o);
      $$0.a(dav.n, czc.sb, dav.p);
      $$0.a(dav.d, czc.sf, dav.w);
      $$0.a(dav.w, czc.mi, dav.x);
      $$0.a(czc.tw, dav.y);
      $$0.a(dav.y, czc.sb, dav.z);
      $$0.a(dav.y, czc.tq, dav.A);
      $$0.a(dav.z, czc.tq, dav.B);
      $$0.a(dav.A, czc.sb, dav.B);
      $$0.a(dav.C, czc.tq, dav.A);
      $$0.a(dav.D, czc.tq, dav.A);
      $$0.a(dav.E, czc.tq, dav.B);
      $$0.a(czc.tp, dav.C);
      $$0.a(dav.C, czc.mi, dav.D);
      $$0.a(dav.C, czc.sb, dav.E);
      $$0.a(czc.tk, dav.F);
      $$0.a(dav.F, czc.mi, dav.G);
      $$0.a(dav.F, czc.sb, dav.H);
      $$0.a(czc.tr, dav.I);
      $$0.a(dav.I, czc.mi, dav.J);
      $$0.a(dav.I, czc.sb, dav.K);
      $$0.a(dav.a, czc.tq, dav.L);
      $$0.a(dav.L, czc.mi, dav.M);
      $$0.a(dav.d, czc.oz, dav.O);
      $$0.a(dav.O, czc.mi, dav.P);
   }

   public static class a {
      private final List<ddl> a = new ArrayList<>();
      private final List<dat.b<das>> b = new ArrayList<>();
      private final List<dat.b<cyu>> c = new ArrayList<>();
      private final cuh d;

      public a(cuh $$0) {
         this.d = $$0;
      }

      private static void b(cyu $$0) {
         if (!($$0 instanceof czr)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mf.g.b($$0));
         }
      }

      public void a(cyu $$0, cyu $$1, cyu $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new dat.b<>($$0.e(), ddl.a($$1), $$2.e()));
         }
      }

      public void a(cyu $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(ddl.a($$0));
         }
      }

      public void a(je<das> $$0, cyu $$1, je<das> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new dat.b<>($$0, ddl.a($$1), $$2));
         }
      }

      public void a(cyu $$0, je<das> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(dav.a, $$0, dav.b);
            this.a(dav.d, $$0, $$1);
         }
      }

      public dat a() {
         return new dat(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(je<T> a, ddl b, je<T> c) {
   }
}
