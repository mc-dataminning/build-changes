import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends dke {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final dye b = dyd.x;
   public static final dye c = dyd.r;

   @Override
   protected MapCodec<? extends dlt> a() {
      return a;
   }

   public dlt(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof ash $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if ($$1 instanceof ash $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dxn $$0, ash $$1, jh $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dxn $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? axf.fH : axf.fI, axg.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
