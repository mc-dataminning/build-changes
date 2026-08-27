import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvn extends cvz {
   protected static final elu a = cvz.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final elu b = cvz.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ekw c = new ekw(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dje d;

   protected cvn(dio.d $$0, dje $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cvn> a();

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dip $$0) {
      return true;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.a && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ia.b);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable blf $$0, csy $$1, hv $$2, dip $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dip $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), ard.e);
         $$1.a($$0, dmz.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), ard.e);
         $$1.a($$0, dmz.a, $$2);
      }

      if ($$7) {
         $$1.a(new hv($$2), this, this.b());
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(csy $$0, hv $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$3 == ia.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   protected static int a(csy $$0, ekw $$1, Class<? extends blf> $$2) {
      return $$0.a($$2, $$1, bli.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(csy var1, hv var2);

   protected abstract int g(dip var1);

   protected abstract dip a(dip var1, int var2);
}
