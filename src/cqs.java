import java.util.List;
import javax.annotation.Nullable;

public class cqs extends cpl {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final vs c = vs.c(ac.a("item", new ajc("smithing_template.ingredients"))).a(a);
   private static final vs d = vs.c(ac.a("item", new ajc("smithing_template.applies_to"))).a(a);
   private static final vs e = vs.c(ac.a("upgrade", new ajc("netherite_upgrade"))).a(a);
   private static final vs f = vs.c(ac.a("item", new ajc("smithing_template.armor_trim.applies_to"))).a(b);
   private static final vs g = vs.c(ac.a("item", new ajc("smithing_template.armor_trim.ingredients"))).a(b);
   private static final vs h = vs.c(ac.a("item", new ajc("smithing_template.armor_trim.base_slot_description")));
   private static final vs i = vs.c(ac.a("item", new ajc("smithing_template.armor_trim.additions_slot_description")));
   private static final vs j = vs.c(ac.a("item", new ajc("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final vs k = vs.c(ac.a("item", new ajc("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final vs r = vs.c(ac.a("item", new ajc("smithing_template.netherite_upgrade.base_slot_description")));
   private static final vs s = vs.c(ac.a("item", new ajc("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ajc t = new ajc("item/empty_armor_slot_helmet");
   private static final ajc u = new ajc("item/empty_armor_slot_chestplate");
   private static final ajc v = new ajc("item/empty_armor_slot_leggings");
   private static final ajc w = new ajc("item/empty_armor_slot_boots");
   private static final ajc x = new ajc("item/empty_slot_hoe");
   private static final ajc y = new ajc("item/empty_slot_axe");
   private static final ajc z = new ajc("item/empty_slot_sword");
   private static final ajc A = new ajc("item/empty_slot_shovel");
   private static final ajc B = new ajc("item/empty_slot_pickaxe");
   private static final ajc C = new ajc("item/empty_slot_ingot");
   private static final ajc D = new ajc("item/empty_slot_redstone_dust");
   private static final ajc E = new ajc("item/empty_slot_quartz");
   private static final ajc F = new ajc("item/empty_slot_emerald");
   private static final ajc G = new ajc("item/empty_slot_diamond");
   private static final ajc H = new ajc("item/empty_slot_lapis_lazuli");
   private static final ajc I = new ajc("item/empty_slot_amethyst_shard");
   private final vs J;
   private final vs K;
   private final vs L;
   private final vs M;
   private final vs N;
   private final List<ajc> O;
   private final List<ajc> P;

   public cqs(vs $$0, vs $$1, vs $$2, vs $$3, vs $$4, List<ajc> $$5, List<ajc> $$6) {
      super(new cpl.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cqs a(ajb<cru> $$0) {
      return a($$0.a());
   }

   public static cqs a(ajc $$0) {
      return new cqs(f, g, vs.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cqs h() {
      return new cqs(j, k, e, r, s, C(), D());
   }

   private static List<ajc> A() {
      return List.of(t, u, v, w);
   }

   private static List<ajc> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ajc> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ajc> D() {
      return List.of(C);
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(vr.a);
      $$2.add(d);
      $$2.add(vr.a().b(this.J));
      $$2.add(c);
      $$2.add(vr.a().b(this.K));
   }

   public vs i() {
      return this.M;
   }

   public vs j() {
      return this.N;
   }

   public List<ajc> y() {
      return this.O;
   }

   public List<ajc> z() {
      return this.P;
   }
}
