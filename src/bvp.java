import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class bvp {
   private final bln a;
   private final IntSet b = new IntOpenHashSet();
   private final IntSet c = new IntOpenHashSet();

   public bvp(bln $$0) {
      this.a = $$0;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(bkv $$0) {
      int $$1 = $$0.aj();
      if (this.b.contains($$1)) {
         return true;
      } else if (this.c.contains($$1)) {
         return false;
      } else {
         this.a.dN().ae().a("hasLineOfSight");
         boolean $$2 = this.a.E($$0);
         this.a.dN().ae().c();
         if ($$2) {
            this.b.add($$1);
         } else {
            this.c.add($$1);
         }

         return $$2;
      }
   }
}
