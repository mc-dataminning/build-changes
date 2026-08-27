import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class czy extends enh {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static enh.a<czy> a() {
      return new enh.a<>(czy::new, czy::b, azf.i);
   }

   private czy(LongSet $$0) {
      this.c = $$0;
   }

   public czy() {
      this(new LongOpenHashSet());
   }

   public static czy b(ua $$0, iy.a $$1) {
      return new czy(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ua a(ua $$0, iy.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
