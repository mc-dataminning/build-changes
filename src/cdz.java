import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class cdz {
   private final bts a;
   private final IntSet b = new IntOpenHashSet();
   private final IntSet c = new IntOpenHashSet();

   public cdz(bts $$0) {
      this.a = $$0;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(bsv $$0) {
      int $$1 = $$0.al();
      if (this.b.contains($$1)) {
         return true;
      } else if (this.c.contains($$1)) {
         return false;
      } else {
         this.a.dP().ag().a("hasLineOfSight");
         boolean $$2 = this.a.E($$0);
         this.a.dP().ag().c();
         if ($$2) {
            this.b.add($$1);
         } else {
            this.c.add($$1);
         }

         return $$2;
      }
   }
}
