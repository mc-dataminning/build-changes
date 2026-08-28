import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dbs extends epb {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static epb.a<dbs> a() {
      return new epb.a<>(dbs::new, dbs::b, baf.i);
   }

   private dbs(LongSet $$0) {
      this.c = $$0;
   }

   public dbs() {
      this(new LongOpenHashSet());
   }

   public static dbs b(ur $$0, jk.a $$1) {
      return new dbs(new LongOpenHashSet($$0.o("Forced")));
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
