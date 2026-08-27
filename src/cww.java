import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cww extends eju {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eju.a<cww> a() {
      return new eju.a<>(cww::new, cww::b, ayc.i);
   }

   private cww(LongSet $$0) {
      this.c = $$0;
   }

   public cww() {
      this(new LongOpenHashSet());
   }

   public static cww b(ta $$0, in.a $$1) {
      return new cww(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ta a(ta $$0, in.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
