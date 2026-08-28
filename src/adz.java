import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adz implements aac<acr> {
   public static final zt<ws, adz> a = aac.a(adz::a, adz::new);
   public static final adz.a b = new adz.a(0);
   public static final adz.a c = new adz.a(1);
   public static final adz.a d = new adz.a(2);
   public static final adz.a e = new adz.a(3);
   public static final adz.a f = new adz.a(4);
   public static final adz.a g = new adz.a(5);
   public static final adz.a h = new adz.a(6);
   public static final adz.a i = new adz.a(7);
   public static final adz.a j = new adz.a(8);
   public static final adz.a k = new adz.a(9);
   public static final adz.a l = new adz.a(10);
   public static final adz.a m = new adz.a(11);
   public static final adz.a n = new adz.a(12);
   public static final adz.a o = new adz.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adz.a u;
   private final float v;

   public adz(adz.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adz(ws $$0) {
      this.u = (adz.a)adz.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(ws $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public aae<adz> a() {
      return ahk.G;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public adz.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adz.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
