import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ekm<FC extends emr> {
   public static final ekm<emy> e = a("no_op", new elg(emy.a));
   public static final ekm<enn> f = a("tree", new ely(enn.a));
   public static final ekm<emq> g = a("fallen_tree", new ekl(emq.a));
   public static final ekm<ene> h = a("flower", new elk(ene.a));
   public static final ekm<ene> i = a("no_bonemeal_flower", new elk(ene.a));
   public static final ekm<ene> j = a("random_patch", new elk(ene.a));
   public static final ekm<emi> k = a("block_pile", new ejt(emi.a));
   public static final ekm<enm> l = a("spring_feature", new elx(enm.a));
   public static final ekm<emy> m = a("chorus_plant", new ejw(emy.a));
   public static final ekm<enf> n = a("replace_single_block", new eln(enf.a));
   public static final ekm<emy> o = a("void_start_platform", new emd(emy.a));
   public static final ekm<emy> p = a("desert_well", new ekd(emy.a));
   public static final ekm<ekr> q = a("fossil", new ekq(ekr.a));
   public static final ekm<emt> r = a("huge_red_mushroom", new ekx(emt.a));
   public static final ekm<emt> s = a("huge_brown_mushroom", new eku(emt.a));
   public static final ekm<emy> t = a("ice_spike", new eky(emy.a));
   public static final ekm<emy> u = a("glowstone_blob", new ekt(emy.a));
   public static final ekm<emy> v = a("freeze_top_layer", new elv(emy.a));
   public static final ekm<emy> w = a("vines", new emc(emy.a));
   public static final ekm<emh> x = a("block_column", new ejs(emh.a));
   public static final ekm<enq> y = a("vegetation_patch", new emb(enq.a));
   public static final ekm<enq> z = a("waterlogged_vegetation_patch", new eme(enq.a));
   public static final ekm<enh> A = a("root_system", new elo(enh.a));
   public static final ekm<emw> B = a("multiface_growth", new ele(emw.a));
   public static final ekm<enp> C = a("underwater_magma", new ema(enp.a));
   public static final ekm<emy> D = a("monster_room", new eld(emy.a));
   public static final ekm<emy> E = a("blue_ice", new eju(emy.a));
   public static final ekm<emj> F = a("iceberg", new ekz(emj.a));
   public static final ekm<emj> G = a("forest_rock", new ejr(emj.a));
   public static final ekm<emn> H = a("disk", new eke(emn.a));
   public static final ekm<elb.a> I = a("lake", new elb(elb.a.a));
   public static final ekm<emz> J = a("ore", new elh(emz.a));
   public static final ekm<emy> K = a("end_platform", new ekj(emy.a));
   public static final ekm<enl> L = a("end_spike", new elw(enl.a));
   public static final ekm<emy> M = a("end_island", new eki(emy.a));
   public static final ekm<emp> N = a("end_gateway", new ekh(emp.a));
   public static final els O = a("seagrass", new els(enb.k));
   public static final ekm<emy> P = a("kelp", new ela(emy.a));
   public static final ekm<emy> Q = a("coral_tree", new ekb(emy.a));
   public static final ekm<emy> R = a("coral_mushroom", new eka(emy.a));
   public static final ekm<emy> S = a("coral_claw", new ejy(emy.a));
   public static final ekm<eml> T = a("sea_pickle", new elr(eml.a));
   public static final ekm<enj> U = a("simple_block", new elt(enj.a));
   public static final ekm<enb> V = a("bamboo", new ejo(enb.k));
   public static final ekm<ekv> W = a("huge_fungus", new ekw(ekv.a));
   public static final ekm<emx> X = a("nether_forest_vegetation", new elf(emx.c));
   public static final ekm<emy> Y = a("weeping_vines", new emf(emy.a));
   public static final ekm<eno> Z = a("twisting_vines", new elz(eno.a));
   public static final ekm<emk> aa = a("basalt_columns", new ejp(emk.a));
   public static final ekm<emm> ab = a("delta_feature", new ekc(emm.a));
   public static final ekm<eng> ac = a("netherrack_replace_blobs", new elm(eng.a));
   public static final ekm<emv> ad = a("fill_layer", new ekp(emv.a));
   public static final ejv ae = a("bonus_chest", new ejv(emy.a));
   public static final ekm<emy> af = a("basalt_pillar", new ejq(emy.a));
   public static final ekm<emz> ag = a("scattered_ore", new elp(emz.a));
   public static final ekm<end> ah = a("random_selector", new ell(end.a));
   public static final ekm<enk> ai = a("simple_random_selector", new elu(enk.a));
   public static final ekm<enc> aj = a("random_boolean_selector", new elj(enc.a));
   public static final ekm<ems> ak = a("geode", new eks(ems.b));
   public static final ekm<emo> al = a("dripstone_cluster", new ekf(emo.a));
   public static final ekm<emu> am = a("large_dripstone", new elc(emu.a));
   public static final ekm<ena> an = a("pointed_dripstone", new eli(ena.a));
   public static final ekm<eni> ao = a("sculk_patch", new elq(eni.a));
   private final MapCodec<ejx<FC, ekm<FC>>> a;

   private static <C extends emr, F extends ekm<C>> F a(String $$0, F $$1) {
      return jt.a(mh.O, $$0, $$1);
   }

   public ekm(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ejx<>(this, $$0x), ejx::c);
   }

   public MapCodec<ejx<FC, ekm<FC>>> a() {
      return this.a;
   }

   protected void a(dkh $$0, iw $$1, ebg $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<ebg> a(axv<dne> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dky $$0, iw $$1, ebg $$2, Predicate<ebg> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eko<FC> var1);

   public boolean a(FC $$0, dky $$1, ede $$2, azz $$3, iw $$4) {
      return $$1.f_($$4) ? this.a(new eko<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(ebg $$0) {
      return $$0.a(axg.bh);
   }

   public static boolean b(ebg $$0) {
      return $$0.a(axg.ah);
   }

   public static boolean a(dkf $$0, iw $$1) {
      return $$0.a($$1, ekm::b);
   }

   public static boolean a(Function<iw, ebg> $$0, iw $$1, Predicate<ebg> $$2) {
      iw.a $$3 = new iw.a();

      for (jc $$4 : jc.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iw, ebg> $$0, iw $$1) {
      return a($$0, $$1, ebf.a::l);
   }

   protected void a(dky $$0, iw $$1) {
      iw.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jc.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.z($$2).e($$2);
      }
   }
}
