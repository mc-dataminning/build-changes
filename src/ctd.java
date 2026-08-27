import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ctd extends efp {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static efp.a<ctd> a() {
      return new efp.a<>(ctd::new, ctd::b, avq.i);
   }

   private ctd(LongSet $$0) {
      this.c = $$0;
   }

   public ctd() {
      this(new LongOpenHashSet());
   }

   public static ctd b(sl $$0) {
      return new ctd(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public sl a(sl $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
