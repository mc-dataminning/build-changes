import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class deq extends esq {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static esq.a<deq> a() {
      return new esq.a<>(deq::new, deq::b, bas.i);
   }

   private deq(LongSet $$0) {
      this.c = $$0;
   }

   public deq() {
      this(new LongOpenHashSet());
   }

   public static deq b(uj $$0, jr.a $$1) {
      return new deq(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public uj a(uj $$0, jr.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
