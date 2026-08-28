import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dbt extends epc {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static epc.a<dbt> a() {
      return new epc.a<>(dbt::new, dbt::b, bag.i);
   }

   private dbt(LongSet $$0) {
      this.c = $$0;
   }

   public dbt() {
      this(new LongOpenHashSet());
   }

   public static dbt b(us $$0, jk.a $$1) {
      return new dbt(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public us a(us $$0, jk.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
