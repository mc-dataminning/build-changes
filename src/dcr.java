import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dcr extends eql {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eql.a<dcr> a() {
      return new eql.a<>(dcr::new, dcr::b, azw.i);
   }

   private dcr(LongSet $$0) {
      this.c = $$0;
   }

   public dcr() {
      this(new LongOpenHashSet());
   }

   public static dcr b(ub $$0, jo.a $$1) {
      return new dcr(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ub a(ub $$0, jo.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
