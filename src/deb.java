import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class deb extends esb {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static esb.a<deb> a() {
      return new esb.a<>(deb::new, deb::b, bam.i);
   }

   private deb(LongSet $$0) {
      this.c = $$0;
   }

   public deb() {
      this(new LongOpenHashSet());
   }

   public static deb b(uf $$0, jp.a $$1) {
      return new deb(new LongOpenHashSet($$0.o("Forced")));
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
