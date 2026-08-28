import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dan {
   public static final int a = 20;
   public static final dan b = new dan(List.of(), List.of(), List.of());
   private final List<ddf> c;
   private final List<dan.b<dam>> d;
   private final List<dan.b<cyo>> e;

   dan(List<ddf> $$0, List<dan.b<dam>> $$1, List<dan.b<cyo>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cys $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cys $$0) {
      for (ddf $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cys $$0) {
      for (dan.b<cyo> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cys $$0) {
      for (dan.b<dam> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(je<dam> $$0) {
      for (dan.b<dam> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cys $$0, cys $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cys $$0, cys $$1) {
      for (dan.b<cyo> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cys $$0, cys $$1) {
      Optional<je<dam>> $$2 = $$0.a(kj.R, dao.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (dan.b<dam> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cys d(cys $$0, cys $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<je<dam>> $$2 = $$1.a(kj.R, dao.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (dan.b<cyo> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return dao.a($$3.c.a(), $$2.get());
               }
            }

            for (dan.b<dam> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return dao.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static dan a(cub $$0) {
      dan.a $$1 = new dan.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(dan.a $$0) {
      $$0.a(cyw.tm);
      $$0.a(cyw.ws);
      $$0.a(cyw.wv);
      $$0.a(cyw.tm, cyw.qd, cyw.ws);
      $$0.a(cyw.ws, cyw.wr, cyw.wv);
      $$0.a(dap.a, cyw.rZ, dap.c);
      $$0.a(dap.a, cyw.mg, dap.b);
      $$0.a(dap.a, cyw.tk, dap.d);
      $$0.a(cyw.vd, dap.Q);
      $$0.a(cyw.mn, dap.S);
      $$0.a(cyw.b, dap.T);
      $$0.a(cyw.cT, dap.R);
      $$0.a(dap.d, cyw.vn, dap.e);
      $$0.a(dap.e, cyw.mg, dap.f);
      $$0.a(dap.e, cyw.to, dap.g);
      $$0.a(dap.f, cyw.to, dap.h);
      $$0.a(dap.g, cyw.mg, dap.h);
      $$0.a(cyw.tq, dap.l);
      $$0.a(dap.l, cyw.mg, dap.m);
      $$0.a(cyw.vH, dap.i);
      $$0.a(dap.i, cyw.mg, dap.j);
      $$0.a(dap.i, cyw.rZ, dap.k);
      $$0.a(dap.i, cyw.to, dap.q);
      $$0.a(dap.j, cyw.to, dap.r);
      $$0.a(dap.q, cyw.mg, dap.r);
      $$0.a(dap.q, cyw.rZ, dap.s);
      $$0.a(dap.d, cyw.oX, dap.t);
      $$0.a(dap.t, cyw.mg, dap.u);
      $$0.a(dap.t, cyw.rZ, dap.v);
      $$0.a(dap.n, cyw.to, dap.q);
      $$0.a(dap.o, cyw.to, dap.r);
      $$0.a(cyw.sB, dap.n);
      $$0.a(dap.n, cyw.mg, dap.o);
      $$0.a(dap.n, cyw.rZ, dap.p);
      $$0.a(dap.d, cyw.sd, dap.w);
      $$0.a(dap.w, cyw.mg, dap.x);
      $$0.a(cyw.tu, dap.y);
      $$0.a(dap.y, cyw.rZ, dap.z);
      $$0.a(dap.y, cyw.to, dap.A);
      $$0.a(dap.z, cyw.to, dap.B);
      $$0.a(dap.A, cyw.rZ, dap.B);
      $$0.a(dap.C, cyw.to, dap.A);
      $$0.a(dap.D, cyw.to, dap.A);
      $$0.a(dap.E, cyw.to, dap.B);
      $$0.a(cyw.tn, dap.C);
      $$0.a(dap.C, cyw.mg, dap.D);
      $$0.a(dap.C, cyw.rZ, dap.E);
      $$0.a(cyw.ti, dap.F);
      $$0.a(dap.F, cyw.mg, dap.G);
      $$0.a(dap.F, cyw.rZ, dap.H);
      $$0.a(cyw.tp, dap.I);
      $$0.a(dap.I, cyw.mg, dap.J);
      $$0.a(dap.I, cyw.rZ, dap.K);
      $$0.a(dap.a, cyw.to, dap.L);
      $$0.a(dap.L, cyw.mg, dap.M);
      $$0.a(dap.d, cyw.ox, dap.O);
      $$0.a(dap.O, cyw.mg, dap.P);
   }

   public static class a {
      private final List<ddf> a = new ArrayList<>();
      private final List<dan.b<dam>> b = new ArrayList<>();
      private final List<dan.b<cyo>> c = new ArrayList<>();
      private final cub d;

      public a(cub $$0) {
         this.d = $$0;
      }

      private static void b(cyo $$0) {
         if (!($$0 instanceof czl)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mf.g.b($$0));
         }
      }

      public void a(cyo $$0, cyo $$1, cyo $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new dan.b<>($$0.e(), ddf.a($$1), $$2.e()));
         }
      }

      public void a(cyo $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(ddf.a($$0));
         }
      }

      public void a(je<dam> $$0, cyo $$1, je<dam> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new dan.b<>($$0, ddf.a($$1), $$2));
         }
      }

      public void a(cyo $$0, je<dam> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(dap.a, $$0, dap.b);
            this.a(dap.d, $$0, $$1);
         }
      }

      public dan a() {
         return new dan(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(je<T> a, ddf b, je<T> c) {
   }
}
