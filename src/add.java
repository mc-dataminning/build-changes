import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class add implements zh<abw> {
   public static final yy<vw, add> a = zh.a(add::a, add::new);
   public static final add.a b = new add.a(0);
   public static final add.a c = new add.a(1);
   public static final add.a d = new add.a(2);
   public static final add.a e = new add.a(3);
   public static final add.a f = new add.a(4);
   public static final add.a g = new add.a(5);
   public static final add.a h = new add.a(6);
   public static final add.a i = new add.a(7);
   public static final add.a j = new add.a(8);
   public static final add.a k = new add.a(9);
   public static final add.a l = new add.a(10);
   public static final add.a m = new add.a(11);
   public static final add.a n = new add.a(12);
   public static final add.a o = new add.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final add.a u;
   private final float v;

   public add(add.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private add(vw $$0) {
      this.u = (add.a)add.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vw $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zj<add> a() {
      return agp.G;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public add.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<add.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
