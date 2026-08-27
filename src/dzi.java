import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class dzi extends efv {
   private static final String a = "Remaining";
   private static final String b = "All";
   private final LongSet c;
   private final LongSet d;

   public static efv.a<dzi> a() {
      return new efv.a<>(dzi::new, dzi::b, avv.o);
   }

   private dzi(LongSet $$0, LongSet $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public dzi() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   public static dzi b(sn $$0) {
      return new dzi(new LongOpenHashSet($$0.o("All")), new LongOpenHashSet($$0.o("Remaining")));
   }

   @Override
   public sn a(sn $$0) {
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
