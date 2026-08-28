import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diy extends djk {
   protected static final fbs a = djk.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final fbs b = djk.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final fat c = new fat(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dxk d;

   protected diy(dwu.d $$0, dxk $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends diy> a();

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dwv $$0) {
      return true;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jn.b);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable buj $$0, dgg $$1, ji $$2, dwv $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dwv $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awa.e);
         $$1.a($$0, ebr.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awa.e);
         $$1.a($$0, ebr.a, $$2);
      }

      if ($$7) {
         $$1.a(new ji($$2), this, this.b());
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dgg $$0, ji $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$3 == jn.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   protected static int a(dgg $$0, fat $$1, Class<? extends buj> $$2) {
      return $$0.a($$2, $$1, buo.f.and($$0x -> !$$0x.s_())).size();
   }

   protected abstract int b(dgg var1, ji var2);

   protected abstract int h(dwv var1);

   protected abstract dwv a(dwv var1, int var2);
}
