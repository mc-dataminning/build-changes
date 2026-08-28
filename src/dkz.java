import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkz extends djl {
   public static final MapCodec<dkz> a = b(dkz::new);
   public static final dxn b = dxm.B;
   public static final dxn c = dxm.v;

   @Override
   protected MapCodec<? extends dkz> a() {
      return a;
   }

   public dkz(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof ard $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if ($$1 instanceof ard $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dww $$0, ard $$1, ji $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dww $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awa.fI : awa.fJ, awb.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
