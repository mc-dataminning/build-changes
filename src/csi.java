public class csi<T extends cqz> implements cqn {
   public static final csi<cri> a = a("generic_9x1", cri::a);
   public static final csi<cri> b = a("generic_9x2", cri::b);
   public static final csi<cri> c = a("generic_9x3", cri::c);
   public static final csi<cri> d = a("generic_9x4", cri::d);
   public static final csi<cri> e = a("generic_9x5", cri::e);
   public static final csi<cri> f = a("generic_9x6", cri::f);
   public static final csi<cru> g = a("generic_3x3", cru::new);
   public static final csi<crp> h = a("crafter_3x3", crp::new);
   public static final csi<crc> i = a("anvil", crc::new);
   public static final csi<cre> j = a("beacon", cre::new);
   public static final csi<crf> k = a("blast_furnace", crf::new);
   public static final csi<crg> l = a("brewing_stand", crg::new);
   public static final csi<crs> m = a("crafting", crs::new);
   public static final csi<crv> n = a("enchantment", crv::new);
   public static final csi<crx> o = a("furnace", crx::new);
   public static final csi<crz> p = a("grindstone", crz::new);
   public static final csi<csa> q = a("hopper", csa::new);
   public static final csi<csf> r = a("lectern", ($$0, $$1) -> new csf($$0));
   public static final csi<csg> s = a("loom", csg::new);
   public static final csi<csk> t = a("merchant", csk::new);
   public static final csi<cst> u = a("shulker_box", cst::new);
   public static final csi<csz> v = a("smithing", csz::new);
   public static final csi<cta> w = a("smoker", cta::new);
   public static final csi<crh> x = a("cartography_table", crh::new);
   public static final csi<ctc> y = a("stonecutter", ctc::new);
   private final cqq z;
   private final csi.a<T> A;

   private static <T extends cqz> csi<T> a(String $$0, csi.a<T> $$1) {
      return kb.a(lv.p, $$0, new csi<>($$1, cqs.h));
   }

   private static <T extends cqz> csi<T> a(String $$0, csi.a<T> $$1, cqo... $$2) {
      return kb.a(lv.p, $$0, new csi<>($$1, cqs.f.a($$2)));
   }

   private csi(csi.a<T> $$0, cqq $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cnw $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cqq i() {
      return this.z;
   }

   interface a<T extends cqz> {
      T create(int var1, cnw var2);
   }
}
