import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends dnc {
   public static final MapCodec<dor> a = b(dor::new);
   public static final ebv b = ebu.A;
   public static final ebv c = ebu.u;

   @Override
   protected MapCodec<? extends dor> a() {
      return a;
   }

   public dor(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof ars $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if ($$1 instanceof ars $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(ebe $$0, ars $$1, iv $$2) {
      boolean $$3 = $$1.D($$2);
      if ($$3 != $$0.c(b)) {
         ebe $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awp.fK : awp.fL, awq.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
