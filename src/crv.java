import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class crv extends edx {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static edx.a<crv> a() {
      return new edx.a<>(crv::new, crv::b, aus.i);
   }

   private crv(LongSet $$0) {
      this.c = $$0;
   }

   public crv() {
      this(new LongOpenHashSet());
   }

   public static crv b(rz $$0) {
      return new crv(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public rz a(rz $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
