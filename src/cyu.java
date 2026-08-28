import java.util.List;

public class cyu extends cxk {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xv c = xv.c(ae.a("item", alz.b("smithing_template.ingredients"))).a(a);
   private static final xv d = xv.c(ae.a("item", alz.b("smithing_template.applies_to"))).a(a);
   private static final xv l = xv.c(ae.a("item", alz.b("smithing_template"))).a(a);
   private static final xv m = xv.c(ae.a("item", alz.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xv n = xv.c(ae.a("item", alz.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xv o = xv.c(ae.a("item", alz.b("smithing_template.armor_trim.base_slot_description")));
   private static final xv p = xv.c(ae.a("item", alz.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xv q = xv.c(ae.a("item", alz.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xv r = xv.c(ae.a("item", alz.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xv s = xv.c(ae.a("item", alz.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xv t = xv.c(ae.a("item", alz.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alz u = alz.b("item/empty_armor_slot_helmet");
   private static final alz v = alz.b("item/empty_armor_slot_chestplate");
   private static final alz w = alz.b("item/empty_armor_slot_leggings");
   private static final alz x = alz.b("item/empty_armor_slot_boots");
   private static final alz y = alz.b("item/empty_slot_hoe");
   private static final alz z = alz.b("item/empty_slot_axe");
   private static final alz A = alz.b("item/empty_slot_sword");
   private static final alz B = alz.b("item/empty_slot_shovel");
   private static final alz C = alz.b("item/empty_slot_pickaxe");
   private static final alz D = alz.b("item/empty_slot_ingot");
   private static final alz E = alz.b("item/empty_slot_redstone_dust");
   private static final alz F = alz.b("item/empty_slot_quartz");
   private static final alz G = alz.b("item/empty_slot_emerald");
   private static final alz H = alz.b("item/empty_slot_diamond");
   private static final alz I = alz.b("item/empty_slot_lapis_lazuli");
   private static final alz J = alz.b("item/empty_slot_amethyst_shard");
   private final xv K;
   private final xv L;
   private final xv M;
   private final xv N;
   private final List<alz> O;
   private final List<alz> P;

   public cyu(xv $$0, xv $$1, xv $$2, xv $$3, List<alz> $$4, List<alz> $$5, cxk.a $$6) {
      super($$6);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.O = $$4;
      this.P = $$5;
   }

   public static cyu a(cxk.a $$0) {
      return new cyu(m, n, o, p, p(), q(), $$0);
   }

   public static cyu b(cxk.a $$0) {
      return new cyu(q, r, s, t, r(), s(), $$0);
   }

   private static List<alz> p() {
      return List.of(u, v, w, x);
   }

   private static List<alz> q() {
      return List.of(D, E, I, F, H, G, J);
   }

   private static List<alz> r() {
      return List.of(u, A, v, C, w, z, x, y, B);
   }

   private static List<alz> s() {
      return List.of(D);
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(l);
      $$2.add(xu.a);
      $$2.add(d);
      $$2.add(xu.a().b(this.K));
      $$2.add(c);
      $$2.add(xu.a().b(this.L));
   }

   public xv b() {
      return this.M;
   }

   public xv c() {
      return this.N;
   }

   public List<alz> d() {
      return this.O;
   }

   public List<alz> o() {
      return this.P;
   }
}
