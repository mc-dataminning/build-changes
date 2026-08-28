import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ejy<FC extends emc> {
   public static final ejy<emj> e = a("no_op", new eks(emj.a));
   public static final ejy<emy> f = a("tree", new elk(emy.a));
   public static final ejy<emp> g = a("flower", new ekw(emp.a));
   public static final ejy<emp> h = a("no_bonemeal_flower", new ekw(emp.a));
   public static final ejy<emp> i = a("random_patch", new ekw(emp.a));
   public static final ejy<elu> j = a("block_pile", new ejg(elu.a));
   public static final ejy<emx> k = a("spring_feature", new elj(emx.a));
   public static final ejy<emj> l = a("chorus_plant", new ejj(emj.a));
   public static final ejy<emq> m = a("replace_single_block", new ekz(emq.a));
   public static final ejy<emj> n = a("void_start_platform", new elp(emj.a));
   public static final ejy<emj> o = a("desert_well", new ejq(emj.a));
   public static final ejy<ekd> p = a("fossil", new ekc(ekd.a));
   public static final ejy<eme> q = a("huge_red_mushroom", new ekj(eme.a));
   public static final ejy<eme> r = a("huge_brown_mushroom", new ekg(eme.a));
   public static final ejy<emj> s = a("ice_spike", new ekk(emj.a));
   public static final ejy<emj> t = a("glowstone_blob", new ekf(emj.a));
   public static final ejy<emj> u = a("freeze_top_layer", new elh(emj.a));
   public static final ejy<emj> v = a("vines", new elo(emj.a));
   public static final ejy<elt> w = a("block_column", new ejf(elt.a));
   public static final ejy<enb> x = a("vegetation_patch", new eln(enb.a));
   public static final ejy<enb> y = a("waterlogged_vegetation_patch", new elq(enb.a));
   public static final ejy<ems> z = a("root_system", new ela(ems.a));
   public static final ejy<emh> A = a("multiface_growth", new ekq(emh.a));
   public static final ejy<ena> B = a("underwater_magma", new elm(ena.a));
   public static final ejy<emj> C = a("monster_room", new ekp(emj.a));
   public static final ejy<emj> D = a("blue_ice", new ejh(emj.a));
   public static final ejy<elv> E = a("iceberg", new ekl(elv.a));
   public static final ejy<elv> F = a("forest_rock", new eje(elv.a));
   public static final ejy<elz> G = a("disk", new ejr(elz.a));
   public static final ejy<ekn.a> H = a("lake", new ekn(ekn.a.a));
   public static final ejy<emk> I = a("ore", new ekt(emk.a));
   public static final ejy<emj> J = a("end_platform", new ejw(emj.a));
   public static final ejy<emw> K = a("end_spike", new eli(emw.a));
   public static final ejy<emj> L = a("end_island", new ejv(emj.a));
   public static final ejy<emb> M = a("end_gateway", new eju(emb.a));
   public static final ele N = a("seagrass", new ele(emm.k));
   public static final ejy<emj> O = a("kelp", new ekm(emj.a));
   public static final ejy<emj> P = a("coral_tree", new ejo(emj.a));
   public static final ejy<emj> Q = a("coral_mushroom", new ejn(emj.a));
   public static final ejy<emj> R = a("coral_claw", new ejl(emj.a));
   public static final ejy<elx> S = a("sea_pickle", new eld(elx.a));
   public static final ejy<emu> T = a("simple_block", new elf(emu.a));
   public static final ejy<emm> U = a("bamboo", new ejb(emm.k));
   public static final ejy<ekh> V = a("huge_fungus", new eki(ekh.a));
   public static final ejy<emi> W = a("nether_forest_vegetation", new ekr(emi.c));
   public static final ejy<emj> X = a("weeping_vines", new elr(emj.a));
   public static final ejy<emz> Y = a("twisting_vines", new ell(emz.a));
   public static final ejy<elw> Z = a("basalt_columns", new ejc(elw.a));
   public static final ejy<ely> aa = a("delta_feature", new ejp(ely.a));
   public static final ejy<emr> ab = a("netherrack_replace_blobs", new eky(emr.a));
   public static final ejy<emg> ac = a("fill_layer", new ekb(emg.a));
   public static final eji ad = a("bonus_chest", new eji(emj.a));
   public static final ejy<emj> ae = a("basalt_pillar", new ejd(emj.a));
   public static final ejy<emk> af = a("scattered_ore", new elb(emk.a));
   public static final ejy<emo> ag = a("random_selector", new ekx(emo.a));
   public static final ejy<emv> ah = a("simple_random_selector", new elg(emv.a));
   public static final ejy<emn> ai = a("random_boolean_selector", new ekv(emn.a));
   public static final ejy<emd> aj = a("geode", new eke(emd.b));
   public static final ejy<ema> ak = a("dripstone_cluster", new ejs(ema.a));
   public static final ejy<emf> al = a("large_dripstone", new eko(emf.a));
   public static final ejy<eml> am = a("pointed_dripstone", new eku(eml.a));
   public static final ejy<emt> an = a("sculk_patch", new elc(emt.a));
   private final MapCodec<ejk<FC, ejy<FC>>> a;

   private static <C extends emc, F extends ejy<C>> F a(String $$0, F $$1) {
      return js.a(mg.O, $$0, $$1);
   }

   public ejy(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ejk<>(this, $$0x), ejk::c);
   }

   public MapCodec<ejk<FC, ejy<FC>>> a() {
      return this.a;
   }

   protected void a(dju $$0, iv $$1, eat $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<eat> a(axr<dmr> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dkl $$0, iv $$1, eat $$2, Predicate<eat> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eka<FC> var1);

   public boolean a(FC $$0, dkl $$1, ecr $$2, azv $$3, iv $$4) {
      return $$1.f_($$4) ? this.a(new eka<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(eat $$0) {
      return $$0.a(axc.bh);
   }

   public static boolean b(eat $$0) {
      return $$0.a(axc.ah);
   }

   public static boolean a(djs $$0, iv $$1) {
      return $$0.a($$1, ejy::b);
   }

   public static boolean a(Function<iv, eat> $$0, iv $$1, Predicate<eat> $$2) {
      iv.a $$3 = new iv.a();

      for (jb $$4 : jb.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iv, eat> $$0, iv $$1) {
      return a($$0, $$1, eas.a::l);
   }

   protected void a(dkl $$0, iv $$1) {
      iv.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jb.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.z($$2).e($$2);
      }
   }
}
