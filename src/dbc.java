import java.util.List;
import java.util.function.Consumer;

public class dbc extends czu {
   private static final o a = o.h;
   private static final o b = o.j;
   private static final xa c = xa.c(ag.a("item", ali.b("smithing_template.ingredients"))).a(a);
   private static final xa d = xa.c(ag.a("item", ali.b("smithing_template.applies_to"))).a(a);
   private static final xa o = xa.c(ag.a("item", ali.b("smithing_template"))).a(a);
   private static final xa p = xa.c(ag.a("item", ali.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xa q = xa.c(ag.a("item", ali.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xa r = xa.c(ag.a("item", ali.b("smithing_template.armor_trim.base_slot_description")));
   private static final xa s = xa.c(ag.a("item", ali.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xa t = xa.c(ag.a("item", ali.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xa u = xa.c(ag.a("item", ali.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xa v = xa.c(ag.a("item", ali.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xa w = xa.c(ag.a("item", ali.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ali x = ali.b("container/slot/helmet");
   private static final ali y = ali.b("container/slot/chestplate");
   private static final ali z = ali.b("container/slot/leggings");
   private static final ali A = ali.b("container/slot/boots");
   private static final ali B = ali.b("container/slot/hoe");
   private static final ali C = ali.b("container/slot/axe");
   private static final ali D = ali.b("container/slot/sword");
   private static final ali E = ali.b("container/slot/shovel");
   private static final ali F = ali.b("container/slot/pickaxe");
   private static final ali G = ali.b("container/slot/ingot");
   private static final ali H = ali.b("container/slot/redstone_dust");
   private static final ali I = ali.b("container/slot/quartz");
   private static final ali J = ali.b("container/slot/emerald");
   private static final ali K = ali.b("container/slot/diamond");
   private static final ali L = ali.b("container/slot/lapis_lazuli");
   private static final ali M = ali.b("container/slot/amethyst_shard");
   private final xa N;
   private final xa O;
   private final xa P;
   private final xa Q;
   private final List<ali> R;
   private final List<ali> S;

   public dbc(xa $$0, xa $$1, xa $$2, xa $$3, List<ali> $$4, List<ali> $$5, czu.a $$6) {
      super($$6);
      this.N = $$0;
      this.O = $$1;
      this.P = $$2;
      this.Q = $$3;
      this.R = $$4;
      this.S = $$5;
   }

   public static dbc a(czu.a $$0) {
      return new dbc(p, q, r, s, o(), p(), $$0);
   }

   public static dbc b(czu.a $$0) {
      return new dbc(t, u, v, w, q(), r(), $$0);
   }

   private static List<ali> o() {
      return List.of(x, y, z, A);
   }

   private static List<ali> p() {
      return List.of(G, H, L, I, K, J, M);
   }

   private static List<ali> q() {
      return List.of(x, D, y, F, z, C, A, B, E);
   }

   private static List<ali> r() {
      return List.of(G);
   }

   @Override
   public void a(czy $$0, czu.b $$1, ddc $$2, Consumer<xa> $$3, dbn $$4) {
      $$3.accept(o);
      $$3.accept(wz.a);
      $$3.accept(d);
      $$3.accept(wz.a().b(this.N));
      $$3.accept(c);
      $$3.accept(wz.a().b(this.O));
   }

   public xa a() {
      return this.P;
   }

   public xa b() {
      return this.Q;
   }

   public List<ali> c() {
      return this.R;
   }

   public List<ali> n() {
      return this.S;
   }
}
