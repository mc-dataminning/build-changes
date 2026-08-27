import java.util.Optional;
import javax.annotation.Nullable;

public class cbi extends cbf {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private final bdq r = new bee(1) {
      @Override
      public boolean b(int $$0, cfz $$1) {
         return $$1.a(ane.aw);
      }

      @Override
      public int ac_() {
         return 1;
      }
   };
   private final cbi.a s;
   private final cbq t;
   private final cbp u;

   public cbi(int $$0, bdq $$1) {
      this($$0, $$1, new ccw(3), cbq.a);
   }

   public cbi(int $$0, bdq $$1, cbp $$2, cbq $$3) {
      super(cck.i, $$0);
      a($$2, 3);
      this.u = $$2;
      this.t = $$3;
      this.s = new cbi.a(this.r, 0, 136, 110);
      this.a(this.s);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for (int $$6 = 0; $$6 < 3; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new ccx($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 9; $$8++) {
         this.a(new ccx($$1, $$8, 36 + $$8 * 18, 195));
      }
   }

   @Override
   public void b(byo $$0) {
      super.b($$0);
      if (!$$0.dI().B) {
         cfz $$1 = this.s.a(this.s.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean a(byo $$0) {
      return a(this.t, $$0, cpo.fO);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cfz a(byo $$0, int $$1) {
      cfz $$2 = cfz.b;
      ccx $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cfz $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cfz.b;
            }

            $$3.a($$4, $$2);
         } else if (!this.s.f() && this.s.a($$4) && $$4.L() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cfz.b;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cfz.b;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cfz.b;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cfz.b;
         }

         if ($$4.b()) {
            $$3.d(cfz.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cfz.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.u.a(0);
   }

   @Nullable
   public bey m() {
      return bey.a(this.u.a(1));
   }

   @Nullable
   public bey n() {
      return bey.a(this.u.a(2));
   }

   public void a(Optional<bey> $$0, Optional<bey> $$1) {
      if (this.s.f()) {
         this.u.a(1, $$0.<Integer>map(bey::a).orElse(-1));
         this.u.a(2, $$1.<Integer>map(bey::a).orElse(-1));
         this.s.a(1);
         this.t.a(cmm::p);
      }
   }

   public boolean o() {
      return !this.r.a(0).b();
   }

   class a extends ccx {
      public a(bdq $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cfz $$0) {
         return $$0.a(ane.aw);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
