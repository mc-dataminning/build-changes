import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dye<FC extends eai> {
   public static final dye<eap> e = a("no_op", new dyy(eap.a));
   public static final dye<ebe> f = a("tree", new dzq(ebe.a));
   public static final dye<eav> g = a("flower", new dzc(eav.a));
   public static final dye<eav> h = a("no_bonemeal_flower", new dzc(eav.a));
   public static final dye<eav> i = a("random_patch", new dzc(eav.a));
   public static final dye<eaa> j = a("block_pile", new dxn(eaa.a));
   public static final dye<ebd> k = a("spring_feature", new dzp(ebd.a));
   public static final dye<eap> l = a("chorus_plant", new dxq(eap.a));
   public static final dye<eaw> m = a("replace_single_block", new dzf(eaw.a));
   public static final dye<eap> n = a("void_start_platform", new dzv(eap.a));
   public static final dye<eap> o = a("desert_well", new dxx(eap.a));
   public static final dye<dyj> p = a("fossil", new dyi(dyj.a));
   public static final dye<eak> q = a("huge_red_mushroom", new dyp(eak.a));
   public static final dye<eak> r = a("huge_brown_mushroom", new dym(eak.a));
   public static final dye<eap> s = a("ice_spike", new dyq(eap.a));
   public static final dye<eap> t = a("glowstone_blob", new dyl(eap.a));
   public static final dye<eap> u = a("freeze_top_layer", new dzn(eap.a));
   public static final dye<eap> v = a("vines", new dzu(eap.a));
   public static final dye<dzz> w = a("block_column", new dxm(dzz.a));
   public static final dye<ebh> x = a("vegetation_patch", new dzt(ebh.a));
   public static final dye<ebh> y = a("waterlogged_vegetation_patch", new dzw(ebh.a));
   public static final dye<eay> z = a("root_system", new dzg(eay.a));
   public static final dye<ean> A = a("multiface_growth", new dyw(ean.a));
   public static final dye<ebg> B = a("underwater_magma", new dzs(ebg.a));
   public static final dye<eap> C = a("monster_room", new dyv(eap.a));
   public static final dye<eap> D = a("blue_ice", new dxo(eap.a));
   public static final dye<eab> E = a("iceberg", new dyr(eab.a));
   public static final dye<eab> F = a("forest_rock", new dxl(eab.a));
   public static final dye<eaf> G = a("disk", new dxy(eaf.a));
   public static final dye<dyt.a> H = a("lake", new dyt(dyt.a.a));
   public static final dye<eaq> I = a("ore", new dyz(eaq.a));
   public static final dye<ebc> J = a("end_spike", new dzo(ebc.a));
   public static final dye<eap> K = a("end_island", new dyc(eap.a));
   public static final dye<eah> L = a("end_gateway", new dyb(eah.a));
   public static final dzk M = a("seagrass", new dzk(eas.k));
   public static final dye<eap> N = a("kelp", new dys(eap.a));
   public static final dye<eap> O = a("coral_tree", new dxv(eap.a));
   public static final dye<eap> P = a("coral_mushroom", new dxu(eap.a));
   public static final dye<eap> Q = a("coral_claw", new dxs(eap.a));
   public static final dye<ead> R = a("sea_pickle", new dzj(ead.a));
   public static final dye<eba> S = a("simple_block", new dzl(eba.a));
   public static final dye<eas> T = a("bamboo", new dxi(eas.k));
   public static final dye<dyn> U = a("huge_fungus", new dyo(dyn.a));
   public static final dye<eao> V = a("nether_forest_vegetation", new dyx(eao.c));
   public static final dye<eap> W = a("weeping_vines", new dzx(eap.a));
   public static final dye<ebf> X = a("twisting_vines", new dzr(ebf.a));
   public static final dye<eac> Y = a("basalt_columns", new dxj(eac.a));
   public static final dye<eae> Z = a("delta_feature", new dxw(eae.a));
   public static final dye<eax> aa = a("netherrack_replace_blobs", new dze(eax.a));
   public static final dye<eam> ab = a("fill_layer", new dyh(eam.a));
   public static final dxp ac = a("bonus_chest", new dxp(eap.a));
   public static final dye<eap> ad = a("basalt_pillar", new dxk(eap.a));
   public static final dye<eaq> ae = a("scattered_ore", new dzh(eaq.a));
   public static final dye<eau> af = a("random_selector", new dzd(eau.a));
   public static final dye<ebb> ag = a("simple_random_selector", new dzm(ebb.a));
   public static final dye<eat> ah = a("random_boolean_selector", new dzb(eat.a));
   public static final dye<eaj> ai = a("geode", new dyk(eaj.b));
   public static final dye<eag> aj = a("dripstone_cluster", new dxz(eag.a));
   public static final dye<eal> ak = a("large_dripstone", new dyu(eal.a));
   public static final dye<ear> al = a("pointed_dripstone", new dza(ear.a));
   public static final dye<eaz> am = a("sculk_patch", new dzi(eaz.a));
   private final Codec<dxr<FC, dye<FC>>> a;

   private static <C extends eai, F extends dye<C>> F a(String $$0, F $$1) {
      return ja.a(kt.Q, $$0, $$1);
   }

   public dye(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dxr<>(this, $$0x), dxr::c).codec();
   }

   public Codec<dxr<FC, dye<FC>>> a() {
      return this.a;
   }

   protected void a(czo $$0, id $$1, dpi $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dpi> a(avt<dch> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dab $$0, id $$1, dpi $$2, Predicate<dpi> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dyg<FC> var1);

   public boolean a(FC $$0, dab $$1, drf $$2, axt $$3, id $$4) {
      return $$1.f_($$4) ? this.a(new dyg<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dpi $$0) {
      return $$0.a(ave.be);
   }

   public static boolean b(dpi $$0) {
      return $$0.a(ave.af);
   }

   public static boolean a(czm $$0, id $$1) {
      return $$0.a($$1, dye::b);
   }

   public static boolean a(Function<id, dpi> $$0, id $$1, Predicate<dpi> $$2) {
      id.a $$3 = new id.a();

      for (ij $$4 : ij.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<id, dpi> $$0, id $$1) {
      return a($$0, $$1, dph.a::i);
   }

   protected void a(dab $$0, id $$1) {
      id.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ij.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.y($$2).e($$2);
      }
   }
}
