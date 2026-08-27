import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dxv<FC extends dzz> {
   public static final dxv<eag> e = a("no_op", new dyp(eag.a));
   public static final dxv<eav> f = a("tree", new dzh(eav.a));
   public static final dxv<eam> g = a("flower", new dyt(eam.a));
   public static final dxv<eam> h = a("no_bonemeal_flower", new dyt(eam.a));
   public static final dxv<eam> i = a("random_patch", new dyt(eam.a));
   public static final dxv<dzr> j = a("block_pile", new dxe(dzr.a));
   public static final dxv<eau> k = a("spring_feature", new dzg(eau.a));
   public static final dxv<eag> l = a("chorus_plant", new dxh(eag.a));
   public static final dxv<ean> m = a("replace_single_block", new dyw(ean.a));
   public static final dxv<eag> n = a("void_start_platform", new dzm(eag.a));
   public static final dxv<eag> o = a("desert_well", new dxo(eag.a));
   public static final dxv<dya> p = a("fossil", new dxz(dya.a));
   public static final dxv<eab> q = a("huge_red_mushroom", new dyg(eab.a));
   public static final dxv<eab> r = a("huge_brown_mushroom", new dyd(eab.a));
   public static final dxv<eag> s = a("ice_spike", new dyh(eag.a));
   public static final dxv<eag> t = a("glowstone_blob", new dyc(eag.a));
   public static final dxv<eag> u = a("freeze_top_layer", new dze(eag.a));
   public static final dxv<eag> v = a("vines", new dzl(eag.a));
   public static final dxv<dzq> w = a("block_column", new dxd(dzq.a));
   public static final dxv<eay> x = a("vegetation_patch", new dzk(eay.a));
   public static final dxv<eay> y = a("waterlogged_vegetation_patch", new dzn(eay.a));
   public static final dxv<eap> z = a("root_system", new dyx(eap.a));
   public static final dxv<eae> A = a("multiface_growth", new dyn(eae.a));
   public static final dxv<eax> B = a("underwater_magma", new dzj(eax.a));
   public static final dxv<eag> C = a("monster_room", new dym(eag.a));
   public static final dxv<eag> D = a("blue_ice", new dxf(eag.a));
   public static final dxv<dzs> E = a("iceberg", new dyi(dzs.a));
   public static final dxv<dzs> F = a("forest_rock", new dxc(dzs.a));
   public static final dxv<dzw> G = a("disk", new dxp(dzw.a));
   public static final dxv<dyk.a> H = a("lake", new dyk(dyk.a.a));
   public static final dxv<eah> I = a("ore", new dyq(eah.a));
   public static final dxv<eat> J = a("end_spike", new dzf(eat.a));
   public static final dxv<eag> K = a("end_island", new dxt(eag.a));
   public static final dxv<dzy> L = a("end_gateway", new dxs(dzy.a));
   public static final dzb M = a("seagrass", new dzb(eaj.k));
   public static final dxv<eag> N = a("kelp", new dyj(eag.a));
   public static final dxv<eag> O = a("coral_tree", new dxm(eag.a));
   public static final dxv<eag> P = a("coral_mushroom", new dxl(eag.a));
   public static final dxv<eag> Q = a("coral_claw", new dxj(eag.a));
   public static final dxv<dzu> R = a("sea_pickle", new dza(dzu.a));
   public static final dxv<ear> S = a("simple_block", new dzc(ear.a));
   public static final dxv<eaj> T = a("bamboo", new dwz(eaj.k));
   public static final dxv<dye> U = a("huge_fungus", new dyf(dye.a));
   public static final dxv<eaf> V = a("nether_forest_vegetation", new dyo(eaf.c));
   public static final dxv<eag> W = a("weeping_vines", new dzo(eag.a));
   public static final dxv<eaw> X = a("twisting_vines", new dzi(eaw.a));
   public static final dxv<dzt> Y = a("basalt_columns", new dxa(dzt.a));
   public static final dxv<dzv> Z = a("delta_feature", new dxn(dzv.a));
   public static final dxv<eao> aa = a("netherrack_replace_blobs", new dyv(eao.a));
   public static final dxv<ead> ab = a("fill_layer", new dxy(ead.a));
   public static final dxg ac = a("bonus_chest", new dxg(eag.a));
   public static final dxv<eag> ad = a("basalt_pillar", new dxb(eag.a));
   public static final dxv<eah> ae = a("scattered_ore", new dyy(eah.a));
   public static final dxv<eal> af = a("random_selector", new dyu(eal.a));
   public static final dxv<eas> ag = a("simple_random_selector", new dzd(eas.a));
   public static final dxv<eak> ah = a("random_boolean_selector", new dys(eak.a));
   public static final dxv<eaa> ai = a("geode", new dyb(eaa.b));
   public static final dxv<dzx> aj = a("dripstone_cluster", new dxq(dzx.a));
   public static final dxv<eac> ak = a("large_dripstone", new dyl(eac.a));
   public static final dxv<eai> al = a("pointed_dripstone", new dyr(eai.a));
   public static final dxv<eaq> am = a("sculk_patch", new dyz(eaq.a));
   private final Codec<dxi<FC, dxv<FC>>> a;

   private static <C extends dzz, F extends dxv<C>> F a(String $$0, F $$1) {
      return iy.a(kr.Q, $$0, $$1);
   }

   public dxv(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dxi<>(this, $$0x), dxi::c).codec();
   }

   public Codec<dxi<FC, dxv<FC>>> a() {
      return this.a;
   }

   protected void a(czf $$0, ib $$1, doz $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<doz> a(avr<dby> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(czs $$0, ib $$1, doz $$2, Predicate<doz> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dxx<FC> var1);

   public boolean a(FC $$0, czs $$1, dqw $$2, axr $$3, ib $$4) {
      return $$1.f_($$4) ? this.a(new dxx<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(doz $$0) {
      return $$0.a(avc.be);
   }

   public static boolean b(doz $$0) {
      return $$0.a(avc.af);
   }

   public static boolean a(czd $$0, ib $$1) {
      return $$0.a($$1, dxv::b);
   }

   public static boolean a(Function<ib, doz> $$0, ib $$1, Predicate<doz> $$2) {
      ib.a $$3 = new ib.a();

      for (ih $$4 : ih.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<ib, doz> $$0, ib $$1) {
      return a($$0, $$1, doy.a::i);
   }

   protected void a(czs $$0, ib $$1) {
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
