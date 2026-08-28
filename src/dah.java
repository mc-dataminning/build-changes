import java.util.List;
import java.util.function.Consumer;

public class dah extends cyz {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wy c = wy.c(af.a("item", alg.b("smithing_template.ingredients"))).a(a);
   private static final wy d = wy.c(af.a("item", alg.b("smithing_template.applies_to"))).a(a);
   private static final wy o = wy.c(af.a("item", alg.b("smithing_template"))).a(a);
   private static final wy p = wy.c(af.a("item", alg.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wy q = wy.c(af.a("item", alg.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wy r = wy.c(af.a("item", alg.b("smithing_template.armor_trim.base_slot_description")));
   private static final wy s = wy.c(af.a("item", alg.b("smithing_template.armor_trim.additions_slot_description")));
   private static final wy t = wy.c(af.a("item", alg.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wy u = wy.c(af.a("item", alg.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wy v = wy.c(af.a("item", alg.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wy w = wy.c(af.a("item", alg.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alg x = alg.b("container/slot/helmet");
   private static final alg y = alg.b("container/slot/chestplate");
   private static final alg z = alg.b("container/slot/leggings");
   private static final alg A = alg.b("container/slot/boots");
   private static final alg B = alg.b("container/slot/hoe");
   private static final alg C = alg.b("container/slot/axe");
   private static final alg D = alg.b("container/slot/sword");
   private static final alg E = alg.b("container/slot/shovel");
   private static final alg F = alg.b("container/slot/pickaxe");
   private static final alg G = alg.b("container/slot/ingot");
   private static final alg H = alg.b("container/slot/redstone_dust");
   private static final alg I = alg.b("container/slot/quartz");
   private static final alg J = alg.b("container/slot/emerald");
   private static final alg K = alg.b("container/slot/diamond");
   private static final alg L = alg.b("container/slot/lapis_lazuli");
   private static final alg M = alg.b("container/slot/amethyst_shard");
   private final wy N;
   private final wy O;
   private final wy P;
   private final wy Q;
   private final List<alg> R;
   private final List<alg> S;

   public dah(wy $$0, wy $$1, wy $$2, wy $$3, List<alg> $$4, List<alg> $$5, cyz.a $$6) {
      super($$6);
      this.N = $$0;
      this.O = $$1;
      this.P = $$2;
      this.Q = $$3;
      this.R = $$4;
      this.S = $$5;
   }

   public static dah a(cyz.a $$0) {
      return new dah(p, q, r, s, o(), p(), $$0);
   }

   public static dah b(cyz.a $$0) {
      return new dah(t, u, v, w, q(), r(), $$0);
   }

   private static List<alg> o() {
      return List.of(x, y, z, A);
   }

   private static List<alg> p() {
      return List.of(G, H, L, I, K, J, M);
   }

   private static List<alg> q() {
      return List.of(x, D, y, F, z, C, A, B, E);
   }

   private static List<alg> r() {
      return List.of(G);
   }

   @Override
   public void a(czd $$0, cyz.b $$1, dch $$2, Consumer<wy> $$3, das $$4) {
      $$3.accept(o);
      $$3.accept(wx.a);
      $$3.accept(d);
      $$3.accept(wx.a().b(this.N));
      $$3.accept(c);
      $$3.accept(wx.a().b(this.O));
   }

   public wy a() {
      return this.P;
   }

   public wy b() {
      return this.Q;
   }

   public List<alg> c() {
      return this.R;
   }

   public List<alg> n() {
      return this.S;
   }
}
