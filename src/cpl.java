import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cpl extends ebm {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ebm.a<cpl> a() {
      return new ebm.a<>(cpl::new, cpl::b, asv.i);
   }

   private cpl(LongSet $$0) {
      this.c = $$0;
   }

   public cpl() {
      this(new LongOpenHashSet());
   }

   public static cpl b(qu $$0) {
      return new cpl(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public qu a(qu $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
