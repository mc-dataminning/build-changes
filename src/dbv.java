import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbv extends dch {
   protected static final etc a = dch.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final etc b = dch.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ese c = new ese(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dpx d;

   protected dbv(dph.d $$0, dpx $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dbv> a();

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dpi $$0) {
      return true;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.a && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ij.b);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bqa $$0, czg $$1, id $$2, dpi $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dpi $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), aup.e);
         $$1.a($$0, dub.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), aup.e);
         $$1.a($$0, dub.a, $$2);
      }

      if ($$7) {
         $$1.a(new id($$2), this, this.b());
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(czg $$0, id $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$3 == ij.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   protected static int a(czg $$0, ese $$1, Class<? extends bqa> $$2) {
      return $$0.a($$2, $$1, bqf.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(czg var1, id var2);

   protected abstract int g(dpi var1);

   protected abstract dpi a(dpi var1, int var2);
}
