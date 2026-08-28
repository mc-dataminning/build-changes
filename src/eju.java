import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class eju extends eql {
   private static final String a = "Remaining";
   private static final String b = "All";
   private final LongSet c;
   private final LongSet d;

   public static eql.a<eju> a() {
      return new eql.a<>(eju::new, eju::b, azw.o);
   }

   private eju(LongSet $$0, LongSet $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public eju() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   public static eju b(ub $$0, jo.a $$1) {
      return new eju(new LongOpenHashSet($$0.o("All")), new LongOpenHashSet($$0.o("Remaining")));
   }

   @Override
   public ub a(ub $$0, jo.a $$1) {
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
