public class ctb<T extends crs> implements crg {
   public static final ctb<csb> a = a("generic_9x1", csb::a);
   public static final ctb<csb> b = a("generic_9x2", csb::b);
   public static final ctb<csb> c = a("generic_9x3", csb::c);
   public static final ctb<csb> d = a("generic_9x4", csb::d);
   public static final ctb<csb> e = a("generic_9x5", csb::e);
   public static final ctb<csb> f = a("generic_9x6", csb::f);
   public static final ctb<csn> g = a("generic_3x3", csn::new);
   public static final ctb<csi> h = a("crafter_3x3", csi::new);
   public static final ctb<crv> i = a("anvil", crv::new);
   public static final ctb<crx> j = a("beacon", crx::new);
   public static final ctb<cry> k = a("blast_furnace", cry::new);
   public static final ctb<crz> l = a("brewing_stand", crz::new);
   public static final ctb<csl> m = a("crafting", csl::new);
   public static final ctb<cso> n = a("enchantment", cso::new);
   public static final ctb<csq> o = a("furnace", csq::new);
   public static final ctb<css> p = a("grindstone", css::new);
   public static final ctb<cst> q = a("hopper", cst::new);
   public static final ctb<csy> r = a("lectern", ($$0, $$1) -> new csy($$0));
   public static final ctb<csz> s = a("loom", csz::new);
   public static final ctb<ctd> t = a("merchant", ctd::new);
   public static final ctb<ctm> u = a("shulker_box", ctm::new);
   public static final ctb<cts> v = a("smithing", cts::new);
   public static final ctb<ctt> w = a("smoker", ctt::new);
   public static final ctb<csa> x = a("cartography_table", csa::new);
   public static final ctb<ctv> y = a("stonecutter", ctv::new);
   private final crj z;
   private final ctb.a<T> A;

   private static <T extends crs> ctb<T> a(String $$0, ctb.a<T> $$1) {
      return kd.a(lz.p, $$0, new ctb<>($$1, crl.h));
   }

   private static <T extends crs> ctb<T> a(String $$0, ctb.a<T> $$1, crh... $$2) {
      return kd.a(lz.p, $$0, new ctb<>($$1, crl.f.a($$2)));
   }

   private ctb(ctb.a<T> $$0, crj $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, coq $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public crj i() {
      return this.z;
   }

   interface a<T extends crs> {
      T create(int var1, coq var2);
   }
}
