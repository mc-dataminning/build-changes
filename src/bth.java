import java.util.function.Supplier;

public class bth<U extends btg<?>> {
   public static final bth<bsr> a = a("dummy", bsr::new);
   public static final bth<bsy> b = a("nearest_items", bsy::new);
   public static final bth<bsz<bjb>> c = a("nearest_living_entities", bsz::new);
   public static final bth<btd> d = a("nearest_players", btd::new);
   public static final bth<bsx> e = a("nearest_bed", bsx::new);
   public static final bth<bsv> f = a("hurt_by", bsv::new);
   public static final bth<btk> g = a("villager_hostiles", btk::new);
   public static final bth<btj> h = a("villager_babies", btj::new);
   public static final bth<bte> i = a("secondary_pois", bte::new);
   public static final bth<bst> j = a("golem_detected", bst::new);
   public static final bth<btc> k = a("piglin_specific_sensor", btc::new);
   public static final bth<btb> l = a("piglin_brute_specific_sensor", btb::new);
   public static final bth<bsu> m = a("hoglin_specific_sensor", bsu::new);
   public static final bth<bsp> n = a("nearest_adult", bsp::new);
   public static final bth<bsq> o = a("axolotl_attackables", bsq::new);
   public static final bth<bti> p = a("axolotl_temptations", () -> new bti(bvu.a()));
   public static final bth<bti> q = a("goat_temptations", () -> new bti(bwi.a()));
   public static final bth<bti> r = a("frog_temptations", () -> new bti(bwc.a()));
   public static final bth<bti> s = a("camel_temptations", () -> new bti(bvz.b()));
   public static final bth<bss> t = a("frog_attackables", bss::new);
   public static final bth<bsw> u = a("is_in_water", bsw::new);
   public static final bth<btl> v = a("warden_entity_sensor", btl::new);
   public static final bth<bti> w = a("sniffer_temptations", () -> new bti(bwz.a()));
   private final Supplier<U> x;

   private bth(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends btg<?>> bth<U> a(String $$0, Supplier<U> $$1) {
      return ht.a(jd.D, new aeu($$0), new bth<>($$1));
   }
}
