import java.util.List;
import javax.annotation.Nullable;

public class cll extends cke {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final ui c = ui.c(ac.a("item", new afw("smithing_template.ingredients"))).a(a);
   private static final ui d = ui.c(ac.a("item", new afw("smithing_template.applies_to"))).a(a);
   private static final ui e = ui.c(ac.a("upgrade", new afw("netherite_upgrade"))).a(a);
   private static final ui f = ui.c(ac.a("item", new afw("smithing_template.armor_trim.applies_to"))).a(b);
   private static final ui g = ui.c(ac.a("item", new afw("smithing_template.armor_trim.ingredients"))).a(b);
   private static final ui h = ui.c(ac.a("item", new afw("smithing_template.armor_trim.base_slot_description")));
   private static final ui i = ui.c(ac.a("item", new afw("smithing_template.armor_trim.additions_slot_description")));
   private static final ui j = ui.c(ac.a("item", new afw("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final ui k = ui.c(ac.a("item", new afw("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final ui r = ui.c(ac.a("item", new afw("smithing_template.netherite_upgrade.base_slot_description")));
   private static final ui s = ui.c(ac.a("item", new afw("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final afw t = new afw("item/empty_armor_slot_helmet");
   private static final afw u = new afw("item/empty_armor_slot_chestplate");
   private static final afw v = new afw("item/empty_armor_slot_leggings");
   private static final afw w = new afw("item/empty_armor_slot_boots");
   private static final afw x = new afw("item/empty_slot_hoe");
   private static final afw y = new afw("item/empty_slot_axe");
   private static final afw z = new afw("item/empty_slot_sword");
   private static final afw A = new afw("item/empty_slot_shovel");
   private static final afw B = new afw("item/empty_slot_pickaxe");
   private static final afw C = new afw("item/empty_slot_ingot");
   private static final afw D = new afw("item/empty_slot_redstone_dust");
   private static final afw E = new afw("item/empty_slot_quartz");
   private static final afw F = new afw("item/empty_slot_emerald");
   private static final afw G = new afw("item/empty_slot_diamond");
   private static final afw H = new afw("item/empty_slot_lapis_lazuli");
   private static final afw I = new afw("item/empty_slot_amethyst_shard");
   private final ui J;
   private final ui K;
   private final ui L;
   private final ui M;
   private final ui N;
   private final List<afw> O;
   private final List<afw> P;

   public cll(ui $$0, ui $$1, ui $$2, ui $$3, ui $$4, List<afw> $$5, List<afw> $$6) {
      super(new cke.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cll a(afv<cmo> $$0) {
      return a($$0.a());
   }

   public static cll a(afw $$0) {
      return new cll(f, g, ui.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cll h() {
      return new cll(j, k, e, r, s, C(), D());
   }

   private static List<afw> A() {
      return List.of(t, u, v, w);
   }

   private static List<afw> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<afw> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<afw> D() {
      return List.of(C);
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(uh.a);
      $$2.add(d);
      $$2.add(uh.a().b(this.J));
      $$2.add(c);
      $$2.add(uh.a().b(this.K));
   }

   public ui i() {
      return this.M;
   }

   public ui x() {
      return this.N;
   }

   public List<afw> y() {
      return this.O;
   }

   public List<afw> z() {
      return this.P;
   }
}
