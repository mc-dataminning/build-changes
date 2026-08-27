public class cfw<T extends cer> implements cef {
   public static final cfw<cey> a = a("generic_9x1", cey::a);
   public static final cfw<cey> b = a("generic_9x2", cey::b);
   public static final cfw<cey> c = a("generic_9x3", cey::c);
   public static final cfw<cey> d = a("generic_9x4", cey::d);
   public static final cfw<cey> e = a("generic_9x5", cey::e);
   public static final cfw<cey> f = a("generic_9x6", cey::f);
   public static final cfw<cfi> g = a("generic_3x3", cfi::new);
   public static final cfw<cet> h = a("anvil", cet::new);
   public static final cfw<ceu> i = a("beacon", ceu::new);
   public static final cfw<cev> j = a("blast_furnace", cev::new);
   public static final cfw<cew> k = a("brewing_stand", cew::new);
   public static final cfw<cfg> l = a("crafting", cfg::new);
   public static final cfw<cfj> m = a("enchantment", cfj::new);
   public static final cfw<cfl> n = a("furnace", cfl::new);
   public static final cfw<cfn> o = a("grindstone", cfn::new);
   public static final cfw<cfo> p = a("hopper", cfo::new);
   public static final cfw<cft> q = a("lectern", ($$0, $$1) -> new cft($$0));
   public static final cfw<cfu> r = a("loom", cfu::new);
   public static final cfw<cfy> s = a("merchant", cfy::new);
   public static final cfw<cgg> t = a("shulker_box", cgg::new);
   public static final cfw<cgk> u = a("smithing", cgk::new);
   public static final cfw<cgl> v = a("smoker", cgl::new);
   public static final cfw<cex> w = a("cartography_table", cex::new);
   public static final cfw<cgn> x = a("stonecutter", cgn::new);
   private final cei y;
   private final cfw.a<T> z;

   private static <T extends cer> cfw<T> a(String $$0, cfw.a<T> $$1) {
      return hq.a(jb.s, $$0, new cfw<>($$1, cek.f));
   }

   private static <T extends cer> cfw<T> a(String $$0, cfw.a<T> $$1, ceg... $$2) {
      return hq.a(jb.s, $$0, new cfw<>($$1, cek.d.a($$2)));
   }

   private cfw(cfw.a<T> $$0, cei $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, cbz $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public cei m() {
      return this.y;
   }

   interface a<T extends cer> {
      T create(int var1, cbz var2);
   }
}
