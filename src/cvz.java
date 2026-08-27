import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvz extends cwp implements ddp {
   public static final djx d = djw.C;
   private static final eml a = cwp.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cvz(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cvz> a();

   protected void a(djg $$0, ctp $$1, hx $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(djg $$0, csu $$1, hx $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ic $$3 : ic.values()) {
            if ($$1.b_($$2.a($$3)).a(asl.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(asl.a) && $$1.e() == 8));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return a;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return $$1 == ic.a && !this.a($$0, (ctr)$$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ic.b);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(d);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(d) ? eer.c.a(false) : super.c_($$0);
   }
}
