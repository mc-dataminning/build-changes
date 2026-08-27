import java.util.List;
import javax.annotation.Nullable;

public class coa extends cmt {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final vf c = vf.c(ac.a("item", new ahg("smithing_template.ingredients"))).a(a);
   private static final vf d = vf.c(ac.a("item", new ahg("smithing_template.applies_to"))).a(a);
   private static final vf e = vf.c(ac.a("upgrade", new ahg("netherite_upgrade"))).a(a);
   private static final vf f = vf.c(ac.a("item", new ahg("smithing_template.armor_trim.applies_to"))).a(b);
   private static final vf g = vf.c(ac.a("item", new ahg("smithing_template.armor_trim.ingredients"))).a(b);
   private static final vf h = vf.c(ac.a("item", new ahg("smithing_template.armor_trim.base_slot_description")));
   private static final vf i = vf.c(ac.a("item", new ahg("smithing_template.armor_trim.additions_slot_description")));
   private static final vf j = vf.c(ac.a("item", new ahg("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final vf k = vf.c(ac.a("item", new ahg("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final vf r = vf.c(ac.a("item", new ahg("smithing_template.netherite_upgrade.base_slot_description")));
   private static final vf s = vf.c(ac.a("item", new ahg("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ahg t = new ahg("item/empty_armor_slot_helmet");
   private static final ahg u = new ahg("item/empty_armor_slot_chestplate");
   private static final ahg v = new ahg("item/empty_armor_slot_leggings");
   private static final ahg w = new ahg("item/empty_armor_slot_boots");
   private static final ahg x = new ahg("item/empty_slot_hoe");
   private static final ahg y = new ahg("item/empty_slot_axe");
   private static final ahg z = new ahg("item/empty_slot_sword");
   private static final ahg A = new ahg("item/empty_slot_shovel");
   private static final ahg B = new ahg("item/empty_slot_pickaxe");
   private static final ahg C = new ahg("item/empty_slot_ingot");
   private static final ahg D = new ahg("item/empty_slot_redstone_dust");
   private static final ahg E = new ahg("item/empty_slot_quartz");
   private static final ahg F = new ahg("item/empty_slot_emerald");
   private static final ahg G = new ahg("item/empty_slot_diamond");
   private static final ahg H = new ahg("item/empty_slot_lapis_lazuli");
   private static final ahg I = new ahg("item/empty_slot_amethyst_shard");
   private final vf J;
   private final vf K;
   private final vf L;
   private final vf M;
   private final vf N;
   private final List<ahg> O;
   private final List<ahg> P;

   public coa(vf $$0, vf $$1, vf $$2, vf $$3, vf $$4, List<ahg> $$5, List<ahg> $$6) {
      super(new cmt.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static coa a(ahf<cpe> $$0) {
      return a($$0.a());
   }

   public static coa a(ahg $$0) {
      return new coa(f, g, vf.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static coa h() {
      return new coa(j, k, e, r, s, C(), D());
   }

   private static List<ahg> A() {
      return List.of(t, u, v, w);
   }

   private static List<ahg> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ahg> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ahg> D() {
      return List.of(C);
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(ve.a);
      $$2.add(d);
      $$2.add(ve.a().b(this.J));
      $$2.add(c);
      $$2.add(ve.a().b(this.K));
   }

   public vf i() {
      return this.M;
   }

   public vf x() {
      return this.N;
   }

   public List<ahg> y() {
      return this.O;
   }

   public List<ahg> z() {
      return this.P;
   }
}
