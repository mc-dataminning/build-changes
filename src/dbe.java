import java.util.List;
import java.util.function.Consumer;

public class dbe extends czw {
   private static final o a = o.h;
   private static final o b = o.j;
   private static final xc c = xc.c(ag.a("item", alk.b("smithing_template.ingredients"))).a(a);
   private static final xc d = xc.c(ag.a("item", alk.b("smithing_template.applies_to"))).a(a);
   private static final xc o = xc.c(ag.a("item", alk.b("smithing_template"))).a(a);
   private static final xc p = xc.c(ag.a("item", alk.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xc q = xc.c(ag.a("item", alk.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xc r = xc.c(ag.a("item", alk.b("smithing_template.armor_trim.base_slot_description")));
   private static final xc s = xc.c(ag.a("item", alk.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xc t = xc.c(ag.a("item", alk.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xc u = xc.c(ag.a("item", alk.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xc v = xc.c(ag.a("item", alk.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xc w = xc.c(ag.a("item", alk.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final alk x = alk.b("container/slot/helmet");
   private static final alk y = alk.b("container/slot/chestplate");
   private static final alk z = alk.b("container/slot/leggings");
   private static final alk A = alk.b("container/slot/boots");
   private static final alk B = alk.b("container/slot/hoe");
   private static final alk C = alk.b("container/slot/axe");
   private static final alk D = alk.b("container/slot/sword");
   private static final alk E = alk.b("container/slot/shovel");
   private static final alk F = alk.b("container/slot/pickaxe");
   private static final alk G = alk.b("container/slot/ingot");
   private static final alk H = alk.b("container/slot/redstone_dust");
   private static final alk I = alk.b("container/slot/quartz");
   private static final alk J = alk.b("container/slot/emerald");
   private static final alk K = alk.b("container/slot/diamond");
   private static final alk L = alk.b("container/slot/lapis_lazuli");
   private static final alk M = alk.b("container/slot/amethyst_shard");
   private final xc N;
   private final xc O;
   private final xc P;
   private final xc Q;
   private final List<alk> R;
   private final List<alk> S;

   public dbe(xc $$0, xc $$1, xc $$2, xc $$3, List<alk> $$4, List<alk> $$5, czw.a $$6) {
      super($$6);
      this.N = $$0;
      this.O = $$1;
      this.P = $$2;
      this.Q = $$3;
      this.R = $$4;
      this.S = $$5;
   }

   public static dbe a(czw.a $$0) {
      return new dbe(p, q, r, s, o(), p(), $$0);
   }

   public static dbe b(czw.a $$0) {
      return new dbe(t, u, v, w, q(), r(), $$0);
   }

   private static List<alk> o() {
      return List.of(x, y, z, A);
   }

   private static List<alk> p() {
      return List.of(G, H, L, I, K, J, M);
   }

   private static List<alk> q() {
      return List.of(x, D, y, F, z, C, A, B, E);
   }

   private static List<alk> r() {
      return List.of(G);
   }

   @Override
   public void a(daa $$0, czw.b $$1, dde $$2, Consumer<xc> $$3, dbp $$4) {
      $$3.accept(o);
      $$3.accept(xb.a);
      $$3.accept(d);
      $$3.accept(xb.a().b(this.N));
      $$3.accept(c);
      $$3.accept(xb.a().b(this.O));
   }

   public xc a() {
      return this.P;
   }

   public xc b() {
      return this.Q;
   }

   public List<alk> c() {
      return this.R;
   }

   public List<alk> n() {
      return this.S;
   }
}
