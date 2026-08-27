import java.util.List;
import javax.annotation.Nullable;

public class ckj extends cjc {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final tn c = tn.c(ac.a("item", new aey("smithing_template.ingredients"))).a(a);
   private static final tn d = tn.c(ac.a("item", new aey("smithing_template.applies_to"))).a(a);
   private static final tn e = tn.c(ac.a("upgrade", new aey("netherite_upgrade"))).a(a);
   private static final tn f = tn.c(ac.a("item", new aey("smithing_template.armor_trim.applies_to"))).a(b);
   private static final tn g = tn.c(ac.a("item", new aey("smithing_template.armor_trim.ingredients"))).a(b);
   private static final tn h = tn.c(ac.a("item", new aey("smithing_template.armor_trim.base_slot_description")));
   private static final tn i = tn.c(ac.a("item", new aey("smithing_template.armor_trim.additions_slot_description")));
   private static final tn j = tn.c(ac.a("item", new aey("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final tn k = tn.c(ac.a("item", new aey("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final tn r = tn.c(ac.a("item", new aey("smithing_template.netherite_upgrade.base_slot_description")));
   private static final tn s = tn.c(ac.a("item", new aey("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aey t = new aey("item/empty_armor_slot_helmet");
   private static final aey u = new aey("item/empty_armor_slot_chestplate");
   private static final aey v = new aey("item/empty_armor_slot_leggings");
   private static final aey w = new aey("item/empty_armor_slot_boots");
   private static final aey x = new aey("item/empty_slot_hoe");
   private static final aey y = new aey("item/empty_slot_axe");
   private static final aey z = new aey("item/empty_slot_sword");
   private static final aey A = new aey("item/empty_slot_shovel");
   private static final aey B = new aey("item/empty_slot_pickaxe");
   private static final aey C = new aey("item/empty_slot_ingot");
   private static final aey D = new aey("item/empty_slot_redstone_dust");
   private static final aey E = new aey("item/empty_slot_quartz");
   private static final aey F = new aey("item/empty_slot_emerald");
   private static final aey G = new aey("item/empty_slot_diamond");
   private static final aey H = new aey("item/empty_slot_lapis_lazuli");
   private static final aey I = new aey("item/empty_slot_amethyst_shard");
   private final tn J;
   private final tn K;
   private final tn L;
   private final tn M;
   private final tn N;
   private final List<aey> O;
   private final List<aey> P;

   public ckj(tn $$0, tn $$1, tn $$2, tn $$3, tn $$4, List<aey> $$5, List<aey> $$6) {
      super(new cjc.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static ckj a(aex<clm> $$0) {
      return a($$0.a());
   }

   public static ckj a(aey $$0) {
      return new ckj(f, g, tn.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static ckj h() {
      return new ckj(j, k, e, r, s, C(), D());
   }

   private static List<aey> A() {
      return List.of(t, u, v, w);
   }

   private static List<aey> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<aey> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<aey> D() {
      return List.of(C);
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(tm.a);
      $$2.add(d);
      $$2.add(tm.a().b(this.J));
      $$2.add(c);
      $$2.add(tm.a().b(this.K));
   }

   public tn i() {
      return this.M;
   }

   public tn x() {
      return this.N;
   }

   public List<aey> y() {
      return this.O;
   }

   public List<aey> z() {
      return this.P;
   }
}
