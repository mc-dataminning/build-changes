public class cfq<T extends cel> implements cdz {
   public static final cfq<ces> a = a("generic_9x1", ces::a);
   public static final cfq<ces> b = a("generic_9x2", ces::b);
   public static final cfq<ces> c = a("generic_9x3", ces::c);
   public static final cfq<ces> d = a("generic_9x4", ces::d);
   public static final cfq<ces> e = a("generic_9x5", ces::e);
   public static final cfq<ces> f = a("generic_9x6", ces::f);
   public static final cfq<cfc> g = a("generic_3x3", cfc::new);
   public static final cfq<cen> h = a("anvil", cen::new);
   public static final cfq<ceo> i = a("beacon", ceo::new);
   public static final cfq<cep> j = a("blast_furnace", cep::new);
   public static final cfq<ceq> k = a("brewing_stand", ceq::new);
   public static final cfq<cfa> l = a("crafting", cfa::new);
   public static final cfq<cfd> m = a("enchantment", cfd::new);
   public static final cfq<cff> n = a("furnace", cff::new);
   public static final cfq<cfh> o = a("grindstone", cfh::new);
   public static final cfq<cfi> p = a("hopper", cfi::new);
   public static final cfq<cfn> q = a("lectern", ($$0, $$1) -> new cfn($$0));
   public static final cfq<cfo> r = a("loom", cfo::new);
   public static final cfq<cfs> s = a("merchant", cfs::new);
   public static final cfq<cga> t = a("shulker_box", cga::new);
   public static final cfq<cge> u = a("smithing", cge::new);
   public static final cfq<cgf> v = a("smoker", cgf::new);
   public static final cfq<cer> w = a("cartography_table", cer::new);
   public static final cfq<cgh> x = a("stonecutter", cgh::new);
   private final cec y;
   private final cfq.a<T> z;

   private static <T extends cel> cfq<T> a(String $$0, cfq.a<T> $$1) {
      return ht.a(jd.s, $$0, new cfq<>($$1, cee.f));
   }

   private static <T extends cel> cfq<T> a(String $$0, cfq.a<T> $$1, cea... $$2) {
      return ht.a(jd.s, $$0, new cfq<>($$1, cee.d.a($$2)));
   }

   private cfq(cfq.a<T> $$0, cec $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, cbt $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public cec m() {
      return this.y;
   }

   interface a<T extends cel> {
      T create(int var1, cbt var2);
   }
}
