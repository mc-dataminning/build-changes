import java.util.List;
import javax.annotation.Nullable;

public class csk extends cre {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final wg c = wg.c(ac.a("item", new ajt("smithing_template.ingredients"))).a(a);
   private static final wg j = wg.c(ac.a("item", new ajt("smithing_template.applies_to"))).a(a);
   private static final wg k = wg.c(ac.a("upgrade", new ajt("netherite_upgrade"))).a(a);
   private static final wg l = wg.c(ac.a("item", new ajt("smithing_template.armor_trim.applies_to"))).a(b);
   private static final wg m = wg.c(ac.a("item", new ajt("smithing_template.armor_trim.ingredients"))).a(b);
   private static final wg n = wg.c(ac.a("item", new ajt("smithing_template.armor_trim.base_slot_description")));
   private static final wg o = wg.c(ac.a("item", new ajt("smithing_template.armor_trim.additions_slot_description")));
   private static final wg p = wg.c(ac.a("item", new ajt("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final wg q = wg.c(ac.a("item", new ajt("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final wg r = wg.c(ac.a("item", new ajt("smithing_template.netherite_upgrade.base_slot_description")));
   private static final wg s = wg.c(ac.a("item", new ajt("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ajt t = new ajt("item/empty_armor_slot_helmet");
   private static final ajt u = new ajt("item/empty_armor_slot_chestplate");
   private static final ajt v = new ajt("item/empty_armor_slot_leggings");
   private static final ajt w = new ajt("item/empty_armor_slot_boots");
   private static final ajt x = new ajt("item/empty_slot_hoe");
   private static final ajt y = new ajt("item/empty_slot_axe");
   private static final ajt z = new ajt("item/empty_slot_sword");
   private static final ajt A = new ajt("item/empty_slot_shovel");
   private static final ajt B = new ajt("item/empty_slot_pickaxe");
   private static final ajt C = new ajt("item/empty_slot_ingot");
   private static final ajt D = new ajt("item/empty_slot_redstone_dust");
   private static final ajt E = new ajt("item/empty_slot_quartz");
   private static final ajt F = new ajt("item/empty_slot_emerald");
   private static final ajt G = new ajt("item/empty_slot_diamond");
   private static final ajt H = new ajt("item/empty_slot_lapis_lazuli");
   private static final ajt I = new ajt("item/empty_slot_amethyst_shard");
   private final wg J;
   private final wg K;
   private final wg L;
   private final wg M;
   private final wg N;
   private final List<ajt> O;
   private final List<ajt> P;

   public csk(wg $$0, wg $$1, wg $$2, wg $$3, wg $$4, List<ajt> $$5, List<ajt> $$6) {
      super(new cre.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static csk a(ajs<ctn> $$0) {
      return a($$0.a());
   }

   public static csk a(ajt $$0) {
      return new csk(l, m, wg.c(ac.a("trim_pattern", $$0)).a(a), n, o, B(), C());
   }

   public static csk h() {
      return new csk(p, q, k, r, s, D(), E());
   }

   private static List<ajt> B() {
      return List.of(t, u, v, w);
   }

   private static List<ajt> C() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<ajt> D() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<ajt> E() {
      return List.of(C);
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(wf.a);
      $$2.add(j);
      $$2.add(wf.a().b(this.J));
      $$2.add(c);
      $$2.add(wf.a().b(this.K));
   }

   public wg i() {
      return this.M;
   }

   public wg j() {
      return this.N;
   }

   public List<ajt> k() {
      return this.O;
   }

   public List<ajt> l() {
      return this.P;
   }
}
