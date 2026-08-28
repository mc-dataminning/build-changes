import com.mojang.serialization.Codec;

public class cw {
   public static final cv.a<cn> a = a("damage", cn.a);
   public static final cv.a<cp.a> b = a("enchantments", cp.a.a);
   public static final cv.a<cp.b> c = a("stored_enchantments", cp.b.a);
   public static final cv.a<ct> d = a("potion_contents", ct.a);
   public static final cv.a<cm> e = a("custom_data", cm.a);
   public static final cv.a<cl> f = a("container", cl.a);
   public static final cv.a<ck> g = a("bundle_contents", ck.a);
   public static final cv.a<cq> h = a("firework_explosion", cq.a);
   public static final cv.a<cr> i = a("fireworks", cr.a);
   public static final cv.a<cz> j = a("writable_book_content", cz.a);
   public static final cv.a<da> k = a("written_book_content", da.a);
   public static final cv.a<cj> l = a("attribute_modifiers", cj.a);
   public static final cv.a<cx> m = a("trim", cx.a);
   public static final cv.a<cs> n = a("jukebox_playable", cs.a);

   private static <T extends cv> cv.a<T> a(String $$0, Codec<T> $$1) {
      return kd.a(lz.aq, $$0, new cv.a<>($$1));
   }

   public static cv.a<?> a(kd<cv.a<?>> $$0) {
      return a;
   }
}
