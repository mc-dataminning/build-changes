import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cvz extends eiw {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eiw.a<cvz> a() {
      return new eiw.a<>(cvz::new, cvz::b, axs.i);
   }

   private cvz(LongSet $$0) {
      this.c = $$0;
   }

   public cvz() {
      this(new LongOpenHashSet());
   }

   public static cvz b(sy $$0, in.a $$1) {
      return new cvz(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public sy a(sy $$0, in.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
