import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class das extends eob {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eob.a<das> a() {
      return new eob.a<>(das::new, das::b, azj.i);
   }

   private das(LongSet $$0) {
      this.c = $$0;
   }

   public das() {
      this(new LongOpenHashSet());
   }

   public static das b(ud $$0, iz.a $$1) {
      return new das(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ud a(ud $$0, iz.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
