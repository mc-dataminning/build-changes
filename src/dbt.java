import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbt {
   public static final int a = 20;
   public static final dbt b = new dbt(List.of(), List.of(), List.of());
   private final List<del> c;
   private final List<dbt.b<dbs>> d;
   private final List<dbt.b<czu>> e;

   dbt(List<del> $$0, List<dbt.b<dbs>> $$1, List<dbt.b<czu>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(czy $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(czy $$0) {
      for (del $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(czy $$0) {
      for (dbt.b<czu> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(czy $$0) {
      for (dbt.b<dbs> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jf<dbs> $$0) {
      for (dbt.b<dbs> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(czy $$0, czy $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(czy $$0, czy $$1) {
      for (dbt.b<czu> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(czy $$0, czy $$1) {
      Optional<jf<dbs>> $$2 = $$0.a(kk.R, dbu.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (dbt.b<dbs> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public czy d(czy $$0, czy $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jf<dbs>> $$2 = $$1.a(kk.R, dbu.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (dbt.b<czu> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return dbu.a($$3.c.a(), $$2.get());
               }
            }

            for (dbt.b<dbs> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return dbu.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static dbt a(cvh $$0) {
      dbt.a $$1 = new dbt.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(dbt.a $$0) {
      $$0.a(dac.tt);
      $$0.a(dac.wz);
      $$0.a(dac.wC);
      $$0.a(dac.tt, dac.qi, dac.wz);
      $$0.a(dac.wz, dac.wy, dac.wC);
      $$0.a(dbv.a, dac.sg, dbv.c);
      $$0.a(dbv.a, dac.ml, dbv.b);
      $$0.a(dbv.a, dac.tr, dbv.d);
      $$0.a(dac.vk, dbv.Q);
      $$0.a(dac.ms, dbv.S);
      $$0.a(dac.b, dbv.T);
      $$0.a(dac.cT, dbv.R);
      $$0.a(dbv.d, dac.vu, dbv.e);
      $$0.a(dbv.e, dac.ml, dbv.f);
      $$0.a(dbv.e, dac.tv, dbv.g);
      $$0.a(dbv.f, dac.tv, dbv.h);
      $$0.a(dbv.g, dac.ml, dbv.h);
      $$0.a(dac.tx, dbv.l);
      $$0.a(dbv.l, dac.ml, dbv.m);
      $$0.a(dac.vO, dbv.i);
      $$0.a(dbv.i, dac.ml, dbv.j);
      $$0.a(dbv.i, dac.sg, dbv.k);
      $$0.a(dbv.i, dac.tv, dbv.q);
      $$0.a(dbv.j, dac.tv, dbv.r);
      $$0.a(dbv.q, dac.ml, dbv.r);
      $$0.a(dbv.q, dac.sg, dbv.s);
      $$0.a(dbv.d, dac.pc, dbv.t);
      $$0.a(dbv.t, dac.ml, dbv.u);
      $$0.a(dbv.t, dac.sg, dbv.v);
      $$0.a(dbv.n, dac.tv, dbv.q);
      $$0.a(dbv.o, dac.tv, dbv.r);
      $$0.a(dac.sI, dbv.n);
      $$0.a(dbv.n, dac.ml, dbv.o);
      $$0.a(dbv.n, dac.sg, dbv.p);
      $$0.a(dbv.d, dac.sk, dbv.w);
      $$0.a(dbv.w, dac.ml, dbv.x);
      $$0.a(dac.tB, dbv.y);
      $$0.a(dbv.y, dac.sg, dbv.z);
      $$0.a(dbv.y, dac.tv, dbv.A);
      $$0.a(dbv.z, dac.tv, dbv.B);
      $$0.a(dbv.A, dac.sg, dbv.B);
      $$0.a(dbv.C, dac.tv, dbv.A);
      $$0.a(dbv.D, dac.tv, dbv.A);
      $$0.a(dbv.E, dac.tv, dbv.B);
      $$0.a(dac.tu, dbv.C);
      $$0.a(dbv.C, dac.ml, dbv.D);
      $$0.a(dbv.C, dac.sg, dbv.E);
      $$0.a(dac.tp, dbv.F);
      $$0.a(dbv.F, dac.ml, dbv.G);
      $$0.a(dbv.F, dac.sg, dbv.H);
      $$0.a(dac.tw, dbv.I);
      $$0.a(dbv.I, dac.ml, dbv.J);
      $$0.a(dbv.I, dac.sg, dbv.K);
      $$0.a(dbv.a, dac.tv, dbv.L);
      $$0.a(dbv.L, dac.ml, dbv.M);
      $$0.a(dbv.d, dac.oC, dbv.O);
      $$0.a(dbv.O, dac.ml, dbv.P);
   }

   public static class a {
      private final List<del> a = new ArrayList<>();
      private final List<dbt.b<dbs>> b = new ArrayList<>();
      private final List<dbt.b<czu>> c = new ArrayList<>();
      private final cvh d;

      public a(cvh $$0) {
         this.d = $$0;
      }

      private static void b(czu $$0) {
         if (!($$0 instanceof dar)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mg.g.b($$0));
         }
      }

      public void a(czu $$0, czu $$1, czu $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new dbt.b<>($$0.e(), del.a($$1), $$2.e()));
         }
      }

      public void a(czu $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(del.a($$0));
         }
      }

      public void a(jf<dbs> $$0, czu $$1, jf<dbs> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new dbt.b<>($$0, del.a($$1), $$2));
         }
      }

      public void a(czu $$0, jf<dbs> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(dbv.a, $$0, dbv.b);
            this.a(dbv.d, $$0, $$1);
         }
      }

      public dbt a() {
         return new dbt(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jf<T> a, del b, jf<T> c) {
   }
}
