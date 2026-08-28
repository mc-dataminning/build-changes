import java.util.List;

public class cyv extends cxl {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xv c = xv.c(ae.a("item", alz.b("smithing_template.ingredients"))).a(a);
   private static final xv d = xv.c(ae.a("item", alz.b("smithing_template.applies_to"))).a(a);
   private static final xv m = xv.c(ae.a("item", alz.b("smithing_template"))).a(a);
   private static final xv n = xv.c(ae.a("item", alz.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xv o = xv.c(ae.a("item", alz.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xv p = xv.c(ae.a("item", alz.b("smithing_template.armor_trim.base_slot_description")));
   private static final xv q = xv.c(ae.a("item", alz.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xv r = xv.c(ae.a("item", alz.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xv s = xv.c(ae.a("item", alz.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xv t = xv.c(ae.a("item", alz.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xv u = xv.c(ae.a("item", alz.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alz v = alz.b("item/empty_armor_slot_helmet");
   private static final alz w = alz.b("item/empty_armor_slot_chestplate");
   private static final alz x = alz.b("item/empty_armor_slot_leggings");
   private static final alz y = alz.b("item/empty_armor_slot_boots");
   private static final alz z = alz.b("item/empty_slot_hoe");
   private static final alz A = alz.b("item/empty_slot_axe");
   private static final alz B = alz.b("item/empty_slot_sword");
   private static final alz C = alz.b("item/empty_slot_shovel");
   private static final alz D = alz.b("item/empty_slot_pickaxe");
   private static final alz E = alz.b("item/empty_slot_ingot");
   private static final alz F = alz.b("item/empty_slot_redstone_dust");
   private static final alz G = alz.b("item/empty_slot_quartz");
   private static final alz H = alz.b("item/empty_slot_emerald");
   private static final alz I = alz.b("item/empty_slot_diamond");
   private static final alz J = alz.b("item/empty_slot_lapis_lazuli");
   private static final alz K = alz.b("item/empty_slot_amethyst_shard");
   private final xv L;
   private final xv M;
   private final xv N;
   private final xv O;
   private final List<alz> P;
   private final List<alz> Q;

   public cyv(xv $$0, xv $$1, xv $$2, xv $$3, List<alz> $$4, List<alz> $$5, cxl.a $$6) {
      super($$6);
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.O = $$3;
      this.P = $$4;
      this.Q = $$5;
   }

   public static cyv a(cxl.a $$0) {
      return new cyv(n, o, p, q, p(), q(), $$0);
   }

   public static cyv b(cxl.a $$0) {
      return new cyv(r, s, t, u, r(), s(), $$0);
   }

   private static List<alz> p() {
      return List.of(v, w, x, y);
   }

   private static List<alz> q() {
      return List.of(E, F, J, G, I, H, K);
   }

   private static List<alz> r() {
      return List.of(v, B, w, D, x, A, y, z, C);
   }

   private static List<alz> s() {
      return List.of(E);
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(m);
      $$2.add(xu.a);
      $$2.add(d);
      $$2.add(xu.a().b(this.L));
      $$2.add(c);
      $$2.add(xu.a().b(this.M));
   }

   public xv b() {
      return this.N;
   }

   public xv c() {
      return this.O;
   }

   public List<alz> d() {
      return this.P;
   }

   public List<alz> o() {
      return this.Q;
   }
}
