import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class aag implements xg<zb> {
   public static final aag.a a = new aag.a(0);
   public static final aag.a b = new aag.a(1);
   public static final aag.a c = new aag.a(2);
   public static final aag.a d = new aag.a(3);
   public static final aag.a e = new aag.a(4);
   public static final aag.a f = new aag.a(5);
   public static final aag.a g = new aag.a(6);
   public static final aag.a h = new aag.a(7);
   public static final aag.a i = new aag.a(8);
   public static final aag.a j = new aag.a(9);
   public static final aag.a k = new aag.a(10);
   public static final aag.a l = new aag.a(11);
   public static final aag.a m = new aag.a(12);
   public static final aag.a n = new aag.a(13);
   public static final int o = 0;
   public static final int p = 101;
   public static final int q = 102;
   public static final int r = 103;
   public static final int s = 104;
   private final aag.a t;
   private final float u;

   public aag(aag.a $$0, float $$1) {
      this.t = $$0;
      this.u = $$1;
   }

   public aag(uj $$0) {
      this.t = (aag.a)aag.a.a.get($$0.readUnsignedByte());
      this.u = $$0.readFloat();
   }

   @Override
   public void a(uj $$0) {
      $$0.k(this.t.b);
      $$0.a(this.u);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public aag.a a() {
      return this.t;
   }

   public float d() {
      return this.u;
   }

   public static class a {
      static final Int2ObjectMap<aag.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
