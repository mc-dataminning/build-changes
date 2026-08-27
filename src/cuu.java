import java.util.List;

public class cuu extends ctl {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wx c = wx.c(ac.a("item", new akn("smithing_template.ingredients"))).a(a);
   private static final wx j = wx.c(ac.a("item", new akn("smithing_template.applies_to"))).a(a);
   private static final wx k = wx.c(ac.a("upgrade", new akn("netherite_upgrade"))).a(a);
   private static final wx l = wx.c(ac.a("item", new akn("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wx m = wx.c(ac.a("item", new akn("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wx n = wx.c(ac.a("item", new akn("smithing_template.armor_trim.base_slot_description")));
   private static final wx o = wx.c(ac.a("item", new akn("smithing_template.armor_trim.additions_slot_description")));
   private static final wx p = wx.c(ac.a("item", new akn("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wx q = wx.c(ac.a("item", new akn("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wx r = wx.c(ac.a("item", new akn("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wx s = wx.c(ac.a("item", new akn("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akn t = new akn("item/empty_armor_slot_helmet");
   private static final akn u = new akn("item/empty_armor_slot_chestplate");
   private static final akn v = new akn("item/empty_armor_slot_leggings");
   private static final akn w = new akn("item/empty_armor_slot_boots");
   private static final akn x = new akn("item/empty_slot_hoe");
   private static final akn y = new akn("item/empty_slot_axe");
   private static final akn z = new akn("item/empty_slot_sword");
   private static final akn A = new akn("item/empty_slot_shovel");
   private static final akn B = new akn("item/empty_slot_pickaxe");
   private static final akn C = new akn("item/empty_slot_ingot");
   private static final akn D = new akn("item/empty_slot_redstone_dust");
   private static final akn E = new akn("item/empty_slot_quartz");
   private static final akn F = new akn("item/empty_slot_emerald");
   private static final akn G = new akn("item/empty_slot_diamond");
   private static final akn H = new akn("item/empty_slot_lapis_lazuli");
   private static final akn I = new akn("item/empty_slot_amethyst_shard");
   private final wx J;
   private final wx K;
   private final wx L;
   private final wx M;
   private final wx N;
   private final List<akn> O;
   private final List<akn> P;

   public cuu(wx $$0, wx $$1, wx $$2, wx $$3, wx $$4, List<akn> $$5, List<akn> $$6, coj... $$7) {
      super(new ctl.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cuu a(akm<cvx> $$0, coj... $$1) {
      return a($$0.a(), $$1);
   }

   public static cuu a(akn $$0, coj... $$1) {
      return new cuu(l, m, wx.c(ac.a("trim_pattern", $$0)).a(a), n, o, x(), y(), $$1);
   }

   public static cuu h() {
      return new cuu(p, q, k, r, s, z(), A());
   }

   private static List<akn> x() {
      return List.of(t, u, v, w);
   }

   private static List<akn> y() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<akn> z() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<akn> A() {
      return List.of(C);
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(ww.a);
      $$2.add(j);
      $$2.add(ww.a().b(this.J));
      $$2.add(c);
      $$2.add(ww.a().b(this.K));
   }

   public wx k() {
      return this.M;
   }

   public wx l() {
      return this.N;
   }

   public List<akn> m() {
      return this.O;
   }

   public List<akn> n() {
      return this.P;
   }
}
