import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cvi extends ehu {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ehu.a<cvi> a() {
      return new ehu.a<>(cvi::new, cvi::b, axo.i);
   }

   private cvi(LongSet $$0) {
      this.c = $$0;
   }

   public cvi() {
      this(new LongOpenHashSet());
   }

   public static cvi b(sw $$0) {
      return new cvi(new LongOpenHashSet($$0.o("Forced")));
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
