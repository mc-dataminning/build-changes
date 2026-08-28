import com.mojang.serialization.MapCodec;

public class dns extends dqh {
   public static final MapCodec<dns> a = b(dns::new);

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(dvu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ls.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
