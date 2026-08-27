public class cfj<T extends cee> implements cds {
   public static final cfj<cel> a = a("generic_9x1", cel::a);
   public static final cfj<cel> b = a("generic_9x2", cel::b);
   public static final cfj<cel> c = a("generic_9x3", cel::c);
   public static final cfj<cel> d = a("generic_9x4", cel::d);
   public static final cfj<cel> e = a("generic_9x5", cel::e);
   public static final cfj<cel> f = a("generic_9x6", cel::f);
   public static final cfj<cev> g = a("generic_3x3", cev::new);
   public static final cfj<ceg> h = a("anvil", ceg::new);
   public static final cfj<ceh> i = a("beacon", ceh::new);
   public static final cfj<cei> j = a("blast_furnace", cei::new);
   public static final cfj<cej> k = a("brewing_stand", cej::new);
   public static final cfj<cet> l = a("crafting", cet::new);
   public static final cfj<cew> m = a("enchantment", cew::new);
   public static final cfj<cey> n = a("furnace", cey::new);
   public static final cfj<cfa> o = a("grindstone", cfa::new);
   public static final cfj<cfb> p = a("hopper", cfb::new);
   public static final cfj<cfg> q = a("lectern", ($$0, $$1) -> new cfg($$0));
   public static final cfj<cfh> r = a("loom", cfh::new);
   public static final cfj<cfl> s = a("merchant", cfl::new);
   public static final cfj<cft> t = a("shulker_box", cft::new);
   public static final cfj<cfx> u = a("smithing", cfx::new);
   public static final cfj<cfy> v = a("smoker", cfy::new);
   public static final cfj<cek> w = a("cartography_table", cek::new);
   public static final cfj<cga> x = a("stonecutter", cga::new);
   private final cdv y;
   private final cfj.a<T> z;

   private static <T extends cee> cfj<T> a(String $$0, cfj.a<T> $$1) {
      return hr.a(jb.s, $$0, new cfj<>($$1, cdx.f));
   }

   private static <T extends cee> cfj<T> a(String $$0, cfj.a<T> $$1, cdt... $$2) {
      return hr.a(jb.s, $$0, new cfj<>($$1, cdx.d.a($$2)));
   }

   private cfj(cfj.a<T> $$0, cdv $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, cbm $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public cdv m() {
      return this.y;
   }

   interface a<T extends cee> {
      T create(int var1, cbm var2);
   }
}
