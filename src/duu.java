import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class duu<FC extends dwy> {
   public static final duu<dxf> e = a("no_op", new dvo(dxf.a));
   public static final duu<dxu> f = a("tree", new dwg(dxu.a));
   public static final duu<dxl> g = a("flower", new dvs(dxl.a));
   public static final duu<dxl> h = a("no_bonemeal_flower", new dvs(dxl.a));
   public static final duu<dxl> i = a("random_patch", new dvs(dxl.a));
   public static final duu<dwq> j = a("block_pile", new dud(dwq.a));
   public static final duu<dxt> k = a("spring_feature", new dwf(dxt.a));
   public static final duu<dxf> l = a("chorus_plant", new dug(dxf.a));
   public static final duu<dxm> m = a("replace_single_block", new dvv(dxm.a));
   public static final duu<dxf> n = a("void_start_platform", new dwl(dxf.a));
   public static final duu<dxf> o = a("desert_well", new dun(dxf.a));
   public static final duu<duz> p = a("fossil", new duy(duz.a));
   public static final duu<dxa> q = a("huge_red_mushroom", new dvf(dxa.a));
   public static final duu<dxa> r = a("huge_brown_mushroom", new dvc(dxa.a));
   public static final duu<dxf> s = a("ice_spike", new dvg(dxf.a));
   public static final duu<dxf> t = a("glowstone_blob", new dvb(dxf.a));
   public static final duu<dxf> u = a("freeze_top_layer", new dwd(dxf.a));
   public static final duu<dxf> v = a("vines", new dwk(dxf.a));
   public static final duu<dwp> w = a("block_column", new duc(dwp.a));
   public static final duu<dxx> x = a("vegetation_patch", new dwj(dxx.a));
   public static final duu<dxx> y = a("waterlogged_vegetation_patch", new dwm(dxx.a));
   public static final duu<dxo> z = a("root_system", new dvw(dxo.a));
   public static final duu<dxd> A = a("multiface_growth", new dvm(dxd.a));
   public static final duu<dxw> B = a("underwater_magma", new dwi(dxw.a));
   public static final duu<dxf> C = a("monster_room", new dvl(dxf.a));
   public static final duu<dxf> D = a("blue_ice", new due(dxf.a));
   public static final duu<dwr> E = a("iceberg", new dvh(dwr.a));
   public static final duu<dwr> F = a("forest_rock", new dub(dwr.a));
   public static final duu<dwv> G = a("disk", new duo(dwv.a));
   public static final duu<dvj.a> H = a("lake", new dvj(dvj.a.a));
   public static final duu<dxg> I = a("ore", new dvp(dxg.a));
   public static final duu<dxs> J = a("end_spike", new dwe(dxs.a));
   public static final duu<dxf> K = a("end_island", new dus(dxf.a));
   public static final duu<dwx> L = a("end_gateway", new dur(dwx.a));
   public static final dwa M = a("seagrass", new dwa(dxi.k));
   public static final duu<dxf> N = a("kelp", new dvi(dxf.a));
   public static final duu<dxf> O = a("coral_tree", new dul(dxf.a));
   public static final duu<dxf> P = a("coral_mushroom", new duk(dxf.a));
   public static final duu<dxf> Q = a("coral_claw", new dui(dxf.a));
   public static final duu<dwt> R = a("sea_pickle", new dvz(dwt.a));
   public static final duu<dxq> S = a("simple_block", new dwb(dxq.a));
   public static final duu<dxi> T = a("bamboo", new dty(dxi.k));
   public static final duu<dvd> U = a("huge_fungus", new dve(dvd.a));
   public static final duu<dxe> V = a("nether_forest_vegetation", new dvn(dxe.c));
   public static final duu<dxf> W = a("weeping_vines", new dwn(dxf.a));
   public static final duu<dxv> X = a("twisting_vines", new dwh(dxv.a));
   public static final duu<dws> Y = a("basalt_columns", new dtz(dws.a));
   public static final duu<dwu> Z = a("delta_feature", new dum(dwu.a));
   public static final duu<dxn> aa = a("netherrack_replace_blobs", new dvu(dxn.a));
   public static final duu<dxc> ab = a("fill_layer", new dux(dxc.a));
   public static final duf ac = a("bonus_chest", new duf(dxf.a));
   public static final duu<dxf> ad = a("basalt_pillar", new dua(dxf.a));
   public static final duu<dxg> ae = a("scattered_ore", new dvx(dxg.a));
   public static final duu<dxk> af = a("random_selector", new dvt(dxk.a));
   public static final duu<dxr> ag = a("simple_random_selector", new dwc(dxr.a));
   public static final duu<dxj> ah = a("random_boolean_selector", new dvr(dxj.a));
   public static final duu<dwz> ai = a("geode", new dva(dwz.b));
   public static final duu<dww> aj = a("dripstone_cluster", new dup(dww.a));
   public static final duu<dxb> ak = a("large_dripstone", new dvk(dxb.a));
   public static final duu<dxh> al = a("pointed_dripstone", new dvq(dxh.a));
   public static final duu<dxp> am = a("sculk_patch", new dvy(dxp.a));
   private final Codec<duh<FC, duu<FC>>> a;

   private static <C extends dwy, F extends duu<C>> F a(String $$0, F $$1) {
      return ix.a(kh.Q, $$0, $$1);
   }

   public duu(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new duh<>(this, $$0x), duh::c).codec();
   }

   public Codec<duh<FC, duu<FC>>> a() {
      return this.a;
   }

   protected void a(cwm $$0, ib $$1, dme $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dme> a(aut<czf> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cwz $$0, ib $$1, dme $$2, Predicate<dme> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(duw<FC> var1);

   public boolean a(FC $$0, cwz $$1, dob $$2, awt $$3, ib $$4) {
      return $$1.f_($$4) ? this.a(new duw<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dme $$0) {
      return $$0.a(aue.bd);
   }

   public static boolean b(dme $$0) {
      return $$0.a(aue.af);
   }

   public static boolean a(cwk $$0, ib $$1) {
      return $$0.a($$1, duu::b);
   }

   public static boolean a(Function<ib, dme> $$0, ib $$1, Predicate<dme> $$2) {
      ib.a $$3 = new ib.a();

      for (ih $$4 : ih.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ib, dme> $$0, ib $$1) {
      return a($$0, $$1, dmd.a::i);
   }

   protected void a(cwz $$0, ib $$1) {
      ib.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ih.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
