import com.mojang.serialization.Codec;

public class dww extends dws {
   public static final Codec<dww> a = asy.j.fieldOf("chance").xmap(dww::new, $$0 -> $$0.c).codec();
   private final int c;

   private dww(int $$0) {
      this.c = $$0;
   }

   public static dww a(int $$0) {
      return new dww($$0);
   }

   @Override
   protected boolean a(dwr $$0, atw $$1, hx $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dwu<?> b() {
      return dwu.b;
   }
}
