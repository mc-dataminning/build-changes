import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class crn extends edl {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static edl.a<crn> a() {
      return new edl.a<>(crn::new, crn::b, aun.i);
   }

   private crn(LongSet $$0) {
      this.c = $$0;
   }

   public crn() {
      this(new LongOpenHashSet());
   }

   public static crn b(rz $$0) {
      return new crn(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public rz a(rz $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
