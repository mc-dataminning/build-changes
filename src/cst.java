import java.util.List;
import javax.annotation.Nullable;

public class cst extends crn {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wi c = wi.c(ac.a("item", new ajv("smithing_template.ingredients"))).a(a);
   private static final wi j = wi.c(ac.a("item", new ajv("smithing_template.applies_to"))).a(a);
   private static final wi k = wi.c(ac.a("upgrade", new ajv("netherite_upgrade"))).a(a);
   private static final wi l = wi.c(ac.a("item", new ajv("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wi m = wi.c(ac.a("item", new ajv("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wi n = wi.c(ac.a("item", new ajv("smithing_template.armor_trim.base_slot_description")));
   private static final wi o = wi.c(ac.a("item", new ajv("smithing_template.armor_trim.additions_slot_description")));
   private static final wi p = wi.c(ac.a("item", new ajv("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wi q = wi.c(ac.a("item", new ajv("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wi r = wi.c(ac.a("item", new ajv("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wi s = wi.c(ac.a("item", new ajv("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ajv t = new ajv("item/empty_armor_slot_helmet");
   private static final ajv u = new ajv("item/empty_armor_slot_chestplate");
   private static final ajv v = new ajv("item/empty_armor_slot_leggings");
   private static final ajv w = new ajv("item/empty_armor_slot_boots");
   private static final ajv x = new ajv("item/empty_slot_hoe");
   private static final ajv y = new ajv("item/empty_slot_axe");
   private static final ajv z = new ajv("item/empty_slot_sword");
   private static final ajv A = new ajv("item/empty_slot_shovel");
   private static final ajv B = new ajv("item/empty_slot_pickaxe");
   private static final ajv C = new ajv("item/empty_slot_ingot");
   private static final ajv D = new ajv("item/empty_slot_redstone_dust");
   private static final ajv E = new ajv("item/empty_slot_quartz");
   private static final ajv F = new ajv("item/empty_slot_emerald");
   private static final ajv G = new ajv("item/empty_slot_diamond");
   private static final ajv H = new ajv("item/empty_slot_lapis_lazuli");
   private static final ajv I = new ajv("item/empty_slot_amethyst_shard");
   private final wi J;
   private final wi K;
   private final wi L;
   private final wi M;
   private final wi N;
   private final List<ajv> O;
   private final List<ajv> P;

   public cst(wi $$0, wi $$1, wi $$2, wi $$3, wi $$4, List<ajv> $$5, List<ajv> $$6) {
      super(new crn.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cst a(aju<ctw> $$0) {
      return a($$0.a());
   }

   public static cst a(ajv $$0) {
      return new cst(l, m, wi.c(ac.a("trim_pattern", $$0)).a(a), n, o, B(), C());
   }

   public static cst h() {
      return new cst(p, q, k, r, s, D(), E());
   }

   private static List<ajv> B() {
      return List.of(t, u, v, w);
   }

   private static List<ajv> C() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ajv> D() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ajv> E() {
      return List.of(C);
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(wh.a);
      $$2.add(j);
      $$2.add(wh.a().b(this.J));
      $$2.add(c);
      $$2.add(wh.a().b(this.K));
   }

   public wi i() {
      return this.M;
   }

   public wi j() {
      return this.N;
   }

   public List<ajv> k() {
      return this.O;
   }

   public List<ajv> l() {
      return this.P;
   }
}
