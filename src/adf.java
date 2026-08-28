import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adf implements zj<aby> {
   public static final za<vy, adf> a = zj.a(adf::a, adf::new);
   public static final adf.a b = new adf.a(0);
   public static final adf.a c = new adf.a(1);
   public static final adf.a d = new adf.a(2);
   public static final adf.a e = new adf.a(3);
   public static final adf.a f = new adf.a(4);
   public static final adf.a g = new adf.a(5);
   public static final adf.a h = new adf.a(6);
   public static final adf.a i = new adf.a(7);
   public static final adf.a j = new adf.a(8);
   public static final adf.a k = new adf.a(9);
   public static final adf.a l = new adf.a(10);
   public static final adf.a m = new adf.a(11);
   public static final adf.a n = new adf.a(12);
   public static final adf.a o = new adf.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adf.a u;
   private final float v;

   public adf(adf.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adf(vy $$0) {
      this.u = (adf.a)adf.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vy $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zl<adf> a() {
      return agr.G;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public adf.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adf.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
