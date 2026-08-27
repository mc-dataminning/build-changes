public class chy<T extends cgr> implements cgf {
   public static final chy<cgy> a = a("generic_9x1", cgy::a);
   public static final chy<cgy> b = a("generic_9x2", cgy::b);
   public static final chy<cgy> c = a("generic_9x3", cgy::c);
   public static final chy<cgy> d = a("generic_9x4", cgy::d);
   public static final chy<cgy> e = a("generic_9x5", cgy::e);
   public static final chy<cgy> f = a("generic_9x6", cgy::f);
   public static final chy<chk> g = a("generic_3x3", chk::new);
   public static final chy<chf> h = a("crafter_3x3", chf::new);
   public static final chy<cgt> i = a("anvil", cgt::new);
   public static final chy<cgu> j = a("beacon", cgu::new);
   public static final chy<cgv> k = a("blast_furnace", cgv::new);
   public static final chy<cgw> l = a("brewing_stand", cgw::new);
   public static final chy<chi> m = a("crafting", chi::new);
   public static final chy<chl> n = a("enchantment", chl::new);
   public static final chy<chn> o = a("furnace", chn::new);
   public static final chy<chp> p = a("grindstone", chp::new);
   public static final chy<chq> q = a("hopper", chq::new);
   public static final chy<chv> r = a("lectern", ($$0, $$1) -> new chv($$0));
   public static final chy<chw> s = a("loom", chw::new);
   public static final chy<cia> t = a("merchant", cia::new);
   public static final chy<cij> u = a("shulker_box", cij::new);
   public static final chy<cin> v = a("smithing", cin::new);
   public static final chy<cio> w = a("smoker", cio::new);
   public static final chy<cgx> x = a("cartography_table", cgx::new);
   public static final chy<ciq> y = a("stonecutter", ciq::new);
   private final cgi z;
   private final chy.a<T> A;

   private static <T extends cgr> chy<T> a(String $$0, chy.a<T> $$1) {
      return is.a(kc.s, $$0, new chy<>($$1, cgk.g));
   }

   private static <T extends cgr> chy<T> a(String $$0, chy.a<T> $$1, cgg... $$2) {
      return is.a(kc.s, $$0, new chy<>($$1, cgk.e.a($$2)));
   }

   private chy(chy.a<T> $$0, cgi $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cdy $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cgi m() {
      return this.z;
   }

   interface a<T extends cgr> {
      T create(int var1, cdy var2);
   }
}
