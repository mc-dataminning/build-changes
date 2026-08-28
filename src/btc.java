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

public class btc<T extends bsw> implements cpk, dwl<bsw, T> {
   private static final Logger bB = LogUtils.getLogger();
   private final ji.c<btc<?>> bC = lp.g.f(this);
   private static final float bD = 1.3964844F;
   private static final int bE = 10;
   public static final btc<cgn> a = a("allay", btc.a.a(cgn::new, btu.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final btc<bss> b = a("area_effect_cloud", btc.a.<bss>a(bss::new, btu.h).c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final btc<cgq> c = a("armadillo", btc.a.a(cgq::new, btu.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final btc<ciz> d = a("armor_stand", btc.a.<ciz>a(ciz::new, btu.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final btc<cnh> e = a("arrow", btc.a.<cnh>a(cnh::new, btu.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btc<cgt> f = a("axolotl", btc.a.a(cgt::new, btu.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final btc<cfc> g = a("bat", btc.a.a(cfc::new, btu.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final btc<cfi> h = a("bee", btc.a.a(cfi::new, btu.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final btc<cjo> i = a("blaze", btc.a.a(cjo::new, btu.a).c().a(0.6F, 1.8F).a(8));
   public static final btc<bsv.b> j = a("block_display", btc.a.a(bsv.b::new, btu.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btc<cox> k = a("boat", btc.a.<cox>a(cox::new, btu.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final btc<cjp> l = a("bogged", btc.a.a(cjp::new, btu.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8).a(cpp.c));
   public static final btc<clb> m = a("breeze", btc.a.a(clb::new, btu.a).a(0.6F, 1.77F).b(1.3452F).a(10).a(cpp.c));
   public static final btc<coi> n = a("breeze_wind_charge", btc.a.<coi>a(coi::new, btu.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpp.c));
   public static final btc<cgy> o = a("camel", btc.a.a(cgy::new, btu.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final btc<cfk> p = a("cat", btc.a.a(cfk::new, btu.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final btc<cjq> q = a("cave_spider", btc.a.a(cjq::new, btu.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final btc<coy> r = a("chest_boat", btc.a.<coy>a(coy::new, btu.h).a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final btc<cpc> s = a("chest_minecart", btc.a.<cpc>a(cpc::new, btu.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btc<cfm> t = a("chicken", btc.a.a(cfm::new, btu.b).a(0.4F, 0.7F).b(0.644F).a(new evt(0.0, 0.7, -0.1)).a(10));
   public static final btc<cfn> u = a("cod", btc.a.a(cfn::new, btu.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final btc<cpd> v = a("command_block_minecart", btc.a.<cpd>a(cpd::new, btu.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btc<cfo> w = a("cow", btc.a.a(cfo::new, btu.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final btc<cjr> x = a("creeper", btc.a.a(cjr::new, btu.a).a(0.6F, 1.7F).a(8));
   public static final btc<cfp> y = a("dolphin", btc.a.a(cfp::new, btu.f).a(0.9F, 0.6F).b(0.3F));
   public static final btc<chm> z = a("donkey", btc.a.a(chm::new, btu.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final btc<cni> A = a("dragon_fireball", btc.a.<cni>a(cni::new, btu.h).a(1.0F, 1.0F).a(4).b(10));
   public static final btc<cjt> B = a("drowned", btc.a.a(cjt::new, btu.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final btc<coa> C = a("egg", btc.a.<coa>a(coa::new, btu.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btc<cju> D = a("elder_guardian", btc.a.a(cju::new, btu.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final btc<cic> E = a("end_crystal", btc.a.<cic>a(cic::new, btu.h).a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final btc<cid> F = a("ender_dragon", btc.a.a(cid::new, btu.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final btc<cob> G = a("ender_pearl", btc.a.<cob>a(cob::new, btu.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btc<cjv> H = a("enderman", btc.a.a(cjv::new, btu.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final btc<cjw> I = a("endermite", btc.a.a(cjw::new, btu.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final btc<cjy> J = a("evoker", btc.a.a(cjy::new, btu.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btc<cnj> K = a("evoker_fangs", btc.a.<cnj>a(cnj::new, btu.h).a(0.5F, 0.8F).a(6).b(2));
   public static final btc<coc> L = a("experience_bottle", btc.a.<coc>a(coc::new, btu.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btc<bth> M = a("experience_orb", btc.a.<bth>a(bth::new, btu.h).a(0.5F, 0.5F).a(6).b(20));
   public static final btc<cnk> N = a("eye_of_ender", btc.a.<cnk>a(cnk::new, btu.h).a(0.25F, 0.25F).a(4).b(4));
   public static final btc<cji> O = a("falling_block", btc.a.<cji>a(cji::new, btu.h).a(0.98F, 0.98F).a(10).b(20));
   public static final btc<cnm> P = a("firework_rocket", btc.a.<cnm>a(cnm::new, btu.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btc<cfr> Q = a("fox", btc.a.a(cfr::new, btu.b).a(0.6F, 0.7F).b(0.4F).a(new evt(0.0, 0.6375, -0.25)).a(8).a(dfd.oi));
   public static final btc<chb> R = a("frog", btc.a.a(chb::new, btu.b).a(0.5F, 0.5F).a(new evt(0.0, 0.375, -0.25)).a(10));
   public static final btc<cpe> S = a("furnace_minecart", btc.a.<cpe>a(cpe::new, btu.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btc<cjz> T = a("ghast", btc.a.a(cjz::new, btu.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final btc<cka> U = a("giant", btc.a.a(cka::new, btu.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final btc<cja> V = a("glow_item_frame", btc.a.<cja>a(cja::new, btu.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final btc<btj> W = a("glow_squid", btc.a.a(btj::new, btu.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final btc<chh> X = a("goat", btc.a.a(chh::new, btu.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final btc<ckb> Y = a("guardian", btc.a.a(ckb::new, btu.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final btc<clj> Z = a("hoglin", btc.a.a(clj::new, btu.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final btc<cpf> aa = a("hopper_minecart", btc.a.<cpf>a(cpf::new, btu.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btc<chn> ab = a("horse", btc.a.a(chn::new, btu.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final btc<ckc> ac = a("husk", btc.a.a(ckc::new, btu.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final btc<ckd> ad = a("illusioner", btc.a.a(ckd::new, btu.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btc<btm> ae = a("interaction", btc.a.a(btm::new, btu.h).a(0.0F, 0.0F).a(10));
   public static final btc<cft> af = a("iron_golem", btc.a.a(cft::new, btu.h).a(1.4F, 2.7F).a(10));
   public static final btc<cjj> ag = a("item", btc.a.<cjj>a(cjj::new, btu.h).a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final btc<bsv.g> ah = a("item_display", btc.a.a(bsv.g::new, btu.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btc<cjc> ai = a("item_frame", btc.a.<cjc>a(cjc::new, btu.h).a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final btc<bty> aj = a("ominous_item_spawner", btc.a.a(bty::new, btu.h).a(0.25F, 0.25F).a(8).a(cpp.c));
   public static final btc<cnp> ak = a("fireball", btc.a.<cnp>a(cnp::new, btu.h).a(1.0F, 1.0F).a(4).b(10));
   public static final btc<cjd> al = a("leash_knot", btc.a.<cjd>a(cjd::new, btu.h).b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final btc<btq> am = a("lightning_bolt", btc.a.a(btq::new, btu.h).b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final btc<cho> an = a("llama", btc.a.a(cho::new, btu.b).a(0.9F, 1.87F).b(1.7765F).a(new evt(0.0, 1.37, -0.3)).a(10));
   public static final btc<cnq> ao = a("llama_spit", btc.a.<cnq>a(cnq::new, btu.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btc<cke> ap = a("magma_cube", btc.a.a(cke::new, btu.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final btc<bts> aq = a("marker", btc.a.a(bts::new, btu.h).a(0.0F, 0.0F).a(0));
   public static final btc<cpb> ar = a("minecart", btc.a.<cpb>a(cpb::new, btu.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btc<cfu> as = a("mooshroom", btc.a.a(cfu::new, btu.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final btc<chq> at = a("mule", btc.a.a(chq::new, btu.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final btc<cfv> au = a("ocelot", btc.a.a(cfv::new, btu.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final btc<cje> av = a("painting", btc.a.<cje>a(cje::new, btu.h).a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final btc<cfw> aw = a("panda", btc.a.a(cfw::new, btu.b).a(1.3F, 1.25F).a(10));
   public static final btc<cfx> ax = a("parrot", btc.a.a(cfx::new, btu.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final btc<ckh> ay = a("phantom", btc.a.a(ckh::new, btu.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final btc<cfy> az = a("pig", btc.a.a(cfy::new, btu.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final btc<clp> aA = a("piglin", btc.a.a(clp::new, btu.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final btc<cls> aB = a("piglin_brute", btc.a.a(cls::new, btu.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final btc<cki> aC = a("pillager", btc.a.a(cki::new, btu.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btc<cfz> aD = a("polar_bear", btc.a.a(cfz::new, btu.b).a(dfd.qP).a(1.4F, 1.4F).a(10));
   public static final btc<cod> aE = a("potion", btc.a.<cod>a(cod::new, btu.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btc<cga> aF = a("pufferfish", btc.a.a(cga::new, btu.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final btc<cgb> aG = a("rabbit", btc.a.a(cgb::new, btu.b).a(0.4F, 0.5F).a(8));
   public static final btc<ckk> aH = a("ravager", btc.a.a(ckk::new, btu.a).a(1.95F, 2.2F).a(new evt(0.0, 2.2625, -0.0625)).a(10));
   public static final btc<cgc> aI = a("salmon", btc.a.a(cgc::new, btu.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final btc<cgd> aJ = a("sheep", btc.a.a(cgd::new, btu.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final btc<ckl> aK = a("shulker", btc.a.a(ckl::new, btu.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final btc<cnu> aL = a("shulker_bullet", btc.a.<cnu>a(cnu::new, btu.h).a(0.3125F, 0.3125F).a(8));
   public static final btc<ckm> aM = a("silverfish", btc.a.a(ckm::new, btu.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final btc<ckn> aN = a("skeleton", btc.a.a(ckn::new, btu.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final btc<chr> aO = a("skeleton_horse", btc.a.a(chr::new, btu.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final btc<cko> aP = a("slime", btc.a.a(cko::new, btu.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final btc<cnv> aQ = a("small_fireball", btc.a.<cnv>a(cnv::new, btu.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final btc<chy> aR = a("sniffer", btc.a.a(chy::new, btu.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final btc<cgf> aS = a("snow_golem", btc.a.a(cgf::new, btu.h).a(dfd.qP).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final btc<cnw> aT = a("snowball", btc.a.<cnw>a(cnw::new, btu.h).a(0.25F, 0.25F).a(4).b(10));
   public static final btc<cpg> aU = a("spawner_minecart", btc.a.<cpg>a(cpg::new, btu.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btc<cnx> aV = a("spectral_arrow", btc.a.<cnx>a(cnx::new, btu.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btc<ckq> aW = a("spider", btc.a.a(ckq::new, btu.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final btc<cgg> aX = a("squid", btc.a.a(cgg::new, btu.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final btc<ckr> aY = a("stray", btc.a.a(ckr::new, btu.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dfd.qP).a(8));
   public static final btc<cks> aZ = a("strider", btc.a.a(cks::new, btu.b).c().a(0.9F, 1.7F).a(10));
   public static final btc<che> ba = a("tadpole", btc.a.a(che::new, btu.b).a(che.c, che.d).b(che.d * 0.65F).a(10));
   public static final btc<bsv.l> bb = a("text_display", btc.a.a(bsv.l::new, btu.h).a(0.0F, 0.0F).a(10).b(1));
   public static final btc<cjk> bc = a("tnt", btc.a.<cjk>a(cjk::new, btu.h).c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final btc<cph> bd = a("tnt_minecart", btc.a.<cph>a(cph::new, btu.h).a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final btc<cht> be = a("trader_llama", btc.a.a(cht::new, btu.b).a(0.9F, 1.87F).b(1.7765F).a(new evt(0.0, 1.37, -0.3)).a(10));
   public static final btc<coe> bf = a("trident", btc.a.<coe>a(coe::new, btu.h).a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final btc<cgh> bg = a("tropical_fish", btc.a.a(cgh::new, btu.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final btc<cgi> bh = a("turtle", btc.a.a(cgi::new, btu.b).a(1.2F, 0.4F).a(new evt(0.0, 0.55625, -0.25)).a(10));
   public static final btc<ckt> bi = a("vex", btc.a.a(ckt::new, btu.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final btc<cmm> bj = a("villager", btc.a.<cmm>a(cmm::new, btu.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final btc<cku> bk = a("vindicator", btc.a.a(cku::new, btu.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final btc<cms> bl = a("wandering_trader", btc.a.a(cms::new, btu.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final btc<cmd> bm = a("warden", btc.a.a(cmd::new, btu.a).a(0.9F, 2.9F).a(3.15F).a(bsx.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final btc<coj> bn = a("wind_charge", btc.a.<coj>a(coj::new, btu.h).a(0.3125F, 0.3125F).b(0.0F).a(4).b(10).a(cpp.c));
   public static final btc<ckv> bo = a("witch", btc.a.a(ckv::new, btu.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final btc<cix> bp = a("wither", btc.a.a(cix::new, btu.a).c().a(dfd.cd).a(0.9F, 3.5F).a(10));
   public static final btc<ckw> bq = a("wither_skeleton", btc.a.a(ckw::new, btu.a).c().a(dfd.cd).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final btc<cof> br = a("wither_skull", btc.a.<cof>a(cof::new, btu.h).a(0.3125F, 0.3125F).a(4).b(10));
   public static final btc<cgk> bs = a("wolf", btc.a.a(cgk::new, btu.b).a(0.6F, 0.85F).b(0.68F).a(new evt(0.0, 0.81875, -0.0625)).a(10));
   public static final btc<ckx> bt = a("zoglin", btc.a.a(ckx::new, btu.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final btc<cky> bu = a("zombie", btc.a.<cky>a(cky::new, btu.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final btc<chv> bv = a("zombie_horse", btc.a.a(chv::new, btu.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final btc<ckz> bw = a("zombie_villager", btc.a.a(ckz::new, btu.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final btc<cla> bx = a("zombified_piglin", btc.a.a(cla::new, btu.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final btc<cmz> by = a("player", btc.a.<cmz>a(btu.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cmz.bT).a(32).b(2));
   public static final btc<cnn> bz = a("fishing_bobber", btc.a.<cnn>a(cnn::new, btu.h).b().a().a(0.25F, 0.25F).a(4).b(5));
   private final btc.b<T> bF;
   private final btu bG;
   private final ImmutableSet<dfb> bH;
   private final boolean bI;
   private final boolean bJ;
   private final boolean bK;
   private final boolean bL;
   private final int bM;
   private final int bN;
   @Nullable
   private String bO;
   @Nullable
   private xp bP;
   @Nullable
   private ale<eqp> bQ;
   private final bsz bR;
   private final float bS;
   private final cpn bT;

   private static <T extends bsw> btc<T> a(String $$0, btc.a<T> $$1) {
      return jv.a(lp.g, $$0, $$1.a($$0));
   }

   public static alf a(btc<?> $$0) {
      return lp.g.b($$0);
   }

   public static Optional<btc<?>> a(String $$0) {
      return lp.g.b(alf.a($$0));
   }

   public btc(btc.b<T> $$0, btu $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dfb> $$6, bsz $$7, float $$8, int $$9, int $$10, cpn $$11) {
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
   public T a(arf $$0, @Nullable cur $$1, @Nullable cmz $$2, iz $$3, btv $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {
         };
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bsw> Consumer<T> a(arf $$0, cur $$1, @Nullable cmz $$2) {
      return a($$0x -> {
      }, $$0, $$1, $$2);
   }

   public static <T extends bsw> Consumer<T> a(Consumer<T> $$0, arf $$1, cur $$2, @Nullable cmz $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bsw> Consumer<T> a(Consumer<T> $$0, cur $$1) {
      xp $$2 = $$1.a(km.g);
      return $$2 != null ? $$0.andThen($$1x -> $$1x.b($$2)) : $$0;
   }

   public static <T extends bsw> Consumer<T> b(Consumer<T> $$0, arf $$1, cur $$2, @Nullable cmz $$3) {
      cxg $$4 = $$2.a(km.M, cxg.a);
      return !$$4.b() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(arf $$0, iz $$1, btv $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(arf $$0, @Nullable Consumer<T> $$1, iz $$2, btv $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
      }

      return $$6;
   }

   @Nullable
   public T b(arf $$0, @Nullable Consumer<T> $$1, iz $$2, btv $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a((dca)$$0);
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

         $$6.b((double)$$2.u() + 0.5, (double)$$2.v() + $$7, (double)$$2.w() + 0.5, ayz.g($$0.z.i() * 360.0F), 0.0F);
         if ($$6 instanceof btt $$9) {
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

   protected static double a(dcd $$0, iz $$1, boolean $$2, evo $$3) {
      evo $$4 = new evo($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<ewm> $$5 = $$0.d(null, $$4);
      return 1.0 + ewj.a(je.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dca $$0, @Nullable cmz $$1, @Nullable bsw $$2, cxg $$3) {
      MinecraftServer $$4 = $$0.o();
      if ($$4 != null && $$2 != null) {
         if ($$0.B || !$$2.cP() || $$1 != null && $$4.ah().f($$1.gb())) {
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

   public btu f() {
      return this.bG;
   }

   public String g() {
      if (this.bO == null) {
         this.bO = ac.a("entity", lp.g.b(this));
      }

      return this.bO;
   }

   public xp h() {
      if (this.bP == null) {
         this.bP = xp.c(this.g());
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

   public ale<eqp> k() {
      if (this.bQ == null) {
         alf $$0 = lp.g.b(this);
         this.bQ = ale.a(lq.aU, $$0.d("entities/"));
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
   public cpn i() {
      return this.bT;
   }

   @Nullable
   public T a(dca $$0) {
      return !this.a($$0.J()) ? null : this.bF.create(this, $$0);
   }

   public static Optional<bsw> a(us $$0, dca $$1) {
      return ac.a(a($$0).map($$1x -> $$1x.a($$1)), $$1x -> $$1x.g($$0), () -> bB.warn("Skipping Entity with id {}", $$0.l("id")));
   }

   public evo a(double $$0, double $$1, double $$2) {
      float $$3 = this.bS * this.l() / 2.0F;
      float $$4 = this.bS * this.m();
      return new evo($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
   }

   public boolean a(dse $$0) {
      if (this.bH.contains($$0.b())) {
         return false;
      } else {
         return !this.bK && eok.a($$0) ? true : $$0.a(dfd.cd) || $$0.a(dfd.oi) || $$0.a(dfd.dQ) || $$0.a(dfd.qP);
      }
   }

   public bsz n() {
      return this.bR;
   }

   public static Optional<btc<?>> a(us $$0) {
      return lp.g.b(new alf($$0.l("id")));
   }

   @Nullable
   public static bsw a(us $$0, dca $$1, Function<bsw, bsw> $$2) {
      return b($$0, $$1).map($$2).map($$3 -> {
         if ($$0.b("Passengers", 9)) {
            uy $$4 = $$0.c("Passengers", 10);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               bsw $$6 = a($$4.a($$5), $$1, $$2);
               if ($$6 != null) {
                  $$6.a($$3, true);
               }
            }
         }

         return (bsw)$$3;
      }).orElse(null);
   }

   public static Stream<bsw> a(final List<? extends vp> $$0, final dca $$1) {
      final Spliterator<? extends vp> $$2 = $$0.spliterator();
      return StreamSupport.stream(new Spliterator<bsw>() {
         @Override
         public boolean tryAdvance(Consumer<? super bsw> $$0x) {
            return $$2.tryAdvance($$2xx -> btc.a((us)$$2xx, $$1, $$1xxxx -> {
                  $$0.accept($$1xxxx);
                  return $$1xxxx;
               }));
         }

         @Override
         public Spliterator<bsw> trySplit() {
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

   private static Optional<bsw> b(us $$0, dca $$1) {
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

   public boolean a(axf<btc<?>> $$0) {
      return this.bC.a($$0);
   }

   public boolean a(jm<btc<?>> $$0) {
      return $$0.a(this.bC);
   }

   @Nullable
   public T a(bsw $$0) {
      return (T)($$0.ak() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bsw> a() {
      return bsw.class;
   }

   @Deprecated
   public ji.c<btc<?>> r() {
      return this.bC;
   }

   public static class a<T extends bsw> {
      private final btc.b<T> a;
      private final btu b;
      private ImmutableSet<dfb> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bsz j = bsz.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bsy.a l = bsy.a();
      private cpn m = cpp.g;

      private a(btc.b<T> $$0, btu $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == btu.b || $$1 == btu.h;
      }

      public static <T extends bsw> btc.a<T> a(btc.b<T> $$0, btu $$1) {
         return new btc.a<>($$0, $$1);
      }

      public static <T extends bsw> btc.a<T> a(btu $$0) {
         return new btc.a<>(($$0x, $$1) -> null, $$0);
      }

      public btc.a<T> a(float $$0, float $$1) {
         this.j = bsz.b($$0, $$1);
         return this;
      }

      public btc.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public btc.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public btc.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bsx.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public btc.a<T> a(evt... $$0) {
         for (evt $$1 : $$0) {
            this.l = this.l.a(bsx.a, $$1);
         }

         return this;
      }

      public btc.a<T> a(evt $$0) {
         return this.a(bsx.b, $$0);
      }

      public btc.a<T> c(float $$0) {
         return this.a(bsx.b, 0.0F, -$$0, 0.0F);
      }

      public btc.a<T> d(float $$0) {
         return this.a(bsx.c, 0.0F, $$0, 0.0F);
      }

      public btc.a<T> a(bsx $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public btc.a<T> a(bsx $$0, evt $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public btc.a<T> a() {
         this.e = false;
         return this;
      }

      public btc.a<T> b() {
         this.d = false;
         return this;
      }

      public btc.a<T> c() {
         this.f = true;
         return this;
      }

      public btc.a<T> a(dfb... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public btc.a<T> d() {
         this.g = true;
         return this;
      }

      public btc.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public btc.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public btc.a<T> a(cpl... $$0) {
         this.m = cpp.e.a($$0);
         return this;
      }

      public btc<T> a(String $$0) {
         if (this.d) {
            ac.a(bgx.A, $$0);
         }

         return new btc<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.m);
      }
   }

   public interface b<T extends bsw> {
      T create(btc<T> var1, dca var2);
   }
}
