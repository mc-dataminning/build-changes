import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqn extends cph {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cpt p;
   final cqa q = cqa.a();
   private List<jj<dpf>> r = List.of();
   Runnable s = () -> {
   };
   private final jk<dpf> t;
   final crd u;
   final crd v;
   private final crd w;
   private final crd x;
   long y;
   private final bpz z = new bqp(3) {
      @Override
      public void e() {
         super.e();
         cqn.this.a(this);
         cqn.this.s.run();
      }
   };
   private final bpz A = new bqp(1) {
      @Override
      public void e() {
         super.e();
         cqn.this.s.run();
      }
   };

   public cqn(int $$0, cmj $$1) {
      this($$0, $$1, cpt.a);
   }

   public cqn(int $$0, cmj $$1, final cpt $$2) {
      super(cqp.s, $$0);
      this.p = $$2;
      this.u = this.a(new crd(this.z, 0, 13, 26) {
         @Override
         public boolean a(cuc $$0) {
            return $$0.g() instanceof cry;
         }
      });
      this.v = this.a(new crd(this.z, 1, 33, 26) {
         @Override
         public boolean a(cuc $$0) {
            return $$0.g() instanceof csw;
         }
      });
      this.w = this.a(new crd(this.z, 2, 23, 45) {
         @Override
         public boolean a(cuc $$0) {
            return $$0.g() instanceof crz;
         }
      });
      this.x = this.a(new crd(this.A, 0, 143, 57) {
         @Override
         public boolean a(cuc $$0) {
            return false;
         }

         @Override
         public void a(cmk $$0, cuc $$1) {
            cqn.this.u.a(1);
            cqn.this.v.a(1);
            if (!cqn.this.u.h() || !cqn.this.v.h()) {
               cqn.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqn.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avh.At, avi.e, 1.0F, 1.0F);
                  cqn.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crd($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dS().b(lr.d);
   }

   @Override
   public boolean b(cmk $$0) {
      return a(this.p, $$0, dfj.nT);
   }

   @Override
   public boolean a(cmk $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jj<dpf>> c(cuc $$0) {
      if ($$0.e()) {
         return this.t.a(avu.a).<List<jj<dpf>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof crz $$1 ? this.t.a($$1.b()).<List<jj<dpf>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bpz $$0) {
      cuc $$1 = this.u.g();
      cuc $$2 = this.v.g();
      cuc $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<jj<dpf>> $$6 = this.r;
         this.r = this.c($$3);
         jj<dpf> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            jj<dpf> $$9 = $$6.get($$4);
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
            dpg $$13 = $$1.a(kn.X, dpg.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cuc.l);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cuc.l);
         }

         this.d();
      } else {
         this.x.f(cuc.l);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<jj<dpf>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof cry) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return cuc.l;
               }
            } else if ($$4.g() instanceof csw) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return cuc.l;
               }
            } else if ($$4.g() instanceof crz) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cuc.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cuc.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(jj<dpf> $$0) {
      cuc $$1 = this.u.g();
      cuc $$2 = this.v.g();
      cuc $$3 = cuc.l;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         csv $$4 = ((csw)$$2.g()).c();
         $$3.a(kn.X, dpg.a, $$2x -> new dpg.a().a($$2x).a($$0, $$4).a());
      }

      if (!cuc.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public crd n() {
      return this.u;
   }

   public crd o() {
      return this.v;
   }

   public crd p() {
      return this.w;
   }

   public crd q() {
      return this.x;
   }
}
