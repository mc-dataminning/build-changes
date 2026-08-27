import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dbv extends eql {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eql.a<dbv> a() {
      return new eql.a<>(dbv::new, dbv::b, azs.i);
   }

   private dbv(LongSet $$0) {
      this.c = $$0;
   }

   public dbv() {
      this(new LongOpenHashSet());
   }

   public static dbv b(uk $$0, jc.a $$1) {
      return new dbv(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public uk a(uk $$0, jc.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
