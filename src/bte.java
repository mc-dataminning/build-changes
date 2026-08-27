import java.util.function.Supplier;

public class bte<U extends btd<?>> {
   public static final bte<bso> a = a("dummy", bso::new);
   public static final bte<bsv> b = a("nearest_items", bsv::new);
   public static final bte<bsw<biy>> c = a("nearest_living_entities", bsw::new);
   public static final bte<bta> d = a("nearest_players", bta::new);
   public static final bte<bsu> e = a("nearest_bed", bsu::new);
   public static final bte<bss> f = a("hurt_by", bss::new);
   public static final bte<bth> g = a("villager_hostiles", bth::new);
   public static final bte<btg> h = a("villager_babies", btg::new);
   public static final bte<btb> i = a("secondary_pois", btb::new);
   public static final bte<bsq> j = a("golem_detected", bsq::new);
   public static final bte<bsz> k = a("piglin_specific_sensor", bsz::new);
   public static final bte<bsy> l = a("piglin_brute_specific_sensor", bsy::new);
   public static final bte<bsr> m = a("hoglin_specific_sensor", bsr::new);
   public static final bte<bsm> n = a("nearest_adult", bsm::new);
   public static final bte<bsn> o = a("axolotl_attackables", bsn::new);
   public static final bte<btf> p = a("axolotl_temptations", () -> new btf(bvr.a()));
   public static final bte<btf> q = a("goat_temptations", () -> new btf(bwf.a()));
   public static final bte<btf> r = a("frog_temptations", () -> new btf(bvz.a()));
   public static final bte<btf> s = a("camel_temptations", () -> new btf(bvw.b()));
   public static final bte<bsp> t = a("frog_attackables", bsp::new);
   public static final bte<bst> u = a("is_in_water", bst::new);
   public static final bte<bti> v = a("warden_entity_sensor", bti::new);
   public static final bte<btf> w = a("sniffer_temptations", () -> new btf(bww.a()));
   private final Supplier<U> x;

   private bte(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends btd<?>> bte<U> a(String $$0, Supplier<U> $$1) {
      return hr.a(jb.D, new aer($$0), new bte<>($$1));
   }
}
