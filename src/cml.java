import java.util.List;
import javax.annotation.Nullable;

public class cml extends cle {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final ur c = ur.c(ac.a("item", new agi("smithing_template.ingredients"))).a(a);
   private static final ur d = ur.c(ac.a("item", new agi("smithing_template.applies_to"))).a(a);
   private static final ur e = ur.c(ac.a("upgrade", new agi("netherite_upgrade"))).a(a);
   private static final ur f = ur.c(ac.a("item", new agi("smithing_template.armor_trim.applies_to"))).a(b);
   private static final ur g = ur.c(ac.a("item", new agi("smithing_template.armor_trim.ingredients"))).a(b);
   private static final ur h = ur.c(ac.a("item", new agi("smithing_template.armor_trim.base_slot_description")));
   private static final ur i = ur.c(ac.a("item", new agi("smithing_template.armor_trim.additions_slot_description")));
   private static final ur j = ur.c(ac.a("item", new agi("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final ur k = ur.c(ac.a("item", new agi("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final ur r = ur.c(ac.a("item", new agi("smithing_template.netherite_upgrade.base_slot_description")));
   private static final ur s = ur.c(ac.a("item", new agi("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final agi t = new agi("item/empty_armor_slot_helmet");
   private static final agi u = new agi("item/empty_armor_slot_chestplate");
   private static final agi v = new agi("item/empty_armor_slot_leggings");
   private static final agi w = new agi("item/empty_armor_slot_boots");
   private static final agi x = new agi("item/empty_slot_hoe");
   private static final agi y = new agi("item/empty_slot_axe");
   private static final agi z = new agi("item/empty_slot_sword");
   private static final agi A = new agi("item/empty_slot_shovel");
   private static final agi B = new agi("item/empty_slot_pickaxe");
   private static final agi C = new agi("item/empty_slot_ingot");
   private static final agi D = new agi("item/empty_slot_redstone_dust");
   private static final agi E = new agi("item/empty_slot_quartz");
   private static final agi F = new agi("item/empty_slot_emerald");
   private static final agi G = new agi("item/empty_slot_diamond");
   private static final agi H = new agi("item/empty_slot_lapis_lazuli");
   private static final agi I = new agi("item/empty_slot_amethyst_shard");
   private final ur J;
   private final ur K;
   private final ur L;
   private final ur M;
   private final ur N;
   private final List<agi> O;
   private final List<agi> P;

   public cml(ur $$0, ur $$1, ur $$2, ur $$3, ur $$4, List<agi> $$5, List<agi> $$6) {
      super(new cle.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cml a(agh<cno> $$0) {
      return a($$0.a());
   }

   public static cml a(agi $$0) {
      return new cml(f, g, ur.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cml h() {
      return new cml(j, k, e, r, s, C(), D());
   }

   private static List<agi> A() {
      return List.of(t, u, v, w);
   }

   private static List<agi> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<agi> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<agi> D() {
      return List.of(C);
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(uq.a);
      $$2.add(d);
      $$2.add(uq.a().b(this.J));
      $$2.add(c);
      $$2.add(uq.a().b(this.K));
   }

   public ur i() {
      return this.M;
   }

   public ur x() {
      return this.N;
   }

   public List<agi> y() {
      return this.O;
   }

   public List<agi> z() {
      return this.P;
   }
}
