import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dca extends epo {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static epo.a<dca> a() {
      return new epo.a<>(dca::new, dca::b, azo.i);
   }

   private dca(LongSet $$0) {
      this.c = $$0;
   }

   public dca() {
      this(new LongOpenHashSet());
   }

   public static dca b(tx $$0, jl.a $$1) {
      return new dca(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public tx a(tx $$0, jl.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
