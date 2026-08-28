public class cul<T extends ctc> implements csq {
   public static final cul<ctl> a = a("generic_9x1", ctl::a);
   public static final cul<ctl> b = a("generic_9x2", ctl::b);
   public static final cul<ctl> c = a("generic_9x3", ctl::c);
   public static final cul<ctl> d = a("generic_9x4", ctl::d);
   public static final cul<ctl> e = a("generic_9x5", ctl::e);
   public static final cul<ctl> f = a("generic_9x6", ctl::f);
   public static final cul<ctx> g = a("generic_3x3", ctx::new);
   public static final cul<cts> h = a("crafter_3x3", cts::new);
   public static final cul<ctf> i = a("anvil", ctf::new);
   public static final cul<cth> j = a("beacon", cth::new);
   public static final cul<cti> k = a("blast_furnace", cti::new);
   public static final cul<ctj> l = a("brewing_stand", ctj::new);
   public static final cul<ctv> m = a("crafting", ctv::new);
   public static final cul<cty> n = a("enchantment", cty::new);
   public static final cul<cua> o = a("furnace", cua::new);
   public static final cul<cuc> p = a("grindstone", cuc::new);
   public static final cul<cud> q = a("hopper", cud::new);
   public static final cul<cui> r = a("lectern", ($$0, $$1) -> new cui($$0));
   public static final cul<cuj> s = a("loom", cuj::new);
   public static final cul<cun> t = a("merchant", cun::new);
   public static final cul<cuw> u = a("shulker_box", cuw::new);
   public static final cul<cvc> v = a("smithing", cvc::new);
   public static final cul<cvd> w = a("smoker", cvd::new);
   public static final cul<ctk> x = a("cartography_table", ctk::new);
   public static final cul<cvf> y = a("stonecutter", cvf::new);
   private final cst z;
   private final cul.a<T> A;

   private static <T extends ctc> cul<T> a(String $$0, cul.a<T> $$1) {
      return kd.a(ma.p, $$0, new cul<>($$1, csv.h));
   }

   private static <T extends ctc> cul<T> a(String $$0, cul.a<T> $$1, csr... $$2) {
      return kd.a(ma.p, $$0, new cul<>($$1, csv.f.a($$2)));
   }

   private cul(cul.a<T> $$0, cst $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cpw $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cst i() {
      return this.z;
   }

   interface a<T extends ctc> {
      T create(int var1, cpw var2);
   }
}
