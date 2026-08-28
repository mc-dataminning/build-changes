import java.util.List;

public class cxv extends cwl {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wp c = wp.c(af.a("item", akv.b("smithing_template.ingredients"))).a(a);
   private static final wp d = wp.c(af.a("item", akv.b("smithing_template.applies_to"))).a(a);
   private static final wp m = wp.c(af.a("item", akv.b("smithing_template"))).a(a);
   private static final wp n = wp.c(af.a("item", akv.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wp o = wp.c(af.a("item", akv.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wp p = wp.c(af.a("item", akv.b("smithing_template.armor_trim.base_slot_description")));
   private static final wp q = wp.c(af.a("item", akv.b("smithing_template.armor_trim.additions_slot_description")));
   private static final wp r = wp.c(af.a("item", akv.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wp s = wp.c(af.a("item", akv.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wp t = wp.c(af.a("item", akv.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wp u = wp.c(af.a("item", akv.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akv v = akv.b("container/slot/helmet");
   private static final akv w = akv.b("container/slot/chestplate");
   private static final akv x = akv.b("container/slot/leggings");
   private static final akv y = akv.b("container/slot/boots");
   private static final akv z = akv.b("container/slot/hoe");
   private static final akv A = akv.b("container/slot/axe");
   private static final akv B = akv.b("container/slot/sword");
   private static final akv C = akv.b("container/slot/shovel");
   private static final akv D = akv.b("container/slot/pickaxe");
   private static final akv E = akv.b("container/slot/ingot");
   private static final akv F = akv.b("container/slot/redstone_dust");
   private static final akv G = akv.b("container/slot/quartz");
   private static final akv H = akv.b("container/slot/emerald");
   private static final akv I = akv.b("container/slot/diamond");
   private static final akv J = akv.b("container/slot/lapis_lazuli");
   private static final akv K = akv.b("container/slot/amethyst_shard");
   private final wp L;
   private final wp M;
   private final wp N;
   private final wp O;
   private final List<akv> P;
   private final List<akv> Q;

   public cxv(wp $$0, wp $$1, wp $$2, wp $$3, List<akv> $$4, List<akv> $$5, cwl.a $$6) {
      super($$6);
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.O = $$3;
      this.P = $$4;
      this.Q = $$5;
   }

   public static cxv a(cwl.a $$0) {
      return new cxv(n, o, p, q, p(), q(), $$0);
   }

   public static cxv b(cwl.a $$0) {
      return new cxv(r, s, t, u, r(), s(), $$0);
   }

   private static List<akv> p() {
      return List.of(v, w, x, y);
   }

   private static List<akv> q() {
      return List.of(E, F, J, G, I, H, K);
   }

   private static List<akv> r() {
      return List.of(v, B, w, D, x, A, y, z, C);
   }

   private static List<akv> s() {
      return List.of(E);
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(m);
      $$2.add(wo.a);
      $$2.add(d);
      $$2.add(wo.a().b(this.L));
      $$2.add(c);
      $$2.add(wo.a().b(this.M));
   }

   public wp b() {
      return this.N;
   }

   public wp c() {
      return this.O;
   }

   public List<akv> d() {
      return this.P;
   }

   public List<akv> o() {
      return this.Q;
   }
}
