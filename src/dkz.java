import com.mojang.serialization.MapCodec;

public class dkz extends dfd implements dcy {
   public static final MapCodec<dkz> c = b(dkz::new);

   @Override
   public MapCodec<dkz> a() {
      return c;
   }

   public dkz(dpx.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return true;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      a($$0, $$2, new csd(this));
   }
}
