import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dge extends eum {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eum.a<dge> a() {
      return new eum.a<>(dge::new, dge::b, ban.i);
   }

   private dge(LongSet $$0) {
      this.c = $$0;
   }

   public dge() {
      this(new LongOpenHashSet());
   }

   public static dge b(tq $$0, jt.a $$1) {
      return new dge(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public tq a(tq $$0, jt.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
