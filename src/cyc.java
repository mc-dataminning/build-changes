import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyc extends cyo {
   protected static final eol a = cyo.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eol b = cyo.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final enn c = new enn(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dlu d;

   protected cyc(dle.d $$0, dlu $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cyc> a();

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dlf $$0) {
      return true;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ie.b);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bno $$0, cvn $$1, hz $$2, dlf $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dlf $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), atl.e);
         $$1.a($$0, dpp.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), atl.e);
         $$1.a($$0, dpp.a, $$2);
      }

      if ($$7) {
         $$1.a(new hz($$2), this, this.b());
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cvn $$0, hz $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$3 == ie.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   protected static int a(cvn $$0, enn $$1, Class<? extends bno> $$2) {
      return $$0.a($$2, $$1, bnt.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(cvn var1, hz var2);

   protected abstract int g(dlf var1);

   protected abstract dlf a(dlf var1, int var2);
}
