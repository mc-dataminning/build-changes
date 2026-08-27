import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class dnn<FC extends dpr> {
   public static final dnn<dpy> e = a("no_op", new doh(dpy.a));
   public static final dnn<dqn> f = a("tree", new doz(dqn.a));
   public static final dnn<dqe> g = a("flower", new dol(dqe.a));
   public static final dnn<dqe> h = a("no_bonemeal_flower", new dol(dqe.a));
   public static final dnn<dqe> i = a("random_patch", new dol(dqe.a));
   public static final dnn<dpj> j = a("block_pile", new dmw(dpj.a));
   public static final dnn<dqm> k = a("spring_feature", new doy(dqm.a));
   public static final dnn<dpy> l = a("chorus_plant", new dmz(dpy.a));
   public static final dnn<dqf> m = a("replace_single_block", new doo(dqf.a));
   public static final dnn<dpy> n = a("void_start_platform", new dpe(dpy.a));
   public static final dnn<dpy> o = a("desert_well", new dng(dpy.a));
   public static final dnn<dns> p = a("fossil", new dnr(dns.a));
   public static final dnn<dpt> q = a("huge_red_mushroom", new dny(dpt.a));
   public static final dnn<dpt> r = a("huge_brown_mushroom", new dnv(dpt.a));
   public static final dnn<dpy> s = a("ice_spike", new dnz(dpy.a));
   public static final dnn<dpy> t = a("glowstone_blob", new dnu(dpy.a));
   public static final dnn<dpy> u = a("freeze_top_layer", new dow(dpy.a));
   public static final dnn<dpy> v = a("vines", new dpd(dpy.a));
   public static final dnn<dpi> w = a("block_column", new dmv(dpi.a));
   public static final dnn<dqq> x = a("vegetation_patch", new dpc(dqq.a));
   public static final dnn<dqq> y = a("waterlogged_vegetation_patch", new dpf(dqq.a));
   public static final dnn<dqh> z = a("root_system", new dop(dqh.a));
   public static final dnn<dpw> A = a("multiface_growth", new dof(dpw.a));
   public static final dnn<dqp> B = a("underwater_magma", new dpb(dqp.a));
   public static final dnn<dpy> C = a("monster_room", new doe(dpy.a));
   public static final dnn<dpy> D = a("blue_ice", new dmx(dpy.a));
   public static final dnn<dpk> E = a("iceberg", new doa(dpk.a));
   public static final dnn<dpk> F = a("forest_rock", new dmu(dpk.a));
   public static final dnn<dpo> G = a("disk", new dnh(dpo.a));
   public static final dnn<doc.a> H = a("lake", new doc(doc.a.a));
   public static final dnn<dpz> I = a("ore", new doi(dpz.a));
   public static final dnn<dql> J = a("end_spike", new dox(dql.a));
   public static final dnn<dpy> K = a("end_island", new dnl(dpy.a));
   public static final dnn<dpq> L = a("end_gateway", new dnk(dpq.a));
   public static final dot M = a("seagrass", new dot(dqb.k));
   public static final dnn<dpy> N = a("kelp", new dob(dpy.a));
   public static final dnn<dpy> O = a("coral_tree", new dne(dpy.a));
   public static final dnn<dpy> P = a("coral_mushroom", new dnd(dpy.a));
   public static final dnn<dpy> Q = a("coral_claw", new dnb(dpy.a));
   public static final dnn<dpm> R = a("sea_pickle", new dos(dpm.a));
   public static final dnn<dqj> S = a("simple_block", new dou(dqj.a));
   public static final dnn<dqb> T = a("bamboo", new dmr(dqb.k));
   public static final dnn<dnw> U = a("huge_fungus", new dnx(dnw.a));
   public static final dnn<dpx> V = a("nether_forest_vegetation", new dog(dpx.c));
   public static final dnn<dpy> W = a("weeping_vines", new dpg(dpy.a));
   public static final dnn<dqo> X = a("twisting_vines", new dpa(dqo.a));
   public static final dnn<dpl> Y = a("basalt_columns", new dms(dpl.a));
   public static final dnn<dpn> Z = a("delta_feature", new dnf(dpn.a));
   public static final dnn<dqg> aa = a("netherrack_replace_blobs", new don(dqg.a));
   public static final dnn<dpv> ab = a("fill_layer", new dnq(dpv.a));
   public static final dmy ac = a("bonus_chest", new dmy(dpy.a));
   public static final dnn<dpy> ad = a("basalt_pillar", new dmt(dpy.a));
   public static final dnn<dpz> ae = a("scattered_ore", new doq(dpz.a));
   public static final dnn<dqd> af = a("random_selector", new dom(dqd.a));
   public static final dnn<dqk> ag = a("simple_random_selector", new dov(dqk.a));
   public static final dnn<dqc> ah = a("random_boolean_selector", new dok(dqc.a));
   public static final dnn<dps> ai = a("geode", new dnt(dps.b));
   public static final dnn<dpp> aj = a("dripstone_cluster", new dni(dpp.a));
   public static final dnn<dpu> ak = a("large_dripstone", new dod(dpu.a));
   public static final dnn<dqa> al = a("pointed_dripstone", new doj(dqa.a));
   public static final dnn<dqi> am = a("sculk_patch", new dor(dqi.a));
   private final Codec<dna<FC, dnn<FC>>> a;

   private static <C extends dpr, F extends dnn<C>> F a(String $$0, F $$1) {
      return hr.a(jb.R, $$0, $$1);
   }

   public dnn(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new dna<>(this, $$0x), dna::c).codec();
   }

   public Codec<dna<FC, dnn<FC>>> a() {
      return this.a;
   }

   protected void a(cpu $$0, gu $$1, dfa $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<dfa> a(aqa<csm> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(cqg $$0, gu $$1, dfa $$2, Predicate<dfa> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(dnp<FC> var1);

   public boolean a(FC $$0, cqg $$1, dgx $$2, aru $$3, gu $$4) {
      return $$1.f_($$4) ? this.a(new dnp<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(dfa $$0) {
      return $$0.a(apl.bd);
   }

   public static boolean b(dfa $$0) {
      return $$0.a(apl.af);
   }

   public static boolean a(cps $$0, gu $$1) {
      return $$0.a($$1, dnn::b);
   }

   public static boolean a(Function<gu, dfa> $$0, gu $$1, Predicate<dfa> $$2) {
      gu.a $$3 = new gu.a();

      for (ha $$4 : ha.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<gu, dfa> $$0, gu $$1) {
      return a($$0, $$1, dez.a::i);
   }

   protected void a(cqg $$0, gu $$1) {
      gu.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(ha.b);
         if ($$0.a_($$2).i()) {
            return;
         }

         $$0.x($$2).e($$2);
      }
   }
}
