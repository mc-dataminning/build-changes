import java.util.List;

public class cxd extends cvt {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xh c = xh.c(ad.a("item", alh.b("smithing_template.ingredients"))).a(a);
   private static final xh d = xh.c(ad.a("item", alh.b("smithing_template.applies_to"))).a(a);
   private static final xh l = xh.c(ad.a("item", alh.b("smithing_template"))).a(a);
   private static final xh m = xh.c(ad.a("item", alh.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xh n = xh.c(ad.a("item", alh.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xh o = xh.c(ad.a("item", alh.b("smithing_template.armor_trim.base_slot_description")));
   private static final xh p = xh.c(ad.a("item", alh.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xh q = xh.c(ad.a("item", alh.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xh r = xh.c(ad.a("item", alh.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xh s = xh.c(ad.a("item", alh.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xh t = xh.c(ad.a("item", alh.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alh u = alh.b("item/empty_armor_slot_helmet");
   private static final alh v = alh.b("item/empty_armor_slot_chestplate");
   private static final alh w = alh.b("item/empty_armor_slot_leggings");
   private static final alh x = alh.b("item/empty_armor_slot_boots");
   private static final alh y = alh.b("item/empty_slot_hoe");
   private static final alh z = alh.b("item/empty_slot_axe");
   private static final alh A = alh.b("item/empty_slot_sword");
   private static final alh B = alh.b("item/empty_slot_shovel");
   private static final alh C = alh.b("item/empty_slot_pickaxe");
   private static final alh D = alh.b("item/empty_slot_ingot");
   private static final alh E = alh.b("item/empty_slot_redstone_dust");
   private static final alh F = alh.b("item/empty_slot_quartz");
   private static final alh G = alh.b("item/empty_slot_emerald");
   private static final alh H = alh.b("item/empty_slot_diamond");
   private static final alh I = alh.b("item/empty_slot_lapis_lazuli");
   private static final alh J = alh.b("item/empty_slot_amethyst_shard");
   private final xh K;
   private final xh L;
   private final xh M;
   private final xh N;
   private final List<alh> O;
   private final List<alh> P;

   public cxd(xh $$0, xh $$1, xh $$2, xh $$3, List<alh> $$4, List<alh> $$5, cvt.a $$6) {
      super($$6);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.O = $$4;
      this.P = $$5;
   }

   public static cxd a(cvt.a $$0) {
      return new cxd(m, n, o, p, r(), s(), $$0);
   }

   public static cxd b(cvt.a $$0) {
      return new cxd(q, r, s, t, t(), u(), $$0);
   }

   private static List<alh> r() {
      return List.of(u, v, w, x);
   }

   private static List<alh> s() {
      return List.of(D, E, I, F, H, G, J);
   }

   private static List<alh> t() {
      return List.of(u, A, v, C, w, z, x, y, B);
   }

   private static List<alh> u() {
      return List.of(D);
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(l);
      $$2.add(xg.a);
      $$2.add(d);
      $$2.add(xg.a().b(this.K));
      $$2.add(c);
      $$2.add(xg.a().b(this.L));
   }

   public xh c() {
      return this.M;
   }

   public xh d() {
      return this.N;
   }

   public List<alh> p() {
      return this.O;
   }

   public List<alh> q() {
      return this.P;
   }
}
