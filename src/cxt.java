import java.util.List;

public class cxt extends cwj {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wo c = wo.c(af.a("item", aku.b("smithing_template.ingredients"))).a(a);
   private static final wo d = wo.c(af.a("item", aku.b("smithing_template.applies_to"))).a(a);
   private static final wo m = wo.c(af.a("item", aku.b("smithing_template"))).a(a);
   private static final wo n = wo.c(af.a("item", aku.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wo o = wo.c(af.a("item", aku.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wo p = wo.c(af.a("item", aku.b("smithing_template.armor_trim.base_slot_description")));
   private static final wo q = wo.c(af.a("item", aku.b("smithing_template.armor_trim.additions_slot_description")));
   private static final wo r = wo.c(af.a("item", aku.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wo s = wo.c(af.a("item", aku.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wo t = wo.c(af.a("item", aku.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wo u = wo.c(af.a("item", aku.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aku v = aku.b("container/slot/helmet");
   private static final aku w = aku.b("container/slot/chestplate");
   private static final aku x = aku.b("container/slot/leggings");
   private static final aku y = aku.b("container/slot/boots");
   private static final aku z = aku.b("container/slot/hoe");
   private static final aku A = aku.b("container/slot/axe");
   private static final aku B = aku.b("container/slot/sword");
   private static final aku C = aku.b("container/slot/shovel");
   private static final aku D = aku.b("container/slot/pickaxe");
   private static final aku E = aku.b("container/slot/ingot");
   private static final aku F = aku.b("container/slot/redstone_dust");
   private static final aku G = aku.b("container/slot/quartz");
   private static final aku H = aku.b("container/slot/emerald");
   private static final aku I = aku.b("container/slot/diamond");
   private static final aku J = aku.b("container/slot/lapis_lazuli");
   private static final aku K = aku.b("container/slot/amethyst_shard");
   private final wo L;
   private final wo M;
   private final wo N;
   private final wo O;
   private final List<aku> P;
   private final List<aku> Q;

   public cxt(wo $$0, wo $$1, wo $$2, wo $$3, List<aku> $$4, List<aku> $$5, cwj.a $$6) {
      super($$6);
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.O = $$3;
      this.P = $$4;
      this.Q = $$5;
   }

   public static cxt a(cwj.a $$0) {
      return new cxt(n, o, p, q, p(), q(), $$0);
   }

   public static cxt b(cwj.a $$0) {
      return new cxt(r, s, t, u, r(), s(), $$0);
   }

   private static List<aku> p() {
      return List.of(v, w, x, y);
   }

   private static List<aku> q() {
      return List.of(E, F, J, G, I, H, K);
   }

   private static List<aku> r() {
      return List.of(v, B, w, D, x, A, y, z, C);
   }

   private static List<aku> s() {
      return List.of(E);
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(m);
      $$2.add(wn.a);
      $$2.add(d);
      $$2.add(wn.a().b(this.L));
      $$2.add(c);
      $$2.add(wn.a().b(this.M));
   }

   public wo b() {
      return this.N;
   }

   public wo c() {
      return this.O;
   }

   public List<aku> d() {
      return this.P;
   }

   public List<aku> o() {
      return this.Q;
   }
}
