public class ctm<T extends csd> implements crr {
   public static final ctm<csm> a = a("generic_9x1", csm::a);
   public static final ctm<csm> b = a("generic_9x2", csm::b);
   public static final ctm<csm> c = a("generic_9x3", csm::c);
   public static final ctm<csm> d = a("generic_9x4", csm::d);
   public static final ctm<csm> e = a("generic_9x5", csm::e);
   public static final ctm<csm> f = a("generic_9x6", csm::f);
   public static final ctm<csy> g = a("generic_3x3", csy::new);
   public static final ctm<cst> h = a("crafter_3x3", cst::new);
   public static final ctm<csg> i = a("anvil", csg::new);
   public static final ctm<csi> j = a("beacon", csi::new);
   public static final ctm<csj> k = a("blast_furnace", csj::new);
   public static final ctm<csk> l = a("brewing_stand", csk::new);
   public static final ctm<csw> m = a("crafting", csw::new);
   public static final ctm<csz> n = a("enchantment", csz::new);
   public static final ctm<ctb> o = a("furnace", ctb::new);
   public static final ctm<ctd> p = a("grindstone", ctd::new);
   public static final ctm<cte> q = a("hopper", cte::new);
   public static final ctm<ctj> r = a("lectern", ($$0, $$1) -> new ctj($$0));
   public static final ctm<ctk> s = a("loom", ctk::new);
   public static final ctm<cto> t = a("merchant", cto::new);
   public static final ctm<ctx> u = a("shulker_box", ctx::new);
   public static final ctm<cud> v = a("smithing", cud::new);
   public static final ctm<cue> w = a("smoker", cue::new);
   public static final ctm<csl> x = a("cartography_table", csl::new);
   public static final ctm<cug> y = a("stonecutter", cug::new);
   private final cru z;
   private final ctm.a<T> A;

   private static <T extends csd> ctm<T> a(String $$0, ctm.a<T> $$1) {
      return ke.a(mb.p, $$0, new ctm<>($$1, crw.g));
   }

   private static <T extends csd> ctm<T> a(String $$0, ctm.a<T> $$1, crs... $$2) {
      return ke.a(mb.p, $$0, new ctm<>($$1, crw.e.a($$2)));
   }

   private ctm(ctm.a<T> $$0, cru $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cox $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cru i() {
      return this.z;
   }

   interface a<T extends csd> {
      T create(int var1, cox var2);
   }
}
