import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends dmf {
   public static final MapCodec<dnu> a = b(dnu::new);
   public static final eay b = eax.A;
   public static final eay c = eax.u;

   @Override
   protected MapCodec<? extends dnu> a() {
      return a;
   }

   public dnu(eag.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arq $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if ($$1 instanceof arq $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(eah $$0, arq $$1, iu $$2) {
      boolean $$3 = $$1.D($$2);
      if ($$3 != $$0.c(b)) {
         eah $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awn.fK : awn.fL, awo.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
