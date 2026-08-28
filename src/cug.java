public class cug<T extends csx> implements csl {
   public static final cug<ctg> a = a("generic_9x1", ctg::a);
   public static final cug<ctg> b = a("generic_9x2", ctg::b);
   public static final cug<ctg> c = a("generic_9x3", ctg::c);
   public static final cug<ctg> d = a("generic_9x4", ctg::d);
   public static final cug<ctg> e = a("generic_9x5", ctg::e);
   public static final cug<ctg> f = a("generic_9x6", ctg::f);
   public static final cug<cts> g = a("generic_3x3", cts::new);
   public static final cug<ctn> h = a("crafter_3x3", ctn::new);
   public static final cug<cta> i = a("anvil", cta::new);
   public static final cug<ctc> j = a("beacon", ctc::new);
   public static final cug<ctd> k = a("blast_furnace", ctd::new);
   public static final cug<cte> l = a("brewing_stand", cte::new);
   public static final cug<ctq> m = a("crafting", ctq::new);
   public static final cug<ctt> n = a("enchantment", ctt::new);
   public static final cug<ctv> o = a("furnace", ctv::new);
   public static final cug<ctx> p = a("grindstone", ctx::new);
   public static final cug<cty> q = a("hopper", cty::new);
   public static final cug<cud> r = a("lectern", ($$0, $$1) -> new cud($$0));
   public static final cug<cue> s = a("loom", cue::new);
   public static final cug<cui> t = a("merchant", cui::new);
   public static final cug<cur> u = a("shulker_box", cur::new);
   public static final cug<cux> v = a("smithing", cux::new);
   public static final cug<cuy> w = a("smoker", cuy::new);
   public static final cug<ctf> x = a("cartography_table", ctf::new);
   public static final cug<cva> y = a("stonecutter", cva::new);
   private final cso z;
   private final cug.a<T> A;

   private static <T extends csx> cug<T> a(String $$0, cug.a<T> $$1) {
      return kd.a(ma.p, $$0, new cug<>($$1, csq.h));
   }

   private static <T extends csx> cug<T> a(String $$0, cug.a<T> $$1, csm... $$2) {
      return kd.a(ma.p, $$0, new cug<>($$1, csq.f.a($$2)));
   }

   private cug(cug.a<T> $$0, cso $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cpr $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cso i() {
      return this.z;
   }

   interface a<T extends csx> {
      T create(int var1, cpr var2);
   }
}
