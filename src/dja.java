import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dja extends djm {
   protected static final fbu a = djm.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fbu b = djm.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final fav c = new fav(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dxm d;

   protected dja(dww.d $$0, dxm $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dja> a();

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dwx $$0) {
      return true;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jn.b);
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, bul $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bul $$0, dgi $$1, ji $$2, dwx $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dwx $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awb.e);
         $$1.a($$0, ebt.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awb.e);
         $$1.a($$0, ebt.a, $$2);
      }

      if ($$7) {
         $$1.a(new ji($$2), this, this.b());
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dgi $$0, ji $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   protected static int a(dgi $$0, fav $$1, Class<? extends bul> $$2) {
      return $$0.a($$2, $$1, buq.f.and($$0x -> !$$0x.s_())).size();
   }

   protected abstract int b(dgi var1, ji var2);

   protected abstract int h(dwx var1);

   protected abstract dwx a(dwx var1, int var2);
}
