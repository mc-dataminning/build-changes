public class cuk<T extends ctb> implements csp {
   public static final cuk<ctk> a = a("generic_9x1", ctk::a);
   public static final cuk<ctk> b = a("generic_9x2", ctk::b);
   public static final cuk<ctk> c = a("generic_9x3", ctk::c);
   public static final cuk<ctk> d = a("generic_9x4", ctk::d);
   public static final cuk<ctk> e = a("generic_9x5", ctk::e);
   public static final cuk<ctk> f = a("generic_9x6", ctk::f);
   public static final cuk<ctw> g = a("generic_3x3", ctw::new);
   public static final cuk<ctr> h = a("crafter_3x3", ctr::new);
   public static final cuk<cte> i = a("anvil", cte::new);
   public static final cuk<ctg> j = a("beacon", ctg::new);
   public static final cuk<cth> k = a("blast_furnace", cth::new);
   public static final cuk<cti> l = a("brewing_stand", cti::new);
   public static final cuk<ctu> m = a("crafting", ctu::new);
   public static final cuk<ctx> n = a("enchantment", ctx::new);
   public static final cuk<ctz> o = a("furnace", ctz::new);
   public static final cuk<cub> p = a("grindstone", cub::new);
   public static final cuk<cuc> q = a("hopper", cuc::new);
   public static final cuk<cuh> r = a("lectern", ($$0, $$1) -> new cuh($$0));
   public static final cuk<cui> s = a("loom", cui::new);
   public static final cuk<cum> t = a("merchant", cum::new);
   public static final cuk<cuv> u = a("shulker_box", cuv::new);
   public static final cuk<cvb> v = a("smithing", cvb::new);
   public static final cuk<cvc> w = a("smoker", cvc::new);
   public static final cuk<ctj> x = a("cartography_table", ctj::new);
   public static final cuk<cve> y = a("stonecutter", cve::new);
   private final css z;
   private final cuk.a<T> A;

   private static <T extends ctb> cuk<T> a(String $$0, cuk.a<T> $$1) {
      return kd.a(ma.p, $$0, new cuk<>($$1, csu.h));
   }

   private static <T extends ctb> cuk<T> a(String $$0, cuk.a<T> $$1, csq... $$2) {
      return kd.a(ma.p, $$0, new cuk<>($$1, csu.f.a($$2)));
   }

   private cuk(cuk.a<T> $$0, css $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cpv $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public css i() {
      return this.z;
   }

   interface a<T extends ctb> {
      T create(int var1, cpv var2);
   }
}
