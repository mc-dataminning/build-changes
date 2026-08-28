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

public class bul<T extends bue> implements crc, dzu<bue, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final jq.c<bul<?>> bC = ly.f.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final bul<chx> a = a("allay", bul.a.a(chx::new, bvd.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bul<btx> b = a("area_effect_cloud", bul.a.<btx>a(btx::new, bvd.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bul<cia> c = a("armadillo", bul.a.a(cia::new, bvd.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bul<ckk> d = a("armor_stand", bul.a.<ckk>a(ckk::new, bvd.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bul<cow> e = a("arrow", bul.a.<cow>a(cow::new, bvd.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bul<cid> f = a("axolotl", bul.a.a(cid::new, bvd.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bul<cgl> g = a("bat", bul.a.a(cgl::new, bvd.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bul<cgs> h = a("bee", bul.a.a(cgs::new, bvd.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bul<cla> i = a("blaze", bul.a.a(cla::new, bvd.a).c().a(0.6F, 1.8F).a(8));
   public static final bul<buc.b> j = a("block_display", bul.a.a(buc.b::new, bvd.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bul<cqm> k = a("boat", bul.a.<cqm>a(cqm::new, bvd.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bul<clb> l = a("bogged", bul.a.a(clb::new, bvd.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bul<cmn> m = a("breeze", bul.a.a(cmn::new, bvd.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bul<cpx> n = a("breeze_wind_charge", bul.a.<cpx>a(cpx::new, bvd.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bul<cii> o = a("camel", bul.a.a(cii::new, bvd.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bul<cgu> p = a("cat", bul.a.a(cgu::new, bvd.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bul<clc> q = a("cave_spider", bul.a.a(clc::new, bvd.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bul<cqn> r = a("chest_boat", bul.a.<cqn>a(cqn::new, bvd.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bul<cqs> s = a("chest_minecart", bul.a.<cqs>a(cqs::new, bvd.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bul<cgw> t = a("chicken", bul.a.a(cgw::new, bvd.b).a(0.4F, 0.7F).b(0.644F).a(new ezn(0.0, 0.7, -0.1)).a(10));
   public static final bul<cgx> u = a("cod", bul.a.a(cgx::new, bvd.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bul<cqt> v = a("command_block_minecart", bul.a.<cqt>a(cqt::new, bvd.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bul<cgy> w = a("cow", bul.a.a(cgy::new, bvd.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bul<cld> x = a("creeper", bul.a.a(cld::new, bvd.a).a(0.6F, 1.7F).a(8));
   public static final bul<cgz> y = a("dolphin", bul.a.a(cgz::new, bvd.f).a(0.9F, 0.6F).b(0.3F));
   public static final bul<ciw> z = a("donkey", bul.a.a(ciw::new, bvd.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bul<cox> A = a("dragon_fireball", bul.a.<cox>a(cox::new, bvd.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bul<clf> B = a("drowned", bul.a.a(clf::new, bvd.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bul<cpp> C = a("egg", bul.a.<cpp>a(cpp::new, bvd.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bul<clg> D = a("elder_guardian", bul.a.a(clg::new, bvd.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bul<cjn> E = a("end_crystal", bul.a.<cjn>a(cjn::new, bvd.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bul<cjo> F = a("ender_dragon", bul.a.a(cjo::new, bvd.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bul<cpq> G = a("ender_pearl", bul.a.<cpq>a(cpq::new, bvd.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bul<clh> H = a("enderman", bul.a.a(clh::new, bvd.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bul<cli> I = a("endermite", bul.a.a(cli::new, bvd.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bul<clk> J = a("evoker", bul.a.a(clk::new, bvd.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bul<coy> K = a("evoker_fangs", bul.a.<coy>a(coy::new, bvd.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bul<cpr> L = a("experience_bottle", bul.a.<cpr>a(cpr::new, bvd.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bul<buq> M = a("experience_orb", bul.a.<buq>a(buq::new, bvd.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bul<coz> N = a("eye_of_ender", bul.a.<coz>a(coz::new, bvd.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bul<cku> O = a("falling_block", bul.a.<cku>a(cku::new, bvd.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bul<cpb> P = a("firework_rocket", bul.a.<cpb>a(cpb::new, bvd.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bul<chb> Q = a("fox", bul.a.a(chb::new, bvd.b).a(0.6F, 0.7F).b(0.4F).a(new ezn(0.0, 0.6375, -0.25)).a(8).a(dig.oi));
   public static final bul<cil> R = a("frog", bul.a.a(cil::new, bvd.b).a(0.5F, 0.5F).a(new ezn(0.0, 0.375, -0.25)).a(10));
   public static final bul<cqu> S = a("furnace_minecart", bul.a.<cqu>a(cqu::new, bvd.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bul<cll> T = a("ghast", bul.a.a(cll::new, bvd.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bul<clm> U = a("giant", bul.a.a(clm::new, bvd.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bul<ckm> V = a("glow_item_frame", bul.a.<ckm>a(ckm::new, bvd.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bul<bus> W = a("glow_squid", bul.a.a(bus::new, bvd.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bul<cir> X = a("goat", bul.a.a(cir::new, bvd.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bul<cln> Y = a("guardian", bul.a.a(cln::new, bvd.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bul<cmv> Z = a("hoglin", bul.a.a(cmv::new, bvd.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bul<cqv> aa = a("hopper_minecart", bul.a.<cqv>a(cqv::new, bvd.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bul<cix> ab = a("horse", bul.a.a(cix::new, bvd.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bul<clo> ac = a("husk", bul.a.a(clo::new, bvd.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bul<clp> ad = a("illusioner", bul.a.a(clp::new, bvd.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bul<buv> ae = a("interaction", bul.a.a(buv::new, bvd.h).e().a(0.0F, 0.0F).a(10));
   public static final bul<chd> af = a("iron_golem", bul.a.a(chd::new, bvd.h).a(1.4F, 2.7F).a(10));
   public static final bul<ckv> ag = a("item", bul.a.<ckv>a(ckv::new, bvd.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bul<buc.g> ah = a("item_display", bul.a.a(buc.g::new, bvd.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bul<cko> ai = a("item_frame", bul.a.<cko>a(cko::new, bvd.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bul<bvg> aj = a("ominous_item_spawner", bul.a.a(bvg::new, bvd.h).e().a(0.25F, 0.25F).a(8));
   public static final bul<cpe> ak = a("fireball", bul.a.<cpe>a(cpe::new, bvd.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bul<ckp> al = a("leash_knot", bul.a.<ckp>a(ckp::new, bvd.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bul<buz> am = a("lightning_bolt", bul.a.a(buz::new, bvd.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bul<ciy> an = a("llama", bul.a.a(ciy::new, bvd.b).a(0.9F, 1.87F).b(1.7765F).a(new ezn(0.0, 1.37, -0.3)).a(10));
   public static final bul<cpf> ao = a("llama_spit", bul.a.<cpf>a(cpf::new, bvd.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bul<clq> ap = a("magma_cube", bul.a.a(clq::new, bvd.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bul<bvb> aq = a("marker", bul.a.a(bvb::new, bvd.h).e().a(0.0F, 0.0F).a(0));
   public static final bul<cqq> ar = a("minecart", bul.a.<cqq>a(cqq::new, bvd.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bul<che> as = a("mooshroom", bul.a.a(che::new, bvd.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bul<cja> at = a("mule", bul.a.a(cja::new, bvd.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bul<chf> au = a("ocelot", bul.a.a(chf::new, bvd.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bul<ckq> av = a("painting", bul.a.<ckq>a(ckq::new, bvd.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bul<chg> aw = a("panda", bul.a.a(chg::new, bvd.b).a(1.3F, 1.25F).a(10));
   public static final bul<chh> ax = a("parrot", bul.a.a(chh::new, bvd.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bul<clt> ay = a("phantom", bul.a.a(clt::new, bvd.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bul<chi> az = a("pig", bul.a.a(chi::new, bvd.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bul<cnb> aA = a("piglin", bul.a.a(cnb::new, bvd.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bul<cne> aB = a("piglin_brute", bul.a.a(cne::new, bvd.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bul<clu> aC = a("pillager", bul.a.a(clu::new, bvd.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bul<chj> aD = a("polar_bear", bul.a.a(chj::new, bvd.b).a(dig.qP).a(1.4F, 1.4F).a(10));
   public static final bul<cps> aE = a("potion", bul.a.<cps>a(cps::new, bvd.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bul<chk> aF = a("pufferfish", bul.a.a(chk::new, bvd.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bul<chl> aG = a("rabbit", bul.a.a(chl::new, bvd.b).a(0.4F, 0.5F).a(8));
   public static final bul<clw> aH = a("ravager", bul.a.a(clw::new, bvd.a).a(1.95F, 2.2F).a(new ezn(0.0, 2.2625, -0.0625)).a(10));
   public static final bul<chm> aI = a("salmon", bul.a.a(chm::new, bvd.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bul<chn> aJ = a("sheep", bul.a.a(chn::new, bvd.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bul<clx> aK = a("shulker", bul.a.a(clx::new, bvd.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bul<cpj> aL = a("shulker_bullet", bul.a.<cpj>a(cpj::new, bvd.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bul<cly> aM = a("silverfish", bul.a.a(cly::new, bvd.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bul<clz> aN = a("skeleton", bul.a.a(clz::new, bvd.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bul<cjb> aO = a("skeleton_horse", bul.a.a(cjb::new, bvd.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bul<cma> aP = a("slime", bul.a.a(cma::new, bvd.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bul<cpk> aQ = a("small_fireball", bul.a.<cpk>a(cpk::new, bvd.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bul<cji> aR = a("sniffer", bul.a.a(cji::new, bvd.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bul<chp> aS = a("snow_golem", bul.a.a(chp::new, bvd.h).a(dig.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bul<cpl> aT = a("snowball", bul.a.<cpl>a(cpl::new, bvd.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bul<cqw> aU = a("spawner_minecart", bul.a.<cqw>a(cqw::new, bvd.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bul<cpm> aV = a("spectral_arrow", bul.a.<cpm>a(cpm::new, bvd.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bul<cmc> aW = a("spider", bul.a.a(cmc::new, bvd.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bul<chq> aX = a("squid", bul.a.a(chq::new, bvd.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bul<cmd> aY = a("stray", bul.a.a(cmd::new, bvd.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dig.qP).a(8));
   public static final bul<cme> aZ = a("strider", bul.a.a(cme::new, bvd.b).c().a(0.9F, 1.7F).a(10));
   public static final bul<cio> ba = a("tadpole", bul.a.a(cio::new, bvd.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bul<buc.l> bb = a("text_display", bul.a.a(buc.l::new, bvd.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bul<ckw> bc = a("tnt", bul.a.<ckw>a(ckw::new, bvd.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bul<cqx> bd = a("tnt_minecart", bul.a.<cqx>a(cqx::new, bvd.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bul<cjd> be = a("trader_llama", bul.a.a(cjd::new, bvd.b).a(0.9F, 1.87F).b(1.7765F).a(new ezn(0.0, 1.37, -0.3)).a(10));
   public static final bul<cpt> bf = a("trident", bul.a.<cpt>a(cpt::new, bvd.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bul<chr> bg = a("tropical_fish", bul.a.a(chr::new, bvd.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bul<chs> bh = a("turtle", bul.a.a(chs::new, bvd.b).a(1.2F, 0.4F).a(new ezn(0.0, 0.55625, -0.25)).a(10));
   public static final bul<cmf> bi = a("vex", bul.a.a(cmf::new, bvd.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bul<cny> bj = a("villager", bul.a.<cny>a(cny::new, bvd.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bul<cmg> bk = a("vindicator", bul.a.a(cmg::new, bvd.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bul<coe> bl = a("wandering_trader", bul.a.a(coe::new, bvd.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bul<cnp> bm = a("warden", bul.a.a(cnp::new, bvd.a).a(0.9F, 2.9F).a(3.15F).a(buf.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bul<cpy> bn = a("wind_charge", bul.a.<cpy>a(cpy::new, bvd.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bul<cmh> bo = a("witch", bul.a.a(cmh::new, bvd.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bul<cki> bp = a("wither", bul.a.a(cki::new, bvd.a).c().a(dig.cd).a(0.9F, 3.5F).a(10));
   public static final bul<cmi> bq = a("wither_skeleton", bul.a.a(cmi::new, bvd.a).c().a(dig.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bul<cpu> br = a("wither_skull", bul.a.<cpu>a(cpu::new, bvd.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bul<chu> bs = a("wolf", bul.a.a(chu::new, bvd.b).a(0.6F, 0.85F).b(0.68F).a(new ezn(0.0, 0.81875, -0.0625)).a(10));
   public static final bul<cmj> bt = a("zoglin", bul.a.a(cmj::new, bvd.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bul<cmk> bu = a("zombie", bul.a.<cmk>a(cmk::new, bvd.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bul<cjf> bv = a("zombie_horse", bul.a.a(cjf::new, bvd.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bul<cml> bw = a("zombie_villager", bul.a.a(cml::new, bvd.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bul<cmm> bx = a("zombified_piglin", bul.a.a(cmm::new, bvd.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bul<com> by = a("player", bul.a.<com>a(bvd.h).b().a().a(0.6F, 1.8F).b(1.62F).a(com.bV).a(32).b(2));
   public static final bul<cpc> bz = a("fishing_bobber", bul.a.<cpc>a(cpc::new, bvd.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private final bul.b<T> bF;
   private final bvd bG;
   private final ImmutableSet<die> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   private final String bO;
   @Nullable
   private xi bP;
   private final Optional<alh<euh>> bQ;
   private final buh bR;
   private final float bS;
   private final crf bT;

   private static <T extends bue> bul<T> a(alh<bul<?>> $$0, bul.a<T> $$1) {
      return kd.a(ly.f, $$0, $$1.a($$0));
   }

   private static alh<bul<?>> b(String $$0) {
      return alh.a(lz.z, ali.b($$0));
   }

   private static <T extends bue> bul<T> a(String $$0, bul.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static ali a(bul<?> $$0) {
      return ly.f.b($$0);
   }

   public static Optional<bul<?>> a(String $$0) {
      return ly.f.b(ali.c($$0));
   }

   public bul(
      bul.b<T> $$0,
      bvd $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<die> $$6,
      buh $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<alh<euh>> $$12,
      crf $$13
   ) {
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
      this.bO = $$11;
      this.bQ = $$12;
      this.bT = $$13;
   }

   @Nullable
   public T a(arn $$0, @Nullable cwb $$1, @Nullable com $$2, jh $$3, buk $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bue> Consumer<T> a(dfb $$0, cwb $$1, @Nullable com $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bue> Consumer<T> a(Consumer<T> $$0, dfb $$1, cwb $$2, @Nullable com $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bue> Consumer<T> a(Consumer<T> $$0, cwb $$1) {
      xi $$2 = $$1.a(ku.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bue> Consumer<T> b(Consumer<T> $$0, dfb $$1, cwb $$2, @Nullable com $$3) {
      cyk $$4 = $$2.a(ku.W, cyk.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arn $$0, jh $$1, buk $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arn $$0, @Nullable Consumer<T> $$1, jh $$2, buk $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arn $$0, @Nullable Consumer<T> $$1, jh $$2, buk $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a($$0, $$3);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_((double)$$2.u() + 0.5, (double)($$2.v() + 1), (double)$$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cS());
         } else {
            $$7 = 0.0;
         }

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, azk.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof bvc $$9) {
            $$9.aZ = $$9.dN();
            $$9.aX = $$9.dN();
            $$9.a($$0, $$0.d_($$9.dx()), $$3, null);
            $$9.U();
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dfe $$0, jh $$1, boolean $$2, ezi $$3) {
      ezi $$4 = new ezi($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fah> $$5 = $$0.d(null, $$4);
      return 1.0 + fae.a(jm.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dfb $$0, @Nullable com $$1, @Nullable bue $$2, cyk $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.C || !$$2.cX() || $$1 != null && $$4.ag().f($$1.gj())) {
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

   public bvd f() {
      return this.bG;
   }

   public String g() {
      return this.bO;
   }

   public xi h() {
      if (this.bP == null) {
         this.bP = xi.c(this.g());
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

   public Optional<alh<euh>> k() {
      return this.bQ;
   }

   public float l() {
      return this.bR.a();
   }

   public float m() {
      return this.bR.b();
   }

   @Override
   public crf i() {
      return this.bT;
   }

   @Nullable
   public T a(dfb $$0, buk $$1) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bue> a(uk $$0, dfb $$1, buk $$2) {
      return ae.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public ezi a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new ezi($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dvj $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && erx.a($$0) ? true : $$0.a(dig.cd) || $$0.a(dig.oi) || $$0.a(dig.dQ) || $$0.a(dig.qP);
      }
   }

   public buh n() {
      return this.bR;
   }

   public static Optional<bul<?>> a(uk $$0) {
      return ly.f.b(ali.a($$0.l("id")));
   }

   @Nullable
   public static bue a(uk $$0, dfb $$1, buk $$2, Function<bue, bue> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         if ($$0.b("Passengers", 9)) {
            uq $$5 = $$0.c("Passengers", 10);

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bue $$7 = a($$5.a($$6), $$1, $$2, $$3);
               if ($$7 != null) {
                  $$7.a($$4, true);
               }
            }
         }

         return (bue)$$4;
      }).orElse(null);
   }

   public static Stream<bue> a(final List<? extends vh> $$0, final dfb $$1, final buk $$2) {
      final Spliterator<? extends vh> $$3 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bue>() {
         @Override
         public boolean tryAdvance(Consumer<? super bue> $$0x) {
            return $$3.tryAdvance($$3xx -> bul.a((uk)$$3xx, $$1, $$2, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bue> trySplit() {
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

   private static Optional<bue> b(uk $$0, dfb $$1, buk $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bB.warn("Exception loading entity: ", var4);
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

   public boolean a(axq<bul<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(ju<bul<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bue $$0) {
      return (T)($$0.ar() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bue> a() {
      return bue.class;
   }

   @Deprecated
   public jq.c<bul<?>> r() {
      return this.bC;
   }

   public static class a<T extends bue> {
      private final bul.b<T> a;
      private final bvd b;
      private ImmutableSet<die> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private buh j = buh.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bug.a l = bug.a();
      private crf m = crh.h;
      private ala<bul<?>, Optional<alh<euh>>> n = $$0x -> Optional.of(alh.a(lz.bd, $$0x.a().f("entities/")));
      private ala<bul<?>, String> o = $$0x -> ae.a("entity", $$0x.a());

      private a(bul.b<T> $$0, bvd $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == bvd.b || $$1 == bvd.h;
      }

      public static <T extends bue> bul.a<T> a(bul.b<T> $$0, bvd $$1) {
         return new bul.a<>($$0, $$1);
      }

      public static <T extends bue> bul.a<T> a(bvd $$0) {
         return new bul.a<>(($$0x, $$1) -> null, $$0);
      }

      public bul.a<T> a(float $$0, float $$1) {
         this.j = buh.b($$0, $$1);
         return this;
      }

      public bul.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bul.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bul.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(buf.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bul.a<T> a(ezn... $$0) {
         for (ezn $$1 : $$0) {
            this.l = this.l.a(buf.a, $$1);
         }

         return this;
      }

      public bul.a<T> a(ezn $$0) {
         return this.a(buf.b, $$0);
      }

      public bul.a<T> c(float $$0) {
         return this.a(buf.b, 0.0F, -$$0, 0.0F);
      }

      public bul.a<T> d(float $$0) {
         return this.a(buf.c, 0.0F, $$0, 0.0F);
      }

      public bul.a<T> a(buf $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bul.a<T> a(buf $$0, ezn $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bul.a<T> a() {
         this.e = false;
         return this;
      }

      public bul.a<T> b() {
         this.d = false;
         return this;
      }

      public bul.a<T> c() {
         this.f = true;
         return this;
      }

      public bul.a<T> a(die... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bul.a<T> d() {
         this.g = true;
         return this;
      }

      public bul.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bul.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bul.a<T> a(crd... $$0) {
         this.m = crh.f.a($$0);
         return this;
      }

      public bul.a<T> e() {
         this.n = ala.fixed(Optional.empty());
         return this;
      }

      public bul<T> a(alh<bul<?>> $$0) {
         if (this.d) {
            ae.a(bhu.A, $$0.a().toString());
         }

         return new bul<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bue> {
      T create(bul<T> var1, dfb var2);
   }
}
