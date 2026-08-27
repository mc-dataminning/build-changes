import com.mojang.serialization.Codec;

public class duu extends duq {
   public static final Codec<duu> a = arh.j.fieldOf("chance").xmap(duu::new, $$0 -> $$0.c).codec();
   private final int c;

   private duu(int $$0) {
      this.c = $$0;
   }

   public static duu a(int $$0) {
      return new duu($$0);
   }

   @Override
   protected boolean a(dup $$0, ase $$1, gw $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dus<?> b() {
      return dus.b;
   }
}
