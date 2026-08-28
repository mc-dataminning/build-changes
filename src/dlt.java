import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlt extends dmf {
   private static final ffk c = dmf.b(14.0, 0.0, 0.5);
   private static final ffk d = dmf.b(14.0, 0.0, 1.0);
   protected static final fel a = dmf.b(14.0, 0.0, 4.0).e().getFirst();
   protected final eaw b;

   protected dlt(eag.d $$0, eaw $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dlt> a();

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(eah $$0) {
      return true;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, ja.b);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bwf $$0, dja $$1, iu $$2, eah $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         eah $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), awo.e);
         $$1.a($$0, efh.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), awo.e);
         $$1.a($$0, efh.a, $$2);
      }

      if ($$7) {
         $$1.a(new iu($$2), this, this.b());
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(dja $$0, iu $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   protected static int a(dja $$0, fel $$1, Class<? extends bwf> $$2) {
      return $$0.a($$2, $$1, bwm.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(dja var1, iu var2);

   protected abstract int h(eah var1);

   protected abstract eah a(eah var1, int var2);
}
