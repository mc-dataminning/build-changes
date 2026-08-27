import java.util.List;
import javax.annotation.Nullable;

public class ckh extends cja {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final tl c = tl.c(ac.a("item", new aew("smithing_template.ingredients"))).a(a);
   private static final tl d = tl.c(ac.a("item", new aew("smithing_template.applies_to"))).a(a);
   private static final tl e = tl.c(ac.a("upgrade", new aew("netherite_upgrade"))).a(a);
   private static final tl f = tl.c(ac.a("item", new aew("smithing_template.armor_trim.applies_to"))).a(b);
   private static final tl g = tl.c(ac.a("item", new aew("smithing_template.armor_trim.ingredients"))).a(b);
   private static final tl h = tl.c(ac.a("item", new aew("smithing_template.armor_trim.base_slot_description")));
   private static final tl i = tl.c(ac.a("item", new aew("smithing_template.armor_trim.additions_slot_description")));
   private static final tl j = tl.c(ac.a("item", new aew("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final tl k = tl.c(ac.a("item", new aew("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final tl r = tl.c(ac.a("item", new aew("smithing_template.netherite_upgrade.base_slot_description")));
   private static final tl s = tl.c(ac.a("item", new aew("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aew t = new aew("item/empty_armor_slot_helmet");
   private static final aew u = new aew("item/empty_armor_slot_chestplate");
   private static final aew v = new aew("item/empty_armor_slot_leggings");
   private static final aew w = new aew("item/empty_armor_slot_boots");
   private static final aew x = new aew("item/empty_slot_hoe");
   private static final aew y = new aew("item/empty_slot_axe");
   private static final aew z = new aew("item/empty_slot_sword");
   private static final aew A = new aew("item/empty_slot_shovel");
   private static final aew B = new aew("item/empty_slot_pickaxe");
   private static final aew C = new aew("item/empty_slot_ingot");
   private static final aew D = new aew("item/empty_slot_redstone_dust");
   private static final aew E = new aew("item/empty_slot_quartz");
   private static final aew F = new aew("item/empty_slot_emerald");
   private static final aew G = new aew("item/empty_slot_diamond");
   private static final aew H = new aew("item/empty_slot_lapis_lazuli");
   private static final aew I = new aew("item/empty_slot_amethyst_shard");
   private final tl J;
   private final tl K;
   private final tl L;
   private final tl M;
   private final tl N;
   private final List<aew> O;
   private final List<aew> P;

   public ckh(tl $$0, tl $$1, tl $$2, tl $$3, tl $$4, List<aew> $$5, List<aew> $$6) {
      super(new cja.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static ckh a(aev<clk> $$0) {
      return a($$0.a());
   }

   public static ckh a(aew $$0) {
      return new ckh(f, g, tl.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static ckh h() {
      return new ckh(j, k, e, r, s, C(), D());
   }

   private static List<aew> A() {
      return List.of(t, u, v, w);
   }

   private static List<aew> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<aew> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<aew> D() {
      return List.of(C);
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(tk.a);
      $$2.add(d);
      $$2.add(tk.a().b(this.J));
      $$2.add(c);
      $$2.add(tk.a().b(this.K));
   }

   public tl i() {
      return this.M;
   }

   public tl x() {
      return this.N;
   }

   public List<aew> y() {
      return this.O;
   }

   public List<aew> z() {
      return this.P;
   }
}
