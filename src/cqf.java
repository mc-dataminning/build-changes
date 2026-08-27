import java.util.List;
import javax.annotation.Nullable;

public class cqf extends coy {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final vq c = vq.c(ac.a("item", new aiy("smithing_template.ingredients"))).a(a);
   private static final vq d = vq.c(ac.a("item", new aiy("smithing_template.applies_to"))).a(a);
   private static final vq e = vq.c(ac.a("upgrade", new aiy("netherite_upgrade"))).a(a);
   private static final vq f = vq.c(ac.a("item", new aiy("smithing_template.armor_trim.applies_to"))).a(b);
   private static final vq g = vq.c(ac.a("item", new aiy("smithing_template.armor_trim.ingredients"))).a(b);
   private static final vq h = vq.c(ac.a("item", new aiy("smithing_template.armor_trim.base_slot_description")));
   private static final vq i = vq.c(ac.a("item", new aiy("smithing_template.armor_trim.additions_slot_description")));
   private static final vq j = vq.c(ac.a("item", new aiy("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final vq k = vq.c(ac.a("item", new aiy("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final vq r = vq.c(ac.a("item", new aiy("smithing_template.netherite_upgrade.base_slot_description")));
   private static final vq s = vq.c(ac.a("item", new aiy("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aiy t = new aiy("item/empty_armor_slot_helmet");
   private static final aiy u = new aiy("item/empty_armor_slot_chestplate");
   private static final aiy v = new aiy("item/empty_armor_slot_leggings");
   private static final aiy w = new aiy("item/empty_armor_slot_boots");
   private static final aiy x = new aiy("item/empty_slot_hoe");
   private static final aiy y = new aiy("item/empty_slot_axe");
   private static final aiy z = new aiy("item/empty_slot_sword");
   private static final aiy A = new aiy("item/empty_slot_shovel");
   private static final aiy B = new aiy("item/empty_slot_pickaxe");
   private static final aiy C = new aiy("item/empty_slot_ingot");
   private static final aiy D = new aiy("item/empty_slot_redstone_dust");
   private static final aiy E = new aiy("item/empty_slot_quartz");
   private static final aiy F = new aiy("item/empty_slot_emerald");
   private static final aiy G = new aiy("item/empty_slot_diamond");
   private static final aiy H = new aiy("item/empty_slot_lapis_lazuli");
   private static final aiy I = new aiy("item/empty_slot_amethyst_shard");
   private final vq J;
   private final vq K;
   private final vq L;
   private final vq M;
   private final vq N;
   private final List<aiy> O;
   private final List<aiy> P;

   public cqf(vq $$0, vq $$1, vq $$2, vq $$3, vq $$4, List<aiy> $$5, List<aiy> $$6) {
      super(new coy.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cqf a(aix<crh> $$0) {
      return a($$0.a());
   }

   public static cqf a(aiy $$0) {
      return new cqf(f, g, vq.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cqf h() {
      return new cqf(j, k, e, r, s, C(), D());
   }

   private static List<aiy> A() {
      return List.of(t, u, v, w);
   }

   private static List<aiy> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<aiy> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<aiy> D() {
      return List.of(C);
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(vp.a);
      $$2.add(d);
      $$2.add(vp.a().b(this.J));
      $$2.add(c);
      $$2.add(vp.a().b(this.K));
   }

   public vq w() {
      return this.M;
   }

   public vq x() {
      return this.N;
   }

   public List<aiy> y() {
      return this.O;
   }

   public List<aiy> z() {
      return this.P;
   }
}
