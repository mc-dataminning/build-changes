import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dbo extends eox {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eox.a<dbo> a() {
      return new eox.a<>(dbo::new, dbo::b, bab.i);
   }

   private dbo(LongSet $$0) {
      this.c = $$0;
   }

   public dbo() {
      this(new LongOpenHashSet());
   }

   public static dbo b(ur $$0, jk.a $$1) {
      return new dbo(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ur a(ur $$0, jk.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
