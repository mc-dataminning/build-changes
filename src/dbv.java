import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dbv {
   public static final int a = 20;
   public static final dbv b = new dbv(List.of(), List.of(), List.of());
   private final List<den> c;
   private final List<dbv.b<dbu>> d;
   private final List<dbv.b<czw>> e;

   dbv(List<den> $$0, List<dbv.b<dbu>> $$1, List<dbv.b<czw>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(daa $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(daa $$0) {
      for (den $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(daa $$0) {
      for (dbv.b<czw> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(daa $$0) {
      for (dbv.b<dbu> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jg<dbu> $$0) {
      for (dbv.b<dbu> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(daa $$0, daa $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(daa $$0, daa $$1) {
      for (dbv.b<czw> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(daa $$0, daa $$1) {
      Optional<jg<dbu>> $$2 = $$0.a(kl.R, dbw.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (dbv.b<dbu> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public daa d(daa $$0, daa $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jg<dbu>> $$2 = $$1.a(kl.R, dbw.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (dbv.b<czw> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return dbw.a($$3.c.a(), $$2.get());
               }
            }

            for (dbv.b<dbu> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return dbw.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static dbv a(cvj $$0) {
      dbv.a $$1 = new dbv.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(dbv.a $$0) {
      $$0.a(dae.tt);
      $$0.a(dae.wz);
      $$0.a(dae.wC);
      $$0.a(dae.tt, dae.qi, dae.wz);
      $$0.a(dae.wz, dae.wy, dae.wC);
      $$0.a(dbx.a, dae.sg, dbx.c);
      $$0.a(dbx.a, dae.ml, dbx.b);
      $$0.a(dbx.a, dae.tr, dbx.d);
      $$0.a(dae.vk, dbx.Q);
      $$0.a(dae.ms, dbx.S);
      $$0.a(dae.b, dbx.T);
      $$0.a(dae.cT, dbx.R);
      $$0.a(dbx.d, dae.vu, dbx.e);
      $$0.a(dbx.e, dae.ml, dbx.f);
      $$0.a(dbx.e, dae.tv, dbx.g);
      $$0.a(dbx.f, dae.tv, dbx.h);
      $$0.a(dbx.g, dae.ml, dbx.h);
      $$0.a(dae.tx, dbx.l);
      $$0.a(dbx.l, dae.ml, dbx.m);
      $$0.a(dae.vO, dbx.i);
      $$0.a(dbx.i, dae.ml, dbx.j);
      $$0.a(dbx.i, dae.sg, dbx.k);
      $$0.a(dbx.i, dae.tv, dbx.q);
      $$0.a(dbx.j, dae.tv, dbx.r);
      $$0.a(dbx.q, dae.ml, dbx.r);
      $$0.a(dbx.q, dae.sg, dbx.s);
      $$0.a(dbx.d, dae.pc, dbx.t);
      $$0.a(dbx.t, dae.ml, dbx.u);
      $$0.a(dbx.t, dae.sg, dbx.v);
      $$0.a(dbx.n, dae.tv, dbx.q);
      $$0.a(dbx.o, dae.tv, dbx.r);
      $$0.a(dae.sI, dbx.n);
      $$0.a(dbx.n, dae.ml, dbx.o);
      $$0.a(dbx.n, dae.sg, dbx.p);
      $$0.a(dbx.d, dae.sk, dbx.w);
      $$0.a(dbx.w, dae.ml, dbx.x);
      $$0.a(dae.tB, dbx.y);
      $$0.a(dbx.y, dae.sg, dbx.z);
      $$0.a(dbx.y, dae.tv, dbx.A);
      $$0.a(dbx.z, dae.tv, dbx.B);
      $$0.a(dbx.A, dae.sg, dbx.B);
      $$0.a(dbx.C, dae.tv, dbx.A);
      $$0.a(dbx.D, dae.tv, dbx.A);
      $$0.a(dbx.E, dae.tv, dbx.B);
      $$0.a(dae.tu, dbx.C);
      $$0.a(dbx.C, dae.ml, dbx.D);
      $$0.a(dbx.C, dae.sg, dbx.E);
      $$0.a(dae.tp, dbx.F);
      $$0.a(dbx.F, dae.ml, dbx.G);
      $$0.a(dbx.F, dae.sg, dbx.H);
      $$0.a(dae.tw, dbx.I);
      $$0.a(dbx.I, dae.ml, dbx.J);
      $$0.a(dbx.I, dae.sg, dbx.K);
      $$0.a(dbx.a, dae.tv, dbx.L);
      $$0.a(dbx.L, dae.ml, dbx.M);
      $$0.a(dbx.d, dae.oC, dbx.O);
      $$0.a(dbx.O, dae.ml, dbx.P);
   }

   public static class a {
      private final List<den> a = new ArrayList<>();
      private final List<dbv.b<dbu>> b = new ArrayList<>();
      private final List<dbv.b<czw>> c = new ArrayList<>();
      private final cvj d;

      public a(cvj $$0) {
         this.d = $$0;
      }

      private static void b(czw $$0) {
         if (!($$0 instanceof dat)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mh.g.b($$0));
         }
      }

      public void a(czw $$0, czw $$1, czw $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new dbv.b<>($$0.e(), den.a($$1), $$2.e()));
         }
      }

      public void a(czw $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(den.a($$0));
         }
      }

      public void a(jg<dbu> $$0, czw $$1, jg<dbu> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new dbv.b<>($$0, den.a($$1), $$2));
         }
      }

      public void a(czw $$0, jg<dbu> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(dbx.a, $$0, dbx.b);
            this.a(dbx.d, $$0, $$1);
         }
      }

      public dbv a() {
         return new dbv(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jg<T> a, den b, jg<T> c) {
   }
}
