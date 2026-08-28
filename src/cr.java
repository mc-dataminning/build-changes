import com.mojang.serialization.Codec;

public class cr {
   public static final cq.a<cj> a = a("damage", cj.a);
   public static final cq.a<cl.a> b = a("enchantments", cl.a.a);
   public static final cq.a<cl.b> c = a("stored_enchantments", cl.b.a);
   public static final cq.a<co> d = a("potion_contents", co.a);
   public static final cq.a<ci> e = a("custom_data", ci.a);
   public static final cq.a<ch> f = a("container", ch.a);
   public static final cq.a<cg> g = a("bundle_contents", cg.a);
   public static final cq.a<cm> h = a("firework_explosion", cm.a);
   public static final cq.a<cn> i = a("fireworks", cn.a);
   public static final cq.a<cu> j = a("writable_book_content", cu.a);
   public static final cq.a<cv> k = a("written_book_content", cv.a);
   public static final cq.a<cf> l = a("attribute_modifiers", cf.a);
   public static final cq.a<cs> m = a("trim", cs.a);

   private static <T extends cq> cq.a<T> a(String $$0, Codec<T> $$1) {
      return jw.a(lq.as, $$0, new cq.a<>($$1));
   }

   public static cq.a<?> a(jw<cq.a<?>> $$0) {
      return a;
   }
}
