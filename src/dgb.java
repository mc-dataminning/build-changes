import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dgb extends euj {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static euj.a<dgb> a() {
      return new euj.a<>(dgb::new, dgb::b, bam.i);
   }

   private dgb(LongSet $$0) {
      this.c = $$0;
   }

   public dgb() {
      this(new LongOpenHashSet());
   }

   public static dgb b(tq $$0, jt.a $$1) {
      return new dgb(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public tq a(tq $$0, jt.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
