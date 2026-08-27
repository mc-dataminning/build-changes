import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwa extends cwq implements ddq {
   public static final djy d = djx.C;
   private static final emm a = cwq.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cwa(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cwa> a();

   protected void a(djh $$0, ctq $$1, hx $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(djh $$0, csv $$1, hx $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ic $$3 : ic.values()) {
            if ($$1.b_($$2.a($$3)).a(asm.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(asm.a) && $$1.e() == 8));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return a;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return $$1 == ic.a && !this.a($$0, (cts)$$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ic.b);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(d);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(d) ? ees.c.a(false) : super.c_($$0);
   }
}
