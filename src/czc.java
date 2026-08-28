import java.util.List;

public class czc extends cxu {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wv c = wv.c(af.a("item", ald.b("smithing_template.ingredients"))).a(a);
   private static final wv d = wv.c(af.a("item", ald.b("smithing_template.applies_to"))).a(a);
   private static final wv n = wv.c(af.a("item", ald.b("smithing_template"))).a(a);
   private static final wv o = wv.c(af.a("item", ald.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wv p = wv.c(af.a("item", ald.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wv q = wv.c(af.a("item", ald.b("smithing_template.armor_trim.base_slot_description")));
   private static final wv r = wv.c(af.a("item", ald.b("smithing_template.armor_trim.additions_slot_description")));
   private static final wv s = wv.c(af.a("item", ald.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wv t = wv.c(af.a("item", ald.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wv u = wv.c(af.a("item", ald.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wv v = wv.c(af.a("item", ald.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ald w = ald.b("container/slot/helmet");
   private static final ald x = ald.b("container/slot/chestplate");
   private static final ald y = ald.b("container/slot/leggings");
   private static final ald z = ald.b("container/slot/boots");
   private static final ald A = ald.b("container/slot/hoe");
   private static final ald B = ald.b("container/slot/axe");
   private static final ald C = ald.b("container/slot/sword");
   private static final ald D = ald.b("container/slot/shovel");
   private static final ald E = ald.b("container/slot/pickaxe");
   private static final ald F = ald.b("container/slot/ingot");
   private static final ald G = ald.b("container/slot/redstone_dust");
   private static final ald H = ald.b("container/slot/quartz");
   private static final ald I = ald.b("container/slot/emerald");
   private static final ald J = ald.b("container/slot/diamond");
   private static final ald K = ald.b("container/slot/lapis_lazuli");
   private static final ald L = ald.b("container/slot/amethyst_shard");
   private final wv M;
   private final wv N;
   private final wv O;
   private final wv P;
   private final List<ald> Q;
   private final List<ald> R;

   public czc(wv $$0, wv $$1, wv $$2, wv $$3, List<ald> $$4, List<ald> $$5, cxu.a $$6) {
      super($$6);
      this.M = $$0;
      this.N = $$1;
      this.O = $$2;
      this.P = $$3;
      this.Q = $$4;
      this.R = $$5;
   }

   public static czc a(cxu.a $$0) {
      return new czc(o, p, q, r, p(), q(), $$0);
   }

   public static czc b(cxu.a $$0) {
      return new czc(s, t, u, v, r(), s(), $$0);
   }

   private static List<ald> p() {
      return List.of(w, x, y, z);
   }

   private static List<ald> q() {
      return List.of(F, G, K, H, J, I, L);
   }

   private static List<ald> r() {
      return List.of(w, C, x, E, y, B, z, A, D);
   }

   private static List<ald> s() {
      return List.of(F);
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(n);
      $$2.add(wu.a);
      $$2.add(d);
      $$2.add(wu.a().b(this.M));
      $$2.add(c);
      $$2.add(wu.a().b(this.N));
   }

   public wv b() {
      return this.O;
   }

   public wv c() {
      return this.P;
   }

   public List<ald> d() {
      return this.Q;
   }

   public List<ald> o() {
      return this.R;
   }
}
