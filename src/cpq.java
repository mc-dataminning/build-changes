import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cpq extends ebr {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ebr.a<cpq> a() {
      return new ebr.a<>(cpq::new, cpq::b, ata.i);
   }

   private cpq(LongSet $$0) {
      this.c = $$0;
   }

   public cpq() {
      this(new LongOpenHashSet());
   }

   public static cpq b(qx $$0) {
      return new cpq(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public qx a(qx $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
