import java.util.List;
import javax.annotation.Nullable;

public class cjy extends cir {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final te c = te.c(ac.a("item", new aep("smithing_template.ingredients"))).a(a);
   private static final te d = te.c(ac.a("item", new aep("smithing_template.applies_to"))).a(a);
   private static final te e = te.c(ac.a("upgrade", new aep("netherite_upgrade"))).a(a);
   private static final te f = te.c(ac.a("item", new aep("smithing_template.armor_trim.applies_to"))).a(b);
   private static final te g = te.c(ac.a("item", new aep("smithing_template.armor_trim.ingredients"))).a(b);
   private static final te h = te.c(ac.a("item", new aep("smithing_template.armor_trim.base_slot_description")));
   private static final te i = te.c(ac.a("item", new aep("smithing_template.armor_trim.additions_slot_description")));
   private static final te j = te.c(ac.a("item", new aep("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final te k = te.c(ac.a("item", new aep("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final te r = te.c(ac.a("item", new aep("smithing_template.netherite_upgrade.base_slot_description")));
   private static final te s = te.c(ac.a("item", new aep("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aep t = new aep("item/empty_armor_slot_helmet");
   private static final aep u = new aep("item/empty_armor_slot_chestplate");
   private static final aep v = new aep("item/empty_armor_slot_leggings");
   private static final aep w = new aep("item/empty_armor_slot_boots");
   private static final aep x = new aep("item/empty_slot_hoe");
   private static final aep y = new aep("item/empty_slot_axe");
   private static final aep z = new aep("item/empty_slot_sword");
   private static final aep A = new aep("item/empty_slot_shovel");
   private static final aep B = new aep("item/empty_slot_pickaxe");
   private static final aep C = new aep("item/empty_slot_ingot");
   private static final aep D = new aep("item/empty_slot_redstone_dust");
   private static final aep E = new aep("item/empty_slot_quartz");
   private static final aep F = new aep("item/empty_slot_emerald");
   private static final aep G = new aep("item/empty_slot_diamond");
   private static final aep H = new aep("item/empty_slot_lapis_lazuli");
   private static final aep I = new aep("item/empty_slot_amethyst_shard");
   private final te J;
   private final te K;
   private final te L;
   private final te M;
   private final te N;
   private final List<aep> O;
   private final List<aep> P;

   public cjy(te $$0, te $$1, te $$2, te $$3, te $$4, List<aep> $$5, List<aep> $$6) {
      super(new cir.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cjy a(aeo<clb> $$0) {
      return a($$0.a());
   }

   public static cjy a(aep $$0) {
      return new cjy(f, g, te.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cjy h() {
      return new cjy(j, k, e, r, s, C(), D());
   }

   private static List<aep> A() {
      return List.of(t, u, v, w);
   }

   private static List<aep> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<aep> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<aep> D() {
      return List.of(C);
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(td.a);
      $$2.add(d);
      $$2.add(td.a().b(this.J));
      $$2.add(c);
      $$2.add(td.a().b(this.K));
   }

   public te i() {
      return this.M;
   }

   public te x() {
      return this.N;
   }

   public List<aep> y() {
      return this.O;
   }

   public List<aep> z() {
      return this.P;
   }
}
