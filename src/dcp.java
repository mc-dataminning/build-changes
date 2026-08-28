import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dcp extends eqf {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static eqf.a<dcp> a() {
      return new eqf.a<>(dcp::new, dcp::b, azv.i);
   }

   private dcp(LongSet $$0) {
      this.c = $$0;
   }

   public dcp() {
      this(new LongOpenHashSet());
   }

   public static dcp b(ua $$0, jo.a $$1) {
      return new dcp(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public ua a(ua $$0, jo.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
