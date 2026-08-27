import java.util.function.Function;
import javax.annotation.Nullable;

public class ckq extends cnb {
   private final int a;
   private final ahh b;
   private final ckq.a c;

   public ckq(int $$0, ckq.a $$1, @Nullable String $$2, cnb.a $$3) {
      super($$3);
      this.a = $$0;
      this.c = $$1;
      this.b = $$1.c.apply($$2);
   }

   public ahh b() {
      return this.b;
   }

   public int c() {
      return this.a;
   }

   public ckq.a d() {
      return this.c;
   }

   public static enum a {
      a($$0 -> new ahh("textures/entity/horse/armor/horse_armor_" + $$0 + ".png")),
      b($$0 -> new ahh("textures/entity/wolf/wolf_armor.png"));

      final Function<String, ahh> c;

      private a(Function<String, ahh> $$0) {
         this.c = $$0;
      }
   }
}
