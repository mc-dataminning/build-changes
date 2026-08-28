import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmb extends dkm {
   public static final MapCodec<dmb> a = b(dmb::new);
   public static final dym b = dyl.x;
   public static final dym c = dyl.r;

   @Override
   protected MapCodec<? extends dmb> a() {
      return a;
   }

   public dmb(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof ash $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if ($$1 instanceof ash $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dxv $$0, ash $$1, jh $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dxv $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? axf.fI : axf.fJ, axg.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
