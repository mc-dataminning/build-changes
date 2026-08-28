import javax.annotation.Nullable;

public class czy extends cxa implements cxo {
   private final awk a;

   public czy(dlu $$0, awk $$1, cyo.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bty a(dcn $$0) {
      bty $$1 = super.a($$0);
      cqs $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cxg.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awk a(dzo $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable bwz $$0, dip $$1, iu $$2, @Nullable fds $$3) {
      if ($$1.k($$2) && $$1.v($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.c().m(), 3);
         }

         $$1.a($$0, eeo.z, $$2);
         $$1.a($$0, $$2, this.a, awm.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
