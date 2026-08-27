import java.util.List;
import javax.annotation.Nullable;

public class cub extends csu {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wu c = wu.c(ac.a("item", new akh("smithing_template.ingredients"))).a(a);
   private static final wu j = wu.c(ac.a("item", new akh("smithing_template.applies_to"))).a(a);
   private static final wu k = wu.c(ac.a("upgrade", new akh("netherite_upgrade"))).a(a);
   private static final wu l = wu.c(ac.a("item", new akh("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wu m = wu.c(ac.a("item", new akh("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wu n = wu.c(ac.a("item", new akh("smithing_template.armor_trim.base_slot_description")));
   private static final wu o = wu.c(ac.a("item", new akh("smithing_template.armor_trim.additions_slot_description")));
   private static final wu p = wu.c(ac.a("item", new akh("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wu q = wu.c(ac.a("item", new akh("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wu r = wu.c(ac.a("item", new akh("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wu s = wu.c(ac.a("item", new akh("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akh t = new akh("item/empty_armor_slot_helmet");
   private static final akh u = new akh("item/empty_armor_slot_chestplate");
   private static final akh v = new akh("item/empty_armor_slot_leggings");
   private static final akh w = new akh("item/empty_armor_slot_boots");
   private static final akh x = new akh("item/empty_slot_hoe");
   private static final akh y = new akh("item/empty_slot_axe");
   private static final akh z = new akh("item/empty_slot_sword");
   private static final akh A = new akh("item/empty_slot_shovel");
   private static final akh B = new akh("item/empty_slot_pickaxe");
   private static final akh C = new akh("item/empty_slot_ingot");
   private static final akh D = new akh("item/empty_slot_redstone_dust");
   private static final akh E = new akh("item/empty_slot_quartz");
   private static final akh F = new akh("item/empty_slot_emerald");
   private static final akh G = new akh("item/empty_slot_diamond");
   private static final akh H = new akh("item/empty_slot_lapis_lazuli");
   private static final akh I = new akh("item/empty_slot_amethyst_shard");
   private final wu J;
   private final wu K;
   private final wu L;
   private final wu M;
   private final wu N;
   private final List<akh> O;
   private final List<akh> P;

   public cub(wu $$0, wu $$1, wu $$2, wu $$3, wu $$4, List<akh> $$5, List<akh> $$6, cns... $$7) {
      super(new csu.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cub a(akg<cve> $$0, cns... $$1) {
      return a($$0.a(), $$1);
   }

   public static cub a(akh $$0, cns... $$1) {
      return new cub(l, m, wu.c(ac.a("trim_pattern", $$0)).a(a), n, o, w(), x(), $$1);
   }

   public static cub h() {
      return new cub(p, q, k, r, s, y(), z());
   }

   private static List<akh> w() {
      return List.of(t, u, v, w);
   }

   private static List<akh> x() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<akh> y() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<akh> z() {
      return List.of(C);
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(wt.a);
      $$2.add(j);
      $$2.add(wt.a().b(this.J));
      $$2.add(c);
      $$2.add(wt.a().b(this.K));
   }

   public wu i() {
      return this.M;
   }

   public wu j() {
      return this.N;
   }

   public List<akh> k() {
      return this.O;
   }

   public List<akh> l() {
      return this.P;
   }
}
