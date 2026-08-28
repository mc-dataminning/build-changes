import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class czd {
   public static final int a = 20;
   public static final czd b = new czd(List.of(), List.of(), List.of());
   private final List<dbr> c;
   private final List<czd.b<czc>> d;
   private final List<czd.b<cxd>> e;

   czd(List<dbr> $$0, List<czd.b<czc>> $$1, List<czd.b<cxd>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cxh $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cxh $$0) {
      for (dbr $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cxh $$0) {
      for (czd.b<cxd> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxh $$0) {
      for (czd.b<czc> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jr<czc> $$0) {
      for (czd.b<czc> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cxh $$0, cxh $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cxh $$0, cxh $$1) {
      for (czd.b<cxd> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cxh $$0, cxh $$1) {
      Optional<jr<czc>> $$2 = $$0.a(kv.R, cze.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (czd.b<czc> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cxh d(cxh $$0, cxh $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jr<czc>> $$2 = $$1.a(kv.R, cze.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (czd.b<cxd> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cze.a($$3.c.a(), $$2.get());
               }
            }

            for (czd.b<czc> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cze.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static czd a(csn $$0) {
      czd.a $$1 = new czd.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(czd.a $$0) {
      $$0.a(cxl.tk);
      $$0.a(cxl.wq);
      $$0.a(cxl.wt);
      $$0.a(cxl.tk, cxl.qb, cxl.wq);
      $$0.a(cxl.wq, cxl.wp, cxl.wt);
      $$0.a(czf.a, cxl.rX, czf.c);
      $$0.a(czf.a, cxl.mg, czf.b);
      $$0.a(czf.a, cxl.ti, czf.d);
      $$0.a(cxl.vb, czf.Q);
      $$0.a(cxl.mn, czf.S);
      $$0.a(cxl.b, czf.T);
      $$0.a(cxl.cT, czf.R);
      $$0.a(czf.d, cxl.vl, czf.e);
      $$0.a(czf.e, cxl.mg, czf.f);
      $$0.a(czf.e, cxl.tm, czf.g);
      $$0.a(czf.f, cxl.tm, czf.h);
      $$0.a(czf.g, cxl.mg, czf.h);
      $$0.a(cxl.to, czf.l);
      $$0.a(czf.l, cxl.mg, czf.m);
      $$0.a(cxl.vF, czf.i);
      $$0.a(czf.i, cxl.mg, czf.j);
      $$0.a(czf.i, cxl.rX, czf.k);
      $$0.a(czf.i, cxl.tm, czf.q);
      $$0.a(czf.j, cxl.tm, czf.r);
      $$0.a(czf.q, cxl.mg, czf.r);
      $$0.a(czf.q, cxl.rX, czf.s);
      $$0.a(czf.d, cxl.oV, czf.t);
      $$0.a(czf.t, cxl.mg, czf.u);
      $$0.a(czf.t, cxl.rX, czf.v);
      $$0.a(czf.n, cxl.tm, czf.q);
      $$0.a(czf.o, cxl.tm, czf.r);
      $$0.a(cxl.sz, czf.n);
      $$0.a(czf.n, cxl.mg, czf.o);
      $$0.a(czf.n, cxl.rX, czf.p);
      $$0.a(czf.d, cxl.sb, czf.w);
      $$0.a(czf.w, cxl.mg, czf.x);
      $$0.a(cxl.ts, czf.y);
      $$0.a(czf.y, cxl.rX, czf.z);
      $$0.a(czf.y, cxl.tm, czf.A);
      $$0.a(czf.z, cxl.tm, czf.B);
      $$0.a(czf.A, cxl.rX, czf.B);
      $$0.a(czf.C, cxl.tm, czf.A);
      $$0.a(czf.D, cxl.tm, czf.A);
      $$0.a(czf.E, cxl.tm, czf.B);
      $$0.a(cxl.tl, czf.C);
      $$0.a(czf.C, cxl.mg, czf.D);
      $$0.a(czf.C, cxl.rX, czf.E);
      $$0.a(cxl.tg, czf.F);
      $$0.a(czf.F, cxl.mg, czf.G);
      $$0.a(czf.F, cxl.rX, czf.H);
      $$0.a(cxl.tn, czf.I);
      $$0.a(czf.I, cxl.mg, czf.J);
      $$0.a(czf.I, cxl.rX, czf.K);
      $$0.a(czf.a, cxl.tm, czf.L);
      $$0.a(czf.L, cxl.mg, czf.M);
      $$0.a(czf.d, cxl.ox, czf.O);
      $$0.a(czf.O, cxl.mg, czf.P);
   }

   public static class a {
      private final List<dbr> a = new ArrayList<>();
      private final List<czd.b<czc>> b = new ArrayList<>();
      private final List<czd.b<cxd>> c = new ArrayList<>();
      private final csn d;

      public a(csn $$0) {
         this.d = $$0;
      }

      private static void b(cxd $$0) {
         if (!($$0 instanceof cya)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mb.g.b($$0));
         }
      }

      public void a(cxd $$0, cxd $$1, cxd $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new czd.b<>($$0.f(), dbr.a($$1), $$2.f()));
         }
      }

      public void a(cxd $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dbr.a($$0));
         }
      }

      public void a(jr<czc> $$0, cxd $$1, jr<czc> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new czd.b<>($$0, dbr.a($$1), $$2));
         }
      }

      public void a(cxd $$0, jr<czc> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(czf.a, $$0, czf.b);
            this.a(czf.d, $$0, $$1);
         }
      }

      public czd a() {
         return new czd(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jr<T> a, dbr b, jr<T> c) {
   }
}
