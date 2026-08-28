import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dby extends epi {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static epi.a<dby> a() {
      return new epi.a<>(dby::new, dby::b, azl.i);
   }

   private dby(LongSet $$0) {
      this.c = $$0;
   }

   public dby() {
      this(new LongOpenHashSet());
   }

   public static dby b(tx $$0, jl.a $$1) {
      return new dby(new LongOpenHashSet($$0.o("Forced")));
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
