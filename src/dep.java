import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dep extends dfc {
   protected static final exn a = dfc.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final exn b = dfc.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ewp c = new ewp(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dtr d;

   protected dep(dtb.d $$0, dtr $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dep> a();

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dtc $$0) {
      return true;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.a && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, iw.b);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!$$1.C) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable brv $$0, dca $$1, ir $$2, dtc $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dtc $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avq.e);
         $$1.a($$0, dxv.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avq.e);
         $$1.a($$0, dxv.a, $$2);
      }

      if ($$7) {
         $$1.a(new ir($$2), this, this.b());
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dca $$0, ir $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$3 == iw.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   protected static int a(dca $$0, ewp $$1, Class<? extends brv> $$2) {
      return $$0.a($$2, $$1, bsa.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dca var1, ir var2);

   protected abstract int g(dtc var1);

   protected abstract dtc a(dtc var1, int var2);
}
