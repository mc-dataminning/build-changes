import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dbr extends epa {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static epa.a<dbr> a() {
      return new epa.a<>(dbr::new, dbr::b, bae.i);
   }

   private dbr(LongSet $$0) {
      this.c = $$0;
   }

   public dbr() {
      this(new LongOpenHashSet());
   }

   public static dbr b(ur $$0, jk.a $$1) {
      return new dbr(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ur a(ur $$0, jk.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
