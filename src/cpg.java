import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cpg extends ebh {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ebh.a<cpg> a() {
      return new ebh.a<>(cpg::new, cpg::b, ass.m);
   }

   private cpg(LongSet $$0) {
      this.c = $$0;
   }

   public cpg() {
      this(new LongOpenHashSet());
   }

   public static cpg b(qr $$0) {
      return new cpg(new LongOpenHashSet($$0.o("Forced")));
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
