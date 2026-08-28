public class ctk<T extends csb> implements crp {
   public static final ctk<csk> a = a("generic_9x1", csk::a);
   public static final ctk<csk> b = a("generic_9x2", csk::b);
   public static final ctk<csk> c = a("generic_9x3", csk::c);
   public static final ctk<csk> d = a("generic_9x4", csk::d);
   public static final ctk<csk> e = a("generic_9x5", csk::e);
   public static final ctk<csk> f = a("generic_9x6", csk::f);
   public static final ctk<csw> g = a("generic_3x3", csw::new);
   public static final ctk<csr> h = a("crafter_3x3", csr::new);
   public static final ctk<cse> i = a("anvil", cse::new);
   public static final ctk<csg> j = a("beacon", csg::new);
   public static final ctk<csh> k = a("blast_furnace", csh::new);
   public static final ctk<csi> l = a("brewing_stand", csi::new);
   public static final ctk<csu> m = a("crafting", csu::new);
   public static final ctk<csx> n = a("enchantment", csx::new);
   public static final ctk<csz> o = a("furnace", csz::new);
   public static final ctk<ctb> p = a("grindstone", ctb::new);
   public static final ctk<ctc> q = a("hopper", ctc::new);
   public static final ctk<cth> r = a("lectern", ($$0, $$1) -> new cth($$0));
   public static final ctk<cti> s = a("loom", cti::new);
   public static final ctk<ctm> t = a("merchant", ctm::new);
   public static final ctk<ctv> u = a("shulker_box", ctv::new);
   public static final ctk<cub> v = a("smithing", cub::new);
   public static final ctk<cuc> w = a("smoker", cuc::new);
   public static final ctk<csj> x = a("cartography_table", csj::new);
   public static final ctk<cue> y = a("stonecutter", cue::new);
   private final crs z;
   private final ctk.a<T> A;

   private static <T extends csb> ctk<T> a(String $$0, ctk.a<T> $$1) {
      return ke.a(mb.p, $$0, new ctk<>($$1, cru.g));
   }

   private static <T extends csb> ctk<T> a(String $$0, ctk.a<T> $$1, crq... $$2) {
      return ke.a(mb.p, $$0, new ctk<>($$1, cru.e.a($$2)));
   }

   private ctk(ctk.a<T> $$0, crs $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cov $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public crs i() {
      return this.z;
   }

   interface a<T extends csb> {
      T create(int var1, cov var2);
   }
}
