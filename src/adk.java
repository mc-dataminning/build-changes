import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adk implements zo<acd> {
   public static final zf<we, adk> a = zo.a(adk::a, adk::new);
   public static final adk.a b = new adk.a(0);
   public static final adk.a c = new adk.a(1);
   public static final adk.a d = new adk.a(2);
   public static final adk.a e = new adk.a(3);
   public static final adk.a f = new adk.a(4);
   public static final adk.a g = new adk.a(5);
   public static final adk.a h = new adk.a(6);
   public static final adk.a i = new adk.a(7);
   public static final adk.a j = new adk.a(8);
   public static final adk.a k = new adk.a(9);
   public static final adk.a l = new adk.a(10);
   public static final adk.a m = new adk.a(11);
   public static final adk.a n = new adk.a(12);
   public static final adk.a o = new adk.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adk.a u;
   private final float v;

   public adk(adk.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adk(we $$0) {
      this.u = (adk.a)adk.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(we $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zq<adk> a() {
      return ags.G;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public adk.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adk.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
