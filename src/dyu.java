import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dyu<FC extends eay> {
   public static final dyu<ebf> e = a("no_op", new dzo(ebf.a));
   public static final dyu<ebu> f = a("tree", new eag(ebu.a));
   public static final dyu<ebl> g = a("flower", new dzs(ebl.a));
   public static final dyu<ebl> h = a("no_bonemeal_flower", new dzs(ebl.a));
   public static final dyu<ebl> i = a("random_patch", new dzs(ebl.a));
   public static final dyu<eaq> j = a("block_pile", new dyd(eaq.a));
   public static final dyu<ebt> k = a("spring_feature", new eaf(ebt.a));
   public static final dyu<ebf> l = a("chorus_plant", new dyg(ebf.a));
   public static final dyu<ebm> m = a("replace_single_block", new dzv(ebm.a));
   public static final dyu<ebf> n = a("void_start_platform", new eal(ebf.a));
   public static final dyu<ebf> o = a("desert_well", new dyn(ebf.a));
   public static final dyu<dyz> p = a("fossil", new dyy(dyz.a));
   public static final dyu<eba> q = a("huge_red_mushroom", new dzf(eba.a));
   public static final dyu<eba> r = a("huge_brown_mushroom", new dzc(eba.a));
   public static final dyu<ebf> s = a("ice_spike", new dzg(ebf.a));
   public static final dyu<ebf> t = a("glowstone_blob", new dzb(ebf.a));
   public static final dyu<ebf> u = a("freeze_top_layer", new ead(ebf.a));
   public static final dyu<ebf> v = a("vines", new eak(ebf.a));
   public static final dyu<eap> w = a("block_column", new dyc(eap.a));
   public static final dyu<ebx> x = a("vegetation_patch", new eaj(ebx.a));
   public static final dyu<ebx> y = a("waterlogged_vegetation_patch", new eam(ebx.a));
   public static final dyu<ebo> z = a("root_system", new dzw(ebo.a));
   public static final dyu<ebd> A = a("multiface_growth", new dzm(ebd.a));
   public static final dyu<ebw> B = a("underwater_magma", new eai(ebw.a));
   public static final dyu<ebf> C = a("monster_room", new dzl(ebf.a));
   public static final dyu<ebf> D = a("blue_ice", new dye(ebf.a));
   public static final dyu<ear> E = a("iceberg", new dzh(ear.a));
   public static final dyu<ear> F = a("forest_rock", new dyb(ear.a));
   public static final dyu<eav> G = a("disk", new dyo(eav.a));
   public static final dyu<dzj.a> H = a("lake", new dzj(dzj.a.a));
   public static final dyu<ebg> I = a("ore", new dzp(ebg.a));
   public static final dyu<ebs> J = a("end_spike", new eae(ebs.a));
   public static final dyu<ebf> K = a("end_island", new dys(ebf.a));
   public static final dyu<eax> L = a("end_gateway", new dyr(eax.a));
   public static final eaa M = a("seagrass", new eaa(ebi.k));
   public static final dyu<ebf> N = a("kelp", new dzi(ebf.a));
   public static final dyu<ebf> O = a("coral_tree", new dyl(ebf.a));
   public static final dyu<ebf> P = a("coral_mushroom", new dyk(ebf.a));
   public static final dyu<ebf> Q = a("coral_claw", new dyi(ebf.a));
   public static final dyu<eat> R = a("sea_pickle", new dzz(eat.a));
   public static final dyu<ebq> S = a("simple_block", new eab(ebq.a));
   public static final dyu<ebi> T = a("bamboo", new dxy(ebi.k));
   public static final dyu<dzd> U = a("huge_fungus", new dze(dzd.a));
   public static final dyu<ebe> V = a("nether_forest_vegetation", new dzn(ebe.c));
   public static final dyu<ebf> W = a("weeping_vines", new ean(ebf.a));
   public static final dyu<ebv> X = a("twisting_vines", new eah(ebv.a));
   public static final dyu<eas> Y = a("basalt_columns", new dxz(eas.a));
   public static final dyu<eau> Z = a("delta_feature", new dym(eau.a));
   public static final dyu<ebn> aa = a("netherrack_replace_blobs", new dzu(ebn.a));
   public static final dyu<ebc> ab = a("fill_layer", new dyx(ebc.a));
   public static final dyf ac = a("bonus_chest", new dyf(ebf.a));
   public static final dyu<ebf> ad = a("basalt_pillar", new dya(ebf.a));
   public static final dyu<ebg> ae = a("scattered_ore", new dzx(ebg.a));
   public static final dyu<ebk> af = a("random_selector", new dzt(ebk.a));
   public static final dyu<ebr> ag = a("simple_random_selector", new eac(ebr.a));
   public static final dyu<ebj> ah = a("random_boolean_selector", new dzr(ebj.a));
   public static final dyu<eaz> ai = a("geode", new dza(eaz.b));
   public static final dyu<eaw> aj = a("dripstone_cluster", new dyp(eaw.a));
   public static final dyu<ebb> ak = a("large_dripstone", new dzk(ebb.a));
   public static final dyu<ebh> al = a("pointed_dripstone", new dzq(ebh.a));
   public static final dyu<ebp> am = a("sculk_patch", new dzy(ebp.a));
   private final Codec<dyh<FC, dyu<FC>>> a;

   private static <C extends eay, F extends dyu<C>> F a(String $$0, F $$1) {
      return ji.a(lc.Q, $$0, $$1);
   }

   public dyu(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dyh<>(this, $$0x), dyh::c).codec();
   }

   public Codec<dyh<FC, dyu<FC>>> a() {
      return this.a;
   }

   protected void a(dac $$0, im $$1, dpy $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dpy> a(awd<dcv> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dap $$0, im $$1, dpy $$2, Predicate<dpy> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dyw<FC> var1);

   public boolean a(FC $$0, dap $$1, drv $$2, ayd $$3, im $$4) {
      return $$1.f_($$4) ? this.a(new dyw<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dpy $$0) {
      return $$0.a(avo.be);
   }

   public static boolean b(dpy $$0) {
      return $$0.a(avo.af);
   }

   public static boolean a(daa $$0, im $$1) {
      return $$0.a($$1, dyu::b);
   }

   public static boolean a(Function<im, dpy> $$0, im $$1, Predicate<dpy> $$2) {
      im.a $$3 = new im.a();

      for (ir $$4 : ir.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<im, dpy> $$0, im $$1) {
      return a($$0, $$1, dpx.a::i);
   }

   protected void a(dap $$0, im $$1) {
      im.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ir.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
