import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cst extends efe {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static efe.a<cst> a() {
      return new efe.a<>(cst::new, cst::b, avg.i);
   }

   private cst(LongSet $$0) {
      this.c = $$0;
   }

   public cst() {
      this(new LongOpenHashSet());
   }

   public static cst b(sj $$0) {
      return new cst(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public sj a(sj $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
