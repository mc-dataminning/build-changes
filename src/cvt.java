import java.util.List;
import javax.annotation.Nullable;

public class cvt extends cuc {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xe c = xe.c(ad.a("item", new akt("smithing_template.ingredients"))).a(a);
   private static final xe j = xe.c(ad.a("item", new akt("smithing_template.applies_to"))).a(a);
   private static final xe k = xe.c(ad.a("upgrade", new akt("netherite_upgrade"))).a(a);
   private static final xe l = xe.c(ad.a("item", new akt("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xe m = xe.c(ad.a("item", new akt("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xe n = xe.c(ad.a("item", new akt("smithing_template.armor_trim.base_slot_description")));
   private static final xe o = xe.c(ad.a("item", new akt("smithing_template.armor_trim.additions_slot_description")));
   private static final xe p = xe.c(ad.a("item", new akt("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xe q = xe.c(ad.a("item", new akt("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xe r = xe.c(ad.a("item", new akt("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xe s = xe.c(ad.a("item", new akt("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akt t = new akt("item/empty_armor_slot_helmet");
   private static final akt u = new akt("item/empty_armor_slot_chestplate");
   private static final akt v = new akt("item/empty_armor_slot_leggings");
   private static final akt w = new akt("item/empty_armor_slot_boots");
   private static final akt x = new akt("item/empty_slot_hoe");
   private static final akt y = new akt("item/empty_slot_axe");
   private static final akt z = new akt("item/empty_slot_sword");
   private static final akt A = new akt("item/empty_slot_shovel");
   private static final akt B = new akt("item/empty_slot_pickaxe");
   private static final akt C = new akt("item/empty_slot_ingot");
   private static final akt D = new akt("item/empty_slot_redstone_dust");
   private static final akt E = new akt("item/empty_slot_quartz");
   private static final akt F = new akt("item/empty_slot_emerald");
   private static final akt G = new akt("item/empty_slot_diamond");
   private static final akt H = new akt("item/empty_slot_lapis_lazuli");
   private static final akt I = new akt("item/empty_slot_amethyst_shard");
   private final xe J;
   private final xe K;
   private final xe L;
   private final xe M;
   private final xe N;
   private final List<akt> O;
   private final List<akt> P;

   public cvt(xe $$0, xe $$1, xe $$2, xe $$3, xe $$4, List<akt> $$5, List<akt> $$6, com... $$7) {
      super(new cuc.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cvt a(aks<cwx> $$0, com... $$1) {
      return a($$0.a(), $$1);
   }

   public static cvt a(akt $$0, com... $$1) {
      return new cvt(l, m, xe.c(ad.a("trim_pattern", $$0)).a(a), n, o, l(), w(), $$1);
   }

   public static cvt d() {
      return new cvt(p, q, k, r, s, x(), y());
   }

   private static List<akt> l() {
      return List.of(t, u, v, w);
   }

   private static List<akt> w() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<akt> x() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<akt> y() {
      return List.of(C);
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(xd.a);
      $$2.add(j);
      $$2.add(xd.a().a(this.J));
      $$2.add(c);
      $$2.add(xd.a().a(this.K));
   }

   public xe h() {
      return this.M;
   }

   public xe i() {
      return this.N;
   }

   public List<akt> j() {
      return this.O;
   }

   public List<akt> k() {
      return this.P;
   }
}
