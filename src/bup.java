import java.util.function.Supplier;

public class bup<U extends buo<?>> {
   public static final bup<btz> a = a("dummy", btz::new);
   public static final bup<bug> b = a("nearest_items", bug::new);
   public static final bup<buh<bkj>> c = a("nearest_living_entities", buh::new);
   public static final bup<bul> d = a("nearest_players", bul::new);
   public static final bup<buf> e = a("nearest_bed", buf::new);
   public static final bup<bud> f = a("hurt_by", bud::new);
   public static final bup<bus> g = a("villager_hostiles", bus::new);
   public static final bup<bur> h = a("villager_babies", bur::new);
   public static final bup<bum> i = a("secondary_pois", bum::new);
   public static final bup<bub> j = a("golem_detected", bub::new);
   public static final bup<buk> k = a("piglin_specific_sensor", buk::new);
   public static final bup<buj> l = a("piglin_brute_specific_sensor", buj::new);
   public static final bup<buc> m = a("hoglin_specific_sensor", buc::new);
   public static final bup<btx> n = a("nearest_adult", btx::new);
   public static final bup<bty> o = a("axolotl_attackables", bty::new);
   public static final bup<buq> p = a("axolotl_temptations", () -> new buq(bxc.a()));
   public static final bup<buq> q = a("goat_temptations", () -> new buq(bxq.a()));
   public static final bup<buq> r = a("frog_temptations", () -> new buq(bxk.a()));
   public static final bup<buq> s = a("camel_temptations", () -> new buq(bxh.b()));
   public static final bup<bua> t = a("frog_attackables", bua::new);
   public static final bup<bue> u = a("is_in_water", bue::new);
   public static final bup<but> v = a("warden_entity_sensor", but::new);
   public static final bup<buq> w = a("sniffer_temptations", () -> new buq(byh.a()));
   private final Supplier<U> x;

   private bup(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends buo<?>> bup<U> a(String $$0, Supplier<U> $$1) {
      return io.a(jy.D, new afw($$0), new bup<>($$1));
   }
}
