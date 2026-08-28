import javax.annotation.Nullable;

public class daj extends cxl implements cxz {
   private final awm a;

   public daj(dmf $$0, awm $$1, cyz.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bud a(dcy $$0) {
      bud $$1 = super.a($$0);
      crc $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cxr.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awm a(eah $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable bxe $$0, dja $$1, iu $$2, @Nullable fem $$3) {
      if ($$1.k($$2) && $$1.v($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.c().m(), 3);
         }

         $$1.a($$0, efh.z, $$2);
         $$1.a($$0, $$2, this.a, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
