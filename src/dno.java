import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dno extends dma {
   public static final MapCodec<dno> a = b(dno::new);
   public static final eaq b = eap.A;
   public static final eaq c = eap.u;

   @Override
   protected MapCodec<? extends dno> a() {
      return a;
   }

   public dno(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arq $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if ($$1 instanceof arq $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dzz $$0, arq $$1, iu $$2) {
      boolean $$3 = $$1.D($$2);
      if ($$3 != $$0.c(b)) {
         dzz $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awn.fI : awn.fJ, awo.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
