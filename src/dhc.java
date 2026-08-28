import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dhc extends evi {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static evi.a<dhc> a() {
      return new evi.a<>(dhc::new, dhc::b, bbs.i);
   }

   private dhc(LongSet $$0) {
      this.c = $$0;
   }

   public dhc() {
      this(new LongOpenHashSet());
   }

   public static dhc b(ux $$0, js.a $$1) {
      return new dhc(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ux a(ux $$0, js.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
