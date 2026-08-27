import java.util.List;
import javax.annotation.Nullable;

public class coi extends cnb {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final vg c = vg.c(ac.a("item", new ahh("smithing_template.ingredients"))).a(a);
   private static final vg d = vg.c(ac.a("item", new ahh("smithing_template.applies_to"))).a(a);
   private static final vg e = vg.c(ac.a("upgrade", new ahh("netherite_upgrade"))).a(a);
   private static final vg f = vg.c(ac.a("item", new ahh("smithing_template.armor_trim.applies_to"))).a(b);
   private static final vg g = vg.c(ac.a("item", new ahh("smithing_template.armor_trim.ingredients"))).a(b);
   private static final vg h = vg.c(ac.a("item", new ahh("smithing_template.armor_trim.base_slot_description")));
   private static final vg i = vg.c(ac.a("item", new ahh("smithing_template.armor_trim.additions_slot_description")));
   private static final vg j = vg.c(ac.a("item", new ahh("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final vg k = vg.c(ac.a("item", new ahh("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final vg r = vg.c(ac.a("item", new ahh("smithing_template.netherite_upgrade.base_slot_description")));
   private static final vg s = vg.c(ac.a("item", new ahh("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ahh t = new ahh("item/empty_armor_slot_helmet");
   private static final ahh u = new ahh("item/empty_armor_slot_chestplate");
   private static final ahh v = new ahh("item/empty_armor_slot_leggings");
   private static final ahh w = new ahh("item/empty_armor_slot_boots");
   private static final ahh x = new ahh("item/empty_slot_hoe");
   private static final ahh y = new ahh("item/empty_slot_axe");
   private static final ahh z = new ahh("item/empty_slot_sword");
   private static final ahh A = new ahh("item/empty_slot_shovel");
   private static final ahh B = new ahh("item/empty_slot_pickaxe");
   private static final ahh C = new ahh("item/empty_slot_ingot");
   private static final ahh D = new ahh("item/empty_slot_redstone_dust");
   private static final ahh E = new ahh("item/empty_slot_quartz");
   private static final ahh F = new ahh("item/empty_slot_emerald");
   private static final ahh G = new ahh("item/empty_slot_diamond");
   private static final ahh H = new ahh("item/empty_slot_lapis_lazuli");
   private static final ahh I = new ahh("item/empty_slot_amethyst_shard");
   private final vg J;
   private final vg K;
   private final vg L;
   private final vg M;
   private final vg N;
   private final List<ahh> O;
   private final List<ahh> P;

   public coi(vg $$0, vg $$1, vg $$2, vg $$3, vg $$4, List<ahh> $$5, List<ahh> $$6) {
      super(new cnb.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static coi a(ahg<cpm> $$0) {
      return a($$0.a());
   }

   public static coi a(ahh $$0) {
      return new coi(f, g, vg.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static coi h() {
      return new coi(j, k, e, r, s, C(), D());
   }

   private static List<ahh> A() {
      return List.of(t, u, v, w);
   }

   private static List<ahh> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ahh> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ahh> D() {
      return List.of(C);
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(vf.a);
      $$2.add(d);
      $$2.add(vf.a().b(this.J));
      $$2.add(c);
      $$2.add(vf.a().b(this.K));
   }

   public vg w() {
      return this.M;
   }

   public vg x() {
      return this.N;
   }

   public List<ahh> y() {
      return this.O;
   }

   public List<ahh> z() {
      return this.P;
   }
}
