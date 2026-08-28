import java.util.List;

public class cwy extends cvn {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xe c = xe.c(ad.a("item", ale.b("smithing_template.ingredients"))).a(a);
   private static final xe d = xe.c(ad.a("item", ale.b("smithing_template.applies_to"))).a(a);
   private static final xe k = xe.c(ad.a("item", ale.b("smithing_template"))).a(a);
   private static final xe l = xe.c(ad.a("item", ale.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xe m = xe.c(ad.a("item", ale.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xe n = xe.c(ad.a("item", ale.b("smithing_template.armor_trim.base_slot_description")));
   private static final xe o = xe.c(ad.a("item", ale.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xe p = xe.c(ad.a("item", ale.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xe q = xe.c(ad.a("item", ale.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xe r = xe.c(ad.a("item", ale.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xe s = xe.c(ad.a("item", ale.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ale t = ale.b("item/empty_armor_slot_helmet");
   private static final ale u = ale.b("item/empty_armor_slot_chestplate");
   private static final ale v = ale.b("item/empty_armor_slot_leggings");
   private static final ale w = ale.b("item/empty_armor_slot_boots");
   private static final ale x = ale.b("item/empty_slot_hoe");
   private static final ale y = ale.b("item/empty_slot_axe");
   private static final ale z = ale.b("item/empty_slot_sword");
   private static final ale A = ale.b("item/empty_slot_shovel");
   private static final ale B = ale.b("item/empty_slot_pickaxe");
   private static final ale C = ale.b("item/empty_slot_ingot");
   private static final ale D = ale.b("item/empty_slot_redstone_dust");
   private static final ale E = ale.b("item/empty_slot_quartz");
   private static final ale F = ale.b("item/empty_slot_emerald");
   private static final ale G = ale.b("item/empty_slot_diamond");
   private static final ale H = ale.b("item/empty_slot_lapis_lazuli");
   private static final ale I = ale.b("item/empty_slot_amethyst_shard");
   private final xe J;
   private final xe K;
   private final xe L;
   private final xe M;
   private final List<ale> N;
   private final List<ale> O;

   public cwy(cvn.a $$0, xe $$1, xe $$2, xe $$3, xe $$4, List<ale> $$5, List<ale> $$6, cqo... $$7) {
      super($$0.a($$7));
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
      this.N = $$5;
      this.O = $$6;
   }

   public static cwy a(cvn.a $$0, cqo... $$1) {
      return new cwy($$0, l, m, n, o, k(), l(), $$1);
   }

   public static cwy a(cvn.a $$0) {
      return new cwy($$0, p, q, r, s, m(), w());
   }

   private static List<ale> k() {
      return List.of(t, u, v, w);
   }

   private static List<ale> l() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ale> m() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ale> w() {
      return List.of(C);
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(k);
      $$2.add(xd.a);
      $$2.add(d);
      $$2.add(xd.a().b(this.J));
      $$2.add(c);
      $$2.add(xd.a().b(this.K));
   }

   public xe c() {
      return this.L;
   }

   public xe d() {
      return this.M;
   }

   public List<ale> g() {
      return this.N;
   }

   public List<ale> j() {
      return this.O;
   }
}
