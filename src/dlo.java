import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlo extends dma {
   private static final ffc c = dma.b(14.0, 0.0, 0.5);
   private static final ffc d = dma.b(14.0, 0.0, 1.0);
   protected static final fed a = dma.b(14.0, 0.0, 4.0).e().getFirst();
   protected final eao b;

   protected dlo(dzy.d $$0, eao $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dlo> a();

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dzz $$0) {
      return true;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, ja.b);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if (!$$1.C) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bwd $$0, div $$1, iu $$2, dzz $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dzz $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), awo.e);
         $$1.a($$0, eez.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), awo.e);
         $$1.a($$0, eez.a, $$2);
      }

      if ($$7) {
         $$1.a(new iu($$2), this, this.b());
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(div $$0, iu $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   protected static int a(div $$0, fed $$1, Class<? extends bwd> $$2) {
      return $$0.a($$2, $$1, bwk.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(div var1, iu var2);

   protected abstract int h(dzz var1);

   protected abstract dzz a(dzz var1, int var2);
}
