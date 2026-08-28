import java.util.List;

public class cxl extends cwb {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xl c = xl.c(ae.a("item", all.b("smithing_template.ingredients"))).a(a);
   private static final xl d = xl.c(ae.a("item", all.b("smithing_template.applies_to"))).a(a);
   private static final xl l = xl.c(ae.a("item", all.b("smithing_template"))).a(a);
   private static final xl m = xl.c(ae.a("item", all.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xl n = xl.c(ae.a("item", all.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xl o = xl.c(ae.a("item", all.b("smithing_template.armor_trim.base_slot_description")));
   private static final xl p = xl.c(ae.a("item", all.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xl q = xl.c(ae.a("item", all.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xl r = xl.c(ae.a("item", all.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xl s = xl.c(ae.a("item", all.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xl t = xl.c(ae.a("item", all.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final all u = all.b("item/empty_armor_slot_helmet");
   private static final all v = all.b("item/empty_armor_slot_chestplate");
   private static final all w = all.b("item/empty_armor_slot_leggings");
   private static final all x = all.b("item/empty_armor_slot_boots");
   private static final all y = all.b("item/empty_slot_hoe");
   private static final all z = all.b("item/empty_slot_axe");
   private static final all A = all.b("item/empty_slot_sword");
   private static final all B = all.b("item/empty_slot_shovel");
   private static final all C = all.b("item/empty_slot_pickaxe");
   private static final all D = all.b("item/empty_slot_ingot");
   private static final all E = all.b("item/empty_slot_redstone_dust");
   private static final all F = all.b("item/empty_slot_quartz");
   private static final all G = all.b("item/empty_slot_emerald");
   private static final all H = all.b("item/empty_slot_diamond");
   private static final all I = all.b("item/empty_slot_lapis_lazuli");
   private static final all J = all.b("item/empty_slot_amethyst_shard");
   private final xl K;
   private final xl L;
   private final xl M;
   private final xl N;
   private final List<all> O;
   private final List<all> P;

   public cxl(xl $$0, xl $$1, xl $$2, xl $$3, List<all> $$4, List<all> $$5, cwb.a $$6) {
      super($$6);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.O = $$4;
      this.P = $$5;
   }

   public static cxl a(cwb.a $$0) {
      return new cxl(m, n, o, p, q(), r(), $$0);
   }

   public static cxl b(cwb.a $$0) {
      return new cxl(q, r, s, t, s(), t(), $$0);
   }

   private static List<all> q() {
      return List.of(u, v, w, x);
   }

   private static List<all> r() {
      return List.of(D, E, I, F, H, G, J);
   }

   private static List<all> s() {
      return List.of(u, A, v, C, w, z, x, y, B);
   }

   private static List<all> t() {
      return List.of(D);
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(l);
      $$2.add(xk.a);
      $$2.add(d);
      $$2.add(xk.a().b(this.K));
      $$2.add(c);
      $$2.add(xk.a().b(this.L));
   }

   public xl b() {
      return this.M;
   }

   public xl c() {
      return this.N;
   }

   public List<all> d() {
      return this.O;
   }

   public List<all> p() {
      return this.P;
   }
}
