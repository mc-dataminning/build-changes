import com.mojang.serialization.Codec;

public class cx {
   public static final cw.a<co> a = a("damage", co.a);
   public static final cw.a<cq.a> b = a("enchantments", cq.a.a);
   public static final cw.a<cq.b> c = a("stored_enchantments", cq.b.a);
   public static final cw.a<cu> d = a("potion_contents", cu.a);
   public static final cw.a<cn> e = a("custom_data", cn.a);
   public static final cw.a<cm> f = a("container", cm.a);
   public static final cw.a<cl> g = a("bundle_contents", cl.a);
   public static final cw.a<cr> h = a("firework_explosion", cr.a);
   public static final cw.a<cs> i = a("fireworks", cs.a);
   public static final cw.a<da> j = a("writable_book_content", da.a);
   public static final cw.a<db> k = a("written_book_content", db.a);
   public static final cw.a<ck> l = a("attribute_modifiers", ck.a);
   public static final cw.a<cy> m = a("trim", cy.a);
   public static final cw.a<ct> n = a("jukebox_playable", ct.a);

   private static <T extends cw> cw.a<T> a(String $$0, Codec<T> $$1) {
      return kf.a(md.aq, $$0, new cw.a<>($$1));
   }

   public static cw.a<?> a(kf<cw.a<?>> $$0) {
      return a;
   }
}
