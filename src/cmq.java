import java.util.List;
import javax.annotation.Nullable;

public class cmq extends clj {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final uv c = uv.c(ac.a("item", new agm("smithing_template.ingredients"))).a(a);
   private static final uv d = uv.c(ac.a("item", new agm("smithing_template.applies_to"))).a(a);
   private static final uv e = uv.c(ac.a("upgrade", new agm("netherite_upgrade"))).a(a);
   private static final uv f = uv.c(ac.a("item", new agm("smithing_template.armor_trim.applies_to"))).a(b);
   private static final uv g = uv.c(ac.a("item", new agm("smithing_template.armor_trim.ingredients"))).a(b);
   private static final uv h = uv.c(ac.a("item", new agm("smithing_template.armor_trim.base_slot_description")));
   private static final uv i = uv.c(ac.a("item", new agm("smithing_template.armor_trim.additions_slot_description")));
   private static final uv j = uv.c(ac.a("item", new agm("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final uv k = uv.c(ac.a("item", new agm("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final uv r = uv.c(ac.a("item", new agm("smithing_template.netherite_upgrade.base_slot_description")));
   private static final uv s = uv.c(ac.a("item", new agm("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final agm t = new agm("item/empty_armor_slot_helmet");
   private static final agm u = new agm("item/empty_armor_slot_chestplate");
   private static final agm v = new agm("item/empty_armor_slot_leggings");
   private static final agm w = new agm("item/empty_armor_slot_boots");
   private static final agm x = new agm("item/empty_slot_hoe");
   private static final agm y = new agm("item/empty_slot_axe");
   private static final agm z = new agm("item/empty_slot_sword");
   private static final agm A = new agm("item/empty_slot_shovel");
   private static final agm B = new agm("item/empty_slot_pickaxe");
   private static final agm C = new agm("item/empty_slot_ingot");
   private static final agm D = new agm("item/empty_slot_redstone_dust");
   private static final agm E = new agm("item/empty_slot_quartz");
   private static final agm F = new agm("item/empty_slot_emerald");
   private static final agm G = new agm("item/empty_slot_diamond");
   private static final agm H = new agm("item/empty_slot_lapis_lazuli");
   private static final agm I = new agm("item/empty_slot_amethyst_shard");
   private final uv J;
   private final uv K;
   private final uv L;
   private final uv M;
   private final uv N;
   private final List<agm> O;
   private final List<agm> P;

   public cmq(uv $$0, uv $$1, uv $$2, uv $$3, uv $$4, List<agm> $$5, List<agm> $$6) {
      super(new clj.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cmq a(agl<cnt> $$0) {
      return a($$0.a());
   }

   public static cmq a(agm $$0) {
      return new cmq(f, g, uv.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cmq h() {
      return new cmq(j, k, e, r, s, C(), D());
   }

   private static List<agm> A() {
      return List.of(t, u, v, w);
   }

   private static List<agm> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<agm> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<agm> D() {
      return List.of(C);
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(uu.a);
      $$2.add(d);
      $$2.add(uu.a().b(this.J));
      $$2.add(c);
      $$2.add(uu.a().b(this.K));
   }

   public uv i() {
      return this.M;
   }

   public uv x() {
      return this.N;
   }

   public List<agm> y() {
      return this.O;
   }

   public List<agm> z() {
      return this.P;
   }
}
