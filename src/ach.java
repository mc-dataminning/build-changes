import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ach implements yp<aba> {
   public static final yg<vi, ach> a = yp.a(ach::a, ach::new);
   public static final ach.a b = new ach.a(0);
   public static final ach.a c = new ach.a(1);
   public static final ach.a d = new ach.a(2);
   public static final ach.a e = new ach.a(3);
   public static final ach.a f = new ach.a(4);
   public static final ach.a g = new ach.a(5);
   public static final ach.a h = new ach.a(6);
   public static final ach.a i = new ach.a(7);
   public static final ach.a j = new ach.a(8);
   public static final ach.a k = new ach.a(9);
   public static final ach.a l = new ach.a(10);
   public static final ach.a m = new ach.a(11);
   public static final ach.a n = new ach.a(12);
   public static final ach.a o = new ach.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final ach.a u;
   private final float v;

   public ach(ach.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private ach(vi $$0) {
      this.u = (ach.a)ach.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vi $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public yr<ach> a() {
      return afl.G;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public ach.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<ach.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
