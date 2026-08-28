import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmf extends dmr {
   private static final ffw c = dmr.b(14.0, 0.0, 0.5);
   private static final ffw d = dmr.b(14.0, 0.0, 1.0);
   protected static final fex a = dmr.b(14.0, 0.0, 4.0).e().getFirst();
   protected final ebi b;

   protected dmf(eas.d $$0, ebi $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dmf> a();

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(eat $$0) {
      return true;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jb.b);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!$$1.C) {
         int $$5 = this.h($$0);
         if ($$5 == 0) {
            this.a($$3, $$1, $$2, $$0, $$5);
         }
      }
   }

   private void a(@Nullable bwi $$0, djm $$1, iv $$2, eat $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         eat $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), awo.e);
         $$1.a($$0, eft.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), awo.e);
         $$1.a($$0, eft.a, $$2);
      }

      if ($$7) {
         $$1.a(new iv($$2), this, this.b());
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(djm $$0, iv $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$3 == jb.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   protected static int a(djm $$0, fex $$1, Class<? extends bwi> $$2) {
      return $$0.a($$2, $$1, bwp.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(djm var1, iv var2);

   protected abstract int h(eat var1);

   protected abstract eat a(eat var1, int var2);
}
