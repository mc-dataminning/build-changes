public class cfs<T extends cen> implements ceb {
   public static final cfs<ceu> a = a("generic_9x1", ceu::a);
   public static final cfs<ceu> b = a("generic_9x2", ceu::b);
   public static final cfs<ceu> c = a("generic_9x3", ceu::c);
   public static final cfs<ceu> d = a("generic_9x4", ceu::d);
   public static final cfs<ceu> e = a("generic_9x5", ceu::e);
   public static final cfs<ceu> f = a("generic_9x6", ceu::f);
   public static final cfs<cfe> g = a("generic_3x3", cfe::new);
   public static final cfs<cep> h = a("anvil", cep::new);
   public static final cfs<ceq> i = a("beacon", ceq::new);
   public static final cfs<cer> j = a("blast_furnace", cer::new);
   public static final cfs<ces> k = a("brewing_stand", ces::new);
   public static final cfs<cfc> l = a("crafting", cfc::new);
   public static final cfs<cff> m = a("enchantment", cff::new);
   public static final cfs<cfh> n = a("furnace", cfh::new);
   public static final cfs<cfj> o = a("grindstone", cfj::new);
   public static final cfs<cfk> p = a("hopper", cfk::new);
   public static final cfs<cfp> q = a("lectern", ($$0, $$1) -> new cfp($$0));
   public static final cfs<cfq> r = a("loom", cfq::new);
   public static final cfs<cfu> s = a("merchant", cfu::new);
   public static final cfs<cgc> t = a("shulker_box", cgc::new);
   public static final cfs<cgg> u = a("smithing", cgg::new);
   public static final cfs<cgh> v = a("smoker", cgh::new);
   public static final cfs<cet> w = a("cartography_table", cet::new);
   public static final cfs<cgj> x = a("stonecutter", cgj::new);
   private final cee y;
   private final cfs.a<T> z;

   private static <T extends cen> cfs<T> a(String $$0, cfs.a<T> $$1) {
      return ht.a(jd.s, $$0, new cfs<>($$1, ceg.f));
   }

   private static <T extends cen> cfs<T> a(String $$0, cfs.a<T> $$1, cec... $$2) {
      return ht.a(jd.s, $$0, new cfs<>($$1, ceg.d.a($$2)));
   }

   private cfs(cfs.a<T> $$0, cee $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, cbv $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public cee m() {
      return this.y;
   }

   interface a<T extends cen> {
      T create(int var1, cbv var2);
   }
}
