public class csx<T extends cro> implements crc {
   public static final csx<crx> a = a("generic_9x1", crx::a);
   public static final csx<crx> b = a("generic_9x2", crx::b);
   public static final csx<crx> c = a("generic_9x3", crx::c);
   public static final csx<crx> d = a("generic_9x4", crx::d);
   public static final csx<crx> e = a("generic_9x5", crx::e);
   public static final csx<crx> f = a("generic_9x6", crx::f);
   public static final csx<csj> g = a("generic_3x3", csj::new);
   public static final csx<cse> h = a("crafter_3x3", cse::new);
   public static final csx<crr> i = a("anvil", crr::new);
   public static final csx<crt> j = a("beacon", crt::new);
   public static final csx<cru> k = a("blast_furnace", cru::new);
   public static final csx<crv> l = a("brewing_stand", crv::new);
   public static final csx<csh> m = a("crafting", csh::new);
   public static final csx<csk> n = a("enchantment", csk::new);
   public static final csx<csm> o = a("furnace", csm::new);
   public static final csx<cso> p = a("grindstone", cso::new);
   public static final csx<csp> q = a("hopper", csp::new);
   public static final csx<csu> r = a("lectern", ($$0, $$1) -> new csu($$0));
   public static final csx<csv> s = a("loom", csv::new);
   public static final csx<csz> t = a("merchant", csz::new);
   public static final csx<cti> u = a("shulker_box", cti::new);
   public static final csx<cto> v = a("smithing", cto::new);
   public static final csx<ctp> w = a("smoker", ctp::new);
   public static final csx<crw> x = a("cartography_table", crw::new);
   public static final csx<ctr> y = a("stonecutter", ctr::new);
   private final crf z;
   private final csx.a<T> A;

   private static <T extends cro> csx<T> a(String $$0, csx.a<T> $$1) {
      return kd.a(ly.p, $$0, new csx<>($$1, crh.h));
   }

   private static <T extends cro> csx<T> a(String $$0, csx.a<T> $$1, crd... $$2) {
      return kd.a(ly.p, $$0, new csx<>($$1, crh.f.a($$2)));
   }

   private csx(csx.a<T> $$0, crf $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, col $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public crf i() {
      return this.z;
   }

   interface a<T extends cro> {
      T create(int var1, col var2);
   }
}
