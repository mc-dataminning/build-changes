import com.google.common.collect.ImmutableList;
import java.util.List;

public class cra extends cpu {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cqg p;
   final cqn q = cqn.a();
   private List<jm<dpx>> r = List.of();
   Runnable s = () -> {
   };
   private final jn<dpx> t;
   final crq u;
   final crq v;
   private final crq w;
   private final crq x;
   long y;
   private final bqk z = new bra(3) {
      @Override
      public void e() {
         super.e();
         cra.this.a(this);
         cra.this.s.run();
      }
   };
   private final bqk A = new bra(1) {
      @Override
      public void e() {
         super.e();
         cra.this.s.run();
      }
   };

   public cra(int $$0, cmw $$1) {
      this($$0, $$1, cqg.a);
   }

   public cra(int $$0, cmw $$1, final cqg $$2) {
      super(crc.s, $$0);
      this.p = $$2;
      this.u = this.a(new crq(this.z, 0, 13, 26) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.g() instanceof csl;
         }
      });
      this.v = this.a(new crq(this.z, 1, 33, 26) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.g() instanceof ctj;
         }
      });
      this.w = this.a(new crq(this.z, 2, 23, 45) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.g() instanceof csm;
         }
      });
      this.x = this.a(new crq(this.A, 0, 143, 57) {
         @Override
         public boolean a(cuq $$0) {
            return false;
         }

         @Override
         public void a(cmx $$0, cuq $$1) {
            cra.this.u.a(1);
            cra.this.v.a(1);
            if (!cra.this.u.h() || !cra.this.v.h()) {
               cra.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cra.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avp.At, avq.e, 1.0F, 1.0F);
                  cra.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crq($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crq($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dR().b(lu.d);
   }

   @Override
   public boolean b(cmx $$0) {
      return a(this.p, $$0, dga.nT);
   }

   @Override
   public boolean a(cmx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jm<dpx>> c(cuq $$0) {
      if ($$0.e()) {
         return this.t.a(awc.a).<List<jm<dpx>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof csm $$1 ? this.t.a($$1.b()).<List<jm<dpx>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bqk $$0) {
      cuq $$1 = this.u.g();
      cuq $$2 = this.v.g();
      cuq $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<jm<dpx>> $$6 = this.r;
         this.r = this.c($$3);
         jm<dpx> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            jm<dpx> $$9 = $$6.get($$4);
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
            dpy $$13 = $$1.a(kq.Y, dpy.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cuq.l);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cuq.l);
         }

         this.d();
      } else {
         this.x.f(cuq.l);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<jm<dpx>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cuq b(cmx $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof csl) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return cuq.l;
               }
            } else if ($$4.g() instanceof ctj) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return cuq.l;
               }
            } else if ($$4.g() instanceof csm) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cuq.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cuq.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cuq.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cmx $$0) {
      super.a($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(jm<dpx> $$0) {
      cuq $$1 = this.u.g();
      cuq $$2 = this.v.g();
      cuq $$3 = cuq.l;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         cti $$4 = ((ctj)$$2.g()).c();
         $$3.a(kq.Y, dpy.a, $$2x -> new dpy.a().a($$2x).a($$0, $$4).a());
      }

      if (!cuq.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public crq n() {
      return this.u;
   }

   public crq o() {
      return this.v;
   }

   public crq p() {
      return this.w;
   }

   public crq q() {
      return this.x;
   }
}
