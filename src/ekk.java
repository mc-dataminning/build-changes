import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ekk<FC extends emp> {
   public static final ekk<emw> e = a("no_op", new ele(emw.a));
   public static final ekk<enl> f = a("tree", new elw(enl.a));
   public static final ekk<emo> g = a("fallen_tree", new ekj(emo.a));
   public static final ekk<enc> h = a("flower", new eli(enc.a));
   public static final ekk<enc> i = a("no_bonemeal_flower", new eli(enc.a));
   public static final ekk<enc> j = a("random_patch", new eli(enc.a));
   public static final ekk<emg> k = a("block_pile", new ejr(emg.a));
   public static final ekk<enk> l = a("spring_feature", new elv(enk.a));
   public static final ekk<emw> m = a("chorus_plant", new eju(emw.a));
   public static final ekk<end> n = a("replace_single_block", new ell(end.a));
   public static final ekk<emw> o = a("void_start_platform", new emb(emw.a));
   public static final ekk<emw> p = a("desert_well", new ekb(emw.a));
   public static final ekk<ekp> q = a("fossil", new eko(ekp.a));
   public static final ekk<emr> r = a("huge_red_mushroom", new ekv(emr.a));
   public static final ekk<emr> s = a("huge_brown_mushroom", new eks(emr.a));
   public static final ekk<emw> t = a("ice_spike", new ekw(emw.a));
   public static final ekk<emw> u = a("glowstone_blob", new ekr(emw.a));
   public static final ekk<emw> v = a("freeze_top_layer", new elt(emw.a));
   public static final ekk<emw> w = a("vines", new ema(emw.a));
   public static final ekk<emf> x = a("block_column", new ejq(emf.a));
   public static final ekk<eno> y = a("vegetation_patch", new elz(eno.a));
   public static final ekk<eno> z = a("waterlogged_vegetation_patch", new emc(eno.a));
   public static final ekk<enf> A = a("root_system", new elm(enf.a));
   public static final ekk<emu> B = a("multiface_growth", new elc(emu.a));
   public static final ekk<enn> C = a("underwater_magma", new ely(enn.a));
   public static final ekk<emw> D = a("monster_room", new elb(emw.a));
   public static final ekk<emw> E = a("blue_ice", new ejs(emw.a));
   public static final ekk<emh> F = a("iceberg", new ekx(emh.a));
   public static final ekk<emh> G = a("forest_rock", new ejp(emh.a));
   public static final ekk<eml> H = a("disk", new ekc(eml.a));
   public static final ekk<ekz.a> I = a("lake", new ekz(ekz.a.a));
   public static final ekk<emx> J = a("ore", new elf(emx.a));
   public static final ekk<emw> K = a("end_platform", new ekh(emw.a));
   public static final ekk<enj> L = a("end_spike", new elu(enj.a));
   public static final ekk<emw> M = a("end_island", new ekg(emw.a));
   public static final ekk<emn> N = a("end_gateway", new ekf(emn.a));
   public static final elq O = a("seagrass", new elq(emz.k));
   public static final ekk<emw> P = a("kelp", new eky(emw.a));
   public static final ekk<emw> Q = a("coral_tree", new ejz(emw.a));
   public static final ekk<emw> R = a("coral_mushroom", new ejy(emw.a));
   public static final ekk<emw> S = a("coral_claw", new ejw(emw.a));
   public static final ekk<emj> T = a("sea_pickle", new elp(emj.a));
   public static final ekk<enh> U = a("simple_block", new elr(enh.a));
   public static final ekk<emz> V = a("bamboo", new ejm(emz.k));
   public static final ekk<ekt> W = a("huge_fungus", new eku(ekt.a));
   public static final ekk<emv> X = a("nether_forest_vegetation", new eld(emv.c));
   public static final ekk<emw> Y = a("weeping_vines", new emd(emw.a));
   public static final ekk<enm> Z = a("twisting_vines", new elx(enm.a));
   public static final ekk<emi> aa = a("basalt_columns", new ejn(emi.a));
   public static final ekk<emk> ab = a("delta_feature", new eka(emk.a));
   public static final ekk<ene> ac = a("netherrack_replace_blobs", new elk(ene.a));
   public static final ekk<emt> ad = a("fill_layer", new ekn(emt.a));
   public static final ejt ae = a("bonus_chest", new ejt(emw.a));
   public static final ekk<emw> af = a("basalt_pillar", new ejo(emw.a));
   public static final ekk<emx> ag = a("scattered_ore", new eln(emx.a));
   public static final ekk<enb> ah = a("random_selector", new elj(enb.a));
   public static final ekk<eni> ai = a("simple_random_selector", new els(eni.a));
   public static final ekk<ena> aj = a("random_boolean_selector", new elh(ena.a));
   public static final ekk<emq> ak = a("geode", new ekq(emq.b));
   public static final ekk<emm> al = a("dripstone_cluster", new ekd(emm.a));
   public static final ekk<ems> am = a("large_dripstone", new ela(ems.a));
   public static final ekk<emy> an = a("pointed_dripstone", new elg(emy.a));
   public static final ekk<eng> ao = a("sculk_patch", new elo(eng.a));
   private final MapCodec<ejv<FC, ekk<FC>>> a;

   private static <C extends emp, F extends ekk<C>> F a(String $$0, F $$1) {
      return js.a(mg.O, $$0, $$1);
   }

   public ekk(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ejv<>(this, $$0x), ejv::c);
   }

   public MapCodec<ejv<FC, ekk<FC>>> a() {
      return this.a;
   }

   protected void a(dkf $$0, iv $$1, ebe $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<ebe> a(axt<dnc> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dkw $$0, iv $$1, ebe $$2, Predicate<ebe> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(ekm<FC> var1);

   public boolean a(FC $$0, dkw $$1, edc $$2, azx $$3, iv $$4) {
      return $$1.f_($$4) ? this.a(new ekm<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(ebe $$0) {
      return $$0.a(axe.bh);
   }

   public static boolean b(ebe $$0) {
      return $$0.a(axe.ah);
   }

   public static boolean a(dkd $$0, iv $$1) {
      return $$0.a($$1, ekk::b);
   }

   public static boolean a(Function<iv, ebe> $$0, iv $$1, Predicate<ebe> $$2) {
      iv.a $$3 = new iv.a();

      for (jb $$4 : jb.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iv, ebe> $$0, iv $$1) {
      return a($$0, $$1, ebd.a::l);
   }

   protected void a(dkw $$0, iv $$1) {
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
