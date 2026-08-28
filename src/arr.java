import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class arr implements arn {
   private final arp a;
   private final Long2ObjectOpenHashMap<duw> b = new Long2ObjectOpenHashMap();
   private dbe c = new dbe(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private arr(arp $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static arr b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static arr c(int $$0) {
      arp $$1 = arp.c($$0);
      int $$2 = arn.a($$0);
      int $$3 = $$0 + duw.b();
      int $$4 = arn.a($$3);
      return new arr($$1, $$2, $$3, $$4);
   }

   public static arr c() {
      return new arr(arp.c(), 0, 0, 0);
   }

   @Override
   public void a(dbe $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dbe $$0, @Nullable duw $$1) {
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

   public int d() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public int f() {
      return this.a.d();
   }

   @Nullable
   public duw a(int $$0, int $$1) {
      return (duw)this.b.get(dbe.c($$0 + this.c.e - this.e, $$1 + this.c.f - this.e));
   }
}
