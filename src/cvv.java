import java.util.List;

public class cvv extends cuj {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wy c = wy.c(ad.a("item", akq.b("smithing_template.ingredients"))).a(a);
   private static final wy j = wy.c(ad.a("item", akq.b("smithing_template.applies_to"))).a(a);
   private static final wy k = wy.c(ad.a("upgrade", akq.b("netherite_upgrade"))).a(a);
   private static final wy l = wy.c(ad.a("item", akq.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wy m = wy.c(ad.a("item", akq.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wy n = wy.c(ad.a("item", akq.b("smithing_template.armor_trim.base_slot_description")));
   private static final wy o = wy.c(ad.a("item", akq.b("smithing_template.armor_trim.additions_slot_description")));
   private static final wy p = wy.c(ad.a("item", akq.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wy q = wy.c(ad.a("item", akq.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wy r = wy.c(ad.a("item", akq.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wy s = wy.c(ad.a("item", akq.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akq t = akq.b("item/empty_armor_slot_helmet");
   private static final akq u = akq.b("item/empty_armor_slot_chestplate");
   private static final akq v = akq.b("item/empty_armor_slot_leggings");
   private static final akq w = akq.b("item/empty_armor_slot_boots");
   private static final akq x = akq.b("item/empty_slot_hoe");
   private static final akq y = akq.b("item/empty_slot_axe");
   private static final akq z = akq.b("item/empty_slot_sword");
   private static final akq A = akq.b("item/empty_slot_shovel");
   private static final akq B = akq.b("item/empty_slot_pickaxe");
   private static final akq C = akq.b("item/empty_slot_ingot");
   private static final akq D = akq.b("item/empty_slot_redstone_dust");
   private static final akq E = akq.b("item/empty_slot_quartz");
   private static final akq F = akq.b("item/empty_slot_emerald");
   private static final akq G = akq.b("item/empty_slot_diamond");
   private static final akq H = akq.b("item/empty_slot_lapis_lazuli");
   private static final akq I = akq.b("item/empty_slot_amethyst_shard");
   private final wy J;
   private final wy K;
   private final wy L;
   private final wy M;
   private final wy N;
   private final List<akq> O;
   private final List<akq> P;

   public cvv(wy $$0, wy $$1, wy $$2, wy $$3, wy $$4, List<akq> $$5, List<akq> $$6, cph... $$7) {
      super(new cuj.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cvv a(akp<cwy> $$0, cph... $$1) {
      return a($$0.a(), $$1);
   }

   public static cvv a(akq $$0, cph... $$1) {
      return new cvv(l, m, wy.c(ad.a("trim_pattern", $$0)).a(a), n, o, x(), y(), $$1);
   }

   public static cvv h() {
      return new cvv(p, q, k, r, s, z(), A());
   }

   private static List<akq> x() {
      return List.of(t, u, v, w);
   }

   private static List<akq> y() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<akq> z() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<akq> A() {
      return List.of(C);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(wx.a);
      $$2.add(j);
      $$2.add(wx.a().b(this.J));
      $$2.add(c);
      $$2.add(wx.a().b(this.K));
   }

   public wy k() {
      return this.M;
   }

   public wy l() {
      return this.N;
   }

   public List<akq> m() {
      return this.O;
   }

   public List<akq> n() {
      return this.P;
   }
}
