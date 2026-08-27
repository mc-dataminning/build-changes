import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cqu extends ecj {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ecj.a<cqu> a() {
      return new ecj.a<>(cqu::new, cqu::b, aud.i);
   }

   private cqu(LongSet $$0) {
      this.c = $$0;
   }

   public cqu() {
      this(new LongOpenHashSet());
   }

   public static cqu b(rt $$0) {
      return new cqu(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public rt a(rt $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
