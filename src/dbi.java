import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbi {
   public static final int a = 20;
   public static final dbi b = new dbi(List.of(), List.of(), List.of());
   private final List<dea> c;
   private final List<dbi.b<dbh>> d;
   private final List<dbi.b<czj>> e;

   dbi(List<dea> $$0, List<dbi.b<dbh>> $$1, List<dbi.b<czj>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(czn $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(czn $$0) {
      for (dea $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(czn $$0) {
      for (dbi.b<czj> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(czn $$0) {
      for (dbi.b<dbh> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jf<dbh> $$0) {
      for (dbi.b<dbh> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(czn $$0, czn $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(czn $$0, czn $$1) {
      for (dbi.b<czj> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(czn $$0, czn $$1) {
      Optional<jf<dbh>> $$2 = $$0.a(kk.R, dbj.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (dbi.b<dbh> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public czn d(czn $$0, czn $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jf<dbh>> $$2 = $$1.a(kk.R, dbj.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (dbi.b<czj> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return dbj.a($$3.c.a(), $$2.get());
               }
            }

            for (dbi.b<dbh> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return dbj.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static dbi a(cuw $$0) {
      dbi.a $$1 = new dbi.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(dbi.a $$0) {
      $$0.a(czr.tt);
      $$0.a(czr.wz);
      $$0.a(czr.wC);
      $$0.a(czr.tt, czr.qi, czr.wz);
      $$0.a(czr.wz, czr.wy, czr.wC);
      $$0.a(dbk.a, czr.sg, dbk.c);
      $$0.a(dbk.a, czr.ml, dbk.b);
      $$0.a(dbk.a, czr.tr, dbk.d);
      $$0.a(czr.vk, dbk.Q);
      $$0.a(czr.ms, dbk.S);
      $$0.a(czr.b, dbk.T);
      $$0.a(czr.cT, dbk.R);
      $$0.a(dbk.d, czr.vu, dbk.e);
      $$0.a(dbk.e, czr.ml, dbk.f);
      $$0.a(dbk.e, czr.tv, dbk.g);
      $$0.a(dbk.f, czr.tv, dbk.h);
      $$0.a(dbk.g, czr.ml, dbk.h);
      $$0.a(czr.tx, dbk.l);
      $$0.a(dbk.l, czr.ml, dbk.m);
      $$0.a(czr.vO, dbk.i);
      $$0.a(dbk.i, czr.ml, dbk.j);
      $$0.a(dbk.i, czr.sg, dbk.k);
      $$0.a(dbk.i, czr.tv, dbk.q);
      $$0.a(dbk.j, czr.tv, dbk.r);
      $$0.a(dbk.q, czr.ml, dbk.r);
      $$0.a(dbk.q, czr.sg, dbk.s);
      $$0.a(dbk.d, czr.pc, dbk.t);
      $$0.a(dbk.t, czr.ml, dbk.u);
      $$0.a(dbk.t, czr.sg, dbk.v);
      $$0.a(dbk.n, czr.tv, dbk.q);
      $$0.a(dbk.o, czr.tv, dbk.r);
      $$0.a(czr.sI, dbk.n);
      $$0.a(dbk.n, czr.ml, dbk.o);
      $$0.a(dbk.n, czr.sg, dbk.p);
      $$0.a(dbk.d, czr.sk, dbk.w);
      $$0.a(dbk.w, czr.ml, dbk.x);
      $$0.a(czr.tB, dbk.y);
      $$0.a(dbk.y, czr.sg, dbk.z);
      $$0.a(dbk.y, czr.tv, dbk.A);
      $$0.a(dbk.z, czr.tv, dbk.B);
      $$0.a(dbk.A, czr.sg, dbk.B);
      $$0.a(dbk.C, czr.tv, dbk.A);
      $$0.a(dbk.D, czr.tv, dbk.A);
      $$0.a(dbk.E, czr.tv, dbk.B);
      $$0.a(czr.tu, dbk.C);
      $$0.a(dbk.C, czr.ml, dbk.D);
      $$0.a(dbk.C, czr.sg, dbk.E);
      $$0.a(czr.tp, dbk.F);
      $$0.a(dbk.F, czr.ml, dbk.G);
      $$0.a(dbk.F, czr.sg, dbk.H);
      $$0.a(czr.tw, dbk.I);
      $$0.a(dbk.I, czr.ml, dbk.J);
      $$0.a(dbk.I, czr.sg, dbk.K);
      $$0.a(dbk.a, czr.tv, dbk.L);
      $$0.a(dbk.L, czr.ml, dbk.M);
      $$0.a(dbk.d, czr.oC, dbk.O);
      $$0.a(dbk.O, czr.ml, dbk.P);
   }

   public static class a {
      private final List<dea> a = new ArrayList<>();
      private final List<dbi.b<dbh>> b = new ArrayList<>();
      private final List<dbi.b<czj>> c = new ArrayList<>();
      private final cuw d;

      public a(cuw $$0) {
         this.d = $$0;
      }

      private static void b(czj $$0) {
         if (!($$0 instanceof dag)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mg.g.b($$0));
         }
      }

      public void a(czj $$0, czj $$1, czj $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new dbi.b<>($$0.e(), dea.a($$1), $$2.e()));
         }
      }

      public void a(czj $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dea.a($$0));
         }
      }

      public void a(jf<dbh> $$0, czj $$1, jf<dbh> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new dbi.b<>($$0, dea.a($$1), $$2));
         }
      }

      public void a(czj $$0, jf<dbh> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(dbk.a, $$0, dbk.b);
            this.a(dbk.d, $$0, $$1);
         }
      }

      public dbi a() {
         return new dbi(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jf<T> a, dea b, jf<T> c) {
   }
}
