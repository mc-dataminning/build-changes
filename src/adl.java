import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adl implements zs<ace> {
   public static final zj<wl, adl> a = zs.a(adl::a, adl::new);
   public static final adl.a b = new adl.a(0);
   public static final adl.a c = new adl.a(1);
   public static final adl.a d = new adl.a(2);
   public static final adl.a e = new adl.a(3);
   public static final adl.a f = new adl.a(4);
   public static final adl.a g = new adl.a(5);
   public static final adl.a h = new adl.a(6);
   public static final adl.a i = new adl.a(7);
   public static final adl.a j = new adl.a(8);
   public static final adl.a k = new adl.a(9);
   public static final adl.a l = new adl.a(10);
   public static final adl.a m = new adl.a(11);
   public static final adl.a n = new adl.a(12);
   public static final adl.a o = new adl.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adl.a u;
   private final float v;

   public adl(adl.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adl(wl $$0) {
      this.u = (adl.a)adl.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(wl $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zu<adl> a() {
      return agq.G;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public adl.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adl.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
