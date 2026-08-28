public class cuw<T extends ctn> implements ctb {
   public static final cuw<ctw> a = a("generic_9x1", ctw::a);
   public static final cuw<ctw> b = a("generic_9x2", ctw::b);
   public static final cuw<ctw> c = a("generic_9x3", ctw::c);
   public static final cuw<ctw> d = a("generic_9x4", ctw::d);
   public static final cuw<ctw> e = a("generic_9x5", ctw::e);
   public static final cuw<ctw> f = a("generic_9x6", ctw::f);
   public static final cuw<cui> g = a("generic_3x3", cui::new);
   public static final cuw<cud> h = a("crafter_3x3", cud::new);
   public static final cuw<ctq> i = a("anvil", ctq::new);
   public static final cuw<cts> j = a("beacon", cts::new);
   public static final cuw<ctt> k = a("blast_furnace", ctt::new);
   public static final cuw<ctu> l = a("brewing_stand", ctu::new);
   public static final cuw<cug> m = a("crafting", cug::new);
   public static final cuw<cuj> n = a("enchantment", cuj::new);
   public static final cuw<cul> o = a("furnace", cul::new);
   public static final cuw<cun> p = a("grindstone", cun::new);
   public static final cuw<cuo> q = a("hopper", cuo::new);
   public static final cuw<cut> r = a("lectern", ($$0, $$1) -> new cut($$0));
   public static final cuw<cuu> s = a("loom", cuu::new);
   public static final cuw<cuy> t = a("merchant", cuy::new);
   public static final cuw<cvh> u = a("shulker_box", cvh::new);
   public static final cuw<cvn> v = a("smithing", cvn::new);
   public static final cuw<cvo> w = a("smoker", cvo::new);
   public static final cuw<ctv> x = a("cartography_table", ctv::new);
   public static final cuw<cvq> y = a("stonecutter", cvq::new);
   private final cte z;
   private final cuw.a<T> A;

   private static <T extends ctn> cuw<T> a(String $$0, cuw.a<T> $$1) {
      return kf.a(md.p, $$0, new cuw<>($$1, ctg.g));
   }

   private static <T extends ctn> cuw<T> a(String $$0, cuw.a<T> $$1, ctc... $$2) {
      return kf.a(md.p, $$0, new cuw<>($$1, ctg.e.a($$2)));
   }

   private cuw(cuw.a<T> $$0, cte $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cqh $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cte k() {
      return this.z;
   }

   interface a<T extends ctn> {
      T create(int var1, cqh var2);
   }
}
