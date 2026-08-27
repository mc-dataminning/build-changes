import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class aaf implements xf<za> {
   public static final aaf.a a = new aaf.a(0);
   public static final aaf.a b = new aaf.a(1);
   public static final aaf.a c = new aaf.a(2);
   public static final aaf.a d = new aaf.a(3);
   public static final aaf.a e = new aaf.a(4);
   public static final aaf.a f = new aaf.a(5);
   public static final aaf.a g = new aaf.a(6);
   public static final aaf.a h = new aaf.a(7);
   public static final aaf.a i = new aaf.a(8);
   public static final aaf.a j = new aaf.a(9);
   public static final aaf.a k = new aaf.a(10);
   public static final aaf.a l = new aaf.a(11);
   public static final aaf.a m = new aaf.a(12);
   public static final aaf.a n = new aaf.a(13);
   public static final int o = 0;
   public static final int p = 101;
   public static final int q = 102;
   public static final int r = 103;
   public static final int s = 104;
   private final aaf.a t;
   private final float u;

   public aaf(aaf.a $$0, float $$1) {
      this.t = $$0;
      this.u = $$1;
   }

   public aaf(ui $$0) {
      this.t = (aaf.a)aaf.a.a.get($$0.readUnsignedByte());
      this.u = $$0.readFloat();
   }

   @Override
   public void a(ui $$0) {
      $$0.k(this.t.b);
      $$0.a(this.u);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public aaf.a a() {
      return this.t;
   }

   public float d() {
      return this.u;
   }

   public static class a {
      static final Int2ObjectMap<aaf.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
