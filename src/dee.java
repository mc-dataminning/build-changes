import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dee extends esf {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static esf.a<dee> a() {
      return new esf.a<>(dee::new, dee::b, bao.i);
   }

   private dee(LongSet $$0) {
      this.c = $$0;
   }

   public dee() {
      this(new LongOpenHashSet());
   }

   public static dee b(ug $$0, jq.a $$1) {
      return new dee(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ug a(ug $$0, jq.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
