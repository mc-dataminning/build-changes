public class cuc<T extends cst> implements csh {
   public static final cuc<ctc> a = a("generic_9x1", ctc::a);
   public static final cuc<ctc> b = a("generic_9x2", ctc::b);
   public static final cuc<ctc> c = a("generic_9x3", ctc::c);
   public static final cuc<ctc> d = a("generic_9x4", ctc::d);
   public static final cuc<ctc> e = a("generic_9x5", ctc::e);
   public static final cuc<ctc> f = a("generic_9x6", ctc::f);
   public static final cuc<cto> g = a("generic_3x3", cto::new);
   public static final cuc<ctj> h = a("crafter_3x3", ctj::new);
   public static final cuc<csw> i = a("anvil", csw::new);
   public static final cuc<csy> j = a("beacon", csy::new);
   public static final cuc<csz> k = a("blast_furnace", csz::new);
   public static final cuc<cta> l = a("brewing_stand", cta::new);
   public static final cuc<ctm> m = a("crafting", ctm::new);
   public static final cuc<ctp> n = a("enchantment", ctp::new);
   public static final cuc<ctr> o = a("furnace", ctr::new);
   public static final cuc<ctt> p = a("grindstone", ctt::new);
   public static final cuc<ctu> q = a("hopper", ctu::new);
   public static final cuc<ctz> r = a("lectern", ($$0, $$1) -> new ctz($$0));
   public static final cuc<cua> s = a("loom", cua::new);
   public static final cuc<cue> t = a("merchant", cue::new);
   public static final cuc<cun> u = a("shulker_box", cun::new);
   public static final cuc<cut> v = a("smithing", cut::new);
   public static final cuc<cuu> w = a("smoker", cuu::new);
   public static final cuc<ctb> x = a("cartography_table", ctb::new);
   public static final cuc<cuw> y = a("stonecutter", cuw::new);
   private final csk z;
   private final cuc.a<T> A;

   private static <T extends cst> cuc<T> a(String $$0, cuc.a<T> $$1) {
      return kd.a(ma.p, $$0, new cuc<>($$1, csm.g));
   }

   private static <T extends cst> cuc<T> a(String $$0, cuc.a<T> $$1, csi... $$2) {
      return kd.a(ma.p, $$0, new cuc<>($$1, csm.e.a($$2)));
   }

   private cuc(cuc.a<T> $$0, csk $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cpn $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public csk i() {
      return this.z;
   }

   interface a<T extends cst> {
      T create(int var1, cpn var2);
   }
}
