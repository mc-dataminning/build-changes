import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dki extends dku {
   private static final fdo c = dku.b(14.0, 0.0, 0.5);
   private static final fdo d = dku.b(14.0, 0.0, 1.0);
   protected static final fcp a = dku.b(14.0, 0.0, 4.0).e().getFirst();
   protected final dzb b;

   protected dki(dyl.d $$0, dzb $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dki> a();

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dym $$0) {
      return true;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.a && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jo.b);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bvs $$0, dhp $$1, jj $$2, dym $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dym $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), awl.e);
         $$1.a($$0, edm.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), awl.e);
         $$1.a($$0, edm.a, $$2);
      }

      if ($$7) {
         $$1.a(new jj($$2), this, this.b());
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(dhp $$0, jj $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$3 == jo.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   protected static int a(dhp $$0, fcp $$1, Class<? extends bvs> $$2) {
      return $$0.a($$2, $$1, bvz.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(dhp var1, jj var2);

   protected abstract int h(dym var1);

   protected abstract dym a(dym var1, int var2);
}
