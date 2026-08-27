import com.mojang.serialization.MapCodec;

public class cyd extends czf {
   public static final MapCodec<cyd> a = b(cyd::new);

   @Override
   public MapCodec<? extends cyd> a() {
      return a;
   }

   public cyd(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         $$0.a(null, $$4, atp.G, atq.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, atp.E, atq.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
