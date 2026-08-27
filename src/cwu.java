import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cwu extends ejs {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ejs.a<cwu> a() {
      return new ejs.a<>(cwu::new, cwu::b, ayc.i);
   }

   private cwu(LongSet $$0) {
      this.c = $$0;
   }

   public cwu() {
      this(new LongOpenHashSet());
   }

   public static cwu b(ta $$0, in.a $$1) {
      return new cwu(new LongOpenHashSet($$0.o("Forced")));
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
