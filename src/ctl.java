public class ctl<T extends csc> implements crq {
   public static final ctl<csl> a = a("generic_9x1", csl::a);
   public static final ctl<csl> b = a("generic_9x2", csl::b);
   public static final ctl<csl> c = a("generic_9x3", csl::c);
   public static final ctl<csl> d = a("generic_9x4", csl::d);
   public static final ctl<csl> e = a("generic_9x5", csl::e);
   public static final ctl<csl> f = a("generic_9x6", csl::f);
   public static final ctl<csx> g = a("generic_3x3", csx::new);
   public static final ctl<css> h = a("crafter_3x3", css::new);
   public static final ctl<csf> i = a("anvil", csf::new);
   public static final ctl<csh> j = a("beacon", csh::new);
   public static final ctl<csi> k = a("blast_furnace", csi::new);
   public static final ctl<csj> l = a("brewing_stand", csj::new);
   public static final ctl<csv> m = a("crafting", csv::new);
   public static final ctl<csy> n = a("enchantment", csy::new);
   public static final ctl<cta> o = a("furnace", cta::new);
   public static final ctl<ctc> p = a("grindstone", ctc::new);
   public static final ctl<ctd> q = a("hopper", ctd::new);
   public static final ctl<cti> r = a("lectern", ($$0, $$1) -> new cti($$0));
   public static final ctl<ctj> s = a("loom", ctj::new);
   public static final ctl<ctn> t = a("merchant", ctn::new);
   public static final ctl<ctw> u = a("shulker_box", ctw::new);
   public static final ctl<cuc> v = a("smithing", cuc::new);
   public static final ctl<cud> w = a("smoker", cud::new);
   public static final ctl<csk> x = a("cartography_table", csk::new);
   public static final ctl<cuf> y = a("stonecutter", cuf::new);
   private final crt z;
   private final ctl.a<T> A;

   private static <T extends csc> ctl<T> a(String $$0, ctl.a<T> $$1) {
      return ke.a(mb.p, $$0, new ctl<>($$1, crv.g));
   }

   private static <T extends csc> ctl<T> a(String $$0, ctl.a<T> $$1, crr... $$2) {
      return ke.a(mb.p, $$0, new ctl<>($$1, crv.e.a($$2)));
   }

   private ctl(ctl.a<T> $$0, crt $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cow $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public crt i() {
      return this.z;
   }

   interface a<T extends csc> {
      T create(int var1, cow var2);
   }
}
