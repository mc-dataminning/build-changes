import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dhd extends evj {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static evj.a<dhd> a() {
      return new evj.a<>(dhd::new, dhd::b, bbs.i);
   }

   private dhd(LongSet $$0) {
      this.c = $$0;
   }

   public dhd() {
      this(new LongOpenHashSet());
   }

   public static dhd b(ux $$0, js.a $$1) {
      return new dhd(new LongOpenHashSet($$0.o("Forced")));
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
