import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwe extends cwq {
   protected static final emm a = cwq.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final emm b = cwq.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final elo c = new elo(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final djw d;

   protected cwe(djg.d $$0, djw $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cwe> a();

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(djh $$0) {
      return true;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ic.b);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable blv $$0, ctp $$1, hx $$2, djh $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         djh $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), art.e);
         $$1.a($$0, dnr.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), art.e);
         $$1.a($$0, dnr.a, $$2);
      }

      if ($$7) {
         $$1.a(new hx($$2), this, this.b());
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(ctp $$0, hx $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return this.g($$0);
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   protected static int a(ctp $$0, elo $$1, Class<? extends blv> $$2) {
      return $$0.a($$2, $$1, bly.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(ctp var1, hx var2);

   protected abstract int g(djh var1);

   protected abstract djh a(djh var1, int var2);
}
