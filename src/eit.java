import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class eit extends epi {
   private static final String a = "Remaining";
   private static final String b = "All";
   private final LongSet c;
   private final LongSet d;

   public static epi.a<eit> a() {
      return new epi.a<>(eit::new, eit::b, azl.o);
   }

   private eit(LongSet $$0, LongSet $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public eit() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   public static eit b(tx $$0, jl.a $$1) {
      return new eit(new LongOpenHashSet($$0.o("All")), new LongOpenHashSet($$0.o("Remaining")));
   }

   @Override
   public tx a(tx $$0, jl.a $$1) {
      $$0.a("All", this.c.toLongArray());
      $$0.a("Remaining", this.d.toLongArray());
      return $$0;
   }

   public void a(long $$0) {
      this.c.add($$0);
      this.d.add($$0);
   }

   public boolean b(long $$0) {
      return this.c.contains($$0);
   }

   public boolean c(long $$0) {
      return this.d.contains($$0);
   }

   public void d(long $$0) {
      this.d.remove($$0);
   }

   public LongSet b() {
      return this.c;
   }
}
