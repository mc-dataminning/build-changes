public class cli<T extends ckb> implements cjp {
   public static final cli<cki> a = a("generic_9x1", cki::a);
   public static final cli<cki> b = a("generic_9x2", cki::b);
   public static final cli<cki> c = a("generic_9x3", cki::c);
   public static final cli<cki> d = a("generic_9x4", cki::d);
   public static final cli<cki> e = a("generic_9x5", cki::e);
   public static final cli<cki> f = a("generic_9x6", cki::f);
   public static final cli<cku> g = a("generic_3x3", cku::new);
   public static final cli<ckp> h = a("crafter_3x3", ckp::new);
   public static final cli<ckd> i = a("anvil", ckd::new);
   public static final cli<cke> j = a("beacon", cke::new);
   public static final cli<ckf> k = a("blast_furnace", ckf::new);
   public static final cli<ckg> l = a("brewing_stand", ckg::new);
   public static final cli<cks> m = a("crafting", cks::new);
   public static final cli<ckv> n = a("enchantment", ckv::new);
   public static final cli<ckx> o = a("furnace", ckx::new);
   public static final cli<ckz> p = a("grindstone", ckz::new);
   public static final cli<cla> q = a("hopper", cla::new);
   public static final cli<clf> r = a("lectern", ($$0, $$1) -> new clf($$0));
   public static final cli<clg> s = a("loom", clg::new);
   public static final cli<clk> t = a("merchant", clk::new);
   public static final cli<clt> u = a("shulker_box", clt::new);
   public static final cli<clx> v = a("smithing", clx::new);
   public static final cli<cly> w = a("smoker", cly::new);
   public static final cli<ckh> x = a("cartography_table", ckh::new);
   public static final cli<cma> y = a("stonecutter", cma::new);
   private final cjs z;
   private final cli.a<T> A;

   private static <T extends ckb> cli<T> a(String $$0, cli.a<T> $$1) {
      return iv.a(kf.r, $$0, new cli<>($$1, cju.g));
   }

   private static <T extends ckb> cli<T> a(String $$0, cli.a<T> $$1, cjq... $$2) {
      return iv.a(kf.r, $$0, new cli<>($$1, cju.e.a($$2)));
   }

   private cli(cli.a<T> $$0, cjs $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, chg $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cjs m() {
      return this.z;
   }

   interface a<T extends ckb> {
      T create(int var1, chg var2);
   }
}
