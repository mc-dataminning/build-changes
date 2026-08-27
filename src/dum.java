import com.mojang.serialization.Codec;

public class dum extends dui {
   public static final Codec<dum> a = arj.j.fieldOf("chance").xmap(dum::new, $$0 -> $$0.c).codec();
   private final int c;

   private dum(int $$0) {
      this.c = $$0;
   }

   public static dum a(int $$0) {
      return new dum($$0);
   }

   @Override
   protected boolean a(duh $$0, ash $$1, gw $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public duk<?> b() {
      return duk.b;
   }
}
