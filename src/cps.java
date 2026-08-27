import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cps extends ebt {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ebt.a<cps> a() {
      return new ebt.a<>(cps::new, cps::b, atc.i);
   }

   private cps(LongSet $$0) {
      this.c = $$0;
   }

   public cps() {
      this(new LongOpenHashSet());
   }

   public static cps b(qy $$0) {
      return new cps(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public qy a(qy $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
