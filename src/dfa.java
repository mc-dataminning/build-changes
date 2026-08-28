import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dfa extends eta {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eta.a<dfa> a() {
      return new eta.a<>(dfa::new, dfa::b, bax.i);
   }

   private dfa(LongSet $$0) {
      this.c = $$0;
   }

   public dfa() {
      this(new LongOpenHashSet());
   }

   public static dfa b(un $$0, js.a $$1) {
      return new dfa(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public un a(un $$0, js.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
