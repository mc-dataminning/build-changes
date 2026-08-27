import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwm extends cwy {
   protected static final emv a = cwy.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final emv b = cwy.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final elx c = new elx(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dke d;

   protected cwm(djo.d $$0, dke $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cwm> a();

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(djp $$0) {
      return true;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ic.b);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable blw $$0, ctx $$1, hx $$2, djp $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         djp $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), aru.e);
         $$1.a($$0, dnz.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), aru.e);
         $$1.a($$0, dnz.a, $$2);
      }

      if ($$7) {
         $$1.a(new hx($$2), this, this.b());
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(ctx $$0, hx $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return this.g($$0);
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   protected static int a(ctx $$0, elx $$1, Class<? extends blw> $$2) {
      return $$0.a($$2, $$1, bmb.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(ctx var1, hx var2);

   protected abstract int g(djp var1);

   protected abstract djp a(djp var1, int var2);
}
