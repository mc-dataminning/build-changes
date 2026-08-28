import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbf {
   public static final int a = 20;
   public static final dbf b = new dbf(List.of(), List.of(), List.of());
   private final List<ddx> c;
   private final List<dbf.b<dbe>> d;
   private final List<dbf.b<czg>> e;

   dbf(List<ddx> $$0, List<dbf.b<dbe>> $$1, List<dbf.b<czg>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(czk $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(czk $$0) {
      for (ddx $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(czk $$0) {
      for (dbf.b<czg> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(czk $$0) {
      for (dbf.b<dbe> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jf<dbe> $$0) {
      for (dbf.b<dbe> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(czk $$0, czk $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(czk $$0, czk $$1) {
      for (dbf.b<czg> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(czk $$0, czk $$1) {
      Optional<jf<dbe>> $$2 = $$0.a(kk.R, dbg.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (dbf.b<dbe> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public czk d(czk $$0, czk $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jf<dbe>> $$2 = $$1.a(kk.R, dbg.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (dbf.b<czg> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return dbg.a($$3.c.a(), $$2.get());
               }
            }

            for (dbf.b<dbe> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return dbg.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static dbf a(cut $$0) {
      dbf.a $$1 = new dbf.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(dbf.a $$0) {
      $$0.a(czo.tt);
      $$0.a(czo.wz);
      $$0.a(czo.wC);
      $$0.a(czo.tt, czo.qi, czo.wz);
      $$0.a(czo.wz, czo.wy, czo.wC);
      $$0.a(dbh.a, czo.sg, dbh.c);
      $$0.a(dbh.a, czo.ml, dbh.b);
      $$0.a(dbh.a, czo.tr, dbh.d);
      $$0.a(czo.vk, dbh.Q);
      $$0.a(czo.ms, dbh.S);
      $$0.a(czo.b, dbh.T);
      $$0.a(czo.cT, dbh.R);
      $$0.a(dbh.d, czo.vu, dbh.e);
      $$0.a(dbh.e, czo.ml, dbh.f);
      $$0.a(dbh.e, czo.tv, dbh.g);
      $$0.a(dbh.f, czo.tv, dbh.h);
      $$0.a(dbh.g, czo.ml, dbh.h);
      $$0.a(czo.tx, dbh.l);
      $$0.a(dbh.l, czo.ml, dbh.m);
      $$0.a(czo.vO, dbh.i);
      $$0.a(dbh.i, czo.ml, dbh.j);
      $$0.a(dbh.i, czo.sg, dbh.k);
      $$0.a(dbh.i, czo.tv, dbh.q);
      $$0.a(dbh.j, czo.tv, dbh.r);
      $$0.a(dbh.q, czo.ml, dbh.r);
      $$0.a(dbh.q, czo.sg, dbh.s);
      $$0.a(dbh.d, czo.pc, dbh.t);
      $$0.a(dbh.t, czo.ml, dbh.u);
      $$0.a(dbh.t, czo.sg, dbh.v);
      $$0.a(dbh.n, czo.tv, dbh.q);
      $$0.a(dbh.o, czo.tv, dbh.r);
      $$0.a(czo.sI, dbh.n);
      $$0.a(dbh.n, czo.ml, dbh.o);
      $$0.a(dbh.n, czo.sg, dbh.p);
      $$0.a(dbh.d, czo.sk, dbh.w);
      $$0.a(dbh.w, czo.ml, dbh.x);
      $$0.a(czo.tB, dbh.y);
      $$0.a(dbh.y, czo.sg, dbh.z);
      $$0.a(dbh.y, czo.tv, dbh.A);
      $$0.a(dbh.z, czo.tv, dbh.B);
      $$0.a(dbh.A, czo.sg, dbh.B);
      $$0.a(dbh.C, czo.tv, dbh.A);
      $$0.a(dbh.D, czo.tv, dbh.A);
      $$0.a(dbh.E, czo.tv, dbh.B);
      $$0.a(czo.tu, dbh.C);
      $$0.a(dbh.C, czo.ml, dbh.D);
      $$0.a(dbh.C, czo.sg, dbh.E);
      $$0.a(czo.tp, dbh.F);
      $$0.a(dbh.F, czo.ml, dbh.G);
      $$0.a(dbh.F, czo.sg, dbh.H);
      $$0.a(czo.tw, dbh.I);
      $$0.a(dbh.I, czo.ml, dbh.J);
      $$0.a(dbh.I, czo.sg, dbh.K);
      $$0.a(dbh.a, czo.tv, dbh.L);
      $$0.a(dbh.L, czo.ml, dbh.M);
      $$0.a(dbh.d, czo.oC, dbh.O);
      $$0.a(dbh.O, czo.ml, dbh.P);
   }

   public static class a {
      private final List<ddx> a = new ArrayList<>();
      private final List<dbf.b<dbe>> b = new ArrayList<>();
      private final List<dbf.b<czg>> c = new ArrayList<>();
      private final cut d;

      public a(cut $$0) {
         this.d = $$0;
      }

      private static void b(czg $$0) {
         if (!($$0 instanceof dad)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mg.g.b($$0));
         }
      }

      public void a(czg $$0, czg $$1, czg $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new dbf.b<>($$0.e(), ddx.a($$1), $$2.e()));
         }
      }

      public void a(czg $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(ddx.a($$0));
         }
      }

      public void a(jf<dbe> $$0, czg $$1, jf<dbe> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new dbf.b<>($$0, ddx.a($$1), $$2));
         }
      }

      public void a(czg $$0, jf<dbe> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(dbh.a, $$0, dbh.b);
            this.a(dbh.d, $$0, $$1);
         }
      }

      public dbf a() {
         return new dbf(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jf<T> a, ddx b, jf<T> c) {
   }
}
