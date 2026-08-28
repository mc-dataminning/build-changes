public class css<T extends crj> implements cqx {
   public static final css<crs> a = a("generic_9x1", crs::a);
   public static final css<crs> b = a("generic_9x2", crs::b);
   public static final css<crs> c = a("generic_9x3", crs::c);
   public static final css<crs> d = a("generic_9x4", crs::d);
   public static final css<crs> e = a("generic_9x5", crs::e);
   public static final css<crs> f = a("generic_9x6", crs::f);
   public static final css<cse> g = a("generic_3x3", cse::new);
   public static final css<crz> h = a("crafter_3x3", crz::new);
   public static final css<crm> i = a("anvil", crm::new);
   public static final css<cro> j = a("beacon", cro::new);
   public static final css<crp> k = a("blast_furnace", crp::new);
   public static final css<crq> l = a("brewing_stand", crq::new);
   public static final css<csc> m = a("crafting", csc::new);
   public static final css<csf> n = a("enchantment", csf::new);
   public static final css<csh> o = a("furnace", csh::new);
   public static final css<csj> p = a("grindstone", csj::new);
   public static final css<csk> q = a("hopper", csk::new);
   public static final css<csp> r = a("lectern", ($$0, $$1) -> new csp($$0));
   public static final css<csq> s = a("loom", csq::new);
   public static final css<csu> t = a("merchant", csu::new);
   public static final css<ctd> u = a("shulker_box", ctd::new);
   public static final css<ctj> v = a("smithing", ctj::new);
   public static final css<ctk> w = a("smoker", ctk::new);
   public static final css<crr> x = a("cartography_table", crr::new);
   public static final css<ctm> y = a("stonecutter", ctm::new);
   private final cra z;
   private final css.a<T> A;

   private static <T extends crj> css<T> a(String $$0, css.a<T> $$1) {
      return kc.a(lx.p, $$0, new css<>($$1, crc.h));
   }

   private static <T extends crj> css<T> a(String $$0, css.a<T> $$1, cqy... $$2) {
      return kc.a(lx.p, $$0, new css<>($$1, crc.f.a($$2)));
   }

   private css(css.a<T> $$0, cra $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cog $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cra i() {
      return this.z;
   }

   interface a<T extends crj> {
      T create(int var1, cog var2);
   }
}
