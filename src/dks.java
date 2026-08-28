import com.mojang.serialization.MapCodec;

public class dks extends dlu {
   public static final MapCodec<dks> a = b(dks::new);

   @Override
   public MapCodec<? extends dks> a() {
      return a;
   }

   public dks(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      if (!$$0.C) {
         iu $$4 = $$2.b();
         $$0.a(null, $$4, awl.E, awm.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
