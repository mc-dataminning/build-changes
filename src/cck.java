public class cck<T extends cbf> implements cat {
   public static final cck<cbm> a = a("generic_9x1", cbm::a);
   public static final cck<cbm> b = a("generic_9x2", cbm::b);
   public static final cck<cbm> c = a("generic_9x3", cbm::c);
   public static final cck<cbm> d = a("generic_9x4", cbm::d);
   public static final cck<cbm> e = a("generic_9x5", cbm::e);
   public static final cck<cbm> f = a("generic_9x6", cbm::f);
   public static final cck<cbw> g = a("generic_3x3", cbw::new);
   public static final cck<cbh> h = a("anvil", cbh::new);
   public static final cck<cbi> i = a("beacon", cbi::new);
   public static final cck<cbj> j = a("blast_furnace", cbj::new);
   public static final cck<cbk> k = a("brewing_stand", cbk::new);
   public static final cck<cbu> l = a("crafting", cbu::new);
   public static final cck<cbx> m = a("enchantment", cbx::new);
   public static final cck<cbz> n = a("furnace", cbz::new);
   public static final cck<ccb> o = a("grindstone", ccb::new);
   public static final cck<ccc> p = a("hopper", ccc::new);
   public static final cck<cch> q = a("lectern", ($$0, $$1) -> new cch($$0));
   public static final cck<cci> r = a("loom", cci::new);
   public static final cck<ccm> s = a("merchant", ccm::new);
   public static final cck<ccu> t = a("shulker_box", ccu::new);
   public static final cck<ccy> u = a("smithing", ccy::new);
   public static final cck<ccz> v = a("smoker", ccz::new);
   public static final cck<cbl> w = a("cartography_table", cbl::new);
   public static final cck<cdb> x = a("stonecutter", cdb::new);
   private final caw y;
   private final cck.a<T> z;

   private static <T extends cbf> cck<T> a(String $$0, cck.a<T> $$1) {
      return hr.a(jb.s, $$0, new cck<>($$1, cay.e));
   }

   private static <T extends cbf> cck<T> a(String $$0, cck.a<T> $$1, cau... $$2) {
      return hr.a(jb.s, $$0, new cck<>($$1, cay.c.a($$2)));
   }

   private cck(cck.a<T> $$0, caw $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, byn $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public caw m() {
      return this.y;
   }

   interface a<T extends cbf> {
      T create(int var1, byn var2);
   }
}
