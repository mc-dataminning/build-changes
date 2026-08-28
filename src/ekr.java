import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ekr extends ern {
   private static final String a = "Remaining";
   private static final String b = "All";
   private final LongSet c;
   private final LongSet d;

   public static ern.a<ekr> a() {
      return new ern.a<>(ekr::new, ekr::b, bal.o);
   }

   private ekr(LongSet $$0, LongSet $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public ekr() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   public static ekr b(uf $$0, jp.a $$1) {
      return new ekr(new LongOpenHashSet($$0.o("All")), new LongOpenHashSet($$0.o("Remaining")));
   }

   @Override
   public uf a(uf $$0, jp.a $$1) {
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
