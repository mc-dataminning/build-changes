import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class acu implements zb<abn> {
   public static final ys<vr, acu> a = zb.a(acu::a, acu::new);
   public static final acu.a b = new acu.a(0);
   public static final acu.a c = new acu.a(1);
   public static final acu.a d = new acu.a(2);
   public static final acu.a e = new acu.a(3);
   public static final acu.a f = new acu.a(4);
   public static final acu.a g = new acu.a(5);
   public static final acu.a h = new acu.a(6);
   public static final acu.a i = new acu.a(7);
   public static final acu.a j = new acu.a(8);
   public static final acu.a k = new acu.a(9);
   public static final acu.a l = new acu.a(10);
   public static final acu.a m = new acu.a(11);
   public static final acu.a n = new acu.a(12);
   public static final acu.a o = new acu.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final acu.a u;
   private final float v;

   public acu(acu.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private acu(vr $$0) {
      this.u = (acu.a)acu.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vr $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zd<acu> a() {
      return afz.G;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public acu.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<acu.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
