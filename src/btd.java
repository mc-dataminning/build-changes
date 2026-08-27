import java.util.function.Supplier;

public class btd<U extends btc<?>> {
   public static final btd<bsn> a = a("dummy", bsn::new);
   public static final btd<bsu> b = a("nearest_items", bsu::new);
   public static final btd<bsv<biw>> c = a("nearest_living_entities", bsv::new);
   public static final btd<bsz> d = a("nearest_players", bsz::new);
   public static final btd<bst> e = a("nearest_bed", bst::new);
   public static final btd<bsr> f = a("hurt_by", bsr::new);
   public static final btd<btg> g = a("villager_hostiles", btg::new);
   public static final btd<btf> h = a("villager_babies", btf::new);
   public static final btd<bta> i = a("secondary_pois", bta::new);
   public static final btd<bsp> j = a("golem_detected", bsp::new);
   public static final btd<bsy> k = a("piglin_specific_sensor", bsy::new);
   public static final btd<bsx> l = a("piglin_brute_specific_sensor", bsx::new);
   public static final btd<bsq> m = a("hoglin_specific_sensor", bsq::new);
   public static final btd<bsl> n = a("nearest_adult", bsl::new);
   public static final btd<bsm> o = a("axolotl_attackables", bsm::new);
   public static final btd<bte> p = a("axolotl_temptations", () -> new bte(bvq.a()));
   public static final btd<bte> q = a("goat_temptations", () -> new bte(bwe.a()));
   public static final btd<bte> r = a("frog_temptations", () -> new bte(bvy.a()));
   public static final btd<bte> s = a("camel_temptations", () -> new bte(bvv.b()));
   public static final btd<bso> t = a("frog_attackables", bso::new);
   public static final btd<bss> u = a("is_in_water", bss::new);
   public static final btd<bth> v = a("warden_entity_sensor", bth::new);
   public static final btd<bte> w = a("sniffer_temptations", () -> new bte(bwv.a()));
   private final Supplier<U> x;

   private btd(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends btc<?>> btd<U> a(String $$0, Supplier<U> $$1) {
      return hs.a(jc.D, new aep($$0), new btd<>($$1));
   }
}
