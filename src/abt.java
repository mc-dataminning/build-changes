import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class abt implements yb<aam> {
   public static final xs<uu, abt> a = yb.a(abt::a, abt::new);
   public static final abt.a b = new abt.a(0);
   public static final abt.a c = new abt.a(1);
   public static final abt.a d = new abt.a(2);
   public static final abt.a e = new abt.a(3);
   public static final abt.a f = new abt.a(4);
   public static final abt.a g = new abt.a(5);
   public static final abt.a h = new abt.a(6);
   public static final abt.a i = new abt.a(7);
   public static final abt.a j = new abt.a(8);
   public static final abt.a k = new abt.a(9);
   public static final abt.a l = new abt.a(10);
   public static final abt.a m = new abt.a(11);
   public static final abt.a n = new abt.a(12);
   public static final abt.a o = new abt.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final abt.a u;
   private final float v;

   public abt(abt.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private abt(uu $$0) {
      this.u = (abt.a)abt.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(uu $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public yd<abt> a() {
      return aex.G;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public abt.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<abt.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
