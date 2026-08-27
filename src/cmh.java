import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cmh extends dyj {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   private cmh(LongSet $$0) {
      this.c = $$0;
   }

   public cmh() {
      this(new LongOpenHashSet());
   }

   public static cmh b(qr $$0) {
      return new cmh(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public qr a(qr $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet a() {
      return this.c;
   }
}
