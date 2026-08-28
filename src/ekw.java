import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ekw<FC extends enb> {
   public static final ekw<eni> e = a("no_op", new elq(eni.a));
   public static final ekw<enx> f = a("tree", new emi(enx.a));
   public static final ekw<ena> g = a("fallen_tree", new ekv(ena.a));
   public static final ekw<eno> h = a("flower", new elu(eno.a));
   public static final ekw<eno> i = a("no_bonemeal_flower", new elu(eno.a));
   public static final ekw<eno> j = a("random_patch", new elu(eno.a));
   public static final ekw<ems> k = a("block_pile", new ekd(ems.a));
   public static final ekw<enw> l = a("spring_feature", new emh(enw.a));
   public static final ekw<eni> m = a("chorus_plant", new ekg(eni.a));
   public static final ekw<enp> n = a("replace_single_block", new elx(enp.a));
   public static final ekw<eni> o = a("void_start_platform", new emn(eni.a));
   public static final ekw<eni> p = a("desert_well", new ekn(eni.a));
   public static final ekw<elb> q = a("fossil", new ela(elb.a));
   public static final ekw<end> r = a("huge_red_mushroom", new elh(end.a));
   public static final ekw<end> s = a("huge_brown_mushroom", new ele(end.a));
   public static final ekw<eni> t = a("ice_spike", new eli(eni.a));
   public static final ekw<eni> u = a("glowstone_blob", new eld(eni.a));
   public static final ekw<eni> v = a("freeze_top_layer", new emf(eni.a));
   public static final ekw<eni> w = a("vines", new emm(eni.a));
   public static final ekw<emr> x = a("block_column", new ekc(emr.a));
   public static final ekw<eoa> y = a("vegetation_patch", new eml(eoa.a));
   public static final ekw<eoa> z = a("waterlogged_vegetation_patch", new emo(eoa.a));
   public static final ekw<enr> A = a("root_system", new ely(enr.a));
   public static final ekw<eng> B = a("multiface_growth", new elo(eng.a));
   public static final ekw<enz> C = a("underwater_magma", new emk(enz.a));
   public static final ekw<eni> D = a("monster_room", new eln(eni.a));
   public static final ekw<eni> E = a("blue_ice", new eke(eni.a));
   public static final ekw<emt> F = a("iceberg", new elj(emt.a));
   public static final ekw<emt> G = a("forest_rock", new ekb(emt.a));
   public static final ekw<emx> H = a("disk", new eko(emx.a));
   public static final ekw<ell.a> I = a("lake", new ell(ell.a.a));
   public static final ekw<enj> J = a("ore", new elr(enj.a));
   public static final ekw<eni> K = a("end_platform", new ekt(eni.a));
   public static final ekw<env> L = a("end_spike", new emg(env.a));
   public static final ekw<eni> M = a("end_island", new eks(eni.a));
   public static final ekw<emz> N = a("end_gateway", new ekr(emz.a));
   public static final emc O = a("seagrass", new emc(enl.k));
   public static final ekw<eni> P = a("kelp", new elk(eni.a));
   public static final ekw<eni> Q = a("coral_tree", new ekl(eni.a));
   public static final ekw<eni> R = a("coral_mushroom", new ekk(eni.a));
   public static final ekw<eni> S = a("coral_claw", new eki(eni.a));
   public static final ekw<emv> T = a("sea_pickle", new emb(emv.a));
   public static final ekw<ent> U = a("simple_block", new emd(ent.a));
   public static final ekw<enl> V = a("bamboo", new ejy(enl.k));
   public static final ekw<elf> W = a("huge_fungus", new elg(elf.a));
   public static final ekw<enh> X = a("nether_forest_vegetation", new elp(enh.c));
   public static final ekw<eni> Y = a("weeping_vines", new emp(eni.a));
   public static final ekw<eny> Z = a("twisting_vines", new emj(eny.a));
   public static final ekw<emu> aa = a("basalt_columns", new ejz(emu.a));
   public static final ekw<emw> ab = a("delta_feature", new ekm(emw.a));
   public static final ekw<enq> ac = a("netherrack_replace_blobs", new elw(enq.a));
   public static final ekw<enf> ad = a("fill_layer", new ekz(enf.a));
   public static final ekf ae = a("bonus_chest", new ekf(eni.a));
   public static final ekw<eni> af = a("basalt_pillar", new eka(eni.a));
   public static final ekw<enj> ag = a("scattered_ore", new elz(enj.a));
   public static final ekw<enn> ah = a("random_selector", new elv(enn.a));
   public static final ekw<enu> ai = a("simple_random_selector", new eme(enu.a));
   public static final ekw<enm> aj = a("random_boolean_selector", new elt(enm.a));
   public static final ekw<enc> ak = a("geode", new elc(enc.b));
   public static final ekw<emy> al = a("dripstone_cluster", new ekp(emy.a));
   public static final ekw<ene> am = a("large_dripstone", new elm(ene.a));
   public static final ekw<enk> an = a("pointed_dripstone", new els(enk.a));
   public static final ekw<ens> ao = a("sculk_patch", new ema(ens.a));
   private final MapCodec<ekh<FC, ekw<FC>>> a;

   private static <C extends enb, F extends ekw<C>> F a(String $$0, F $$1) {
      return jt.a(mh.O, $$0, $$1);
   }

   public ekw(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ekh<>(this, $$0x), ekh::c);
   }

   public MapCodec<ekh<FC, ekw<FC>>> a() {
      return this.a;
   }

   protected void a(dkr $$0, iw $$1, ebq $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<ebq> a(ayc<dno> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dli $$0, iw $$1, ebq $$2, Predicate<ebq> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(eky<FC> var1);

   public boolean a(FC $$0, dli $$1, edo $$2, bai $$3, iw $$4) {
      return $$1.f_($$4) ? this.a(new eky<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(ebq $$0) {
      return $$0.a(axn.bh);
   }

   public static boolean b(ebq $$0) {
      return $$0.a(axn.ah);
   }

   public static boolean a(dkp $$0, iw $$1) {
      return $$0.a($$1, ekw::b);
   }

   public static boolean a(Function<iw, ebq> $$0, iw $$1, Predicate<ebq> $$2) {
      iw.a $$3 = new iw.a();

      for (jc $$4 : jc.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<iw, ebq> $$0, iw $$1) {
      return a($$0, $$1, ebp.a::l);
   }

   protected void a(dli $$0, iw $$1) {
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
