import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cys extends elz {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static elz.a<cys> a() {
      return new elz.a<>(cys::new, cys::b, ayq.i);
   }

   private cys(LongSet $$0) {
      this.c = $$0;
   }

   public cys() {
      this(new LongOpenHashSet());
   }

   public static cys b(tm $$0, in.a $$1) {
      return new cys(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public tm a(tm $$0, in.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
