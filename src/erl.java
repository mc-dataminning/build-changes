import com.mojang.serialization.MapCodec;

public class erl extends erh {
   public static final MapCodec<erl> a = ayw.m.fieldOf("chance").xmap(erl::new, $$0 -> $$0.c);
   private final int c;

   private erl(int $$0) {
      this.c = $$0;
   }

   public static erl a(int $$0) {
      return new erl($$0);
   }

   @Override
   protected boolean a(erg $$0, azx $$1, iv $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public erj<?> b() {
      return erj.b;
   }
}
