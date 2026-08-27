import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cto extends cua {
   protected static final eiy a = cua.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eiy b = cua.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eia c = new eia(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dgq d;

   protected cto(dga.d $$0, dgq $$1) {
      super($$0.a($$1.f()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cto> a();

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dgb $$0) {
      return true;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, hx.b);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bjt $$0, cqz $$1, ht $$2, dgb $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dgb $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.k(), aqe.e);
         $$1.a($$0, dkl.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.l(), aqe.e);
         $$1.a($$0, dkl.a, $$2);
      }

      if ($$7) {
         $$1.a(new ht($$2), this, this.b());
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cqz $$0, ht $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$3 == hx.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   protected static int a(cqz $$0, eia $$1, Class<? extends bjt> $$2) {
      return $$0.a($$2, $$1, bjw.f.and($$0x -> !$$0x.q_())).size();
   }

   protected abstract int b(cqz var1, ht var2);

   protected abstract int g(dgb var1);

   protected abstract dgb a(dgb var1, int var2);
}
