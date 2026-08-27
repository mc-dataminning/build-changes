import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class csa extends eec {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eec.a<csa> a() {
      return new eec.a<>(csa::new, csa::b, auw.i);
   }

   private csa(LongSet $$0) {
      this.c = $$0;
   }

   public csa() {
      this(new LongOpenHashSet());
   }

   public static csa b(sd $$0) {
      return new csa(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public sd a(sd $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
