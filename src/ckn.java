import java.util.List;
import javax.annotation.Nullable;

public class ckn extends cjg {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final tl c = tl.c(ac.a("item", new aez("smithing_template.ingredients"))).a(a);
   private static final tl d = tl.c(ac.a("item", new aez("smithing_template.applies_to"))).a(a);
   private static final tl e = tl.c(ac.a("upgrade", new aez("netherite_upgrade"))).a(a);
   private static final tl f = tl.c(ac.a("item", new aez("smithing_template.armor_trim.applies_to"))).a(b);
   private static final tl g = tl.c(ac.a("item", new aez("smithing_template.armor_trim.ingredients"))).a(b);
   private static final tl h = tl.c(ac.a("item", new aez("smithing_template.armor_trim.base_slot_description")));
   private static final tl i = tl.c(ac.a("item", new aez("smithing_template.armor_trim.additions_slot_description")));
   private static final tl j = tl.c(ac.a("item", new aez("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final tl k = tl.c(ac.a("item", new aez("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final tl r = tl.c(ac.a("item", new aez("smithing_template.netherite_upgrade.base_slot_description")));
   private static final tl s = tl.c(ac.a("item", new aez("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aez t = new aez("item/empty_armor_slot_helmet");
   private static final aez u = new aez("item/empty_armor_slot_chestplate");
   private static final aez v = new aez("item/empty_armor_slot_leggings");
   private static final aez w = new aez("item/empty_armor_slot_boots");
   private static final aez x = new aez("item/empty_slot_hoe");
   private static final aez y = new aez("item/empty_slot_axe");
   private static final aez z = new aez("item/empty_slot_sword");
   private static final aez A = new aez("item/empty_slot_shovel");
   private static final aez B = new aez("item/empty_slot_pickaxe");
   private static final aez C = new aez("item/empty_slot_ingot");
   private static final aez D = new aez("item/empty_slot_redstone_dust");
   private static final aez E = new aez("item/empty_slot_quartz");
   private static final aez F = new aez("item/empty_slot_emerald");
   private static final aez G = new aez("item/empty_slot_diamond");
   private static final aez H = new aez("item/empty_slot_lapis_lazuli");
   private static final aez I = new aez("item/empty_slot_amethyst_shard");
   private final tl J;
   private final tl K;
   private final tl L;
   private final tl M;
   private final tl N;
   private final List<aez> O;
   private final List<aez> P;

   public ckn(tl $$0, tl $$1, tl $$2, tl $$3, tl $$4, List<aez> $$5, List<aez> $$6) {
      super(new cjg.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static ckn a(aey<clq> $$0) {
      return a($$0.a());
   }

   public static ckn a(aez $$0) {
      return new ckn(f, g, tl.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static ckn h() {
      return new ckn(j, k, e, r, s, C(), D());
   }

   private static List<aez> A() {
      return List.of(t, u, v, w);
   }

   private static List<aez> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<aez> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<aez> D() {
      return List.of(C);
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
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

   public List<aez> y() {
      return this.O;
   }

   public List<aez> z() {
      return this.P;
   }
}
