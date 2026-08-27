import java.util.List;
import javax.annotation.Nullable;

public class chb extends cfu {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final String c = ac.a("item", new acq("smithing_template"));
   private static final sw d = sw.c(ac.a("item", new acq("smithing_template.ingredients"))).a(a);
   private static final sw e = sw.c(ac.a("item", new acq("smithing_template.applies_to"))).a(a);
   private static final sw f = sw.c(ac.a("upgrade", new acq("netherite_upgrade"))).a(a);
   private static final sw g = sw.c(ac.a("item", new acq("smithing_template.armor_trim.applies_to"))).a(b);
   private static final sw h = sw.c(ac.a("item", new acq("smithing_template.armor_trim.ingredients"))).a(b);
   private static final sw i = sw.c(ac.a("item", new acq("smithing_template.armor_trim.base_slot_description")));
   private static final sw j = sw.c(ac.a("item", new acq("smithing_template.armor_trim.additions_slot_description")));
   private static final sw k = sw.c(ac.a("item", new acq("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final sw r = sw.c(ac.a("item", new acq("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final sw s = sw.c(ac.a("item", new acq("smithing_template.netherite_upgrade.base_slot_description")));
   private static final sw t = sw.c(ac.a("item", new acq("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final acq u = new acq("item/empty_armor_slot_helmet");
   private static final acq v = new acq("item/empty_armor_slot_chestplate");
   private static final acq w = new acq("item/empty_armor_slot_leggings");
   private static final acq x = new acq("item/empty_armor_slot_boots");
   private static final acq y = new acq("item/empty_slot_hoe");
   private static final acq z = new acq("item/empty_slot_axe");
   private static final acq A = new acq("item/empty_slot_sword");
   private static final acq B = new acq("item/empty_slot_shovel");
   private static final acq C = new acq("item/empty_slot_pickaxe");
   private static final acq D = new acq("item/empty_slot_ingot");
   private static final acq E = new acq("item/empty_slot_redstone_dust");
   private static final acq F = new acq("item/empty_slot_quartz");
   private static final acq G = new acq("item/empty_slot_emerald");
   private static final acq H = new acq("item/empty_slot_diamond");
   private static final acq I = new acq("item/empty_slot_lapis_lazuli");
   private static final acq J = new acq("item/empty_slot_amethyst_shard");
   private final sw K;
   private final sw L;
   private final sw M;
   private final sw N;
   private final sw O;
   private final List<acq> P;
   private final List<acq> Q;

   public chb(sw $$0, sw $$1, sw $$2, sw $$3, sw $$4, List<acq> $$5, List<acq> $$6) {
      super(new cfu.a());
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.O = $$4;
      this.P = $$5;
      this.Q = $$6;
   }

   public static chb a(acp<cie> $$0) {
      return a($$0.a());
   }

   public static chb a(acq $$0) {
      return new chb(g, h, sw.c(ac.a("trim_pattern", $$0)).a(a), i, j, A(), B());
   }

   public static chb h() {
      return new chb(k, r, f, s, t, C(), D());
   }

   private static List<acq> A() {
      return List.of(u, v, w, x);
   }

   private static List<acq> B() {
      return List.of(D, E, I, F, H, G, J);
   }

   private static List<acq> C() {
      return List.of(u, A, v, C, w, z, x, y, B);
   }

   private static List<acq> D() {
      return List.of(D);
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.M);
      $$2.add(sv.a);
      $$2.add(e);
      $$2.add(sv.a().b(this.K));
      $$2.add(d);
      $$2.add(sv.a().b(this.L));
   }

   public sw i() {
      return this.N;
   }

   public sw x() {
      return this.O;
   }

   public List<acq> y() {
      return this.P;
   }

   public List<acq> z() {
      return this.Q;
   }

   @Override
   public String a() {
      return c;
   }
}
