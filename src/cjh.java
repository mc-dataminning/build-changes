public class cjh<T extends cia> implements cho {
   public static final cjh<cih> a = a("generic_9x1", cih::a);
   public static final cjh<cih> b = a("generic_9x2", cih::b);
   public static final cjh<cih> c = a("generic_9x3", cih::c);
   public static final cjh<cih> d = a("generic_9x4", cih::d);
   public static final cjh<cih> e = a("generic_9x5", cih::e);
   public static final cjh<cih> f = a("generic_9x6", cih::f);
   public static final cjh<cit> g = a("generic_3x3", cit::new);
   public static final cjh<cio> h = a("crafter_3x3", cio::new);
   public static final cjh<cic> i = a("anvil", cic::new);
   public static final cjh<cid> j = a("beacon", cid::new);
   public static final cjh<cie> k = a("blast_furnace", cie::new);
   public static final cjh<cif> l = a("brewing_stand", cif::new);
   public static final cjh<cir> m = a("crafting", cir::new);
   public static final cjh<ciu> n = a("enchantment", ciu::new);
   public static final cjh<ciw> o = a("furnace", ciw::new);
   public static final cjh<ciy> p = a("grindstone", ciy::new);
   public static final cjh<ciz> q = a("hopper", ciz::new);
   public static final cjh<cje> r = a("lectern", ($$0, $$1) -> new cje($$0));
   public static final cjh<cjf> s = a("loom", cjf::new);
   public static final cjh<cjj> t = a("merchant", cjj::new);
   public static final cjh<cjs> u = a("shulker_box", cjs::new);
   public static final cjh<cjw> v = a("smithing", cjw::new);
   public static final cjh<cjx> w = a("smoker", cjx::new);
   public static final cjh<cig> x = a("cartography_table", cig::new);
   public static final cjh<cjz> y = a("stonecutter", cjz::new);
   private final chr z;
   private final cjh.a<T> A;

   private static <T extends cia> cjh<T> a(String $$0, cjh.a<T> $$1) {
      return it.a(kd.r, $$0, new cjh<>($$1, cht.g));
   }

   private static <T extends cia> cjh<T> a(String $$0, cjh.a<T> $$1, chp... $$2) {
      return it.a(kd.r, $$0, new cjh<>($$1, cht.e.a($$2)));
   }

   private cjh(cjh.a<T> $$0, chr $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cfg $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public chr m() {
      return this.z;
   }

   interface a<T extends cia> {
      T create(int var1, cfg var2);
   }
}
