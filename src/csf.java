public class csf<T extends cqw> implements cqk {
   public static final csf<crf> a = a("generic_9x1", crf::a);
   public static final csf<crf> b = a("generic_9x2", crf::b);
   public static final csf<crf> c = a("generic_9x3", crf::c);
   public static final csf<crf> d = a("generic_9x4", crf::d);
   public static final csf<crf> e = a("generic_9x5", crf::e);
   public static final csf<crf> f = a("generic_9x6", crf::f);
   public static final csf<crr> g = a("generic_3x3", crr::new);
   public static final csf<crm> h = a("crafter_3x3", crm::new);
   public static final csf<cqz> i = a("anvil", cqz::new);
   public static final csf<crb> j = a("beacon", crb::new);
   public static final csf<crc> k = a("blast_furnace", crc::new);
   public static final csf<crd> l = a("brewing_stand", crd::new);
   public static final csf<crp> m = a("crafting", crp::new);
   public static final csf<crs> n = a("enchantment", crs::new);
   public static final csf<cru> o = a("furnace", cru::new);
   public static final csf<crw> p = a("grindstone", crw::new);
   public static final csf<crx> q = a("hopper", crx::new);
   public static final csf<csc> r = a("lectern", ($$0, $$1) -> new csc($$0));
   public static final csf<csd> s = a("loom", csd::new);
   public static final csf<csh> t = a("merchant", csh::new);
   public static final csf<csq> u = a("shulker_box", csq::new);
   public static final csf<csw> v = a("smithing", csw::new);
   public static final csf<csx> w = a("smoker", csx::new);
   public static final csf<cre> x = a("cartography_table", cre::new);
   public static final csf<csz> y = a("stonecutter", csz::new);
   private final cqn z;
   private final csf.a<T> A;

   private static <T extends cqw> csf<T> a(String $$0, csf.a<T> $$1) {
      return ka.a(lu.p, $$0, new csf<>($$1, cqp.h));
   }

   private static <T extends cqw> csf<T> a(String $$0, csf.a<T> $$1, cql... $$2) {
      return ka.a(lu.p, $$0, new csf<>($$1, cqp.f.a($$2)));
   }

   private csf(csf.a<T> $$0, cqn $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cnt $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cqn i() {
      return this.z;
   }

   interface a<T extends cqw> {
      T create(int var1, cnt var2);
   }
}
