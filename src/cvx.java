import java.util.List;

public class cvx extends cul {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wz c = wz.c(ad.a("item", akr.b("smithing_template.ingredients"))).a(a);
   private static final wz j = wz.c(ad.a("item", akr.b("smithing_template.applies_to"))).a(a);
   private static final wz k = wz.c(ad.a("upgrade", akr.b("netherite_upgrade"))).a(a);
   private static final wz l = wz.c(ad.a("item", akr.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wz m = wz.c(ad.a("item", akr.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wz n = wz.c(ad.a("item", akr.b("smithing_template.armor_trim.base_slot_description")));
   private static final wz o = wz.c(ad.a("item", akr.b("smithing_template.armor_trim.additions_slot_description")));
   private static final wz p = wz.c(ad.a("item", akr.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wz q = wz.c(ad.a("item", akr.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wz r = wz.c(ad.a("item", akr.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wz s = wz.c(ad.a("item", akr.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akr t = akr.b("item/empty_armor_slot_helmet");
   private static final akr u = akr.b("item/empty_armor_slot_chestplate");
   private static final akr v = akr.b("item/empty_armor_slot_leggings");
   private static final akr w = akr.b("item/empty_armor_slot_boots");
   private static final akr x = akr.b("item/empty_slot_hoe");
   private static final akr y = akr.b("item/empty_slot_axe");
   private static final akr z = akr.b("item/empty_slot_sword");
   private static final akr A = akr.b("item/empty_slot_shovel");
   private static final akr B = akr.b("item/empty_slot_pickaxe");
   private static final akr C = akr.b("item/empty_slot_ingot");
   private static final akr D = akr.b("item/empty_slot_redstone_dust");
   private static final akr E = akr.b("item/empty_slot_quartz");
   private static final akr F = akr.b("item/empty_slot_emerald");
   private static final akr G = akr.b("item/empty_slot_diamond");
   private static final akr H = akr.b("item/empty_slot_lapis_lazuli");
   private static final akr I = akr.b("item/empty_slot_amethyst_shard");
   private final wz J;
   private final wz K;
   private final wz L;
   private final wz M;
   private final wz N;
   private final List<akr> O;
   private final List<akr> P;

   public cvx(wz $$0, wz $$1, wz $$2, wz $$3, wz $$4, List<akr> $$5, List<akr> $$6, cpj... $$7) {
      super(new cul.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cvx a(akq<cxa> $$0, cpj... $$1) {
      return a($$0.a(), $$1);
   }

   public static cvx a(akr $$0, cpj... $$1) {
      return new cvx(l, m, wz.c(ad.a("trim_pattern", $$0)).a(a), n, o, x(), y(), $$1);
   }

   public static cvx h() {
      return new cvx(p, q, k, r, s, z(), A());
   }

   private static List<akr> x() {
      return List.of(t, u, v, w);
   }

   private static List<akr> y() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<akr> z() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<akr> A() {
      return List.of(C);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(wy.a);
      $$2.add(j);
      $$2.add(wy.a().b(this.J));
      $$2.add(c);
      $$2.add(wy.a().b(this.K));
   }

   public wz k() {
      return this.M;
   }

   public wz l() {
      return this.N;
   }

   public List<akr> m() {
      return this.O;
   }

   public List<akr> n() {
      return this.P;
   }
}
