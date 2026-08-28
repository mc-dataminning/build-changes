import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adb implements zf<abu> {
   public static final yw<vu, adb> a = zf.a(adb::a, adb::new);
   public static final adb.a b = new adb.a(0);
   public static final adb.a c = new adb.a(1);
   public static final adb.a d = new adb.a(2);
   public static final adb.a e = new adb.a(3);
   public static final adb.a f = new adb.a(4);
   public static final adb.a g = new adb.a(5);
   public static final adb.a h = new adb.a(6);
   public static final adb.a i = new adb.a(7);
   public static final adb.a j = new adb.a(8);
   public static final adb.a k = new adb.a(9);
   public static final adb.a l = new adb.a(10);
   public static final adb.a m = new adb.a(11);
   public static final adb.a n = new adb.a(12);
   public static final adb.a o = new adb.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adb.a u;
   private final float v;

   public adb(adb.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adb(vu $$0) {
      this.u = (adb.a)adb.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vu $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zh<adb> a() {
      return agn.G;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public adb.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adb.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
