import java.util.List;

public class cym extends cxc {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final xk c = xk.c(ae.a("item", alp.b("smithing_template.ingredients"))).a(a);
   private static final xk d = xk.c(ae.a("item", alp.b("smithing_template.applies_to"))).a(a);
   private static final xk m = xk.c(ae.a("item", alp.b("smithing_template"))).a(a);
   private static final xk n = xk.c(ae.a("item", alp.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xk o = xk.c(ae.a("item", alp.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xk p = xk.c(ae.a("item", alp.b("smithing_template.armor_trim.base_slot_description")));
   private static final xk q = xk.c(ae.a("item", alp.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xk r = xk.c(ae.a("item", alp.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xk s = xk.c(ae.a("item", alp.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xk t = xk.c(ae.a("item", alp.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xk u = xk.c(ae.a("item", alp.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alp v = alp.b("container/slot/helmet");
   private static final alp w = alp.b("container/slot/chestplate");
   private static final alp x = alp.b("container/slot/leggings");
   private static final alp y = alp.b("container/slot/boots");
   private static final alp z = alp.b("container/slot/hoe");
   private static final alp A = alp.b("container/slot/axe");
   private static final alp B = alp.b("container/slot/sword");
   private static final alp C = alp.b("container/slot/shovel");
   private static final alp D = alp.b("container/slot/pickaxe");
   private static final alp E = alp.b("container/slot/ingot");
   private static final alp F = alp.b("container/slot/redstone_dust");
   private static final alp G = alp.b("container/slot/quartz");
   private static final alp H = alp.b("container/slot/emerald");
   private static final alp I = alp.b("container/slot/diamond");
   private static final alp J = alp.b("container/slot/lapis_lazuli");
   private static final alp K = alp.b("container/slot/amethyst_shard");
   private final xk L;
   private final xk M;
   private final xk N;
   private final xk O;
   private final List<alp> P;
   private final List<alp> Q;

   public cym(xk $$0, xk $$1, xk $$2, xk $$3, List<alp> $$4, List<alp> $$5, cxc.a $$6) {
      super($$6);
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.O = $$3;
      this.P = $$4;
      this.Q = $$5;
   }

   public static cym a(cxc.a $$0) {
      return new cym(n, o, p, q, p(), q(), $$0);
   }

   public static cym b(cxc.a $$0) {
      return new cym(r, s, t, u, r(), s(), $$0);
   }

   private static List<alp> p() {
      return List.of(v, w, x, y);
   }

   private static List<alp> q() {
      return List.of(E, F, J, G, I, H, K);
   }

   private static List<alp> r() {
      return List.of(v, B, w, D, x, A, y, z, C);
   }

   private static List<alp> s() {
      return List.of(E);
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(m);
      $$2.add(xj.a);
      $$2.add(d);
      $$2.add(xj.a().b(this.L));
      $$2.add(c);
      $$2.add(xj.a().b(this.M));
   }

   public xk b() {
      return this.N;
   }

   public xk c() {
      return this.O;
   }

   public List<alp> d() {
      return this.P;
   }

   public List<alp> o() {
      return this.Q;
   }
}
