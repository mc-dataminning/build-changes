import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bsj<T extends bsd> implements cos, dwo<bsd, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jj.c<bsj<?>> bC = lq.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bsj<cfu> a = a("allay", bsj.a.a(cfu::new, btb.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bsj<brz> b = a("area_effect_cloud", bsj.a.<brz>a(brz::new, btb.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsj<cfx> c = a("armadillo", bsj.a.a(cfx::new, btb.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bsj<cig> d = a("armor_stand", bsj.a.<cig>a(cig::new, btb.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bsj<cmp> e = a("arrow", bsj.a.<cmp>a(cmp::new, btb.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsj<cga> f = a("axolotl", bsj.a.a(cga::new, btb.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bsj<cej> g = a("bat", bsj.a.a(cej::new, btb.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bsj<cep> h = a("bee", bsj.a.a(cep::new, btb.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bsj<ciw> i = a("blaze", bsj.a.a(ciw::new, btb.a).c().a(0.6F, 1.8F).a(8));
   public static final bsj<bsc.b> j = a("block_display", bsj.a.a(bsc.b::new, btb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsj<coe> k = a("boat", bsj.a.<coe>a(coe::new, btb.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsj<cix> l = a("bogged", bsj.a.a(cix::new, btb.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsj<ckj> m = a("breeze", bsj.a.a(ckj::new, btb.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bsj<cnq> n = a("breeze_wind_charge", bsj.a.<cnq>a(cnq::new, btb.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsj<cgf> o = a("camel", bsj.a.a(cgf::new, btb.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bsj<cer> p = a("cat", bsj.a.a(cer::new, btb.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bsj<ciy> q = a("cave_spider", bsj.a.a(ciy::new, btb.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bsj<cof> r = a("chest_boat", bsj.a.<cof>a(cof::new, btb.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bsj<coj> s = a("chest_minecart", bsj.a.<coj>a(coj::new, btb.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsj<cet> t = a("chicken", bsj.a.a(cet::new, btb.b).a(0.4F, 0.7F).b(0.644F).a(new evz(0.0, 0.7, -0.1)).a(10));
   public static final bsj<ceu> u = a("cod", bsj.a.a(ceu::new, btb.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bsj<cok> v = a("command_block_minecart", bsj.a.<cok>a(cok::new, btb.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsj<cev> w = a("cow", bsj.a.a(cev::new, btb.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsj<ciz> x = a("creeper", bsj.a.a(ciz::new, btb.a).a(0.6F, 1.7F).a(8));
   public static final bsj<cew> y = a("dolphin", bsj.a.a(cew::new, btb.f).a(0.9F, 0.6F).b(0.3F));
   public static final bsj<cgt> z = a("donkey", bsj.a.a(cgt::new, btb.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bsj<cmq> A = a("dragon_fireball", bsj.a.<cmq>a(cmq::new, btb.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsj<cjb> B = a("drowned", bsj.a.a(cjb::new, btb.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsj<cni> C = a("egg", bsj.a.<cni>a(cni::new, btb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsj<cjc> D = a("elder_guardian", bsj.a.a(cjc::new, btb.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bsj<chj> E = a("end_crystal", bsj.a.<chj>a(chj::new, btb.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsj<chk> F = a("ender_dragon", bsj.a.a(chk::new, btb.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bsj<cnj> G = a("ender_pearl", bsj.a.<cnj>a(cnj::new, btb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsj<cjd> H = a("enderman", bsj.a.a(cjd::new, btb.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bsj<cje> I = a("endermite", bsj.a.a(cje::new, btb.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsj<cjg> J = a("evoker", bsj.a.a(cjg::new, btb.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsj<cmr> K = a("evoker_fangs", bsj.a.<cmr>a(cmr::new, btb.h).a(0.5F, 0.8F).a(6).b(2));
   public static final bsj<cnk> L = a("experience_bottle", bsj.a.<cnk>a(cnk::new, btb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsj<bso> M = a("experience_orb", bsj.a.<bso>a(bso::new, btb.h).a(0.5F, 0.5F).a(6).b(20));
   public static final bsj<cms> N = a("eye_of_ender", bsj.a.<cms>a(cms::new, btb.h).a(0.25F, 0.25F).a(4).b(4));
   public static final bsj<ciq> O = a("falling_block", bsj.a.<ciq>a(ciq::new, btb.h).a(0.98F, 0.98F).a(10).b(20));
   public static final bsj<cmu> P = a("firework_rocket", bsj.a.<cmu>a(cmu::new, btb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsj<cey> Q = a("fox", bsj.a.a(cey::new, btb.b).a(0.6F, 0.7F).b(0.4F).a(new evz(0.0, 0.6375, -0.25)).a(8).a(dfh.oi));
   public static final bsj<cgi> R = a("frog", bsj.a.a(cgi::new, btb.b).a(0.5F, 0.5F).a(new evz(0.0, 0.375, -0.25)).a(10));
   public static final bsj<col> S = a("furnace_minecart", bsj.a.<col>a(col::new, btb.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsj<cjh> T = a("ghast", bsj.a.a(cjh::new, btb.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bsj<cji> U = a("giant", bsj.a.a(cji::new, btb.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bsj<cii> V = a("glow_item_frame", bsj.a.<cii>a(cii::new, btb.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsj<bsq> W = a("glow_squid", bsj.a.a(bsq::new, btb.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bsj<cgo> X = a("goat", bsj.a.a(cgo::new, btb.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bsj<cjj> Y = a("guardian", bsj.a.a(cjj::new, btb.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bsj<ckr> Z = a("hoglin", bsj.a.a(ckr::new, btb.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsj<com> aa = a("hopper_minecart", bsj.a.<com>a(com::new, btb.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsj<cgu> ab = a("horse", bsj.a.a(cgu::new, btb.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bsj<cjk> ac = a("husk", bsj.a.a(cjk::new, btb.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bsj<cjl> ad = a("illusioner", bsj.a.a(cjl::new, btb.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsj<bst> ae = a("interaction", bsj.a.a(bst::new, btb.h).a(0.0F, 0.0F).a(10));
   public static final bsj<cfa> af = a("iron_golem", bsj.a.a(cfa::new, btb.h).a(1.4F, 2.7F).a(10));
   public static final bsj<cir> ag = a("item", bsj.a.<cir>a(cir::new, btb.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bsj<bsc.g> ah = a("item_display", bsj.a.a(bsc.g::new, btb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsj<cik> ai = a("item_frame", bsj.a.<cik>a(cik::new, btb.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bsj<btf> aj = a("ominous_item_spawner", bsj.a.a(btf::new, btb.h).a(0.25F, 0.25F).a(8));
   public static final bsj<cmx> ak = a("fireball", bsj.a.<cmx>a(cmx::new, btb.h).a(1.0F, 1.0F).a(4).b(10));
   public static final bsj<cil> al = a("leash_knot", bsj.a.<cil>a(cil::new, btb.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bsj<bsx> am = a("lightning_bolt", bsj.a.a(bsx::new, btb.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bsj<cgv> an = a("llama", bsj.a.a(cgv::new, btb.b).a(0.9F, 1.87F).b(1.7765F).a(new evz(0.0, 1.37, -0.3)).a(10));
   public static final bsj<cmy> ao = a("llama_spit", bsj.a.<cmy>a(cmy::new, btb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsj<cjm> ap = a("magma_cube", bsj.a.a(cjm::new, btb.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bsj<bsz> aq = a("marker", bsj.a.a(bsz::new, btb.h).a(0.0F, 0.0F).a(0));
   public static final bsj<coi> ar = a("minecart", bsj.a.<coi>a(coi::new, btb.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsj<cfb> as = a("mooshroom", bsj.a.a(cfb::new, btb.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bsj<cgx> at = a("mule", bsj.a.a(cgx::new, btb.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bsj<cfc> au = a("ocelot", bsj.a.a(cfc::new, btb.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bsj<cim> av = a("painting", bsj.a.<cim>a(cim::new, btb.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bsj<cfd> aw = a("panda", bsj.a.a(cfd::new, btb.b).a(1.3F, 1.25F).a(10));
   public static final bsj<cfe> ax = a("parrot", bsj.a.a(cfe::new, btb.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bsj<cjp> ay = a("phantom", bsj.a.a(cjp::new, btb.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bsj<cff> az = a("pig", bsj.a.a(cff::new, btb.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bsj<ckx> aA = a("piglin", bsj.a.a(ckx::new, btb.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsj<cla> aB = a("piglin_brute", bsj.a.a(cla::new, btb.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bsj<cjq> aC = a("pillager", bsj.a.a(cjq::new, btb.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsj<cfg> aD = a("polar_bear", bsj.a.a(cfg::new, btb.b).a(dfh.qP).a(1.4F, 1.4F).a(10));
   public static final bsj<cnl> aE = a("potion", bsj.a.<cnl>a(cnl::new, btb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsj<cfh> aF = a("pufferfish", bsj.a.a(cfh::new, btb.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bsj<cfi> aG = a("rabbit", bsj.a.a(cfi::new, btb.b).a(0.4F, 0.5F).a(8));
   public static final bsj<cjs> aH = a("ravager", bsj.a.a(cjs::new, btb.a).a(1.95F, 2.2F).a(new evz(0.0, 2.2625, -0.0625)).a(10));
   public static final bsj<cfj> aI = a("salmon", bsj.a.a(cfj::new, btb.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bsj<cfk> aJ = a("sheep", bsj.a.a(cfk::new, btb.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bsj<cjt> aK = a("shulker", bsj.a.a(cjt::new, btb.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bsj<cnc> aL = a("shulker_bullet", bsj.a.<cnc>a(cnc::new, btb.h).a(0.3125F, 0.3125F).a(8));
   public static final bsj<cju> aM = a("silverfish", bsj.a.a(cju::new, btb.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bsj<cjv> aN = a("skeleton", bsj.a.a(cjv::new, btb.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bsj<cgy> aO = a("skeleton_horse", bsj.a.a(cgy::new, btb.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsj<cjw> aP = a("slime", bsj.a.a(cjw::new, btb.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bsj<cnd> aQ = a("small_fireball", bsj.a.<cnd>a(cnd::new, btb.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsj<chf> aR = a("sniffer", bsj.a.a(chf::new, btb.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bsj<cfm> aS = a("snow_golem", bsj.a.a(cfm::new, btb.h).a(dfh.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bsj<cne> aT = a("snowball", bsj.a.<cne>a(cne::new, btb.h).a(0.25F, 0.25F).a(4).b(10));
   public static final bsj<coo> aU = a("spawner_minecart", bsj.a.<coo>a(coo::new, btb.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsj<cnf> aV = a("spectral_arrow", bsj.a.<cnf>a(cnf::new, btb.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsj<cjy> aW = a("spider", bsj.a.a(cjy::new, btb.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bsj<cfn> aX = a("squid", bsj.a.a(cfn::new, btb.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bsj<cjz> aY = a("stray", bsj.a.a(cjz::new, btb.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dfh.qP).a(8));
   public static final bsj<cka> aZ = a("strider", bsj.a.a(cka::new, btb.b).c().a(0.9F, 1.7F).a(10));
   public static final bsj<cgl> ba = a("tadpole", bsj.a.a(cgl::new, btb.b).a(cgl.c, cgl.d).b(cgl.d * 0.65F).a(10));
   public static final bsj<bsc.l> bb = a("text_display", bsj.a.a(bsc.l::new, btb.h).a(0.0F, 0.0F).a(10).b(1));
   public static final bsj<cis> bc = a("tnt", bsj.a.<cis>a(cis::new, btb.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bsj<cop> bd = a("tnt_minecart", bsj.a.<cop>a(cop::new, btb.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bsj<cha> be = a("trader_llama", bsj.a.a(cha::new, btb.b).a(0.9F, 1.87F).b(1.7765F).a(new evz(0.0, 1.37, -0.3)).a(10));
   public static final bsj<cnm> bf = a("trident", bsj.a.<cnm>a(cnm::new, btb.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bsj<cfo> bg = a("tropical_fish", bsj.a.a(cfo::new, btb.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bsj<cfp> bh = a("turtle", bsj.a.a(cfp::new, btb.b).a(1.2F, 0.4F).a(new evz(0.0, 0.55625, -0.25)).a(10));
   public static final bsj<ckb> bi = a("vex", bsj.a.a(ckb::new, btb.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bsj<clu> bj = a("villager", bsj.a.<clu>a(clu::new, btb.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsj<ckc> bk = a("vindicator", bsj.a.a(ckc::new, btb.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bsj<cma> bl = a("wandering_trader", bsj.a.a(cma::new, btb.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bsj<cll> bm = a("warden", bsj.a.a(cll::new, btb.a).a(0.9F, 2.9F).a(3.15F).a(bse.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bsj<cnr> bn = a("wind_charge", bsj.a.<cnr>a(cnr::new, btb.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bsj<ckd> bo = a("witch", bsj.a.a(ckd::new, btb.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bsj<cie> bp = a("wither", bsj.a.a(cie::new, btb.a).c().a(dfh.cd).a(0.9F, 3.5F).a(10));
   public static final bsj<cke> bq = a("wither_skeleton", bsj.a.a(cke::new, btb.a).c().a(dfh.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bsj<cnn> br = a("wither_skull", bsj.a.<cnn>a(cnn::new, btb.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final bsj<cfr> bs = a("wolf", bsj.a.a(cfr::new, btb.b).a(0.6F, 0.85F).b(0.68F).a(new evz(0.0, 0.81875, -0.0625)).a(10));
   public static final bsj<ckf> bt = a("zoglin", bsj.a.a(ckf::new, btb.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bsj<ckg> bu = a("zombie", bsj.a.<ckg>a(ckg::new, btb.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bsj<chc> bv = a("zombie_horse", bsj.a.a(chc::new, btb.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bsj<ckh> bw = a("zombie_villager", bsj.a.a(ckh::new, btb.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bsj<cki> bx = a("zombified_piglin", bsj.a.a(cki::new, btb.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bsj<cmh> by = a("player", bsj.a.<cmh>a(btb.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmh.bV).a(32).b(2));
   public static final bsj<cmv> bz = a("fishing_bobber", bsj.a.<cmv>a(cmv::new, btb.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bsj.b<T> bF;
   private final btb bG;
   private final ImmutableSet<dff> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private wu bP;
   @Nullable
   private akj<eqt> bQ;
   private final bsg bR;
   private final float bS;
   private final cov bT;

   private static <T extends bsd> bsj<T> a(String $$0, bsj.a<T> $$1) {
      return jw.a(lq.f, $$0, $$1.a($$0));
   }

   public static akk a(bsj<?> $$0) {
      return lq.f.b($$0);
   }

   public static Optional<bsj<?>> a(String $$0) {
      return lq.f.b(akk.a($$0));
   }

   public bsj(bsj.b<T> $$0, btb $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dff> $$6, bsg $$7, float $$8, int $$9, int $$10, cov $$11) {
      this.bF = $$0;
      this.bG = $$1;
      this.bL = $$5;
      this.bI = $$2;
      this.bJ = $$3;
      this.bK = $$4;
      this.bH = $$6;
      this.bR = $$7;
      this.bS = $$8;
      this.bM = $$9;
      this.bN = $$10;
      this.bT = $$11;
   }

   @Nullable
   public T a(aqk $$0, @Nullable cua $$1, @Nullable cmh $$2, ja $$3, btc $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsd> Consumer<T> a(aqk $$0, cua $$1, @Nullable cmh $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsd> Consumer<T> a(Consumer<T> $$0, aqk $$1, cua $$2, @Nullable cmh $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsd> Consumer<T> a(Consumer<T> $$0, cua $$1) {
      wu $$2 = $$1.a(kn.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsd> Consumer<T> b(Consumer<T> $$0, aqk $$1, cua $$2, @Nullable cmh $$3) {
      cwo $$4 = $$2.a(kn.M, cwo.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aqk $$0, ja $$1, btc $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aqk $$0, @Nullable Consumer<T> $$1, ja $$2, btc $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(aqk $$0, @Nullable Consumer<T> $$1, ja $$2, btc $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dcd)$$0);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cK());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, aye.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof bta $$9) {
            $$9.ba = $$9.dF();
            $$9.aY = $$9.dF();
            $$9.a($$0, $$0.d_($$9.dp()), $$3, null);
            $$9.Q();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dcg $$0, ja $$1, boolean $$2, evu $$3) {
      evu $$4 = new evu($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ews> $$5 = $$0.d(null, $$4);
      return 1.0 + ewp.a(jf.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dcd $$0, @Nullable cmh $$1, @Nullable bsd $$2, cwo $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cP() || $$1 != null && $$4.ah().f($$1.fX())) {
            $$3.a($$2);
         }
      }
   }

   public boolean b() {
      return this.bI;
   }

   public boolean c() {
      return this.bJ;
   }

   public boolean d() {
      return this.bK;
   }

   public boolean e() {
      return this.bL;
   }

   public btb f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", lq.f.b(this));
      }

      return this.bO;
   }

   public wu h() {
      if (this.bP == null) {
         this.bP = wu.c(this.g());
      }

      return this.bP;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String j() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public akj<eqt> k() {
      if (this.bQ == null) {
         akk $$0 = lq.f.b(this);
         this.bQ = akj.a(lr.bb, $$0.d("entities/"));
      }

      return this.bQ;
   }

   public float l() {
      return this.bR.a();
   }

   public float m() {
      return this.bR.b();
   }

   @Override
   public cov i() {
      return this.bT;
   }

   @Nullable
   public T a(dcd $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsd> a(tx $$0, dcd $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public evu a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new evu($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dsh $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eoo.a($$0) ? true : $$0.a(dfh.cd) || $$0.a(dfh.oi) || $$0.a(dfh.dQ) || $$0.a(dfh.qP);
      }
   }

   public bsg n() {
      return this.bR;
   }

   public static Optional<bsj<?>> a(tx $$0) {
      return lq.f.b(new akk($$0.l("id")));
   }

   @Nullable
   public static bsd a(tx $$0, dcd $$1, Function<bsd, bsd> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            ud $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsd $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsd)$$3;
      }).orElse(null);
   }

   public static Stream<bsd> a(final List<? extends uu> $$0, final dcd $$1) {
      final Spliterator<? extends uu> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsd>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsd> $$0x) {
            return $$2.tryAdvance($$2xx -> bsj.a((tx)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsd> trySplit() {
            return null;
         }

         @Override
         public long estimateSize() {
            return (long)$$0.size();
         }

         @Override
         public int characteristics() {
            return 1297;
         }
      }, false);
   }

   private static Optional<bsd> b(tx $$0, dcd $$1) {
      try {
         return a($$0, $$1);
      } catch (RuntimeException var3) {
         bB.warn("Exception loading entity: ", var3);
         return Optional.empty();
      }
   }

   public int o() {
      return this.bM;
   }

   public int p() {
      return this.bN;
   }

   public boolean q() {
      return this != by && this != ao && this != bp && this != g && this != ai && this != V && this != al && this != av && this != E && this != K;
   }

   public boolean a(awk<bsj<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jn<bsj<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsd $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsd> a() {
      return bsd.class;
   }

   @Deprecated
   public jj.c<bsj<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsd> {
      private final bsj.b<T> a;
      private final btb b;
      private ImmutableSet<dff> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsg j = bsg.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsf.a l = bsf.a();
      private cov m = cox.f;

      private a(bsj.b<T> $$0, btb $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == btb.b || $$1 == btb.h;
      }

      public static <T extends bsd> bsj.a<T> a(bsj.b<T> $$0, btb $$1) {
         return new bsj.a<>($$0, $$1);
      }

      public static <T extends bsd> bsj.a<T> a(btb $$0) {
         return new bsj.a<>(($$0x, $$1) -> null, $$0);
      }

      public bsj.a<T> a(float $$0, float $$1) {
         this.j = bsg.b($$0, $$1);
         return this;
      }

      public bsj.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bsj.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bsj.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bse.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bsj.a<T> a(evz... $$0) {
         for (evz $$1 : $$0) {
            this.l = this.l.a(bse.a, $$1);
         }

         return this;
      }

      public bsj.a<T> a(evz $$0) {
         return this.a(bse.b, $$0);
      }

      public bsj.a<T> c(float $$0) {
         return this.a(bse.b, 0.0F, -$$0, 0.0F);
      }

      public bsj.a<T> d(float $$0) {
         return this.a(bse.c, 0.0F, $$0, 0.0F);
      }

      public bsj.a<T> a(bse $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bsj.a<T> a(bse $$0, evz $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bsj.a<T> a() {
         this.e = false;
         return this;
      }

      public bsj.a<T> b() {
         this.d = false;
         return this;
      }

      public bsj.a<T> c() {
         this.f = true;
         return this;
      }

      public bsj.a<T> a(dff... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bsj.a<T> d() {
         this.g = true;
         return this;
      }

      public bsj.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bsj.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bsj.a<T> a(cot... $$0) {
         this.m = cox.d.a($$0);
         return this;
      }

      public bsj<T> a(String $$0) {
         if (this.d) {
            ac.a(bgd.A, $$0);
         }

         return new bsj<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsd> {
      T create(bsj<T> var1, dcd var2);
   }
}
