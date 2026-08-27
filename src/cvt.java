import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvt extends cwj implements ddj {
   public static final djr d = djq.C;
   private static final emf a = cwj.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cvt(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cvt> a();

   protected void a(dja $$0, ctj $$1, hx $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(dja $$0, cso $$1, hx $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ic $$3 : ic.values()) {
            if ($$1.b_($$2.a($$3)).a(asg.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(asg.a) && $$1.e() == 8));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return a;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$1 == ic.a && !this.a($$0, (ctl)$$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ic.b);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(d);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(d) ? eel.c.a(false) : super.c_($$0);
   }
}
