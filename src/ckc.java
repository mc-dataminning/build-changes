import java.util.List;
import javax.annotation.Nullable;

public class ckc extends civ {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final ti c = ti.c(ac.a("item", new aeu("smithing_template.ingredients"))).a(a);
   private static final ti d = ti.c(ac.a("item", new aeu("smithing_template.applies_to"))).a(a);
   private static final ti e = ti.c(ac.a("upgrade", new aeu("netherite_upgrade"))).a(a);
   private static final ti f = ti.c(ac.a("item", new aeu("smithing_template.armor_trim.applies_to"))).a(b);
   private static final ti g = ti.c(ac.a("item", new aeu("smithing_template.armor_trim.ingredients"))).a(b);
   private static final ti h = ti.c(ac.a("item", new aeu("smithing_template.armor_trim.base_slot_description")));
   private static final ti i = ti.c(ac.a("item", new aeu("smithing_template.armor_trim.additions_slot_description")));
   private static final ti j = ti.c(ac.a("item", new aeu("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final ti k = ti.c(ac.a("item", new aeu("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final ti r = ti.c(ac.a("item", new aeu("smithing_template.netherite_upgrade.base_slot_description")));
   private static final ti s = ti.c(ac.a("item", new aeu("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aeu t = new aeu("item/empty_armor_slot_helmet");
   private static final aeu u = new aeu("item/empty_armor_slot_chestplate");
   private static final aeu v = new aeu("item/empty_armor_slot_leggings");
   private static final aeu w = new aeu("item/empty_armor_slot_boots");
   private static final aeu x = new aeu("item/empty_slot_hoe");
   private static final aeu y = new aeu("item/empty_slot_axe");
   private static final aeu z = new aeu("item/empty_slot_sword");
   private static final aeu A = new aeu("item/empty_slot_shovel");
   private static final aeu B = new aeu("item/empty_slot_pickaxe");
   private static final aeu C = new aeu("item/empty_slot_ingot");
   private static final aeu D = new aeu("item/empty_slot_redstone_dust");
   private static final aeu E = new aeu("item/empty_slot_quartz");
   private static final aeu F = new aeu("item/empty_slot_emerald");
   private static final aeu G = new aeu("item/empty_slot_diamond");
   private static final aeu H = new aeu("item/empty_slot_lapis_lazuli");
   private static final aeu I = new aeu("item/empty_slot_amethyst_shard");
   private final ti J;
   private final ti K;
   private final ti L;
   private final ti M;
   private final ti N;
   private final List<aeu> O;
   private final List<aeu> P;

   public ckc(ti $$0, ti $$1, ti $$2, ti $$3, ti $$4, List<aeu> $$5, List<aeu> $$6) {
      super(new civ.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static ckc a(aet<clf> $$0) {
      return a($$0.a());
   }

   public static ckc a(aeu $$0) {
      return new ckc(f, g, ti.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static ckc h() {
      return new ckc(j, k, e, r, s, C(), D());
   }

   private static List<aeu> A() {
      return List.of(t, u, v, w);
   }

   private static List<aeu> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<aeu> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<aeu> D() {
      return List.of(C);
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(th.a);
      $$2.add(d);
      $$2.add(th.a().b(this.J));
      $$2.add(c);
      $$2.add(th.a().b(this.K));
   }

   public ti i() {
      return this.M;
   }

   public ti x() {
      return this.N;
   }

   public List<aeu> y() {
      return this.O;
   }

   public List<aeu> z() {
      return this.P;
   }
}
