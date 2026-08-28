import java.util.List;

public class cwv extends cvk {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xd c = xd.c(ad.a("item", alc.b("smithing_template.ingredients"))).a(a);
   private static final xd d = xd.c(ad.a("item", alc.b("smithing_template.applies_to"))).a(a);
   private static final xd k = xd.c(ad.a("item", alc.b("smithing_template"))).a(a);
   private static final xd l = xd.c(ad.a("item", alc.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xd m = xd.c(ad.a("item", alc.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xd n = xd.c(ad.a("item", alc.b("smithing_template.armor_trim.base_slot_description")));
   private static final xd o = xd.c(ad.a("item", alc.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xd p = xd.c(ad.a("item", alc.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xd q = xd.c(ad.a("item", alc.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xd r = xd.c(ad.a("item", alc.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xd s = xd.c(ad.a("item", alc.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alc t = alc.b("item/empty_armor_slot_helmet");
   private static final alc u = alc.b("item/empty_armor_slot_chestplate");
   private static final alc v = alc.b("item/empty_armor_slot_leggings");
   private static final alc w = alc.b("item/empty_armor_slot_boots");
   private static final alc x = alc.b("item/empty_slot_hoe");
   private static final alc y = alc.b("item/empty_slot_axe");
   private static final alc z = alc.b("item/empty_slot_sword");
   private static final alc A = alc.b("item/empty_slot_shovel");
   private static final alc B = alc.b("item/empty_slot_pickaxe");
   private static final alc C = alc.b("item/empty_slot_ingot");
   private static final alc D = alc.b("item/empty_slot_redstone_dust");
   private static final alc E = alc.b("item/empty_slot_quartz");
   private static final alc F = alc.b("item/empty_slot_emerald");
   private static final alc G = alc.b("item/empty_slot_diamond");
   private static final alc H = alc.b("item/empty_slot_lapis_lazuli");
   private static final alc I = alc.b("item/empty_slot_amethyst_shard");
   private final xd J;
   private final xd K;
   private final xd L;
   private final xd M;
   private final List<alc> N;
   private final List<alc> O;

   public cwv(cvk.a $$0, xd $$1, xd $$2, xd $$3, xd $$4, List<alc> $$5, List<alc> $$6, cql... $$7) {
      super($$0.a($$7));
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
      this.N = $$5;
      this.O = $$6;
   }

   public static cwv a(cvk.a $$0, cql... $$1) {
      return new cwv($$0, l, m, n, o, k(), l(), $$1);
   }

   public static cwv a(cvk.a $$0) {
      return new cwv($$0, p, q, r, s, m(), w());
   }

   private static List<alc> k() {
      return List.of(t, u, v, w);
   }

   private static List<alc> l() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<alc> m() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<alc> w() {
      return List.of(C);
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(k);
      $$2.add(xc.a);
      $$2.add(d);
      $$2.add(xc.a().b(this.J));
      $$2.add(c);
      $$2.add(xc.a().b(this.K));
   }

   public xd c() {
      return this.L;
   }

   public xd d() {
      return this.M;
   }

   public List<alc> g() {
      return this.N;
   }

   public List<alc> j() {
      return this.O;
   }
}
