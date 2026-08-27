import com.mojang.serialization.Codec;

public class cj {
   public static final ci.a<cd> a = a("damage", cd.a);
   public static final ci.a<cf.a> b = a("enchantments", cf.a.a);
   public static final ci.a<cf.b> c = a("stored_enchantments", cf.b.a);
   public static final ci.a<cg> d = a("potion_contents", cg.a);
   public static final ci.a<cc> e = a("custom_data", cc.a);

   private static <T extends ci> ci.a<T> a(String $$0, Codec<T> $$1) {
      return jk.a(le.au, $$0, new ci.a<>($$1));
   }

   public static ci.a<?> a(jk<ci.a<?>> $$0) {
      return a;
   }
}
