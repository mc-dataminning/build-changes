import com.mojang.serialization.Codec;

public class ejd extends eiz {
   public static final Codec<ejd> a = axu.j.fieldOf("chance").xmap(ejd::new, $$0 -> $$0.c).codec();
   private final int c;

   private ejd(int $$0) {
      this.c = $$0;
   }

   public static ejd a(int $$0) {
      return new ejd($$0);
   }

   @Override
   protected boolean a(eiy $$0, ayt $$1, ir $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ejb<?> b() {
      return ejb.b;
   }
}
