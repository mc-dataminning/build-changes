import com.mojang.serialization.Codec;

public class cv {
   public static final cu.a<cm> a = a("damage", cm.a);
   public static final cu.a<co.a> b = a("enchantments", co.a.a);
   public static final cu.a<co.b> c = a("stored_enchantments", co.b.a);
   public static final cu.a<cs> d = a("potion_contents", cs.a);
   public static final cu.a<cl> e = a("custom_data", cl.a);
   public static final cu.a<ck> f = a("container", ck.a);
   public static final cu.a<cj> g = a("bundle_contents", cj.a);
   public static final cu.a<cp> h = a("firework_explosion", cp.a);
   public static final cu.a<cq> i = a("fireworks", cq.a);
   public static final cu.a<cy> j = a("writable_book_content", cy.a);
   public static final cu.a<cz> k = a("written_book_content", cz.a);
   public static final cu.a<ci> l = a("attribute_modifiers", ci.a);
   public static final cu.a<cw> m = a("trim", cw.a);
   public static final cu.a<cr> n = a("jukebox_playable", cr.a);

   private static <T extends cu> cu.a<T> a(String $$0, Codec<T> $$1) {
      return kc.a(lx.aq, $$0, new cu.a<>($$1));
   }

   public static cu.a<?> a(kc<cu.a<?>> $$0) {
      return a;
   }
}
