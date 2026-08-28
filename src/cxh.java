import java.util.List;

public class cxh extends cvx {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xi c = xi.c(ae.a("item", ali.b("smithing_template.ingredients"))).a(a);
   private static final xi d = xi.c(ae.a("item", ali.b("smithing_template.applies_to"))).a(a);
   private static final xi l = xi.c(ae.a("item", ali.b("smithing_template"))).a(a);
   private static final xi m = xi.c(ae.a("item", ali.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xi n = xi.c(ae.a("item", ali.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xi o = xi.c(ae.a("item", ali.b("smithing_template.armor_trim.base_slot_description")));
   private static final xi p = xi.c(ae.a("item", ali.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xi q = xi.c(ae.a("item", ali.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xi r = xi.c(ae.a("item", ali.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xi s = xi.c(ae.a("item", ali.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xi t = xi.c(ae.a("item", ali.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ali u = ali.b("item/empty_armor_slot_helmet");
   private static final ali v = ali.b("item/empty_armor_slot_chestplate");
   private static final ali w = ali.b("item/empty_armor_slot_leggings");
   private static final ali x = ali.b("item/empty_armor_slot_boots");
   private static final ali y = ali.b("item/empty_slot_hoe");
   private static final ali z = ali.b("item/empty_slot_axe");
   private static final ali A = ali.b("item/empty_slot_sword");
   private static final ali B = ali.b("item/empty_slot_shovel");
   private static final ali C = ali.b("item/empty_slot_pickaxe");
   private static final ali D = ali.b("item/empty_slot_ingot");
   private static final ali E = ali.b("item/empty_slot_redstone_dust");
   private static final ali F = ali.b("item/empty_slot_quartz");
   private static final ali G = ali.b("item/empty_slot_emerald");
   private static final ali H = ali.b("item/empty_slot_diamond");
   private static final ali I = ali.b("item/empty_slot_lapis_lazuli");
   private static final ali J = ali.b("item/empty_slot_amethyst_shard");
   private final xi K;
   private final xi L;
   private final xi M;
   private final xi N;
   private final List<ali> O;
   private final List<ali> P;

   public cxh(xi $$0, xi $$1, xi $$2, xi $$3, List<ali> $$4, List<ali> $$5, cvx.a $$6) {
      super($$6);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.O = $$4;
      this.P = $$5;
   }

   public static cxh a(cvx.a $$0) {
      return new cxh(m, n, o, p, q(), r(), $$0);
   }

   public static cxh b(cvx.a $$0) {
      return new cxh(q, r, s, t, s(), t(), $$0);
   }

   private static List<ali> q() {
      return List.of(u, v, w, x);
   }

   private static List<ali> r() {
      return List.of(D, E, I, F, H, G, J);
   }

   private static List<ali> s() {
      return List.of(u, A, v, C, w, z, x, y, B);
   }

   private static List<ali> t() {
      return List.of(D);
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(l);
      $$2.add(xh.a);
      $$2.add(d);
      $$2.add(xh.a().b(this.K));
      $$2.add(c);
      $$2.add(xh.a().b(this.L));
   }

   public xi b() {
      return this.M;
   }

   public xi c() {
      return this.N;
   }

   public List<ali> d() {
      return this.O;
   }

   public List<ali> p() {
      return this.P;
   }
}
