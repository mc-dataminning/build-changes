import com.mojang.serialization.MapCodec;

public class dpy extends djh {
   public static final MapCodec<dpy> a = b(dpy::new);
   public static final int b = 2;
   public static final dvs c = dvi.aq;
   private static final float g = 3.0F;
   private static final ezq[] h = new ezq[]{dhm.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dhm.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dpy> a() {
      return a;
   }

   public dpy(dur.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   @Override
   public ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dvs b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dei d() {
      return cvw.vk;
   }

   @Override
   public dus b(int $$0) {
      return $$0 == 2 ? dho.bS.n() : super.b($$0);
   }

   @Override
   public void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dej $$0) {
      return 1;
   }
}
