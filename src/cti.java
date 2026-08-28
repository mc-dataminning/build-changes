public class cti<T extends crz> implements crn {
   public static final cti<csi> a = a("generic_9x1", csi::a);
   public static final cti<csi> b = a("generic_9x2", csi::b);
   public static final cti<csi> c = a("generic_9x3", csi::c);
   public static final cti<csi> d = a("generic_9x4", csi::d);
   public static final cti<csi> e = a("generic_9x5", csi::e);
   public static final cti<csi> f = a("generic_9x6", csi::f);
   public static final cti<csu> g = a("generic_3x3", csu::new);
   public static final cti<csp> h = a("crafter_3x3", csp::new);
   public static final cti<csc> i = a("anvil", csc::new);
   public static final cti<cse> j = a("beacon", cse::new);
   public static final cti<csf> k = a("blast_furnace", csf::new);
   public static final cti<csg> l = a("brewing_stand", csg::new);
   public static final cti<css> m = a("crafting", css::new);
   public static final cti<csv> n = a("enchantment", csv::new);
   public static final cti<csx> o = a("furnace", csx::new);
   public static final cti<csz> p = a("grindstone", csz::new);
   public static final cti<cta> q = a("hopper", cta::new);
   public static final cti<ctf> r = a("lectern", ($$0, $$1) -> new ctf($$0));
   public static final cti<ctg> s = a("loom", ctg::new);
   public static final cti<ctk> t = a("merchant", ctk::new);
   public static final cti<ctt> u = a("shulker_box", ctt::new);
   public static final cti<ctz> v = a("smithing", ctz::new);
   public static final cti<cua> w = a("smoker", cua::new);
   public static final cti<csh> x = a("cartography_table", csh::new);
   public static final cti<cuc> y = a("stonecutter", cuc::new);
   private final crq z;
   private final cti.a<T> A;

   private static <T extends crz> cti<T> a(String $$0, cti.a<T> $$1) {
      return kd.a(lz.p, $$0, new cti<>($$1, crs.g));
   }

   private static <T extends crz> cti<T> a(String $$0, cti.a<T> $$1, cro... $$2) {
      return kd.a(lz.p, $$0, new cti<>($$1, crs.e.a($$2)));
   }

   private cti(cti.a<T> $$0, crq $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cot $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public crq i() {
      return this.z;
   }

   interface a<T extends crz> {
      T create(int var1, cot var2);
   }
}
