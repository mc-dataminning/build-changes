public class cfh<T extends cec> implements cdq {
   public static final cfh<cej> a = a("generic_9x1", cej::a);
   public static final cfh<cej> b = a("generic_9x2", cej::b);
   public static final cfh<cej> c = a("generic_9x3", cej::c);
   public static final cfh<cej> d = a("generic_9x4", cej::d);
   public static final cfh<cej> e = a("generic_9x5", cej::e);
   public static final cfh<cej> f = a("generic_9x6", cej::f);
   public static final cfh<cet> g = a("generic_3x3", cet::new);
   public static final cfh<cee> h = a("anvil", cee::new);
   public static final cfh<cef> i = a("beacon", cef::new);
   public static final cfh<ceg> j = a("blast_furnace", ceg::new);
   public static final cfh<ceh> k = a("brewing_stand", ceh::new);
   public static final cfh<cer> l = a("crafting", cer::new);
   public static final cfh<ceu> m = a("enchantment", ceu::new);
   public static final cfh<cew> n = a("furnace", cew::new);
   public static final cfh<cey> o = a("grindstone", cey::new);
   public static final cfh<cez> p = a("hopper", cez::new);
   public static final cfh<cfe> q = a("lectern", ($$0, $$1) -> new cfe($$0));
   public static final cfh<cff> r = a("loom", cff::new);
   public static final cfh<cfj> s = a("merchant", cfj::new);
   public static final cfh<cfr> t = a("shulker_box", cfr::new);
   public static final cfh<cfv> u = a("smithing", cfv::new);
   public static final cfh<cfw> v = a("smoker", cfw::new);
   public static final cfh<cei> w = a("cartography_table", cei::new);
   public static final cfh<cfy> x = a("stonecutter", cfy::new);
   private final cdt y;
   private final cfh.a<T> z;

   private static <T extends cec> cfh<T> a(String $$0, cfh.a<T> $$1) {
      return hs.a(jc.s, $$0, new cfh<>($$1, cdv.f));
   }

   private static <T extends cec> cfh<T> a(String $$0, cfh.a<T> $$1, cdr... $$2) {
      return hs.a(jc.s, $$0, new cfh<>($$1, cdv.d.a($$2)));
   }

   private cfh(cfh.a<T> $$0, cdt $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, cbk $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public cdt m() {
      return this.y;
   }

   interface a<T extends cec> {
      T create(int var1, cbk var2);
   }
}
