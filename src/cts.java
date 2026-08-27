import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cts extends ege {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ege.a<cts> a() {
      return new ege.a<>(cts::new, cts::b, avx.i);
   }

   private cts(LongSet $$0) {
      this.c = $$0;
   }

   public cts() {
      this(new LongOpenHashSet());
   }

   public static cts b(so $$0) {
      return new cts(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public so a(so $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
