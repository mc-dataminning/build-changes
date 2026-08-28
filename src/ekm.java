import com.mojang.serialization.MapCodec;

public class ekm extends eki {
   public static final MapCodec<ekm> a = aym.l.fieldOf("chance").xmap(ekm::new, $$0 -> $$0.c);
   private final int c;

   private ekm(int $$0) {
      this.c = $$0;
   }

   public static ekm a(int $$0) {
      return new ekm($$0);
   }

   @Override
   protected boolean a(ekh $$0, azl $$1, je $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ekk<?> b() {
      return ekk.b;
   }
}
