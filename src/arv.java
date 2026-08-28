import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

public class arv extends ara {
   public static final int a = 33;
   protected final Long2ByteMap b = new Long2ByteOpenHashMap();
   private final dku c;

   public arv(dku $$0) {
      super(34, 16, 256);
      this.c = $$0;
      $$0.b(this::b);
      this.b.defaultReturnValue((byte)33);
   }

   @Override
   protected int b(long $$0) {
      return this.c.a($$0, true);
   }

   public int a(djc $$0) {
      return this.c($$0.a());
   }

   @Override
   protected int c(long $$0) {
      return this.b.get($$0);
   }

   @Override
   protected void a(long $$0, int $$1) {
      if ($$1 >= 33) {
         this.b.remove($$0);
      } else {
         this.b.put($$0, (byte)$$1);
      }
   }

   public void a() {
      this.b(Integer.MAX_VALUE);
   }
}
