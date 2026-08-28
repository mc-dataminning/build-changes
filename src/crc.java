public class crc<T extends cpu> implements cpi {
   public static final crc<cqc> a = a("generic_9x1", cqc::a);
   public static final crc<cqc> b = a("generic_9x2", cqc::b);
   public static final crc<cqc> c = a("generic_9x3", cqc::c);
   public static final crc<cqc> d = a("generic_9x4", cqc::d);
   public static final crc<cqc> e = a("generic_9x5", cqc::e);
   public static final crc<cqc> f = a("generic_9x6", cqc::f);
   public static final crc<cqo> g = a("generic_3x3", cqo::new);
   public static final crc<cqj> h = a("crafter_3x3", cqj::new);
   public static final crc<cpw> i = a("anvil", cpw::new);
   public static final crc<cpy> j = a("beacon", cpy::new);
   public static final crc<cpz> k = a("blast_furnace", cpz::new);
   public static final crc<cqa> l = a("brewing_stand", cqa::new);
   public static final crc<cqm> m = a("crafting", cqm::new);
   public static final crc<cqp> n = a("enchantment", cqp::new);
   public static final crc<cqr> o = a("furnace", cqr::new);
   public static final crc<cqt> p = a("grindstone", cqt::new);
   public static final crc<cqu> q = a("hopper", cqu::new);
   public static final crc<cqz> r = a("lectern", ($$0, $$1) -> new cqz($$0));
   public static final crc<cra> s = a("loom", cra::new);
   public static final crc<cre> t = a("merchant", cre::new);
   public static final crc<crn> u = a("shulker_box", crn::new);
   public static final crc<crt> v = a("smithing", crt::new);
   public static final crc<cru> w = a("smoker", cru::new);
   public static final crc<cqb> x = a("cartography_table", cqb::new);
   public static final crc<crw> y = a("stonecutter", crw::new);
   private final cpl z;
   private final crc.a<T> A;

   private static <T extends cpu> crc<T> a(String $$0, crc.a<T> $$1) {
      return jz.a(lt.p, $$0, new crc<>($$1, cpn.f));
   }

   private static <T extends cpu> crc<T> a(String $$0, crc.a<T> $$1, cpj... $$2) {
      return jz.a(lt.p, $$0, new crc<>($$1, cpn.d.a($$2)));
   }

   private crc(crc.a<T> $$0, cpl $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmw $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cpl i() {
      return this.z;
   }

   interface a<T extends cpu> {
      T create(int var1, cmw var2);
   }
}
