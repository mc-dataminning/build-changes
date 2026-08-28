public class cuf<T extends csw> implements csk {
   public static final cuf<ctf> a = a("generic_9x1", ctf::a);
   public static final cuf<ctf> b = a("generic_9x2", ctf::b);
   public static final cuf<ctf> c = a("generic_9x3", ctf::c);
   public static final cuf<ctf> d = a("generic_9x4", ctf::d);
   public static final cuf<ctf> e = a("generic_9x5", ctf::e);
   public static final cuf<ctf> f = a("generic_9x6", ctf::f);
   public static final cuf<ctr> g = a("generic_3x3", ctr::new);
   public static final cuf<ctm> h = a("crafter_3x3", ctm::new);
   public static final cuf<csz> i = a("anvil", csz::new);
   public static final cuf<ctb> j = a("beacon", ctb::new);
   public static final cuf<ctc> k = a("blast_furnace", ctc::new);
   public static final cuf<ctd> l = a("brewing_stand", ctd::new);
   public static final cuf<ctp> m = a("crafting", ctp::new);
   public static final cuf<cts> n = a("enchantment", cts::new);
   public static final cuf<ctu> o = a("furnace", ctu::new);
   public static final cuf<ctw> p = a("grindstone", ctw::new);
   public static final cuf<ctx> q = a("hopper", ctx::new);
   public static final cuf<cuc> r = a("lectern", ($$0, $$1) -> new cuc($$0));
   public static final cuf<cud> s = a("loom", cud::new);
   public static final cuf<cuh> t = a("merchant", cuh::new);
   public static final cuf<cuq> u = a("shulker_box", cuq::new);
   public static final cuf<cuw> v = a("smithing", cuw::new);
   public static final cuf<cux> w = a("smoker", cux::new);
   public static final cuf<cte> x = a("cartography_table", cte::new);
   public static final cuf<cuz> y = a("stonecutter", cuz::new);
   private final csn z;
   private final cuf.a<T> A;

   private static <T extends csw> cuf<T> a(String $$0, cuf.a<T> $$1) {
      return ke.a(mb.p, $$0, new cuf<>($$1, csp.g));
   }

   private static <T extends csw> cuf<T> a(String $$0, cuf.a<T> $$1, csl... $$2) {
      return ke.a(mb.p, $$0, new cuf<>($$1, csp.e.a($$2)));
   }

   private cuf(cuf.a<T> $$0, csn $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cpq $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public csn k() {
      return this.z;
   }

   interface a<T extends csw> {
      T create(int var1, cpq var2);
   }
}
