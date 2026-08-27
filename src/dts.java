import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dts<FC extends dvw> {
   public static final dts<dwd> e = a("no_op", new dum(dwd.a));
   public static final dts<dws> f = a("tree", new dve(dws.a));
   public static final dts<dwj> g = a("flower", new duq(dwj.a));
   public static final dts<dwj> h = a("no_bonemeal_flower", new duq(dwj.a));
   public static final dts<dwj> i = a("random_patch", new duq(dwj.a));
   public static final dts<dvo> j = a("block_pile", new dtb(dvo.a));
   public static final dts<dwr> k = a("spring_feature", new dvd(dwr.a));
   public static final dts<dwd> l = a("chorus_plant", new dte(dwd.a));
   public static final dts<dwk> m = a("replace_single_block", new dut(dwk.a));
   public static final dts<dwd> n = a("void_start_platform", new dvj(dwd.a));
   public static final dts<dwd> o = a("desert_well", new dtl(dwd.a));
   public static final dts<dtx> p = a("fossil", new dtw(dtx.a));
   public static final dts<dvy> q = a("huge_red_mushroom", new dud(dvy.a));
   public static final dts<dvy> r = a("huge_brown_mushroom", new dua(dvy.a));
   public static final dts<dwd> s = a("ice_spike", new due(dwd.a));
   public static final dts<dwd> t = a("glowstone_blob", new dtz(dwd.a));
   public static final dts<dwd> u = a("freeze_top_layer", new dvb(dwd.a));
   public static final dts<dwd> v = a("vines", new dvi(dwd.a));
   public static final dts<dvn> w = a("block_column", new dta(dvn.a));
   public static final dts<dwv> x = a("vegetation_patch", new dvh(dwv.a));
   public static final dts<dwv> y = a("waterlogged_vegetation_patch", new dvk(dwv.a));
   public static final dts<dwm> z = a("root_system", new duu(dwm.a));
   public static final dts<dwb> A = a("multiface_growth", new duk(dwb.a));
   public static final dts<dwu> B = a("underwater_magma", new dvg(dwu.a));
   public static final dts<dwd> C = a("monster_room", new duj(dwd.a));
   public static final dts<dwd> D = a("blue_ice", new dtc(dwd.a));
   public static final dts<dvp> E = a("iceberg", new duf(dvp.a));
   public static final dts<dvp> F = a("forest_rock", new dsz(dvp.a));
   public static final dts<dvt> G = a("disk", new dtm(dvt.a));
   public static final dts<duh.a> H = a("lake", new duh(duh.a.a));
   public static final dts<dwe> I = a("ore", new dun(dwe.a));
   public static final dts<dwq> J = a("end_spike", new dvc(dwq.a));
   public static final dts<dwd> K = a("end_island", new dtq(dwd.a));
   public static final dts<dvv> L = a("end_gateway", new dtp(dvv.a));
   public static final duy M = a("seagrass", new duy(dwg.k));
   public static final dts<dwd> N = a("kelp", new dug(dwd.a));
   public static final dts<dwd> O = a("coral_tree", new dtj(dwd.a));
   public static final dts<dwd> P = a("coral_mushroom", new dti(dwd.a));
   public static final dts<dwd> Q = a("coral_claw", new dtg(dwd.a));
   public static final dts<dvr> R = a("sea_pickle", new dux(dvr.a));
   public static final dts<dwo> S = a("simple_block", new duz(dwo.a));
   public static final dts<dwg> T = a("bamboo", new dsw(dwg.k));
   public static final dts<dub> U = a("huge_fungus", new duc(dub.a));
   public static final dts<dwc> V = a("nether_forest_vegetation", new dul(dwc.c));
   public static final dts<dwd> W = a("weeping_vines", new dvl(dwd.a));
   public static final dts<dwt> X = a("twisting_vines", new dvf(dwt.a));
   public static final dts<dvq> Y = a("basalt_columns", new dsx(dvq.a));
   public static final dts<dvs> Z = a("delta_feature", new dtk(dvs.a));
   public static final dts<dwl> aa = a("netherrack_replace_blobs", new dus(dwl.a));
   public static final dts<dwa> ab = a("fill_layer", new dtv(dwa.a));
   public static final dtd ac = a("bonus_chest", new dtd(dwd.a));
   public static final dts<dwd> ad = a("basalt_pillar", new dsy(dwd.a));
   public static final dts<dwe> ae = a("scattered_ore", new duv(dwe.a));
   public static final dts<dwi> af = a("random_selector", new dur(dwi.a));
   public static final dts<dwp> ag = a("simple_random_selector", new dva(dwp.a));
   public static final dts<dwh> ah = a("random_boolean_selector", new dup(dwh.a));
   public static final dts<dvx> ai = a("geode", new dty(dvx.b));
   public static final dts<dvu> aj = a("dripstone_cluster", new dtn(dvu.a));
   public static final dts<dvz> ak = a("large_dripstone", new dui(dvz.a));
   public static final dts<dwf> al = a("pointed_dripstone", new duo(dwf.a));
   public static final dts<dwn> am = a("sculk_patch", new duw(dwn.a));
   private final Codec<dtf<FC, dts<FC>>> a;

   private static <C extends dvw, F extends dts<C>> F a(String $$0, F $$1) {
      return iv.a(kf.Q, $$0, $$1);
   }

   public dts(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dtf<>(this, $$0x), dtf::c).codec();
   }

   public Codec<dtf<FC, dts<FC>>> a() {
      return this.a;
   }

   protected void a(cvv $$0, hz $$1, dlf $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dlf> a(auo<cyo> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cwi $$0, hz $$1, dlf $$2, Predicate<dlf> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dtu<FC> var1);

   public boolean a(FC $$0, cwi $$1, dnc $$2, awo $$3, hz $$4) {
      return $$1.f_($$4) ? this.a(new dtu<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dlf $$0) {
      return $$0.a(atz.bd);
   }

   public static boolean b(dlf $$0) {
      return $$0.a(atz.af);
   }

   public static boolean a(cvt $$0, hz $$1) {
      return $$0.a($$1, dts::b);
   }

   public static boolean a(Function<hz, dlf> $$0, hz $$1, Predicate<dlf> $$2) {
      hz.a $$3 = new hz.a();

      for (ie $$4 : ie.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<hz, dlf> $$0, hz $$1) {
      return a($$0, $$1, dle.a::i);
   }

   protected void a(cwi $$0, hz $$1) {
      hz.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ie.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
