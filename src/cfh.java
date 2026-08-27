import com.google.common.collect.ImmutableList;
import java.util.List;

public class cfh extends cee {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cep p;
   final ceu q = ceu.a();
   private List<he<dcd>> r = List.of();
   Runnable s = () -> {
   };
   final cfw t;
   final cfw u;
   private final cfw v;
   private final cfw w;
   long x;
   private final bgj y = new bgx(3) {
      @Override
      public void e() {
         super.e();
         cfh.this.a(this);
         cfh.this.s.run();
      }
   };
   private final bgj z = new bgx(1) {
      @Override
      public void e() {
         super.e();
         cfh.this.s.run();
      }
   };

   public cfh(int $$0, cbm $$1) {
      this($$0, $$1, cep.a);
   }

   public cfh(int $$0, cbm $$1, final cep $$2) {
      super(cfj.r, $$0);
      this.p = $$2;
      this.t = this.a(new cfw(this.y, 0, 13, 26) {
         @Override
         public boolean a(ciy $$0) {
            return $$0.d() instanceof cgo;
         }
      });
      this.u = this.a(new cfw(this.y, 1, 33, 26) {
         @Override
         public boolean a(ciy $$0) {
            return $$0.d() instanceof chn;
         }
      });
      this.v = this.a(new cfw(this.y, 2, 23, 45) {
         @Override
         public boolean a(ciy $$0) {
            return $$0.d() instanceof cgp;
         }
      });
      this.w = this.a(new cfw(this.z, 0, 143, 58) {
         @Override
         public boolean a(ciy $$0) {
            return false;
         }

         @Override
         public void a(cbn $$0, ciy $$1) {
            cfh.this.t.a(1);
            cfh.this.u.a(1);
            if (!cfh.this.t.f() || !cfh.this.u.f()) {
               cfh.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cfh.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aow.yr, aox.e, 1.0F, 1.0F);
                  cfh.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfw($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cbn $$0) {
      return a(this.p, $$0, csn.nT);
   }

   @Override
   public boolean b(cbn $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<he<dcd>> c(ciy $$0) {
      if ($$0.b()) {
         return jb.al.b(apj.a).<List<he<dcd>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cgp $$1 ? jb.al.b($$1.b()).<List<he<dcd>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bgj $$0) {
      ciy $$1 = this.t.e();
      ciy $$2 = this.u.e();
      ciy $$3 = this.v.e();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<he<dcd>> $$6 = this.r;
         this.r = this.c($$3);
         he<dcd> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            he<dcd> $$9 = $$6.get($$4);
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
            qr $$13 = cgr.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.e(ciy.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.e(ciy.b);
         }

         this.d();
      } else {
         this.w.e(ciy.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<he<dcd>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public ciy a(cbn $$0, int $$1) {
      ciy $$2 = ciy.b;
      cfw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciy $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return ciy.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cgo) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return ciy.b;
               }
            } else if ($$4.d() instanceof chn) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return ciy.b;
               }
            } else if ($$4.d() instanceof cgp) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return ciy.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return ciy.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return ciy.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return ciy.b;
         }

         if ($$4.b()) {
            $$3.d(ciy.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciy.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cbn $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(he<dcd> $$0) {
      ciy $$1 = this.t.e();
      ciy $$2 = this.u.e();
      ciy $$3 = ciy.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         chm $$4 = ((chn)$$2.d()).d();
         qr $$5 = cgr.a($$3);
         qx $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new qx();
            if ($$5 == null) {
               $$5 = new qr();
            }

            $$5.a("Patterns", $$6);
         }

         qr $$8 = new qr();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cgr.a($$3, dco.t, $$5);
      }

      if (!ciy.a($$3, this.w.e())) {
         this.w.e($$3);
      }
   }

   public cfw n() {
      return this.t;
   }

   public cfw o() {
      return this.u;
   }

   public cfw p() {
      return this.v;
   }

   public cfw q() {
      return this.w;
   }
}
