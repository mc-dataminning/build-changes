import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class aac implements xd<yx> {
   public static final aac.a a = new aac.a(0);
   public static final aac.a b = new aac.a(1);
   public static final aac.a c = new aac.a(2);
   public static final aac.a d = new aac.a(3);
   public static final aac.a e = new aac.a(4);
   public static final aac.a f = new aac.a(5);
   public static final aac.a g = new aac.a(6);
   public static final aac.a h = new aac.a(7);
   public static final aac.a i = new aac.a(8);
   public static final aac.a j = new aac.a(9);
   public static final aac.a k = new aac.a(10);
   public static final aac.a l = new aac.a(11);
   public static final aac.a m = new aac.a(12);
   public static final aac.a n = new aac.a(13);
   public static final int o = 0;
   public static final int p = 101;
   public static final int q = 102;
   public static final int r = 103;
   public static final int s = 104;
   private final aac.a t;
   private final float u;

   public aac(aac.a $$0, float $$1) {
      this.t = $$0;
      this.u = $$1;
   }

   public aac(ug $$0) {
      this.t = (aac.a)aac.a.a.get($$0.readUnsignedByte());
      this.u = $$0.readFloat();
   }

   @Override
   public void a(ug $$0) {
      $$0.k(this.t.b);
      $$0.a(this.u);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public aac.a a() {
      return this.t;
   }

   public float d() {
      return this.u;
   }

   public static class a {
      static final Int2ObjectMap<aac.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
