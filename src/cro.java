import java.util.List;
import javax.annotation.Nullable;

public class cro extends cqh {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final vu c = vu.c(ac.a("item", new ajh("smithing_template.ingredients"))).a(a);
   private static final vu d = vu.c(ac.a("item", new ajh("smithing_template.applies_to"))).a(a);
   private static final vu e = vu.c(ac.a("upgrade", new ajh("netherite_upgrade"))).a(a);
   private static final vu f = vu.c(ac.a("item", new ajh("smithing_template.armor_trim.applies_to"))).a(b);
   private static final vu g = vu.c(ac.a("item", new ajh("smithing_template.armor_trim.ingredients"))).a(b);
   private static final vu h = vu.c(ac.a("item", new ajh("smithing_template.armor_trim.base_slot_description")));
   private static final vu i = vu.c(ac.a("item", new ajh("smithing_template.armor_trim.additions_slot_description")));
   private static final vu j = vu.c(ac.a("item", new ajh("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final vu k = vu.c(ac.a("item", new ajh("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final vu r = vu.c(ac.a("item", new ajh("smithing_template.netherite_upgrade.base_slot_description")));
   private static final vu s = vu.c(ac.a("item", new ajh("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ajh t = new ajh("item/empty_armor_slot_helmet");
   private static final ajh u = new ajh("item/empty_armor_slot_chestplate");
   private static final ajh v = new ajh("item/empty_armor_slot_leggings");
   private static final ajh w = new ajh("item/empty_armor_slot_boots");
   private static final ajh x = new ajh("item/empty_slot_hoe");
   private static final ajh y = new ajh("item/empty_slot_axe");
   private static final ajh z = new ajh("item/empty_slot_sword");
   private static final ajh A = new ajh("item/empty_slot_shovel");
   private static final ajh B = new ajh("item/empty_slot_pickaxe");
   private static final ajh C = new ajh("item/empty_slot_ingot");
   private static final ajh D = new ajh("item/empty_slot_redstone_dust");
   private static final ajh E = new ajh("item/empty_slot_quartz");
   private static final ajh F = new ajh("item/empty_slot_emerald");
   private static final ajh G = new ajh("item/empty_slot_diamond");
   private static final ajh H = new ajh("item/empty_slot_lapis_lazuli");
   private static final ajh I = new ajh("item/empty_slot_amethyst_shard");
   private final vu J;
   private final vu K;
   private final vu L;
   private final vu M;
   private final vu N;
   private final List<ajh> O;
   private final List<ajh> P;

   public cro(vu $$0, vu $$1, vu $$2, vu $$3, vu $$4, List<ajh> $$5, List<ajh> $$6) {
      super(new cqh.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cro a(ajg<csr> $$0) {
      return a($$0.a());
   }

   public static cro a(ajh $$0) {
      return new cro(f, g, vu.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cro h() {
      return new cro(j, k, e, r, s, C(), D());
   }

   private static List<ajh> A() {
      return List.of(t, u, v, w);
   }

   private static List<ajh> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ajh> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ajh> D() {
      return List.of(C);
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(vt.a);
      $$2.add(d);
      $$2.add(vt.a().b(this.J));
      $$2.add(c);
      $$2.add(vt.a().b(this.K));
   }

   public vu i() {
      return this.M;
   }

   public vu j() {
      return this.N;
   }

   public List<ajh> y() {
      return this.O;
   }

   public List<ajh> z() {
      return this.P;
   }
}
