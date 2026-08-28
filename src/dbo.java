import java.util.List;
import java.util.function.Consumer;

public class dbo extends dag {
   private static final o a = o.h;
   private static final o b = o.j;
   private static final xg c = xg.c(ag.a("item", alr.b("smithing_template.ingredients"))).a(a);
   private static final xg d = xg.c(ag.a("item", alr.b("smithing_template.applies_to"))).a(a);
   private static final xg o = xg.c(ag.a("item", alr.b("smithing_template"))).a(a);
   private static final xg p = xg.c(ag.a("item", alr.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xg q = xg.c(ag.a("item", alr.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xg r = xg.c(ag.a("item", alr.b("smithing_template.armor_trim.base_slot_description")));
   private static final xg s = xg.c(ag.a("item", alr.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xg t = xg.c(ag.a("item", alr.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xg u = xg.c(ag.a("item", alr.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xg v = xg.c(ag.a("item", alr.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xg w = xg.c(ag.a("item", alr.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alr x = alr.b("container/slot/helmet");
   private static final alr y = alr.b("container/slot/chestplate");
   private static final alr z = alr.b("container/slot/leggings");
   private static final alr A = alr.b("container/slot/boots");
   private static final alr B = alr.b("container/slot/hoe");
   private static final alr C = alr.b("container/slot/axe");
   private static final alr D = alr.b("container/slot/sword");
   private static final alr E = alr.b("container/slot/shovel");
   private static final alr F = alr.b("container/slot/pickaxe");
   private static final alr G = alr.b("container/slot/ingot");
   private static final alr H = alr.b("container/slot/redstone_dust");
   private static final alr I = alr.b("container/slot/quartz");
   private static final alr J = alr.b("container/slot/emerald");
   private static final alr K = alr.b("container/slot/diamond");
   private static final alr L = alr.b("container/slot/lapis_lazuli");
   private static final alr M = alr.b("container/slot/amethyst_shard");
   private final xg N;
   private final xg O;
   private final xg P;
   private final xg Q;
   private final List<alr> R;
   private final List<alr> S;

   public dbo(xg $$0, xg $$1, xg $$2, xg $$3, List<alr> $$4, List<alr> $$5, dag.a $$6) {
      super($$6);
      this.N = $$0;
      this.O = $$1;
      this.P = $$2;
      this.Q = $$3;
      this.R = $$4;
      this.S = $$5;
   }

   public static dbo a(dag.a $$0) {
      return new dbo(p, q, r, s, o(), p(), $$0);
   }

   public static dbo b(dag.a $$0) {
      return new dbo(t, u, v, w, q(), r(), $$0);
   }

   private static List<alr> o() {
      return List.of(x, y, z, A);
   }

   private static List<alr> p() {
      return List.of(G, H, L, I, K, J, M);
   }

   private static List<alr> q() {
      return List.of(x, D, y, F, z, C, A, B, E);
   }

   private static List<alr> r() {
      return List.of(G);
   }

   @Override
   public void a(dak $$0, dag.b $$1, ddo $$2, Consumer<xg> $$3, dbz $$4) {
      $$3.accept(o);
      $$3.accept(xf.a);
      $$3.accept(d);
      $$3.accept(xf.a().b(this.N));
      $$3.accept(c);
      $$3.accept(xf.a().b(this.O));
   }

   public xg a() {
      return this.P;
   }

   public xg b() {
      return this.Q;
   }

   public List<alr> c() {
      return this.R;
   }

   public List<alr> n() {
      return this.S;
   }
}
