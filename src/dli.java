import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dli extends dlu {
   private static final feq c = dlu.b(14.0, 0.0, 0.5);
   private static final feq d = dlu.b(14.0, 0.0, 1.0);
   protected static final fdr a = dlu.b(14.0, 0.0, 4.0).e().getFirst();
   protected final ead b;

   protected dli(dzn.d $$0, ead $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dli> a();

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dzo $$0) {
      return true;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, ja.b);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bwa $$0, dip $$1, iu $$2, dzo $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dzo $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), awm.e);
         $$1.a($$0, eeo.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), awm.e);
         $$1.a($$0, eeo.a, $$2);
      }

      if ($$7) {
         $$1.a(new iu($$2), this, this.b());
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(dip $$0, iu $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   protected static int a(dip $$0, fdr $$1, Class<? extends bwa> $$2) {
      return $$0.a($$2, $$1, bwh.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(dip var1, iu var2);

   protected abstract int h(dzo var1);

   protected abstract dzo a(dzo var1, int var2);
}
