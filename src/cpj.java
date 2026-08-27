import com.google.common.collect.ImmutableList;
import java.util.List;

public class cpj extends cod {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cop p;
   final cow q = cow.a();
   private List<iw<dnc>> r = List.of();
   Runnable s = () -> {
   };
   private final ix<dnc> t;
   final cpz u;
   final cpz v;
   private final cpz w;
   private final cpz x;
   long y;
   private final bpf z = new bpv(3) {
      @Override
      public void e() {
         super.e();
         cpj.this.a(this);
         cpj.this.s.run();
      }
   };
   private final bpf A = new bpv(1) {
      @Override
      public void e() {
         super.e();
         cpj.this.s.run();
      }
   };

   public cpj(int $$0, clg $$1) {
      this($$0, $$1, cop.a);
   }

   public cpj(int $$0, clg $$1, final cop $$2) {
      super(cpl.s, $$0);
      this.p = $$2;
      this.u = this.a(new cpz(this.z, 0, 13, 26) {
         @Override
         public boolean a(csz $$0) {
            return $$0.f() instanceof cqu;
         }
      });
      this.v = this.a(new cpz(this.z, 1, 33, 26) {
         @Override
         public boolean a(csz $$0) {
            return $$0.f() instanceof crt;
         }
      });
      this.w = this.a(new cpz(this.z, 2, 23, 45) {
         @Override
         public boolean a(csz $$0) {
            return $$0.f() instanceof cqv;
         }
      });
      this.x = this.a(new cpz(this.A, 0, 143, 57) {
         @Override
         public boolean a(csz $$0) {
            return false;
         }

         @Override
         public void a(clh $$0, csz $$1) {
            cpj.this.u.a(1);
            cpj.this.v.a(1);
            if (!cpj.this.u.h() || !cpj.this.v.h()) {
               cpj.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cpj.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avc.Af, avd.e, 1.0F, 1.0F);
                  cpj.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpz($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpz($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dP().b(le.d);
   }

   @Override
   public boolean a(clh $$0) {
      return a(this.p, $$0, ddg.nT);
   }

   @Override
   public boolean b(clh $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<iw<dnc>> c(csz $$0) {
      if ($$0.d()) {
         return this.t.a(avp.a).<List<iw<dnc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.f() instanceof cqv $$1 ? this.t.a($$1.b()).<List<iw<dnc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bpf $$0) {
      csz $$1 = this.u.g();
      csz $$2 = this.v.g();
      csz $$3 = this.w.g();
      if (!$$1.d() && !$$2.d()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<iw<dnc>> $$6 = this.r;
         this.r = this.c($$3);
         iw<dnc> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            iw<dnc> $$9 = $$6.get($$4);
            int $$10 = this.r.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.q.a($$10);
            } else {
               $$7 = null;
               this.q.a(-1);
            }
         }

         if ($$7 != null) {
            dnd $$13 = $$1.a(ka.U, dnd.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(csz.i);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(csz.i);
         }

         this.d();
      } else {
         this.x.f(csz.i);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<iw<dnc>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csz $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == this.x.e) {
            if (!this.a($$4, 4, 40, true)) {
               return csz.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.e && $$1 != this.u.e && $$1 != this.w.e) {
            if ($$4.f() instanceof cqu) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return csz.i;
               }
            } else if ($$4.f() instanceof crt) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return csz.i;
               }
            } else if ($$4.f() instanceof cqv) {
               if (!this.a($$4, this.w.e, this.w.e + 1, false)) {
                  return csz.i;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return csz.i;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return csz.i;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return csz.i;
         }

         if ($$4.d()) {
            $$3.e(csz.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csz.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(clh $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(iw<dnc> $$0) {
      csz $$1 = this.u.g();
      csz $$2 = this.v.g();
      csz $$3 = csz.i;
      if (!$$1.d() && !$$2.d()) {
         $$3 = $$1.c(1);
         crs $$4 = ((crt)$$2.f()).c();
         $$3.a(ka.U, dnd.a, $$2x -> new dnd.a().a($$2x).a($$0, $$4).a());
      }

      if (!csz.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cpz n() {
      return this.u;
   }

   public cpz o() {
      return this.v;
   }

   public cpz p() {
      return this.w;
   }

   public cpz q() {
      return this.x;
   }
}
