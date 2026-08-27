public class cjb<T extends chu> implements chi {
   public static final cjb<cib> a = a("generic_9x1", cib::a);
   public static final cjb<cib> b = a("generic_9x2", cib::b);
   public static final cjb<cib> c = a("generic_9x3", cib::c);
   public static final cjb<cib> d = a("generic_9x4", cib::d);
   public static final cjb<cib> e = a("generic_9x5", cib::e);
   public static final cjb<cib> f = a("generic_9x6", cib::f);
   public static final cjb<cin> g = a("generic_3x3", cin::new);
   public static final cjb<cii> h = a("crafter_3x3", cii::new);
   public static final cjb<chw> i = a("anvil", chw::new);
   public static final cjb<chx> j = a("beacon", chx::new);
   public static final cjb<chy> k = a("blast_furnace", chy::new);
   public static final cjb<chz> l = a("brewing_stand", chz::new);
   public static final cjb<cil> m = a("crafting", cil::new);
   public static final cjb<cio> n = a("enchantment", cio::new);
   public static final cjb<ciq> o = a("furnace", ciq::new);
   public static final cjb<cis> p = a("grindstone", cis::new);
   public static final cjb<cit> q = a("hopper", cit::new);
   public static final cjb<ciy> r = a("lectern", ($$0, $$1) -> new ciy($$0));
   public static final cjb<ciz> s = a("loom", ciz::new);
   public static final cjb<cjd> t = a("merchant", cjd::new);
   public static final cjb<cjm> u = a("shulker_box", cjm::new);
   public static final cjb<cjq> v = a("smithing", cjq::new);
   public static final cjb<cjr> w = a("smoker", cjr::new);
   public static final cjb<cia> x = a("cartography_table", cia::new);
   public static final cjb<cjt> y = a("stonecutter", cjt::new);
   private final chl z;
   private final cjb.a<T> A;

   private static <T extends chu> cjb<T> a(String $$0, cjb.a<T> $$1) {
      return it.a(kd.r, $$0, new cjb<>($$1, chn.g));
   }

   private static <T extends chu> cjb<T> a(String $$0, cjb.a<T> $$1, chj... $$2) {
      return it.a(kd.r, $$0, new cjb<>($$1, chn.e.a($$2)));
   }

   private cjb(cjb.a<T> $$0, chl $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cfa $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public chl m() {
      return this.z;
   }

   interface a<T extends chu> {
      T create(int var1, cfa var2);
   }
}
