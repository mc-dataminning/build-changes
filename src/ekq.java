import com.mojang.serialization.MapCodec;

public class ekq extends ekm {
   public static final MapCodec<ekq> a = ayo.l.fieldOf("chance").xmap(ekq::new, $$0 -> $$0.c);
   private final int c;

   private ekq(int $$0) {
      this.c = $$0;
   }

   public static ekq a(int $$0) {
      return new ekq($$0);
   }

   @Override
   protected boolean a(ekl $$0, azn $$1, jf $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eko<?> b() {
      return eko.b;
   }
}
