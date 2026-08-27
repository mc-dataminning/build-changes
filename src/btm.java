import java.util.function.Supplier;

public class btm<U extends btl<?>> {
   public static final btm<bsw> a = a("dummy", bsw::new);
   public static final btm<btd> b = a("nearest_items", btd::new);
   public static final btm<bte<bjg>> c = a("nearest_living_entities", bte::new);
   public static final btm<bti> d = a("nearest_players", bti::new);
   public static final btm<btc> e = a("nearest_bed", btc::new);
   public static final btm<bta> f = a("hurt_by", bta::new);
   public static final btm<btp> g = a("villager_hostiles", btp::new);
   public static final btm<bto> h = a("villager_babies", bto::new);
   public static final btm<btj> i = a("secondary_pois", btj::new);
   public static final btm<bsy> j = a("golem_detected", bsy::new);
   public static final btm<bth> k = a("piglin_specific_sensor", bth::new);
   public static final btm<btg> l = a("piglin_brute_specific_sensor", btg::new);
   public static final btm<bsz> m = a("hoglin_specific_sensor", bsz::new);
   public static final btm<bsu> n = a("nearest_adult", bsu::new);
   public static final btm<bsv> o = a("axolotl_attackables", bsv::new);
   public static final btm<btn> p = a("axolotl_temptations", () -> new btn(bvz.a()));
   public static final btm<btn> q = a("goat_temptations", () -> new btn(bwn.a()));
   public static final btm<btn> r = a("frog_temptations", () -> new btn(bwh.a()));
   public static final btm<btn> s = a("camel_temptations", () -> new btn(bwe.b()));
   public static final btm<bsx> t = a("frog_attackables", bsx::new);
   public static final btm<btb> u = a("is_in_water", btb::new);
   public static final btm<btq> v = a("warden_entity_sensor", btq::new);
   public static final btm<btn> w = a("sniffer_temptations", () -> new btn(bxe.a()));
   private final Supplier<U> x;

   private btm(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends btl<?>> btm<U> a(String $$0, Supplier<U> $$1) {
      return hq.a(jb.D, new aew($$0), new btm<>($$1));
   }
}
