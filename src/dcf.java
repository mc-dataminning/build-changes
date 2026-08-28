import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class dcf {
   public static final int a = 20;
   public static final dcf b = new dcf(List.of(), List.of(), List.of());
   private final List<dex> c;
   private final List<dcf.b<dce>> d;
   private final List<dcf.b<dag>> e;

   dcf(List<dex> $$0, List<dcf.b<dce>> $$1, List<dcf.b<dag>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(dak $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(dak $$0) {
      for (dex $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(dak $$0) {
      for (dcf.b<dag> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(dak $$0) {
      for (dcf.b<dce> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jg<dce> $$0) {
      for (dcf.b<dce> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(dak $$0, dak $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(dak $$0, dak $$1) {
      for (dcf.b<dag> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(dak $$0, dak $$1) {
      Optional<jg<dce>> $$2 = $$0.a(kl.R, dcg.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (dcf.b<dce> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dak d(dak $$0, dak $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jg<dce>> $$2 = $$1.a(kl.R, dcg.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (dcf.b<dag> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return dcg.a($$3.c.a(), $$2.get());
               }
            }

            for (dcf.b<dce> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return dcg.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static dcf a(cvs $$0) {
      dcf.a $$1 = new dcf.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(dcf.a $$0) {
      $$0.a(dao.tt);
      $$0.a(dao.wz);
      $$0.a(dao.wC);
      $$0.a(dao.tt, dao.qi, dao.wz);
      $$0.a(dao.wz, dao.wy, dao.wC);
      $$0.a(dch.a, dao.sg, dch.c);
      $$0.a(dch.a, dao.ml, dch.b);
      $$0.a(dch.a, dao.tr, dch.d);
      $$0.a(dao.vk, dch.Q);
      $$0.a(dao.ms, dch.S);
      $$0.a(dao.b, dch.T);
      $$0.a(dao.cT, dch.R);
      $$0.a(dch.d, dao.vu, dch.e);
      $$0.a(dch.e, dao.ml, dch.f);
      $$0.a(dch.e, dao.tv, dch.g);
      $$0.a(dch.f, dao.tv, dch.h);
      $$0.a(dch.g, dao.ml, dch.h);
      $$0.a(dao.tx, dch.l);
      $$0.a(dch.l, dao.ml, dch.m);
      $$0.a(dao.vO, dch.i);
      $$0.a(dch.i, dao.ml, dch.j);
      $$0.a(dch.i, dao.sg, dch.k);
      $$0.a(dch.i, dao.tv, dch.q);
      $$0.a(dch.j, dao.tv, dch.r);
      $$0.a(dch.q, dao.ml, dch.r);
      $$0.a(dch.q, dao.sg, dch.s);
      $$0.a(dch.d, dao.pc, dch.t);
      $$0.a(dch.t, dao.ml, dch.u);
      $$0.a(dch.t, dao.sg, dch.v);
      $$0.a(dch.n, dao.tv, dch.q);
      $$0.a(dch.o, dao.tv, dch.r);
      $$0.a(dao.sI, dch.n);
      $$0.a(dch.n, dao.ml, dch.o);
      $$0.a(dch.n, dao.sg, dch.p);
      $$0.a(dch.d, dao.sk, dch.w);
      $$0.a(dch.w, dao.ml, dch.x);
      $$0.a(dao.tB, dch.y);
      $$0.a(dch.y, dao.sg, dch.z);
      $$0.a(dch.y, dao.tv, dch.A);
      $$0.a(dch.z, dao.tv, dch.B);
      $$0.a(dch.A, dao.sg, dch.B);
      $$0.a(dch.C, dao.tv, dch.A);
      $$0.a(dch.D, dao.tv, dch.A);
      $$0.a(dch.E, dao.tv, dch.B);
      $$0.a(dao.tu, dch.C);
      $$0.a(dch.C, dao.ml, dch.D);
      $$0.a(dch.C, dao.sg, dch.E);
      $$0.a(dao.tp, dch.F);
      $$0.a(dch.F, dao.ml, dch.G);
      $$0.a(dch.F, dao.sg, dch.H);
      $$0.a(dao.tw, dch.I);
      $$0.a(dch.I, dao.ml, dch.J);
      $$0.a(dch.I, dao.sg, dch.K);
      $$0.a(dch.a, dao.tv, dch.L);
      $$0.a(dch.L, dao.ml, dch.M);
      $$0.a(dch.d, dao.oC, dch.O);
      $$0.a(dch.O, dao.ml, dch.P);
   }

   public static class a {
      private final List<dex> a = new ArrayList<>();
      private final List<dcf.b<dce>> b = new ArrayList<>();
      private final List<dcf.b<dag>> c = new ArrayList<>();
      private final cvs d;

      public a(cvs $$0) {
         this.d = $$0;
      }

      private static void b(dag $$0) {
         if (!($$0 instanceof dbd)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mh.g.b($$0));
         }
      }

      public void a(dag $$0, dag $$1, dag $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new dcf.b<>($$0.e(), dex.a($$1), $$2.e()));
         }
      }

      public void a(dag $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dex.a($$0));
         }
      }

      public void a(jg<dce> $$0, dag $$1, jg<dce> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new dcf.b<>($$0, dex.a($$1), $$2));
         }
      }

      public void a(dag $$0, jg<dce> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(dch.a, $$0, dch.b);
            this.a(dch.d, $$0, $$1);
         }
      }

      public dcf a() {
         return new dcf(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jg<T> a, dex b, jg<T> c) {
   }
}
