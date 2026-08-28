import java.util.List;

public class cvu extends cul {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xp c = xp.c(ac.a("item", new alf("smithing_template.ingredients"))).a(a);
   private static final xp j = xp.c(ac.a("item", new alf("smithing_template.applies_to"))).a(a);
   private static final xp k = xp.c(ac.a("upgrade", new alf("netherite_upgrade"))).a(a);
   private static final xp l = xp.c(ac.a("item", new alf("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xp m = xp.c(ac.a("item", new alf("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xp n = xp.c(ac.a("item", new alf("smithing_template.armor_trim.base_slot_description")));
   private static final xp o = xp.c(ac.a("item", new alf("smithing_template.armor_trim.additions_slot_description")));
   private static final xp p = xp.c(ac.a("item", new alf("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xp q = xp.c(ac.a("item", new alf("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xp r = xp.c(ac.a("item", new alf("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xp s = xp.c(ac.a("item", new alf("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alf t = new alf("item/empty_armor_slot_helmet");
   private static final alf u = new alf("item/empty_armor_slot_chestplate");
   private static final alf v = new alf("item/empty_armor_slot_leggings");
   private static final alf w = new alf("item/empty_armor_slot_boots");
   private static final alf x = new alf("item/empty_slot_hoe");
   private static final alf y = new alf("item/empty_slot_axe");
   private static final alf z = new alf("item/empty_slot_sword");
   private static final alf A = new alf("item/empty_slot_shovel");
   private static final alf B = new alf("item/empty_slot_pickaxe");
   private static final alf C = new alf("item/empty_slot_ingot");
   private static final alf D = new alf("item/empty_slot_redstone_dust");
   private static final alf E = new alf("item/empty_slot_quartz");
   private static final alf F = new alf("item/empty_slot_emerald");
   private static final alf G = new alf("item/empty_slot_diamond");
   private static final alf H = new alf("item/empty_slot_lapis_lazuli");
   private static final alf I = new alf("item/empty_slot_amethyst_shard");
   private final xp J;
   private final xp K;
   private final xp L;
   private final xp M;
   private final xp N;
   private final List<alf> O;
   private final List<alf> P;

   public cvu(xp $$0, xp $$1, xp $$2, xp $$3, xp $$4, List<alf> $$5, List<alf> $$6, cpk... $$7) {
      super(new cul.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cvu a(ale<cwx> $$0, cpk... $$1) {
      return a($$0.a(), $$1);
   }

   public static cvu a(alf $$0, cpk... $$1) {
      return new cvu(l, m, xp.c(ac.a("trim_pattern", $$0)).a(a), n, o, x(), y(), $$1);
   }

   public static cvu h() {
      return new cvu(p, q, k, r, s, z(), A());
   }

   private static List<alf> x() {
      return List.of(t, u, v, w);
   }

   private static List<alf> y() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<alf> z() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<alf> A() {
      return List.of(C);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(xo.a);
      $$2.add(j);
      $$2.add(xo.a().b(this.J));
      $$2.add(c);
      $$2.add(xo.a().b(this.K));
   }

   public xp k() {
      return this.M;
   }

   public xp l() {
      return this.N;
   }

   public List<alf> m() {
      return this.O;
   }

   public List<alf> n() {
      return this.P;
   }
}
