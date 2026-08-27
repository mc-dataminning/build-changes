import com.mojang.serialization.Codec;

public class ck {
   public static final cj.a<ce> a = a("damage", ce.a);
   public static final cj.a<cg.a> b = a("enchantments", cg.a.a);
   public static final cj.a<cg.b> c = a("stored_enchantments", cg.b.a);
   public static final cj.a<ch> d = a("potion_contents", ch.a);
   public static final cj.a<cd> e = a("custom_data", cd.a);

   private static <T extends cj> cj.a<T> a(String $$0, Codec<T> $$1) {
      return jn.a(lh.au, $$0, new cj.a<>($$1));
   }

   public static cj.a<?> a(jn<cj.a<?>> $$0) {
      return a;
   }
}
