import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czo extends daa {
   protected static final eqk a = daa.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eqk b = daa.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final epm c = new epm(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dno d;

   protected czo(dmy.d $$0, dno $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends czo> a();

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dmz $$0) {
      return true;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ih.b);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bow $$0, cwz $$1, ib $$2, dmz $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dmz $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), atz.e);
         $$1.a($$0, drn.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), atz.e);
         $$1.a($$0, drn.a, $$2);
      }

      if ($$7) {
         $$1.a(new ib($$2), this, this.b());
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cwz $$0, ib $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   protected static int a(cwz $$0, epm $$1, Class<? extends bow> $$2) {
      return $$0.a($$2, $$1, bpb.f.and($$0x -> !$$0x.q_())).size();
   }

   protected abstract int b(cwz var1, ib var2);

   protected abstract int g(dmz var1);

   protected abstract dmz a(dmz var1, int var2);
}
