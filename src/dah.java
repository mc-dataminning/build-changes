import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dah extends cwq implements ddq {
   public static final MapCodec<dah> a = b(dah::new);
   private static final djy c = djx.C;
   protected static final emm b = cwq.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   protected dah(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = super.a($$0);
      if ($$1 != null) {
         eer $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == ees.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.c();
      djh $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ic.a);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !this.a($$0, $$3, $$4)) {
         return cws.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ees.c, ees.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
