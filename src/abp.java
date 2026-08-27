import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class abp implements xz<aai> {
   public static final xq<us, abp> a = xz.a(abp::a, abp::new);
   public static final abp.a b = new abp.a(0);
   public static final abp.a c = new abp.a(1);
   public static final abp.a d = new abp.a(2);
   public static final abp.a e = new abp.a(3);
   public static final abp.a f = new abp.a(4);
   public static final abp.a g = new abp.a(5);
   public static final abp.a h = new abp.a(6);
   public static final abp.a i = new abp.a(7);
   public static final abp.a j = new abp.a(8);
   public static final abp.a k = new abp.a(9);
   public static final abp.a l = new abp.a(10);
   public static final abp.a m = new abp.a(11);
   public static final abp.a n = new abp.a(12);
   public static final abp.a o = new abp.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final abp.a u;
   private final float v;

   public abp(abp.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private abp(us $$0) {
      this.u = (abp.a)abp.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(us $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public yb<abp> a() {
      return aet.G;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public abp.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<abp.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
