import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dgd extends eul {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eul.a<dgd> a() {
      return new eul.a<>(dgd::new, dgd::b, ban.i);
   }

   private dgd(LongSet $$0) {
      this.c = $$0;
   }

   public dgd() {
      this(new LongOpenHashSet());
   }

   public static dgd b(tq $$0, jt.a $$1) {
      return new dgd(new LongOpenHashSet($$0.o("Forced")));
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
