public class cra<T extends cps> implements cpg {
   public static final cra<cqa> a = a("generic_9x1", cqa::a);
   public static final cra<cqa> b = a("generic_9x2", cqa::b);
   public static final cra<cqa> c = a("generic_9x3", cqa::c);
   public static final cra<cqa> d = a("generic_9x4", cqa::d);
   public static final cra<cqa> e = a("generic_9x5", cqa::e);
   public static final cra<cqa> f = a("generic_9x6", cqa::f);
   public static final cra<cqm> g = a("generic_3x3", cqm::new);
   public static final cra<cqh> h = a("crafter_3x3", cqh::new);
   public static final cra<cpu> i = a("anvil", cpu::new);
   public static final cra<cpw> j = a("beacon", cpw::new);
   public static final cra<cpx> k = a("blast_furnace", cpx::new);
   public static final cra<cpy> l = a("brewing_stand", cpy::new);
   public static final cra<cqk> m = a("crafting", cqk::new);
   public static final cra<cqn> n = a("enchantment", cqn::new);
   public static final cra<cqp> o = a("furnace", cqp::new);
   public static final cra<cqr> p = a("grindstone", cqr::new);
   public static final cra<cqs> q = a("hopper", cqs::new);
   public static final cra<cqx> r = a("lectern", ($$0, $$1) -> new cqx($$0));
   public static final cra<cqy> s = a("loom", cqy::new);
   public static final cra<crc> t = a("merchant", crc::new);
   public static final cra<crl> u = a("shulker_box", crl::new);
   public static final cra<crr> v = a("smithing", crr::new);
   public static final cra<crs> w = a("smoker", crs::new);
   public static final cra<cpz> x = a("cartography_table", cpz::new);
   public static final cra<cru> y = a("stonecutter", cru::new);
   private final cpj z;
   private final cra.a<T> A;

   private static <T extends cps> cra<T> a(String $$0, cra.a<T> $$1) {
      return jz.a(lt.p, $$0, new cra<>($$1, cpl.f));
   }

   private static <T extends cps> cra<T> a(String $$0, cra.a<T> $$1, cph... $$2) {
      return jz.a(lt.p, $$0, new cra<>($$1, cpl.d.a($$2)));
   }

   private cra(cra.a<T> $$0, cpj $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmu $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cpj i() {
      return this.z;
   }

   interface a<T extends cps> {
      T create(int var1, cmu var2);
   }
}
