import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class czb extends emi {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static emi.a<czb> a() {
      return new emi.a<>(czb::new, czb::b, ays.i);
   }

   private czb(LongSet $$0) {
      this.c = $$0;
   }

   public czb() {
      this(new LongOpenHashSet());
   }

   public static czb b(to $$0, ip.a $$1) {
      return new czb(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public to a(to $$0, ip.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
