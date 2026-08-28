import java.util.List;

public class cvo extends cuf {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xl c = xl.c(ac.a("item", new alb("smithing_template.ingredients"))).a(a);
   private static final xl j = xl.c(ac.a("item", new alb("smithing_template.applies_to"))).a(a);
   private static final xl k = xl.c(ac.a("upgrade", new alb("netherite_upgrade"))).a(a);
   private static final xl l = xl.c(ac.a("item", new alb("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xl m = xl.c(ac.a("item", new alb("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xl n = xl.c(ac.a("item", new alb("smithing_template.armor_trim.base_slot_description")));
   private static final xl o = xl.c(ac.a("item", new alb("smithing_template.armor_trim.additions_slot_description")));
   private static final xl p = xl.c(ac.a("item", new alb("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xl q = xl.c(ac.a("item", new alb("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xl r = xl.c(ac.a("item", new alb("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xl s = xl.c(ac.a("item", new alb("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alb t = new alb("item/empty_armor_slot_helmet");
   private static final alb u = new alb("item/empty_armor_slot_chestplate");
   private static final alb v = new alb("item/empty_armor_slot_leggings");
   private static final alb w = new alb("item/empty_armor_slot_boots");
   private static final alb x = new alb("item/empty_slot_hoe");
   private static final alb y = new alb("item/empty_slot_axe");
   private static final alb z = new alb("item/empty_slot_sword");
   private static final alb A = new alb("item/empty_slot_shovel");
   private static final alb B = new alb("item/empty_slot_pickaxe");
   private static final alb C = new alb("item/empty_slot_ingot");
   private static final alb D = new alb("item/empty_slot_redstone_dust");
   private static final alb E = new alb("item/empty_slot_quartz");
   private static final alb F = new alb("item/empty_slot_emerald");
   private static final alb G = new alb("item/empty_slot_diamond");
   private static final alb H = new alb("item/empty_slot_lapis_lazuli");
   private static final alb I = new alb("item/empty_slot_amethyst_shard");
   private final xl J;
   private final xl K;
   private final xl L;
   private final xl M;
   private final xl N;
   private final List<alb> O;
   private final List<alb> P;

   public cvo(xl $$0, xl $$1, xl $$2, xl $$3, xl $$4, List<alb> $$5, List<alb> $$6, cpe... $$7) {
      super(new cuf.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cvo a(ala<cwr> $$0, cpe... $$1) {
      return a($$0.a(), $$1);
   }

   public static cvo a(alb $$0, cpe... $$1) {
      return new cvo(l, m, xl.c(ac.a("trim_pattern", $$0)).a(a), n, o, x(), y(), $$1);
   }

   public static cvo h() {
      return new cvo(p, q, k, r, s, z(), A());
   }

   private static List<alb> x() {
      return List.of(t, u, v, w);
   }

   private static List<alb> y() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<alb> z() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<alb> A() {
      return List.of(C);
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(xk.a);
      $$2.add(j);
      $$2.add(xk.a().b(this.J));
      $$2.add(c);
      $$2.add(xk.a().b(this.K));
   }

   public xl k() {
      return this.M;
   }

   public xl l() {
      return this.N;
   }

   public List<alb> m() {
      return this.O;
   }

   public List<alb> n() {
      return this.P;
   }
}
