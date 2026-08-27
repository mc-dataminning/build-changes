import java.util.List;
import javax.annotation.Nullable;

public class cus extends ctj {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wx c = wx.c(ac.a("item", new akm("smithing_template.ingredients"))).a(a);
   private static final wx j = wx.c(ac.a("item", new akm("smithing_template.applies_to"))).a(a);
   private static final wx k = wx.c(ac.a("upgrade", new akm("netherite_upgrade"))).a(a);
   private static final wx l = wx.c(ac.a("item", new akm("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wx m = wx.c(ac.a("item", new akm("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wx n = wx.c(ac.a("item", new akm("smithing_template.armor_trim.base_slot_description")));
   private static final wx o = wx.c(ac.a("item", new akm("smithing_template.armor_trim.additions_slot_description")));
   private static final wx p = wx.c(ac.a("item", new akm("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wx q = wx.c(ac.a("item", new akm("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wx r = wx.c(ac.a("item", new akm("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wx s = wx.c(ac.a("item", new akm("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akm t = new akm("item/empty_armor_slot_helmet");
   private static final akm u = new akm("item/empty_armor_slot_chestplate");
   private static final akm v = new akm("item/empty_armor_slot_leggings");
   private static final akm w = new akm("item/empty_armor_slot_boots");
   private static final akm x = new akm("item/empty_slot_hoe");
   private static final akm y = new akm("item/empty_slot_axe");
   private static final akm z = new akm("item/empty_slot_sword");
   private static final akm A = new akm("item/empty_slot_shovel");
   private static final akm B = new akm("item/empty_slot_pickaxe");
   private static final akm C = new akm("item/empty_slot_ingot");
   private static final akm D = new akm("item/empty_slot_redstone_dust");
   private static final akm E = new akm("item/empty_slot_quartz");
   private static final akm F = new akm("item/empty_slot_emerald");
   private static final akm G = new akm("item/empty_slot_diamond");
   private static final akm H = new akm("item/empty_slot_lapis_lazuli");
   private static final akm I = new akm("item/empty_slot_amethyst_shard");
   private final wx J;
   private final wx K;
   private final wx L;
   private final wx M;
   private final wx N;
   private final List<akm> O;
   private final List<akm> P;

   public cus(wx $$0, wx $$1, wx $$2, wx $$3, wx $$4, List<akm> $$5, List<akm> $$6, coh... $$7) {
      super(new ctj.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cus a(akl<cvv> $$0, coh... $$1) {
      return a($$0.a(), $$1);
   }

   public static cus a(akm $$0, coh... $$1) {
      return new cus(l, m, wx.c(ac.a("trim_pattern", $$0)).a(a), n, o, w(), x(), $$1);
   }

   public static cus h() {
      return new cus(p, q, k, r, s, y(), z());
   }

   private static List<akm> w() {
      return List.of(t, u, v, w);
   }

   private static List<akm> x() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<akm> y() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<akm> z() {
      return List.of(C);
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(ww.a);
      $$2.add(j);
      $$2.add(ww.a().b(this.J));
      $$2.add(c);
      $$2.add(ww.a().b(this.K));
   }

   public wx j() {
      return this.M;
   }

   public wx k() {
      return this.N;
   }

   public List<akm> l() {
      return this.O;
   }

   public List<akm> m() {
      return this.P;
   }
}
