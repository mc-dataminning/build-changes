public class ctj<T extends csa> implements cro {
   public static final ctj<csj> a = a("generic_9x1", csj::a);
   public static final ctj<csj> b = a("generic_9x2", csj::b);
   public static final ctj<csj> c = a("generic_9x3", csj::c);
   public static final ctj<csj> d = a("generic_9x4", csj::d);
   public static final ctj<csj> e = a("generic_9x5", csj::e);
   public static final ctj<csj> f = a("generic_9x6", csj::f);
   public static final ctj<csv> g = a("generic_3x3", csv::new);
   public static final ctj<csq> h = a("crafter_3x3", csq::new);
   public static final ctj<csd> i = a("anvil", csd::new);
   public static final ctj<csf> j = a("beacon", csf::new);
   public static final ctj<csg> k = a("blast_furnace", csg::new);
   public static final ctj<csh> l = a("brewing_stand", csh::new);
   public static final ctj<cst> m = a("crafting", cst::new);
   public static final ctj<csw> n = a("enchantment", csw::new);
   public static final ctj<csy> o = a("furnace", csy::new);
   public static final ctj<cta> p = a("grindstone", cta::new);
   public static final ctj<ctb> q = a("hopper", ctb::new);
   public static final ctj<ctg> r = a("lectern", ($$0, $$1) -> new ctg($$0));
   public static final ctj<cth> s = a("loom", cth::new);
   public static final ctj<ctl> t = a("merchant", ctl::new);
   public static final ctj<ctu> u = a("shulker_box", ctu::new);
   public static final ctj<cua> v = a("smithing", cua::new);
   public static final ctj<cub> w = a("smoker", cub::new);
   public static final ctj<csi> x = a("cartography_table", csi::new);
   public static final ctj<cud> y = a("stonecutter", cud::new);
   private final crr z;
   private final ctj.a<T> A;

   private static <T extends csa> ctj<T> a(String $$0, ctj.a<T> $$1) {
      return ke.a(mb.p, $$0, new ctj<>($$1, crt.g));
   }

   private static <T extends csa> ctj<T> a(String $$0, ctj.a<T> $$1, crp... $$2) {
      return ke.a(mb.p, $$0, new ctj<>($$1, crt.e.a($$2)));
   }

   private ctj(ctj.a<T> $$0, crr $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cou $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public crr i() {
      return this.z;
   }

   interface a<T extends csa> {
      T create(int var1, cou var2);
   }
}
