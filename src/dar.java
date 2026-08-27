import com.mojang.serialization.MapCodec;

public class dar extends cvz {
   public static final MapCodec<dar> a = b(dar::new);
   private static final int b = 20;

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   public dar(dio.d $$0) {
      super($$0);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blf $$3) {
      if (!$$3.bT() && $$3 instanceof blv && !cqu.j((blv)$$3)) {
         $$3.a($$0.ah().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      cwf.b($$1, $$2.c(), $$0);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.b && $$2.a(cwb.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
