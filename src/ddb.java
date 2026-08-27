import com.mojang.serialization.MapCodec;

public class ddb extends cwq {
   public static final MapCodec<ddb> h = b(ddb::new);
   public static final dkf<ic.a> i = djx.I;

   @Override
   public MapCodec<? extends ddb> a() {
      return h;
   }

   public ddb(djg.d $$0) {
      super($$0);
      this.k(this.o().a(i, ic.a.b));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return b($$0, $$1);
   }

   public static djh b(djh $$0, ddc $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ic.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ic.a.c);
               case c:
                  return $$0.a(i, ic.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(i);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
