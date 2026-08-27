import java.util.List;
import javax.annotation.Nullable;

public class cnt extends cmm {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final vd c = vd.c(ac.a("item", new ahd("smithing_template.ingredients"))).a(a);
   private static final vd d = vd.c(ac.a("item", new ahd("smithing_template.applies_to"))).a(a);
   private static final vd e = vd.c(ac.a("upgrade", new ahd("netherite_upgrade"))).a(a);
   private static final vd f = vd.c(ac.a("item", new ahd("smithing_template.armor_trim.applies_to"))).a(b);
   private static final vd g = vd.c(ac.a("item", new ahd("smithing_template.armor_trim.ingredients"))).a(b);
   private static final vd h = vd.c(ac.a("item", new ahd("smithing_template.armor_trim.base_slot_description")));
   private static final vd i = vd.c(ac.a("item", new ahd("smithing_template.armor_trim.additions_slot_description")));
   private static final vd j = vd.c(ac.a("item", new ahd("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final vd k = vd.c(ac.a("item", new ahd("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final vd r = vd.c(ac.a("item", new ahd("smithing_template.netherite_upgrade.base_slot_description")));
   private static final vd s = vd.c(ac.a("item", new ahd("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ahd t = new ahd("item/empty_armor_slot_helmet");
   private static final ahd u = new ahd("item/empty_armor_slot_chestplate");
   private static final ahd v = new ahd("item/empty_armor_slot_leggings");
   private static final ahd w = new ahd("item/empty_armor_slot_boots");
   private static final ahd x = new ahd("item/empty_slot_hoe");
   private static final ahd y = new ahd("item/empty_slot_axe");
   private static final ahd z = new ahd("item/empty_slot_sword");
   private static final ahd A = new ahd("item/empty_slot_shovel");
   private static final ahd B = new ahd("item/empty_slot_pickaxe");
   private static final ahd C = new ahd("item/empty_slot_ingot");
   private static final ahd D = new ahd("item/empty_slot_redstone_dust");
   private static final ahd E = new ahd("item/empty_slot_quartz");
   private static final ahd F = new ahd("item/empty_slot_emerald");
   private static final ahd G = new ahd("item/empty_slot_diamond");
   private static final ahd H = new ahd("item/empty_slot_lapis_lazuli");
   private static final ahd I = new ahd("item/empty_slot_amethyst_shard");
   private final vd J;
   private final vd K;
   private final vd L;
   private final vd M;
   private final vd N;
   private final List<ahd> O;
   private final List<ahd> P;

   public cnt(vd $$0, vd $$1, vd $$2, vd $$3, vd $$4, List<ahd> $$5, List<ahd> $$6) {
      super(new cmm.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cnt a(ahc<cox> $$0) {
      return a($$0.a());
   }

   public static cnt a(ahd $$0) {
      return new cnt(f, g, vd.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cnt h() {
      return new cnt(j, k, e, r, s, C(), D());
   }

   private static List<ahd> A() {
      return List.of(t, u, v, w);
   }

   private static List<ahd> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ahd> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ahd> D() {
      return List.of(C);
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(vc.a);
      $$2.add(d);
      $$2.add(vc.a().b(this.J));
      $$2.add(c);
      $$2.add(vc.a().b(this.K));
   }

   public vd i() {
      return this.M;
   }

   public vd x() {
      return this.N;
   }

   public List<ahd> y() {
      return this.O;
   }

   public List<ahd> z() {
      return this.P;
   }
}
