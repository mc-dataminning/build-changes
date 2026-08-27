import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cph extends ebi {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ebi.a<cph> a() {
      return new ebi.a<>(cph::new, cph::b, ass.m);
   }

   private cph(LongSet $$0) {
      this.c = $$0;
   }

   public cph() {
      this(new LongOpenHashSet());
   }

   public static cph b(qr $$0) {
      return new cph(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public qr a(qr $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
