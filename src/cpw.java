import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cpw extends ebl {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ebl.a<cpw> a() {
      return new ebl.a<>(cpw::new, cpw::b, atg.i);
   }

   private cpw(LongSet $$0) {
      this.c = $$0;
   }

   public cpw() {
      this(new LongOpenHashSet());
   }

   public static cpw b(qw $$0) {
      return new cpw(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public qw a(qw $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
