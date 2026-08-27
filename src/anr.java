import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class anr implements ann {
   private final anp a;
   private final Long2ObjectOpenHashMap<dlq> b;
   private cte c = new cte(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   public anr(int $$0) {
      this.a = new anp($$0);
      this.d = $$0 * 2 + 1;
      this.e = $$0 + dlq.b();
      this.f = this.e * 2 + 1;
      this.b = new Long2ObjectOpenHashMap();
   }

   @Override
   public void a(cte $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(cte $$0, @Nullable dlq $$1) {
      if (this.g) {
         this.a.a($$0, $$1);
         if ($$1 == null) {
            this.b.remove($$0.a());
         } else {
            this.b.put($$0.a(), $$1);
         }
      }
   }

   @Override
   public void a() {
      this.g = true;
      this.b.clear();
      this.a.a();
   }

   @Override
   public void b() {
      this.g = false;
      this.a.b();
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.f;
   }

   public int e() {
      return this.a.c();
   }

   @Nullable
   public dlq a(int $$0, int $$1) {
      return (dlq)this.b.get(cte.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
