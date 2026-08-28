import java.util.List;

public class cxs extends cwi {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xj c = xj.c(ae.a("item", alj.b("smithing_template.ingredients"))).a(a);
   private static final xj d = xj.c(ae.a("item", alj.b("smithing_template.applies_to"))).a(a);
   private static final xj l = xj.c(ae.a("item", alj.b("smithing_template"))).a(a);
   private static final xj m = xj.c(ae.a("item", alj.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xj n = xj.c(ae.a("item", alj.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xj o = xj.c(ae.a("item", alj.b("smithing_template.armor_trim.base_slot_description")));
   private static final xj p = xj.c(ae.a("item", alj.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xj q = xj.c(ae.a("item", alj.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xj r = xj.c(ae.a("item", alj.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xj s = xj.c(ae.a("item", alj.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xj t = xj.c(ae.a("item", alj.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alj u = alj.b("item/empty_armor_slot_helmet");
   private static final alj v = alj.b("item/empty_armor_slot_chestplate");
   private static final alj w = alj.b("item/empty_armor_slot_leggings");
   private static final alj x = alj.b("item/empty_armor_slot_boots");
   private static final alj y = alj.b("item/empty_slot_hoe");
   private static final alj z = alj.b("item/empty_slot_axe");
   private static final alj A = alj.b("item/empty_slot_sword");
   private static final alj B = alj.b("item/empty_slot_shovel");
   private static final alj C = alj.b("item/empty_slot_pickaxe");
   private static final alj D = alj.b("item/empty_slot_ingot");
   private static final alj E = alj.b("item/empty_slot_redstone_dust");
   private static final alj F = alj.b("item/empty_slot_quartz");
   private static final alj G = alj.b("item/empty_slot_emerald");
   private static final alj H = alj.b("item/empty_slot_diamond");
   private static final alj I = alj.b("item/empty_slot_lapis_lazuli");
   private static final alj J = alj.b("item/empty_slot_amethyst_shard");
   private final xj K;
   private final xj L;
   private final xj M;
   private final xj N;
   private final List<alj> O;
   private final List<alj> P;

   public cxs(xj $$0, xj $$1, xj $$2, xj $$3, List<alj> $$4, List<alj> $$5, cwi.a $$6) {
      super($$6);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.O = $$4;
      this.P = $$5;
   }

   public static cxs a(cwi.a $$0) {
      return new cxs(m, n, o, p, q(), r(), $$0);
   }

   public static cxs b(cwi.a $$0) {
      return new cxs(q, r, s, t, s(), t(), $$0);
   }

   private static List<alj> q() {
      return List.of(u, v, w, x);
   }

   private static List<alj> r() {
      return List.of(D, E, I, F, H, G, J);
   }

   private static List<alj> s() {
      return List.of(u, A, v, C, w, z, x, y, B);
   }

   private static List<alj> t() {
      return List.of(D);
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(l);
      $$2.add(xi.a);
      $$2.add(d);
      $$2.add(xi.a().b(this.K));
      $$2.add(c);
      $$2.add(xi.a().b(this.L));
   }

   public xj b() {
      return this.M;
   }

   public xj c() {
      return this.N;
   }

   public List<alj> d() {
      return this.O;
   }

   public List<alj> p() {
      return this.P;
   }
}
