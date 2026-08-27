import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class acx implements ze<abq> {
   public static final yv<vx, acx> a = ze.a(acx::a, acx::new);
   public static final acx.a b = new acx.a(0);
   public static final acx.a c = new acx.a(1);
   public static final acx.a d = new acx.a(2);
   public static final acx.a e = new acx.a(3);
   public static final acx.a f = new acx.a(4);
   public static final acx.a g = new acx.a(5);
   public static final acx.a h = new acx.a(6);
   public static final acx.a i = new acx.a(7);
   public static final acx.a j = new acx.a(8);
   public static final acx.a k = new acx.a(9);
   public static final acx.a l = new acx.a(10);
   public static final acx.a m = new acx.a(11);
   public static final acx.a n = new acx.a(12);
   public static final acx.a o = new acx.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final acx.a u;
   private final float v;

   public acx(acx.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private acx(vx $$0) {
      this.u = (acx.a)acx.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vx $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zg<acx> a() {
      return agb.G;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public acx.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<acx.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
