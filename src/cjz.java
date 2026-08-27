import java.util.List;
import javax.annotation.Nullable;

public class cjz extends cis {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final tf c = tf.c(ac.a("item", new aer("smithing_template.ingredients"))).a(a);
   private static final tf d = tf.c(ac.a("item", new aer("smithing_template.applies_to"))).a(a);
   private static final tf e = tf.c(ac.a("upgrade", new aer("netherite_upgrade"))).a(a);
   private static final tf f = tf.c(ac.a("item", new aer("smithing_template.armor_trim.applies_to"))).a(b);
   private static final tf g = tf.c(ac.a("item", new aer("smithing_template.armor_trim.ingredients"))).a(b);
   private static final tf h = tf.c(ac.a("item", new aer("smithing_template.armor_trim.base_slot_description")));
   private static final tf i = tf.c(ac.a("item", new aer("smithing_template.armor_trim.additions_slot_description")));
   private static final tf j = tf.c(ac.a("item", new aer("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final tf k = tf.c(ac.a("item", new aer("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final tf r = tf.c(ac.a("item", new aer("smithing_template.netherite_upgrade.base_slot_description")));
   private static final tf s = tf.c(ac.a("item", new aer("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final aer t = new aer("item/empty_armor_slot_helmet");
   private static final aer u = new aer("item/empty_armor_slot_chestplate");
   private static final aer v = new aer("item/empty_armor_slot_leggings");
   private static final aer w = new aer("item/empty_armor_slot_boots");
   private static final aer x = new aer("item/empty_slot_hoe");
   private static final aer y = new aer("item/empty_slot_axe");
   private static final aer z = new aer("item/empty_slot_sword");
   private static final aer A = new aer("item/empty_slot_shovel");
   private static final aer B = new aer("item/empty_slot_pickaxe");
   private static final aer C = new aer("item/empty_slot_ingot");
   private static final aer D = new aer("item/empty_slot_redstone_dust");
   private static final aer E = new aer("item/empty_slot_quartz");
   private static final aer F = new aer("item/empty_slot_emerald");
   private static final aer G = new aer("item/empty_slot_diamond");
   private static final aer H = new aer("item/empty_slot_lapis_lazuli");
   private static final aer I = new aer("item/empty_slot_amethyst_shard");
   private final tf J;
   private final tf K;
   private final tf L;
   private final tf M;
   private final tf N;
   private final List<aer> O;
   private final List<aer> P;

   public cjz(tf $$0, tf $$1, tf $$2, tf $$3, tf $$4, List<aer> $$5, List<aer> $$6) {
      super(new cis.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cjz a(aeq<clc> $$0) {
      return a($$0.a());
   }

   public static cjz a(aer $$0) {
      return new cjz(f, g, tf.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cjz h() {
      return new cjz(j, k, e, r, s, C(), D());
   }

   private static List<aer> A() {
      return List.of(t, u, v, w);
   }

   private static List<aer> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<aer> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<aer> D() {
      return List.of(C);
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(te.a);
      $$2.add(d);
      $$2.add(te.a().b(this.J));
      $$2.add(c);
      $$2.add(te.a().b(this.K));
   }

   public tf i() {
      return this.M;
   }

   public tf x() {
      return this.N;
   }

   public List<aer> y() {
      return this.O;
   }

   public List<aer> z() {
      return this.P;
   }
}
