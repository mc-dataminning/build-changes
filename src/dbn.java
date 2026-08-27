import com.mojang.serialization.MapCodec;

public class dbn extends cuf {
   public static final MapCodec<dbn> n = b(dbn::new);

   @Override
   public MapCodec<dbn> a() {
      return n;
   }

   public dbn(dfc.d $$0) {
      super($$0, () -> ddb.c);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new deq($$0, $$1);
   }

   @Override
   protected apn<aez> c() {
      return apq.i.b(apq.ai);
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return asb.a(ddg.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$3 == ha.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
