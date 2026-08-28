import java.util.List;

public class cvs extends cuj {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xo c = xo.c(ac.a("item", new ale("smithing_template.ingredients"))).a(a);
   private static final xo j = xo.c(ac.a("item", new ale("smithing_template.applies_to"))).a(a);
   private static final xo k = xo.c(ac.a("upgrade", new ale("netherite_upgrade"))).a(a);
   private static final xo l = xo.c(ac.a("item", new ale("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xo m = xo.c(ac.a("item", new ale("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xo n = xo.c(ac.a("item", new ale("smithing_template.armor_trim.base_slot_description")));
   private static final xo o = xo.c(ac.a("item", new ale("smithing_template.armor_trim.additions_slot_description")));
   private static final xo p = xo.c(ac.a("item", new ale("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xo q = xo.c(ac.a("item", new ale("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xo r = xo.c(ac.a("item", new ale("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xo s = xo.c(ac.a("item", new ale("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ale t = new ale("item/empty_armor_slot_helmet");
   private static final ale u = new ale("item/empty_armor_slot_chestplate");
   private static final ale v = new ale("item/empty_armor_slot_leggings");
   private static final ale w = new ale("item/empty_armor_slot_boots");
   private static final ale x = new ale("item/empty_slot_hoe");
   private static final ale y = new ale("item/empty_slot_axe");
   private static final ale z = new ale("item/empty_slot_sword");
   private static final ale A = new ale("item/empty_slot_shovel");
   private static final ale B = new ale("item/empty_slot_pickaxe");
   private static final ale C = new ale("item/empty_slot_ingot");
   private static final ale D = new ale("item/empty_slot_redstone_dust");
   private static final ale E = new ale("item/empty_slot_quartz");
   private static final ale F = new ale("item/empty_slot_emerald");
   private static final ale G = new ale("item/empty_slot_diamond");
   private static final ale H = new ale("item/empty_slot_lapis_lazuli");
   private static final ale I = new ale("item/empty_slot_amethyst_shard");
   private final xo J;
   private final xo K;
   private final xo L;
   private final xo M;
   private final xo N;
   private final List<ale> O;
   private final List<ale> P;

   public cvs(xo $$0, xo $$1, xo $$2, xo $$3, xo $$4, List<ale> $$5, List<ale> $$6, cpi... $$7) {
      super(new cuj.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cvs a(ald<cwv> $$0, cpi... $$1) {
      return a($$0.a(), $$1);
   }

   public static cvs a(ale $$0, cpi... $$1) {
      return new cvs(l, m, xo.c(ac.a("trim_pattern", $$0)).a(a), n, o, x(), y(), $$1);
   }

   public static cvs h() {
      return new cvs(p, q, k, r, s, z(), A());
   }

   private static List<ale> x() {
      return List.of(t, u, v, w);
   }

   private static List<ale> y() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ale> z() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ale> A() {
      return List.of(C);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(xn.a);
      $$2.add(j);
      $$2.add(xn.a().b(this.J));
      $$2.add(c);
      $$2.add(xn.a().b(this.K));
   }

   public xo k() {
      return this.M;
   }

   public xo l() {
      return this.N;
   }

   public List<ale> m() {
      return this.O;
   }

   public List<ale> n() {
      return this.P;
   }
}
