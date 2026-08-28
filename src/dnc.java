import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dnc extends dno {
   private static final fgw c = dno.b(14.0, 0.0, 0.5);
   private static final fgw d = dno.b(14.0, 0.0, 1.0);
   protected static final ffx a = dno.b(14.0, 0.0, 4.0).e().getFirst();
   protected final ecf b;

   protected dnc(ebp.d $$0, ecf $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dnc> a();

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(ebq $$0) {
      return true;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jc.b);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if (!$$1.C) {
         int $$5 = this.h($$0);
         if ($$5 == 0) {
            this.a($$3, $$1, $$2, $$0, $$5);
         }
      }
   }

   private void a(@Nullable bxe $$0, dkj $$1, iw $$2, ebq $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         ebq $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), awz.e);
         $$1.a($$0, egq.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), awz.e);
         $$1.a($$0, egq.a, $$2);
      }

      if ($$7) {
         $$1.a(new iw($$2), this, this.b());
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(dkj $$0, iw $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$3 == jc.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   protected static int a(dkj $$0, ffx $$1, Class<? extends bxe> $$2) {
      return $$0.a($$2, $$1, bxl.f.and($$0x -> !$$0x.g_())).size();
   }

   protected abstract int b(dkj var1, iw var2);

   protected abstract int h(ebq var1);

   protected abstract ebq a(ebq var1, int var2);
}
