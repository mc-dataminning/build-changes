import java.util.List;
import javax.annotation.Nullable;

public class cnj extends cmc {
   private static final n a = n.h;
   private static final n b = n.j;
   private static final vb c = vb.c(ac.a("item", new agt("smithing_template.ingredients"))).a(a);
   private static final vb d = vb.c(ac.a("item", new agt("smithing_template.applies_to"))).a(a);
   private static final vb e = vb.c(ac.a("upgrade", new agt("netherite_upgrade"))).a(a);
   private static final vb f = vb.c(ac.a("item", new agt("smithing_template.armor_trim.applies_to"))).a(b);
   private static final vb g = vb.c(ac.a("item", new agt("smithing_template.armor_trim.ingredients"))).a(b);
   private static final vb h = vb.c(ac.a("item", new agt("smithing_template.armor_trim.base_slot_description")));
   private static final vb i = vb.c(ac.a("item", new agt("smithing_template.armor_trim.additions_slot_description")));
   private static final vb j = vb.c(ac.a("item", new agt("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final vb k = vb.c(ac.a("item", new agt("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final vb r = vb.c(ac.a("item", new agt("smithing_template.netherite_upgrade.base_slot_description")));
   private static final vb s = vb.c(ac.a("item", new agt("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final agt t = new agt("item/empty_armor_slot_helmet");
   private static final agt u = new agt("item/empty_armor_slot_chestplate");
   private static final agt v = new agt("item/empty_armor_slot_leggings");
   private static final agt w = new agt("item/empty_armor_slot_boots");
   private static final agt x = new agt("item/empty_slot_hoe");
   private static final agt y = new agt("item/empty_slot_axe");
   private static final agt z = new agt("item/empty_slot_sword");
   private static final agt A = new agt("item/empty_slot_shovel");
   private static final agt B = new agt("item/empty_slot_pickaxe");
   private static final agt C = new agt("item/empty_slot_ingot");
   private static final agt D = new agt("item/empty_slot_redstone_dust");
   private static final agt E = new agt("item/empty_slot_quartz");
   private static final agt F = new agt("item/empty_slot_emerald");
   private static final agt G = new agt("item/empty_slot_diamond");
   private static final agt H = new agt("item/empty_slot_lapis_lazuli");
   private static final agt I = new agt("item/empty_slot_amethyst_shard");
   private final vb J;
   private final vb K;
   private final vb L;
   private final vb M;
   private final vb N;
   private final List<agt> O;
   private final List<agt> P;

   public cnj(vb $$0, vb $$1, vb $$2, vb $$3, vb $$4, List<agt> $$5, List<agt> $$6) {
      super(new cmc.a());
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
   }

   public static cnj a(ags<com> $$0) {
      return a($$0.a());
   }

   public static cnj a(agt $$0) {
      return new cnj(f, g, vb.c(ac.a("trim_pattern", $$0)).a(a), h, i, A(), B());
   }

   public static cnj h() {
      return new cnj(j, k, e, r, s, C(), D());
   }

   private static List<agt> A() {
      return List.of(t, u, v, w);
   }

   private static List<agt> B() {
      return List.of(C, D, H, E, G, F, I);
   }

   private static List<agt> C() {
      return List.of(t, z, u, B, v, y, w, x, A);
   }

   private static List<agt> D() {
      return List.of(C);
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.add(this.L);
      $$2.add(va.a);
      $$2.add(d);
      $$2.add(va.a().b(this.J));
      $$2.add(c);
      $$2.add(va.a().b(this.K));
   }

   public vb i() {
      return this.M;
   }

   public vb x() {
      return this.N;
   }

   public List<agt> y() {
      return this.O;
   }

   public List<agt> z() {
      return this.P;
   }
}
