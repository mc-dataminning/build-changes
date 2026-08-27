import java.util.function.Supplier;

public class btf<U extends bte<?>> {
   public static final btf<bsp> a = a("dummy", bsp::new);
   public static final btf<bsw> b = a("nearest_items", bsw::new);
   public static final btf<bsx<biy>> c = a("nearest_living_entities", bsx::new);
   public static final btf<btb> d = a("nearest_players", btb::new);
   public static final btf<bsv> e = a("nearest_bed", bsv::new);
   public static final btf<bst> f = a("hurt_by", bst::new);
   public static final btf<bti> g = a("villager_hostiles", bti::new);
   public static final btf<bth> h = a("villager_babies", bth::new);
   public static final btf<btc> i = a("secondary_pois", btc::new);
   public static final btf<bsr> j = a("golem_detected", bsr::new);
   public static final btf<bta> k = a("piglin_specific_sensor", bta::new);
   public static final btf<bsz> l = a("piglin_brute_specific_sensor", bsz::new);
   public static final btf<bss> m = a("hoglin_specific_sensor", bss::new);
   public static final btf<bsn> n = a("nearest_adult", bsn::new);
   public static final btf<bso> o = a("axolotl_attackables", bso::new);
   public static final btf<btg> p = a("axolotl_temptations", () -> new btg(bvs.a()));
   public static final btf<btg> q = a("goat_temptations", () -> new btg(bwg.a()));
   public static final btf<btg> r = a("frog_temptations", () -> new btg(bwa.a()));
   public static final btf<btg> s = a("camel_temptations", () -> new btg(bvx.b()));
   public static final btf<bsq> t = a("frog_attackables", bsq::new);
   public static final btf<bsu> u = a("is_in_water", bsu::new);
   public static final btf<btj> v = a("warden_entity_sensor", btj::new);
   public static final btf<btg> w = a("sniffer_temptations", () -> new btg(bwx.a()));
   private final Supplier<U> x;

   private btf(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends bte<?>> btf<U> a(String $$0, Supplier<U> $$1) {
      return hr.a(jb.D, new aer($$0), new btf<>($$1));
   }
}
