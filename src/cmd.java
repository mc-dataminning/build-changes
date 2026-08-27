import java.util.List;
import javax.annotation.Nullable;

public class cmd extends ckw {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final ur c = ur.c(ac.a("item", new agg("smithing_template.ingredients"))).a(a);
   private static final ur d = ur.c(ac.a("item", new agg("smithing_template.applies_to"))).a(a);
   private static final ur e = ur.c(ac.a("upgrade", new agg("netherite_upgrade"))).a(a);
   private static final ur f = ur.c(ac.a("item", new agg("smithing_template.armor_trim.applies_to"))).a(b);
   private static final ur g = ur.c(ac.a("item", new agg("smithing_template.armor_trim.ingredients"))).a(b);
   private static final ur h = ur.c(ac.a("item", new agg("smithing_template.armor_trim.base_slot_description")));
   private static final ur i = ur.c(ac.a("item", new agg("smithing_template.armor_trim.additions_slot_description")));
   private static final ur j = ur.c(ac.a("item", new agg("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final ur k = ur.c(ac.a("item", new agg("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final ur r = ur.c(ac.a("item", new agg("smithing_template.netherite_upgrade.base_slot_description")));
   private static final ur s = ur.c(ac.a("item", new agg("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final agg t = new agg("item/empty_armor_slot_helmet");
   private static final agg u = new agg("item/empty_armor_slot_chestplate");
   private static final agg v = new agg("item/empty_armor_slot_leggings");
   private static final agg w = new agg("item/empty_armor_slot_boots");
   private static final agg x = new agg("item/empty_slot_hoe");
   private static final agg y = new agg("item/empty_slot_axe");
   private static final agg z = new agg("item/empty_slot_sword");
   private static final agg A = new agg("item/empty_slot_shovel");
   private static final agg B = new agg("item/empty_slot_pickaxe");
   private static final agg C = new agg("item/empty_slot_ingot");
   private static final agg D = new agg("item/empty_slot_redstone_dust");
   private static final agg E = new agg("item/empty_slot_quartz");
   private static final agg F = new agg("item/empty_slot_emerald");
   private static final agg G = new agg("item/empty_slot_diamond");
   private static final agg H = new agg("item/empty_slot_lapis_lazuli");
   private static final agg I = new agg("item/empty_slot_amethyst_shard");
   private final ur J;
   private final ur K;
   private final ur L;
   private final ur M;
   private final ur N;
   private final List<agg> O;
   private final List<agg> P;

   public cmd(ur $$0, ur $$1, ur $$2, ur $$3, ur $$4, List<agg> $$5, List<agg> $$6) {
      super(new ckw.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cmd a(agf<cng> $$0) {
      return a($$0.a());
   }

   public static cmd a(agg $$0) {
      return new cmd(f, g, ur.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cmd h() {
      return new cmd(j, k, e, r, s, C(), D());
   }

   private static List<agg> A() {
      return List.of(t, u, v, w);
   }

   private static List<agg> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<agg> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<agg> D() {
      return List.of(C);
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
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

   public List<agg> y() {
      return this.O;
   }

   public List<agg> z() {
      return this.P;
   }
}
