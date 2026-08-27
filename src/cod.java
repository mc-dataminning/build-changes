public class cod<T extends cmw> implements cmk {
   public static final cod<cnd> a = a("generic_9x1", cnd::a);
   public static final cod<cnd> b = a("generic_9x2", cnd::b);
   public static final cod<cnd> c = a("generic_9x3", cnd::c);
   public static final cod<cnd> d = a("generic_9x4", cnd::d);
   public static final cod<cnd> e = a("generic_9x5", cnd::e);
   public static final cod<cnd> f = a("generic_9x6", cnd::f);
   public static final cod<cnp> g = a("generic_3x3", cnp::new);
   public static final cod<cnk> h = a("crafter_3x3", cnk::new);
   public static final cod<cmy> i = a("anvil", cmy::new);
   public static final cod<cmz> j = a("beacon", cmz::new);
   public static final cod<cna> k = a("blast_furnace", cna::new);
   public static final cod<cnb> l = a("brewing_stand", cnb::new);
   public static final cod<cnn> m = a("crafting", cnn::new);
   public static final cod<cnq> n = a("enchantment", cnq::new);
   public static final cod<cns> o = a("furnace", cns::new);
   public static final cod<cnu> p = a("grindstone", cnu::new);
   public static final cod<cnv> q = a("hopper", cnv::new);
   public static final cod<coa> r = a("lectern", ($$0, $$1) -> new coa($$0));
   public static final cod<cob> s = a("loom", cob::new);
   public static final cod<cof> t = a("merchant", cof::new);
   public static final cod<cop> u = a("shulker_box", cop::new);
   public static final cod<cov> v = a("smithing", cov::new);
   public static final cod<cow> w = a("smoker", cow::new);
   public static final cod<cnc> x = a("cartography_table", cnc::new);
   public static final cod<coy> y = a("stonecutter", coy::new);
   private final cmn z;
   private final cod.a<T> A;

   private static <T extends cmw> cod<T> a(String $$0, cod.a<T> $$1) {
      return ja.a(kt.r, $$0, new cod<>($$1, cmp.g));
   }

   private static <T extends cmw> cod<T> a(String $$0, cod.a<T> $$1, cml... $$2) {
      return ja.a(kt.r, $$0, new cod<>($$1, cmp.e.a($$2)));
   }

   private cod(cod.a<T> $$0, cmn $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cjz $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cmn m() {
      return this.z;
   }

   interface a<T extends cmw> {
      T create(int var1, cjz var2);
   }
}
