import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddo extends dea {
   protected static final evf a = dea.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final evf b = dea.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final euh c = new euh(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final drs d;

   protected ddo(drc.d $$0, drs $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddo> a();

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(drd $$0) {
      return true;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, it.b);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable brw $$0, daz $$1, io $$2, drd $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         drd $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avj.e);
         $$1.a($$0, dvw.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avj.e);
         $$1.a($$0, dvw.a, $$2);
      }

      if ($$7) {
         $$1.a(new io($$2), this, this.b());
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(daz $$0, io $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$3 == it.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   protected static int a(daz $$0, euh $$1, Class<? extends brw> $$2) {
      return $$0.a($$2, $$1, bsb.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(daz var1, io var2);

   protected abstract int g(drd var1);

   protected abstract drd a(drd var1, int var2);
}
