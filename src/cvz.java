public class cvz<T extends cuq> implements cue {
   public static final cvz<cuz> a = a("generic_9x1", cuz::a);
   public static final cvz<cuz> b = a("generic_9x2", cuz::b);
   public static final cvz<cuz> c = a("generic_9x3", cuz::c);
   public static final cvz<cuz> d = a("generic_9x4", cuz::d);
   public static final cvz<cuz> e = a("generic_9x5", cuz::e);
   public static final cvz<cuz> f = a("generic_9x6", cuz::f);
   public static final cvz<cvl> g = a("generic_3x3", cvl::new);
   public static final cvz<cvg> h = a("crafter_3x3", cvg::new);
   public static final cvz<cut> i = a("anvil", cut::new);
   public static final cvz<cuv> j = a("beacon", cuv::new);
   public static final cvz<cuw> k = a("blast_furnace", cuw::new);
   public static final cvz<cux> l = a("brewing_stand", cux::new);
   public static final cvz<cvj> m = a("crafting", cvj::new);
   public static final cvz<cvm> n = a("enchantment", cvm::new);
   public static final cvz<cvo> o = a("furnace", cvo::new);
   public static final cvz<cvq> p = a("grindstone", cvq::new);
   public static final cvz<cvr> q = a("hopper", cvr::new);
   public static final cvz<cvw> r = a("lectern", ($$0, $$1) -> new cvw($$0));
   public static final cvz<cvx> s = a("loom", cvx::new);
   public static final cvz<cwb> t = a("merchant", cwb::new);
   public static final cvz<cwk> u = a("shulker_box", cwk::new);
   public static final cvz<cwq> v = a("smithing", cwq::new);
   public static final cvz<cwr> w = a("smoker", cwr::new);
   public static final cvz<cuy> x = a("cartography_table", cuy::new);
   public static final cvz<cwt> y = a("stonecutter", cwt::new);
   private final cuh z;
   private final cvz.a<T> A;

   private static <T extends cuq> cvz<T> a(String $$0, cvz.a<T> $$1) {
      return jr.a(mf.p, $$0, new cvz<>($$1, cuj.g));
   }

   private static <T extends cuq> cvz<T> a(String $$0, cvz.a<T> $$1, cuf... $$2) {
      return jr.a(mf.p, $$0, new cvz<>($$1, cuj.e.a($$2)));
   }

   private cvz(cvz.a<T> $$0, cuh $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cqx $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cuh k() {
      return this.z;
   }

   interface a<T extends cuq> {
      T create(int var1, cqx var2);
   }
}
