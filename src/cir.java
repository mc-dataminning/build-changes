public class cir<T extends chk> implements cgy {
   public static final cir<chr> a = a("generic_9x1", chr::a);
   public static final cir<chr> b = a("generic_9x2", chr::b);
   public static final cir<chr> c = a("generic_9x3", chr::c);
   public static final cir<chr> d = a("generic_9x4", chr::d);
   public static final cir<chr> e = a("generic_9x5", chr::e);
   public static final cir<chr> f = a("generic_9x6", chr::f);
   public static final cir<cid> g = a("generic_3x3", cid::new);
   public static final cir<chy> h = a("crafter_3x3", chy::new);
   public static final cir<chm> i = a("anvil", chm::new);
   public static final cir<chn> j = a("beacon", chn::new);
   public static final cir<cho> k = a("blast_furnace", cho::new);
   public static final cir<chp> l = a("brewing_stand", chp::new);
   public static final cir<cib> m = a("crafting", cib::new);
   public static final cir<cie> n = a("enchantment", cie::new);
   public static final cir<cig> o = a("furnace", cig::new);
   public static final cir<cii> p = a("grindstone", cii::new);
   public static final cir<cij> q = a("hopper", cij::new);
   public static final cir<cio> r = a("lectern", ($$0, $$1) -> new cio($$0));
   public static final cir<cip> s = a("loom", cip::new);
   public static final cir<cit> t = a("merchant", cit::new);
   public static final cir<cjc> u = a("shulker_box", cjc::new);
   public static final cir<cjg> v = a("smithing", cjg::new);
   public static final cir<cjh> w = a("smoker", cjh::new);
   public static final cir<chq> x = a("cartography_table", chq::new);
   public static final cir<cjj> y = a("stonecutter", cjj::new);
   private final chb z;
   private final cir.a<T> A;

   private static <T extends chk> cir<T> a(String $$0, cir.a<T> $$1) {
      return ir.a(kb.r, $$0, new cir<>($$1, chd.g));
   }

   private static <T extends chk> cir<T> a(String $$0, cir.a<T> $$1, cgz... $$2) {
      return ir.a(kb.r, $$0, new cir<>($$1, chd.e.a($$2)));
   }

   private cir(cir.a<T> $$0, chb $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, ceq $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public chb m() {
      return this.z;
   }

   interface a<T extends chk> {
      T create(int var1, ceq var2);
   }
}
