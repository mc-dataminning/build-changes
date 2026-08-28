import java.util.List;

public class cvg extends ctx {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wu c = wu.c(ac.a("item", new akk("smithing_template.ingredients"))).a(a);
   private static final wu j = wu.c(ac.a("item", new akk("smithing_template.applies_to"))).a(a);
   private static final wu k = wu.c(ac.a("upgrade", new akk("netherite_upgrade"))).a(a);
   private static final wu l = wu.c(ac.a("item", new akk("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wu m = wu.c(ac.a("item", new akk("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wu n = wu.c(ac.a("item", new akk("smithing_template.armor_trim.base_slot_description")));
   private static final wu o = wu.c(ac.a("item", new akk("smithing_template.armor_trim.additions_slot_description")));
   private static final wu p = wu.c(ac.a("item", new akk("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wu q = wu.c(ac.a("item", new akk("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wu r = wu.c(ac.a("item", new akk("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wu s = wu.c(ac.a("item", new akk("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akk t = new akk("item/empty_armor_slot_helmet");
   private static final akk u = new akk("item/empty_armor_slot_chestplate");
   private static final akk v = new akk("item/empty_armor_slot_leggings");
   private static final akk w = new akk("item/empty_armor_slot_boots");
   private static final akk x = new akk("item/empty_slot_hoe");
   private static final akk y = new akk("item/empty_slot_axe");
   private static final akk z = new akk("item/empty_slot_sword");
   private static final akk A = new akk("item/empty_slot_shovel");
   private static final akk B = new akk("item/empty_slot_pickaxe");
   private static final akk C = new akk("item/empty_slot_ingot");
   private static final akk D = new akk("item/empty_slot_redstone_dust");
   private static final akk E = new akk("item/empty_slot_quartz");
   private static final akk F = new akk("item/empty_slot_emerald");
   private static final akk G = new akk("item/empty_slot_diamond");
   private static final akk H = new akk("item/empty_slot_lapis_lazuli");
   private static final akk I = new akk("item/empty_slot_amethyst_shard");
   private final wu J;
   private final wu K;
   private final wu L;
   private final wu M;
   private final wu N;
   private final List<akk> O;
   private final List<akk> P;

   public cvg(wu $$0, wu $$1, wu $$2, wu $$3, wu $$4, List<akk> $$5, List<akk> $$6, cow... $$7) {
      super(new ctx.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cvg a(akj<cwj> $$0, cow... $$1) {
      return a($$0.a(), $$1);
   }

   public static cvg a(akk $$0, cow... $$1) {
      return new cvg(l, m, wu.c(ac.a("trim_pattern", $$0)).a(a), n, o, x(), y(), $$1);
   }

   public static cvg h() {
      return new cvg(p, q, k, r, s, z(), A());
   }

   private static List<akk> x() {
      return List.of(t, u, v, w);
   }

   private static List<akk> y() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<akk> z() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<akk> A() {
      return List.of(C);
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(wt.a);
      $$2.add(j);
      $$2.add(wt.a().b(this.J));
      $$2.add(c);
      $$2.add(wt.a().b(this.K));
   }

   public wu k() {
      return this.M;
   }

   public wu l() {
      return this.N;
   }

   public List<akk> m() {
      return this.O;
   }

   public List<akk> n() {
      return this.P;
   }
}
