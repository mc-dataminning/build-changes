import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class elu extends esq {
   private static final String a = "Remaining";
   private static final String b = "All";
   private final LongSet c;
   private final LongSet d;

   public static esq.a<elu> a() {
      return new esq.a<>(elu::new, elu::b, bas.o);
   }

   private elu(LongSet $$0, LongSet $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public elu() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   public static elu b(uj $$0, jr.a $$1) {
      return new elu(new LongOpenHashSet($$0.o("All")), new LongOpenHashSet($$0.o("Remaining")));
   }

   @Override
   public uj a(uj $$0, jr.a $$1) {
      $$0.a("All", this.c.toLongArray());
      $$0.a("Remaining", this.d.toLongArray());
      return $$0;
   }

   public void a(long $$0) {
      this.c.add($$0);
      this.d.add($$0);
      this.c();
   }

   public boolean b(long $$0) {
      return this.c.contains($$0);
   }

   public boolean c(long $$0) {
      return this.d.contains($$0);
   }

   public void d(long $$0) {
      if (this.d.remove($$0)) {
         this.c();
      }
   }

   public LongSet b() {
      return this.c;
   }
}
