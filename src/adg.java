import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adg implements zk<abz> {
   public static final zb<wa, adg> a = zk.a(adg::a, adg::new);
   public static final adg.a b = new adg.a(0);
   public static final adg.a c = new adg.a(1);
   public static final adg.a d = new adg.a(2);
   public static final adg.a e = new adg.a(3);
   public static final adg.a f = new adg.a(4);
   public static final adg.a g = new adg.a(5);
   public static final adg.a h = new adg.a(6);
   public static final adg.a i = new adg.a(7);
   public static final adg.a j = new adg.a(8);
   public static final adg.a k = new adg.a(9);
   public static final adg.a l = new adg.a(10);
   public static final adg.a m = new adg.a(11);
   public static final adg.a n = new adg.a(12);
   public static final adg.a o = new adg.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adg.a u;
   private final float v;

   public adg(adg.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adg(wa $$0) {
      this.u = (adg.a)adg.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(wa $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zm<adg> a() {
      return ago.G;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public adg.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adg.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
