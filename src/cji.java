public class cji<T extends cib> implements chp {
   public static final cji<cii> a = a("generic_9x1", cii::a);
   public static final cji<cii> b = a("generic_9x2", cii::b);
   public static final cji<cii> c = a("generic_9x3", cii::c);
   public static final cji<cii> d = a("generic_9x4", cii::d);
   public static final cji<cii> e = a("generic_9x5", cii::e);
   public static final cji<cii> f = a("generic_9x6", cii::f);
   public static final cji<ciu> g = a("generic_3x3", ciu::new);
   public static final cji<cip> h = a("crafter_3x3", cip::new);
   public static final cji<cid> i = a("anvil", cid::new);
   public static final cji<cie> j = a("beacon", cie::new);
   public static final cji<cif> k = a("blast_furnace", cif::new);
   public static final cji<cig> l = a("brewing_stand", cig::new);
   public static final cji<cis> m = a("crafting", cis::new);
   public static final cji<civ> n = a("enchantment", civ::new);
   public static final cji<cix> o = a("furnace", cix::new);
   public static final cji<ciz> p = a("grindstone", ciz::new);
   public static final cji<cja> q = a("hopper", cja::new);
   public static final cji<cjf> r = a("lectern", ($$0, $$1) -> new cjf($$0));
   public static final cji<cjg> s = a("loom", cjg::new);
   public static final cji<cjk> t = a("merchant", cjk::new);
   public static final cji<cjt> u = a("shulker_box", cjt::new);
   public static final cji<cjx> v = a("smithing", cjx::new);
   public static final cji<cjy> w = a("smoker", cjy::new);
   public static final cji<cih> x = a("cartography_table", cih::new);
   public static final cji<cka> y = a("stonecutter", cka::new);
   private final chs z;
   private final cji.a<T> A;

   private static <T extends cib> cji<T> a(String $$0, cji.a<T> $$1) {
      return it.a(kd.r, $$0, new cji<>($$1, chu.g));
   }

   private static <T extends cib> cji<T> a(String $$0, cji.a<T> $$1, chq... $$2) {
      return it.a(kd.r, $$0, new cji<>($$1, chu.e.a($$2)));
   }

   private cji(cji.a<T> $$0, chs $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cfh $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public chs m() {
      return this.z;
   }

   interface a<T extends cib> {
      T create(int var1, cfh var2);
   }
}
