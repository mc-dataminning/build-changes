import com.google.common.collect.Lists;
import java.util.List;

public class ctc extends cqz {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final crm v;
   private final crt w = crt.a();
   private final dej x;
   private List<dam<dbh>> y = Lists.newArrayList();
   private cvs z = cvs.k;
   long A;
   final csw o;
   final csw p;
   Runnable B = () -> {
   };
   public final brl q = new brz(1) {
      @Override
      public void e() {
         super.e();
         ctc.this.a(this);
         ctc.this.B.run();
      }
   };
   final csr C = new csr();

   public ctc(int $$0, cnw $$1) {
      this($$0, $$1, crm.a);
   }

   public ctc(int $$0, cnw $$1, final crm $$2) {
      super(csi.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dS();
      this.o = this.a(new csw(this.q, 0, 20, 33));
      this.p = this.a(new csw(this.C, 1, 143, 33) {
         @Override
         public boolean a(cvs $$0) {
            return false;
         }

         @Override
         public void a(cnx $$0, cvs $$1) {
            $$1.a($$0.dS(), $$0, $$1.K());
            ctc.this.C.a($$0, this.j());
            cvs $$2 = ctc.this.o.a(1);
            if (!$$2.f()) {
               ctc.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.aa();
               if (ctc.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awg.AB, awh.e, 1.0F, 1.0F);
                  ctc.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cvs> j() {
            return List.of(ctc.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public List<dam<dbh>> m() {
      return this.y;
   }

   public int n() {
      return this.y.size();
   }

   public boolean o() {
      return this.o.h() && !this.y.isEmpty();
   }

   @Override
   public boolean b(cnx $$0) {
      return a(this.v, $$0, dho.oc);
   }

   @Override
   public boolean a(cnx $$0, int $$1) {
      if (this.e($$1)) {
         this.w.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.y.size();
   }

   @Override
   public void a(brl $$0) {
      cvs $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.u();
         this.a($$0, $$1);
      }
   }

   private static dba c(brl $$0) {
      return new dba($$0.a(0));
   }

   private void a(brl $$0, cvs $$1) {
      this.y.clear();
      this.w.a(-1);
      this.p.f(cvs.k);
      if (!$$1.f()) {
         this.y = this.x.r().b(daq.f, c($$0), this.x);
      }
   }

   void p() {
      if (!this.y.isEmpty() && this.e(this.w.b())) {
         dam<dbh> $$0 = this.y.get(this.w.b());
         cvs $$1 = $$0.b().a(c(this.q), this.x.G_());
         if ($$1.a(this.x.J())) {
            this.C.a($$0);
            this.p.f($$1);
         } else {
            this.p.f(cvs.k);
         }
      } else {
         this.p.f(cvs.k);
      }

      this.d();
   }

   @Override
   public csi<?> a() {
      return csi.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cvs $$0, csw $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         cvn $$5 = $$4.h();
         $$2 = $$4.u();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dS(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cvs.k;
            }
         } else if (this.x.r().a(daq.f, new dba($$4), this.x).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cvs.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cvs.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         }

         $$3.c();
         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
