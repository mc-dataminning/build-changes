import com.google.common.collect.Lists;
import java.util.List;

public class ctr extends cro {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final csb v;
   private final csi w = csi.a();
   private final dfb x;
   private List<dar<dbm>> y = Lists.newArrayList();
   private cwb z = cwb.k;
   long A;
   final ctl o;
   final ctl p;
   Runnable B = () -> {
   };
   public final brw q = new bsk(1) {
      @Override
      public void e() {
         super.e();
         ctr.this.a(this);
         ctr.this.B.run();
      }
   };
   final ctg C = new ctg();

   public ctr(int $$0, col $$1) {
      this($$0, $$1, csb.a);
   }

   public ctr(int $$0, col $$1, final csb $$2) {
      super(csx.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dX();
      this.o = this.a(new ctl(this.q, 0, 20, 33));
      this.p = this.a(new ctl(this.C, 1, 143, 33) {
         @Override
         public boolean a(cwb $$0) {
            return false;
         }

         @Override
         public void a(com $$0, cwb $$1) {
            $$1.a($$0.dX(), $$0, $$1.L());
            ctr.this.C.a($$0, this.j());
            cwb $$2 = ctr.this.o.a(1);
            if (!$$2.f()) {
               ctr.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.aa();
               if (ctr.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awl.Az, awm.e, 1.0F, 1.0F);
                  ctr.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cwb> j() {
            return List.of(ctr.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public List<dar<dbm>> m() {
      return this.y;
   }

   public int n() {
      return this.y.size();
   }

   public boolean o() {
      return this.o.h() && !this.y.isEmpty();
   }

   @Override
   public boolean b(com $$0) {
      return a(this.v, $$0, dig.oc);
   }

   @Override
   public boolean a(com $$0, int $$1) {
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
   public void a(brw $$0) {
      cwb $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.a($$0, $$1);
      }
   }

   private static dbf c(brw $$0) {
      return new dbf($$0.a(0));
   }

   private void a(brw $$0, cwb $$1) {
      this.y.clear();
      this.w.a(-1);
      this.p.f(cwb.k);
      if (!$$1.f()) {
         this.y = this.x.r().b(dav.f, c($$0), this.x);
      }
   }

   void p() {
      if (!this.y.isEmpty() && this.e(this.w.b())) {
         dar<dbm> $$0 = this.y.get(this.w.b());
         cwb $$1 = $$0.b().a(c(this.q), this.x.H_());
         if ($$1.a(this.x.J())) {
            this.C.a($$0);
            this.p.f($$1);
         } else {
            this.p.f(cwb.k);
         }
      } else {
         this.p.f(cwb.k);
      }

      this.d();
   }

   @Override
   public csx<?> a() {
      return csx.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cwb $$0, ctl $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         cvx $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dX(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cwb.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cwb.k;
            }
         } else if (this.x.r().a(dav.f, new dbf($$4), this.x).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cwb.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cwb.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cwb.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 1) {
            $$0.a($$4, false);
         }

         this.d();
      }

      return $$2;
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
