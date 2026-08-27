import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwd extends cwp {
   protected static final eml a = cwp.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eml b = cwp.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eln c = new eln(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final djv d;

   protected cwd(djf.d $$0, djv $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cwd> a();

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(djg $$0) {
      return true;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ic.b);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable blu $$0, cto $$1, hx $$2, djg $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         djg $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), ars.e);
         $$1.a($$0, dnq.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), ars.e);
         $$1.a($$0, dnq.a, $$2);
      }

      if ($$7) {
         $$1.a(new hx($$2), this, this.b());
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cto $$0, hx $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return this.g($$0);
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   protected static int a(cto $$0, eln $$1, Class<? extends blu> $$2) {
      return $$0.a($$2, $$1, blx.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(cto var1, hx var2);

   protected abstract int g(djg var1);

   protected abstract djg a(djg var1, int var2);
}
