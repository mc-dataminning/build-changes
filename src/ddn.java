import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ddn extends ern {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ern.a<ddn> a() {
      return new ern.a<>(ddn::new, ddn::b, bal.i);
   }

   private ddn(LongSet $$0) {
      this.c = $$0;
   }

   public ddn() {
      this(new LongOpenHashSet());
   }

   public static ddn b(uf $$0, jp.a $$1) {
      return new ddn(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public uf a(uf $$0, jp.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
