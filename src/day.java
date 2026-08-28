import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class day {
   public static final int a = 20;
   public static final day b = new day(List.of(), List.of(), List.of());
   private final List<ddq> c;
   private final List<day.b<dax>> d;
   private final List<day.b<cyz>> e;

   day(List<ddq> $$0, List<day.b<dax>> $$1, List<day.b<cyz>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(czd $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(czd $$0) {
      for (ddq $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(czd $$0) {
      for (day.b<cyz> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(czd $$0) {
      for (day.b<dax> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(je<dax> $$0) {
      for (day.b<dax> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(czd $$0, czd $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(czd $$0, czd $$1) {
      for (day.b<cyz> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(czd $$0, czd $$1) {
      Optional<je<dax>> $$2 = $$0.a(kj.R, daz.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (day.b<dax> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public czd d(czd $$0, czd $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<je<dax>> $$2 = $$1.a(kj.R, daz.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (day.b<cyz> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return daz.a($$3.c.a(), $$2.get());
               }
            }

            for (day.b<dax> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return daz.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static day a(cum $$0) {
      day.a $$1 = new day.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(day.a $$0) {
      $$0.a(czh.tt);
      $$0.a(czh.wz);
      $$0.a(czh.wC);
      $$0.a(czh.tt, czh.qi, czh.wz);
      $$0.a(czh.wz, czh.wy, czh.wC);
      $$0.a(dba.a, czh.sg, dba.c);
      $$0.a(dba.a, czh.ml, dba.b);
      $$0.a(dba.a, czh.tr, dba.d);
      $$0.a(czh.vk, dba.Q);
      $$0.a(czh.ms, dba.S);
      $$0.a(czh.b, dba.T);
      $$0.a(czh.cT, dba.R);
      $$0.a(dba.d, czh.vu, dba.e);
      $$0.a(dba.e, czh.ml, dba.f);
      $$0.a(dba.e, czh.tv, dba.g);
      $$0.a(dba.f, czh.tv, dba.h);
      $$0.a(dba.g, czh.ml, dba.h);
      $$0.a(czh.tx, dba.l);
      $$0.a(dba.l, czh.ml, dba.m);
      $$0.a(czh.vO, dba.i);
      $$0.a(dba.i, czh.ml, dba.j);
      $$0.a(dba.i, czh.sg, dba.k);
      $$0.a(dba.i, czh.tv, dba.q);
      $$0.a(dba.j, czh.tv, dba.r);
      $$0.a(dba.q, czh.ml, dba.r);
      $$0.a(dba.q, czh.sg, dba.s);
      $$0.a(dba.d, czh.pc, dba.t);
      $$0.a(dba.t, czh.ml, dba.u);
      $$0.a(dba.t, czh.sg, dba.v);
      $$0.a(dba.n, czh.tv, dba.q);
      $$0.a(dba.o, czh.tv, dba.r);
      $$0.a(czh.sI, dba.n);
      $$0.a(dba.n, czh.ml, dba.o);
      $$0.a(dba.n, czh.sg, dba.p);
      $$0.a(dba.d, czh.sk, dba.w);
      $$0.a(dba.w, czh.ml, dba.x);
      $$0.a(czh.tB, dba.y);
      $$0.a(dba.y, czh.sg, dba.z);
      $$0.a(dba.y, czh.tv, dba.A);
      $$0.a(dba.z, czh.tv, dba.B);
      $$0.a(dba.A, czh.sg, dba.B);
      $$0.a(dba.C, czh.tv, dba.A);
      $$0.a(dba.D, czh.tv, dba.A);
      $$0.a(dba.E, czh.tv, dba.B);
      $$0.a(czh.tu, dba.C);
      $$0.a(dba.C, czh.ml, dba.D);
      $$0.a(dba.C, czh.sg, dba.E);
      $$0.a(czh.tp, dba.F);
      $$0.a(dba.F, czh.ml, dba.G);
      $$0.a(dba.F, czh.sg, dba.H);
      $$0.a(czh.tw, dba.I);
      $$0.a(dba.I, czh.ml, dba.J);
      $$0.a(dba.I, czh.sg, dba.K);
      $$0.a(dba.a, czh.tv, dba.L);
      $$0.a(dba.L, czh.ml, dba.M);
      $$0.a(dba.d, czh.oC, dba.O);
      $$0.a(dba.O, czh.ml, dba.P);
   }

   public static class a {
      private final List<ddq> a = new ArrayList<>();
      private final List<day.b<dax>> b = new ArrayList<>();
      private final List<day.b<cyz>> c = new ArrayList<>();
      private final cum d;

      public a(cum $$0) {
         this.d = $$0;
      }

      private static void b(cyz $$0) {
         if (!($$0 instanceof czw)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mf.g.b($$0));
         }
      }

      public void a(cyz $$0, cyz $$1, cyz $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new day.b<>($$0.e(), ddq.a($$1), $$2.e()));
         }
      }

      public void a(cyz $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(ddq.a($$0));
         }
      }

      public void a(je<dax> $$0, cyz $$1, je<dax> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new day.b<>($$0, ddq.a($$1), $$2));
         }
      }

      public void a(cyz $$0, je<dax> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(dba.a, $$0, dba.b);
            this.a(dba.d, $$0, $$1);
         }
      }

      public day a() {
         return new day(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(je<T> a, ddq b, je<T> c) {
   }
}
