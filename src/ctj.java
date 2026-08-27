import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ctj extends efv {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static efv.a<ctj> a() {
      return new efv.a<>(ctj::new, ctj::b, avv.i);
   }

   private ctj(LongSet $$0) {
      this.c = $$0;
   }

   public ctj() {
      this(new LongOpenHashSet());
   }

   public static ctj b(sn $$0) {
      return new ctj(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public sn a(sn $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
