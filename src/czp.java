import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class czp extends emy {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static emy.a<czp> a() {
      return new emy.a<>(czp::new, czp::b, azc.i);
   }

   private czp(LongSet $$0) {
      this.c = $$0;
   }

   public czp() {
      this(new LongOpenHashSet());
   }

   public static czp b(ty $$0, ix.a $$1) {
      return new czp(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ty a(ty $$0, ix.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
