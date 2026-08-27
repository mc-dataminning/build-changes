public class cfi<T extends ced> implements cdr {
   public static final cfi<cek> a = a("generic_9x1", cek::a);
   public static final cfi<cek> b = a("generic_9x2", cek::b);
   public static final cfi<cek> c = a("generic_9x3", cek::c);
   public static final cfi<cek> d = a("generic_9x4", cek::d);
   public static final cfi<cek> e = a("generic_9x5", cek::e);
   public static final cfi<cek> f = a("generic_9x6", cek::f);
   public static final cfi<ceu> g = a("generic_3x3", ceu::new);
   public static final cfi<cef> h = a("anvil", cef::new);
   public static final cfi<ceg> i = a("beacon", ceg::new);
   public static final cfi<ceh> j = a("blast_furnace", ceh::new);
   public static final cfi<cei> k = a("brewing_stand", cei::new);
   public static final cfi<ces> l = a("crafting", ces::new);
   public static final cfi<cev> m = a("enchantment", cev::new);
   public static final cfi<cex> n = a("furnace", cex::new);
   public static final cfi<cez> o = a("grindstone", cez::new);
   public static final cfi<cfa> p = a("hopper", cfa::new);
   public static final cfi<cff> q = a("lectern", ($$0, $$1) -> new cff($$0));
   public static final cfi<cfg> r = a("loom", cfg::new);
   public static final cfi<cfk> s = a("merchant", cfk::new);
   public static final cfi<cfs> t = a("shulker_box", cfs::new);
   public static final cfi<cfw> u = a("smithing", cfw::new);
   public static final cfi<cfx> v = a("smoker", cfx::new);
   public static final cfi<cej> w = a("cartography_table", cej::new);
   public static final cfi<cfz> x = a("stonecutter", cfz::new);
   private final cdu y;
   private final cfi.a<T> z;

   private static <T extends ced> cfi<T> a(String $$0, cfi.a<T> $$1) {
      return hr.a(jb.s, $$0, new cfi<>($$1, cdw.f));
   }

   private static <T extends ced> cfi<T> a(String $$0, cfi.a<T> $$1, cds... $$2) {
      return hr.a(jb.s, $$0, new cfi<>($$1, cdw.d.a($$2)));
   }

   private cfi(cfi.a<T> $$0, cdu $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, cbl $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public cdu m() {
      return this.y;
   }

   interface a<T extends ced> {
      T create(int var1, cbl var2);
   }
}
