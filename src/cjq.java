public class cjq<T extends cij> implements chx {
   public static final cjq<ciq> a = a("generic_9x1", ciq::a);
   public static final cjq<ciq> b = a("generic_9x2", ciq::b);
   public static final cjq<ciq> c = a("generic_9x3", ciq::c);
   public static final cjq<ciq> d = a("generic_9x4", ciq::d);
   public static final cjq<ciq> e = a("generic_9x5", ciq::e);
   public static final cjq<ciq> f = a("generic_9x6", ciq::f);
   public static final cjq<cjc> g = a("generic_3x3", cjc::new);
   public static final cjq<cix> h = a("crafter_3x3", cix::new);
   public static final cjq<cil> i = a("anvil", cil::new);
   public static final cjq<cim> j = a("beacon", cim::new);
   public static final cjq<cin> k = a("blast_furnace", cin::new);
   public static final cjq<cio> l = a("brewing_stand", cio::new);
   public static final cjq<cja> m = a("crafting", cja::new);
   public static final cjq<cjd> n = a("enchantment", cjd::new);
   public static final cjq<cjf> o = a("furnace", cjf::new);
   public static final cjq<cjh> p = a("grindstone", cjh::new);
   public static final cjq<cji> q = a("hopper", cji::new);
   public static final cjq<cjn> r = a("lectern", ($$0, $$1) -> new cjn($$0));
   public static final cjq<cjo> s = a("loom", cjo::new);
   public static final cjq<cjs> t = a("merchant", cjs::new);
   public static final cjq<ckb> u = a("shulker_box", ckb::new);
   public static final cjq<ckf> v = a("smithing", ckf::new);
   public static final cjq<ckg> w = a("smoker", ckg::new);
   public static final cjq<cip> x = a("cartography_table", cip::new);
   public static final cjq<cki> y = a("stonecutter", cki::new);
   private final cia z;
   private final cjq.a<T> A;

   private static <T extends cij> cjq<T> a(String $$0, cjq.a<T> $$1) {
      return it.a(kd.r, $$0, new cjq<>($$1, cic.g));
   }

   private static <T extends cij> cjq<T> a(String $$0, cjq.a<T> $$1, chy... $$2) {
      return it.a(kd.r, $$0, new cjq<>($$1, cic.e.a($$2)));
   }

   private cjq(cjq.a<T> $$0, cia $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cfp $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cia m() {
      return this.z;
   }

   interface a<T extends cij> {
      T create(int var1, cfp var2);
   }
}
