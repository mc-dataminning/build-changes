import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dgc extends euk {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static euk.a<dgc> a() {
      return new euk.a<>(dgc::new, dgc::b, ban.i);
   }

   private dgc(LongSet $$0) {
      this.c = $$0;
   }

   public dgc() {
      this(new LongOpenHashSet());
   }

   public static dgc b(tq $$0, jt.a $$1) {
      return new dgc(new LongOpenHashSet($$0.o("Forced")));
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
