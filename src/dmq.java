import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmq extends dnc {
   private static final fgk c = dnc.b(14.0, 0.0, 0.5);
   private static final fgk d = dnc.b(14.0, 0.0, 1.0);
   protected static final ffl a = dnc.b(14.0, 0.0, 4.0).e().getFirst();
   protected final ebt b;

   protected dmq(ebd.d $$0, ebt $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dmq> a();

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(ebe $$0) {
      return true;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jb.b);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if (!$$1.C) {
         int $$5 = this.h($$0);
         if ($$5 == 0) {
            this.a($$3, $$1, $$2, $$0, $$5);
         }
      }
   }

   private void a(@Nullable bwt $$0, djx $$1, iv $$2, ebe $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         ebe $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), awq.e);
         $$1.a($$0, ege.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), awq.e);
         $$1.a($$0, ege.a, $$2);
      }

      if ($$7) {
         $$1.a(new iv($$2), this, this.b());
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(djx $$0, iv $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$3 == jb.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   protected static int a(djx $$0, ffl $$1, Class<? extends bwt> $$2) {
      return $$0.a($$2, $$1, bxa.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(djx var1, iv var2);

   protected abstract int h(ebe var1);

   protected abstract ebe a(ebe var1, int var2);
}
