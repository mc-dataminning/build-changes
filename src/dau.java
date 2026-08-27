import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dau extends eod {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eod.a<dau> a() {
      return new eod.a<>(dau::new, dau::b, azl.i);
   }

   private dau(LongSet $$0) {
      this.c = $$0;
   }

   public dau() {
      this(new LongOpenHashSet());
   }

   public static dau b(ud $$0, iz.a $$1) {
      return new dau(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ud a(ud $$0, iz.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
