import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class epj extends ewf {
   private static final String a = "Remaining";
   private static final String b = "All";
   private final LongSet c;
   private final LongSet d;

   public static ewf.a<epj> a() {
      return new ewf.a<>(epj::new, epj::b, bax.o);
   }

   private epj(LongSet $$0, LongSet $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public epj() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   public static epj b(tw $$0, ju.a $$1) {
      return new epj(new LongOpenHashSet($$0.o("All")), new LongOpenHashSet($$0.o("Remaining")));
   }

   @Override
   public tw a(tw $$0, ju.a $$1) {
      $$0.a("All", this.c.toLongArray());
      $$0.a("Remaining", this.d.toLongArray());
      return $$0;
   }

   public void a(long $$0) {
      this.c.add($$0);
      this.d.add($$0);
      this.g();
   }

   public boolean b(long $$0) {
      return this.c.contains($$0);
   }

   public boolean c(long $$0) {
      return this.d.contains($$0);
   }

   public void d(long $$0) {
      if (this.d.remove($$0)) {
         this.g();
      }
   }

   public LongSet b() {
      return this.c;
   }
}
