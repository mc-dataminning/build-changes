import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djs extends dke {
   private static final fcr c = dke.b(14.0, 0.0, 0.5);
   private static final fcr d = dke.b(14.0, 0.0, 1.0);
   protected static final fbs a = dke.b(14.0, 0.0, 4.0).e().getFirst();
   protected final dyf b;

   protected djs(dxp.d $$0, dyf $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djs> a();

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dxq $$0) {
      return true;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jn.b);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bva $$0, dgz $$1, ji $$2, dxq $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dxq $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), awb.e);
         $$1.a($$0, ecp.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), awb.e);
         $$1.a($$0, ecp.a, $$2);
      }

      if ($$7) {
         $$1.a(new ji($$2), this, this.b());
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(dgz $$0, ji $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   protected static int a(dgz $$0, fbs $$1, Class<? extends bva> $$2) {
      return $$0.a($$2, $$1, bvg.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(dgz var1, ji var2);

   protected abstract int h(dxq var1);

   protected abstract dxq a(dxq var1, int var2);
}
