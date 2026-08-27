import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cvm extends eib {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eib.a<cvm> a() {
      return new eib.a<>(cvm::new, cvm::b, axo.i);
   }

   private cvm(LongSet $$0) {
      this.c = $$0;
   }

   public cvm() {
      this(new LongOpenHashSet());
   }

   public static cvm b(sw $$0) {
      return new cvm(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public sw a(sw $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
