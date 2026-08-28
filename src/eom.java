import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class eom extends evi {
   private static final String a = "Remaining";
   private static final String b = "All";
   private final LongSet c;
   private final LongSet d;

   public static evi.a<eom> a() {
      return new evi.a<>(eom::new, eom::b, bbs.o);
   }

   private eom(LongSet $$0, LongSet $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public eom() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   public static eom b(ux $$0, js.a $$1) {
      return new eom(new LongOpenHashSet($$0.o("All")), new LongOpenHashSet($$0.o("Remaining")));
   }

   @Override
   public ux a(ux $$0, js.a $$1) {
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
