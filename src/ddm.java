import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddm extends ddy {
   protected static final evd a = ddy.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final evd b = ddy.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final euf c = new euf(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final drq d;

   protected ddm(dra.d $$0, drq $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddm> a();

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(drb $$0) {
      return true;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, it.b);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bru $$0, dax $$1, io $$2, drb $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         drb $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avi.e);
         $$1.a($$0, dvu.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avi.e);
         $$1.a($$0, dvu.a, $$2);
      }

      if ($$7) {
         $$1.a(new io($$2), this, this.b());
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dax $$0, io $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      return $$3 == it.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   protected static int a(dax $$0, euf $$1, Class<? extends bru> $$2) {
      return $$0.a($$2, $$1, brz.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dax var1, io var2);

   protected abstract int g(drb var1);

   protected abstract drb a(drb var1, int var2);
}
