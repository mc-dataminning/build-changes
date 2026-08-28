import com.mojang.serialization.MapCodec;

public class eoq extends eom {
   public static final MapCodec<eoq> a = ays.m.fieldOf("chance").xmap(eoq::new, $$0 -> $$0.c);
   private final int c;

   private eoq(int $$0) {
      this.c = $$0;
   }

   public static eoq a(int $$0) {
      return new eoq($$0);
   }

   @Override
   protected boolean a(eol $$0, azs $$1, jj $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eoo<?> b() {
      return eoo.b;
   }
}
