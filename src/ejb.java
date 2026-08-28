import com.mojang.serialization.MapCodec;

public class ejb extends eix {
   public static final MapCodec<ejb> a = axw.l.fieldOf("chance").xmap(ejb::new, $$0 -> $$0.c);
   private final int c;

   private ejb(int $$0) {
      this.c = $$0;
   }

   public static ejb a(int $$0) {
      return new ejb($$0);
   }

   @Override
   protected boolean a(eiw $$0, ayw $$1, jd $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eiz<?> b() {
      return eiz.b;
   }
}
