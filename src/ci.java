import com.mojang.serialization.Codec;

public class ci {
   public static final ch.a<cc> a = a("damage", cc.a);
   public static final ch.a<ce.a> b = a("enchantments", ce.a.a);
   public static final ch.a<ce.b> c = a("stored_enchantments", ce.b.a);
   public static final ch.a<cf> d = a("potion_contents", cf.a);
   public static final ch.a<cb> e = a("custom_data", cb.a);

   private static <T extends ch> ch.a<T> a(String $$0, Codec<T> $$1) {
      return ji.a(lc.au, $$0, new ch.a<>($$1));
   }

   public static ch.a<?> a(ji<ch.a<?>> $$0) {
      return a;
   }
}
