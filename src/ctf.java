import java.util.List;
import javax.annotation.Nullable;

public class ctf extends cry {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final ws c = ws.c(ac.a("item", new akf("smithing_template.ingredients"))).a(a);
   private static final ws j = ws.c(ac.a("item", new akf("smithing_template.applies_to"))).a(a);
   private static final ws k = ws.c(ac.a("upgrade", new akf("netherite_upgrade"))).a(a);
   private static final ws l = ws.c(ac.a("item", new akf("smithing_template.armor_trim.applies_to"))).a(b);
   private static final ws m = ws.c(ac.a("item", new akf("smithing_template.armor_trim.ingredients"))).a(b);
   private static final ws n = ws.c(ac.a("item", new akf("smithing_template.armor_trim.base_slot_description")));
   private static final ws o = ws.c(ac.a("item", new akf("smithing_template.armor_trim.additions_slot_description")));
   private static final ws p = ws.c(ac.a("item", new akf("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final ws q = ws.c(ac.a("item", new akf("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final ws r = ws.c(ac.a("item", new akf("smithing_template.netherite_upgrade.base_slot_description")));
   private static final ws s = ws.c(ac.a("item", new akf("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final akf t = new akf("item/empty_armor_slot_helmet");
   private static final akf u = new akf("item/empty_armor_slot_chestplate");
   private static final akf v = new akf("item/empty_armor_slot_leggings");
   private static final akf w = new akf("item/empty_armor_slot_boots");
   private static final akf x = new akf("item/empty_slot_hoe");
   private static final akf y = new akf("item/empty_slot_axe");
   private static final akf z = new akf("item/empty_slot_sword");
   private static final akf A = new akf("item/empty_slot_shovel");
   private static final akf B = new akf("item/empty_slot_pickaxe");
   private static final akf C = new akf("item/empty_slot_ingot");
   private static final akf D = new akf("item/empty_slot_redstone_dust");
   private static final akf E = new akf("item/empty_slot_quartz");
   private static final akf F = new akf("item/empty_slot_emerald");
   private static final akf G = new akf("item/empty_slot_diamond");
   private static final akf H = new akf("item/empty_slot_lapis_lazuli");
   private static final akf I = new akf("item/empty_slot_amethyst_shard");
   private final ws J;
   private final ws K;
   private final ws L;
   private final ws M;
   private final ws N;
   private final List<akf> O;
   private final List<akf> P;

   public ctf(ws $$0, ws $$1, ws $$2, ws $$3, ws $$4, List<akf> $$5, List<akf> $$6, cmw... $$7) {
      super(new cry.a().a($$7));
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static ctf a(ake<cui> $$0, cmw... $$1) {
      return a($$0.a(), $$1);
   }

   public static ctf a(akf $$0, cmw... $$1) {
      return new ctf(l, m, ws.c(ac.a("trim_pattern", $$0)).a(a), n, o, B(), C(), $$1);
   }

   public static ctf h() {
      return new ctf(p, q, k, r, s, D(), E());
   }

   private static List<akf> B() {
      return List.of(t, u, v, w);
   }

   private static List<akf> C() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<akf> D() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<akf> E() {
      return List.of(C);
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(wr.a);
      $$2.add(j);
      $$2.add(wr.a().b(this.J));
      $$2.add(c);
      $$2.add(wr.a().b(this.K));
   }

   public ws i() {
      return this.M;
   }

   public ws j() {
      return this.N;
   }

   public List<akf> k() {
      return this.O;
   }

   public List<akf> l() {
      return this.P;
   }
}
