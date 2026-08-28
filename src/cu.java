import com.mojang.serialization.Codec;

public class cu {
   public static final ct.a<cl> a = a("damage", cl.a);
   public static final ct.a<cn.a> b = a("enchantments", cn.a.a);
   public static final ct.a<cn.b> c = a("stored_enchantments", cn.b.a);
   public static final ct.a<cr> d = a("potion_contents", cr.a);
   public static final ct.a<ck> e = a("custom_data", ck.a);
   public static final ct.a<cj> f = a("container", cj.a);
   public static final ct.a<ci> g = a("bundle_contents", ci.a);
   public static final ct.a<co> h = a("firework_explosion", co.a);
   public static final ct.a<cp> i = a("fireworks", cp.a);
   public static final ct.a<cx> j = a("writable_book_content", cx.a);
   public static final ct.a<cy> k = a("written_book_content", cy.a);
   public static final ct.a<ch> l = a("attribute_modifiers", ch.a);
   public static final ct.a<cv> m = a("trim", cv.a);
   public static final ct.a<cq> n = a("jukebox_playable", cq.a);

   private static <T extends ct> ct.a<T> a(String $$0, Codec<T> $$1) {
      return kb.a(lv.ar, $$0, new ct.a<>($$1));
   }

   public static ct.a<?> a(kb<ct.a<?>> $$0) {
      return a;
   }
}
