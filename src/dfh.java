import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dfh extends eth {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eth.a<dfh> a() {
      return new eth.a<>(dfh::new, dfh::b, baw.i);
   }

   private dfh(LongSet $$0) {
      this.c = $$0;
   }

   public dfh() {
      this(new LongOpenHashSet());
   }

   public static dfh b(ul $$0, js.a $$1) {
      return new dfh(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ul a(ul $$0, js.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
