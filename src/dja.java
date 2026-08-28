import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dja extends dhm {
   public static final MapCodec<dja> a = b(dja::new);
   public static final dvj b = dvi.w;
   public static final dvj c = dvi.r;

   @Override
   protected MapCodec<? extends dja> a() {
      return a;
   }

   public dja(dur.d $$0) {
      super($$0);
      this.l(this.n().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arj $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if ($$1 instanceof arj $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dus $$0, arj $$1, jf $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dus $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awg.fH : awg.fI, awh.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
