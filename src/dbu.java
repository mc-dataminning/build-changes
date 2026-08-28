import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dbu extends epd {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static epd.a<dbu> a() {
      return new epd.a<>(dbu::new, dbu::b, bag.i);
   }

   private dbu(LongSet $$0) {
      this.c = $$0;
   }

   public dbu() {
      this(new LongOpenHashSet());
   }

   public static dbu b(us $$0, jk.a $$1) {
      return new dbu(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public us a(us $$0, jk.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
