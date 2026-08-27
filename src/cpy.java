import com.google.common.collect.ImmutableList;
import java.util.List;

public class cpy extends cot {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cpe p;
   final cpl q = cpl.a();
   private List<ix<dnw>> r = List.of();
   Runnable s = () -> {
   };
   private final iy<dnw> t;
   final cqo u;
   final cqo v;
   private final cqo w;
   private final cqo x;
   long y;
   private final bpn z = new bqd(3) {
      @Override
      public void e() {
         super.e();
         cpy.this.a(this);
         cpy.this.s.run();
      }
   };
   private final bpn A = new bqd(1) {
      @Override
      public void e() {
         super.e();
         cpy.this.s.run();
      }
   };

   public cpy(int $$0, clv $$1) {
      this($$0, $$1, cpe.a);
   }

   public cpy(int $$0, clv $$1, final cpe $$2) {
      super(cqa.s, $$0);
      this.p = $$2;
      this.u = this.a(new cqo(this.z, 0, 13, 26) {
         @Override
         public boolean a(cto $$0) {
            return $$0.g() instanceof crj;
         }
      });
      this.v = this.a(new cqo(this.z, 1, 33, 26) {
         @Override
         public boolean a(cto $$0) {
            return $$0.g() instanceof csi;
         }
      });
      this.w = this.a(new cqo(this.z, 2, 23, 45) {
         @Override
         public boolean a(cto $$0) {
            return $$0.g() instanceof crk;
         }
      });
      this.x = this.a(new cqo(this.A, 0, 143, 57) {
         @Override
         public boolean a(cto $$0) {
            return false;
         }

         @Override
         public void a(clw $$0, cto $$1) {
            cpy.this.u.a(1);
            cpy.this.v.a(1);
            if (!cpy.this.u.h() || !cpy.this.v.h()) {
               cpy.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cpy.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avh.Aq, avi.e, 1.0F, 1.0F);
                  cpy.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cqo($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cqo($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dR().b(lf.d);
   }

   @Override
   public boolean a(clw $$0) {
      return a(this.p, $$0, dea.nT);
   }

   @Override
   public boolean b(clw $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ix<dnw>> c(cto $$0) {
      if ($$0.e()) {
         return this.t.a(avu.a).<List<ix<dnw>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof crk $$1 ? this.t.a($$1.b()).<List<ix<dnw>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bpn $$0) {
      cto $$1 = this.u.g();
      cto $$2 = this.v.g();
      cto $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ix<dnw>> $$6 = this.r;
         this.r = this.c($$3);
         ix<dnw> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ix<dnw> $$9 = $$6.get($$4);
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
            dnx $$13 = $$1.a(kb.W, dnx.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cto.i);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cto.i);
         }

         this.d();
      } else {
         this.x.f(cto.i);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ix<dnw>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cto.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.e && $$1 != this.u.e && $$1 != this.w.e) {
            if ($$4.g() instanceof crj) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cto.i;
               }
            } else if ($$4.g() instanceof csi) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cto.i;
               }
            } else if ($$4.g() instanceof crk) {
               if (!this.a($$4, this.w.e, this.w.e + 1, false)) {
                  return cto.i;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cto.i;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cto.i;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.e(cto.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cto.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(clw $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(ix<dnw> $$0) {
      cto $$1 = this.u.g();
      cto $$2 = this.v.g();
      cto $$3 = cto.i;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         csh $$4 = ((csi)$$2.g()).c();
         $$3.a(kb.W, dnx.a, $$2x -> new dnx.a().a($$2x).a($$0, $$4).a());
      }

      if (!cto.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cqo n() {
      return this.u;
   }

   public cqo o() {
      return this.v;
   }

   public cqo p() {
      return this.w;
   }

   public cqo q() {
      return this.x;
   }
}
