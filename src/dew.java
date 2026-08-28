import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dew extends esw {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static esw.a<dew> a() {
      return new esw.a<>(dew::new, dew::b, bat.i);
   }

   private dew(LongSet $$0) {
      this.c = $$0;
   }

   public dew() {
      this(new LongOpenHashSet());
   }

   public static dew b(uk $$0, js.a $$1) {
      return new dew(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public uk a(uk $$0, js.a $$1) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
