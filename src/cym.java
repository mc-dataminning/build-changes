import java.util.List;

public class cym extends cxd {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wp c = wp.c(af.a("item", aku.b("smithing_template.ingredients"))).a(a);
   private static final wp d = wp.c(af.a("item", aku.b("smithing_template.applies_to"))).a(a);
   private static final wp n = wp.c(af.a("item", aku.b("smithing_template"))).a(a);
   private static final wp o = wp.c(af.a("item", aku.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wp p = wp.c(af.a("item", aku.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wp q = wp.c(af.a("item", aku.b("smithing_template.armor_trim.base_slot_description")));
   private static final wp r = wp.c(af.a("item", aku.b("smithing_template.armor_trim.additions_slot_description")));
   private static final wp s = wp.c(af.a("item", aku.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wp t = wp.c(af.a("item", aku.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wp u = wp.c(af.a("item", aku.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wp v = wp.c(af.a("item", aku.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aku w = aku.b("container/slot/helmet");
   private static final aku x = aku.b("container/slot/chestplate");
   private static final aku y = aku.b("container/slot/leggings");
   private static final aku z = aku.b("container/slot/boots");
   private static final aku A = aku.b("container/slot/hoe");
   private static final aku B = aku.b("container/slot/axe");
   private static final aku C = aku.b("container/slot/sword");
   private static final aku D = aku.b("container/slot/shovel");
   private static final aku E = aku.b("container/slot/pickaxe");
   private static final aku F = aku.b("container/slot/ingot");
   private static final aku G = aku.b("container/slot/redstone_dust");
   private static final aku H = aku.b("container/slot/quartz");
   private static final aku I = aku.b("container/slot/emerald");
   private static final aku J = aku.b("container/slot/diamond");
   private static final aku K = aku.b("container/slot/lapis_lazuli");
   private static final aku L = aku.b("container/slot/amethyst_shard");
   private final wp M;
   private final wp N;
   private final wp O;
   private final wp P;
   private final List<aku> Q;
   private final List<aku> R;

   public cym(wp $$0, wp $$1, wp $$2, wp $$3, List<aku> $$4, List<aku> $$5, cxd.a $$6) {
      super($$6);
      this.M = $$0;
      this.N = $$1;
      this.O = $$2;
      this.P = $$3;
      this.Q = $$4;
      this.R = $$5;
   }

   public static cym a(cxd.a $$0) {
      return new cym(o, p, q, r, p(), q(), $$0);
   }

   public static cym b(cxd.a $$0) {
      return new cym(s, t, u, v, r(), s(), $$0);
   }

   private static List<aku> p() {
      return List.of(w, x, y, z);
   }

   private static List<aku> q() {
      return List.of(F, G, K, H, J, I, L);
   }

   private static List<aku> r() {
      return List.of(w, C, x, E, y, B, z, A, D);
   }

   private static List<aku> s() {
      return List.of(F);
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(n);
      $$2.add(wo.a);
      $$2.add(d);
      $$2.add(wo.a().b(this.M));
      $$2.add(c);
      $$2.add(wo.a().b(this.N));
   }

   public wp b() {
      return this.O;
   }

   public wp c() {
      return this.P;
   }

   public List<aku> d() {
      return this.Q;
   }

   public List<aku> o() {
      return this.R;
   }
}
