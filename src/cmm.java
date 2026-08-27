import java.util.function.Function;
import javax.annotation.Nullable;

public class cmm extends coy {
   private final int a;
   private final aiy b;
   private final cmm.a c;

   public cmm(int $$0, cmm.a $$1, @Nullable String $$2, coy.a $$3) {
      super($$3);
      this.a = $$0;
      this.c = $$1;
      this.b = $$1.c.apply($$2);
   }

   public aiy b() {
      return this.b;
   }

   public int c() {
      return this.a;
   }

   public cmm.a d() {
      return this.c;
   }

   public static enum a {
      a($$0 -> new aiy("textures/entity/horse/armor/horse_armor_" + $$0 + ".png")),
      b($$0 -> new aiy("textures/entity/wolf/wolf_armor.png"));

      final Function<String, aiy> c;

      private a(Function<String, aiy> $$0) {
         this.c = $$0;
      }
   }
}
