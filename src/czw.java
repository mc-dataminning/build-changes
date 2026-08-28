import java.util.List;
import java.util.function.Consumer;

public class czw extends cyo {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final ww c = ww.c(af.a("item", ale.b("smithing_template.ingredients"))).a(a);
   private static final ww d = ww.c(af.a("item", ale.b("smithing_template.applies_to"))).a(a);
   private static final ww o = ww.c(af.a("item", ale.b("smithing_template"))).a(a);
   private static final ww p = ww.c(af.a("item", ale.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final ww q = ww.c(af.a("item", ale.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final ww r = ww.c(af.a("item", ale.b("smithing_template.armor_trim.base_slot_description")));
   private static final ww s = ww.c(af.a("item", ale.b("smithing_template.armor_trim.additions_slot_description")));
   private static final ww t = ww.c(af.a("item", ale.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final ww u = ww.c(af.a("item", ale.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final ww v = ww.c(af.a("item", ale.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final ww w = ww.c(af.a("item", ale.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ale x = ale.b("container/slot/helmet");
   private static final ale y = ale.b("container/slot/chestplate");
   private static final ale z = ale.b("container/slot/leggings");
   private static final ale A = ale.b("container/slot/boots");
   private static final ale B = ale.b("container/slot/hoe");
   private static final ale C = ale.b("container/slot/axe");
   private static final ale D = ale.b("container/slot/sword");
   private static final ale E = ale.b("container/slot/shovel");
   private static final ale F = ale.b("container/slot/pickaxe");
   private static final ale G = ale.b("container/slot/ingot");
   private static final ale H = ale.b("container/slot/redstone_dust");
   private static final ale I = ale.b("container/slot/quartz");
   private static final ale J = ale.b("container/slot/emerald");
   private static final ale K = ale.b("container/slot/diamond");
   private static final ale L = ale.b("container/slot/lapis_lazuli");
   private static final ale M = ale.b("container/slot/amethyst_shard");
   private final ww N;
   private final ww O;
   private final ww P;
   private final ww Q;
   private final List<ale> R;
   private final List<ale> S;

   public czw(ww $$0, ww $$1, ww $$2, ww $$3, List<ale> $$4, List<ale> $$5, cyo.a $$6) {
      super($$6);
      this.N = $$0;
      this.O = $$1;
      this.P = $$2;
      this.Q = $$3;
      this.R = $$4;
      this.S = $$5;
   }

   public static czw a(cyo.a $$0) {
      return new czw(p, q, r, s, o(), p(), $$0);
   }

   public static czw b(cyo.a $$0) {
      return new czw(t, u, v, w, q(), r(), $$0);
   }

   private static List<ale> o() {
      return List.of(x, y, z, A);
   }

   private static List<ale> p() {
      return List.of(G, H, L, I, K, J, M);
   }

   private static List<ale> q() {
      return List.of(x, D, y, F, z, C, A, B, E);
   }

   private static List<ale> r() {
      return List.of(G);
   }

   @Override
   public void a(cys $$0, cyo.b $$1, dbw $$2, Consumer<ww> $$3, dah $$4) {
      $$3.accept(o);
      $$3.accept(wv.a);
      $$3.accept(d);
      $$3.accept(wv.a().b(this.N));
      $$3.accept(c);
      $$3.accept(wv.a().b(this.O));
   }

   public ww a() {
      return this.P;
   }

   public ww b() {
      return this.Q;
   }

   public List<ale> c() {
      return this.R;
   }

   public List<ale> n() {
      return this.S;
   }
}
