import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class cdl {
   private final bte a;
   private final IntSet b = new IntOpenHashSet();
   private final IntSet c = new IntOpenHashSet();

   public cdl(bte $$0) {
      this.a = $$0;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(bsh $$0) {
      int $$1 = $$0.an();
      if (this.b.contains($$1)) {
         return true;
      } else if (this.c.contains($$1)) {
         return false;
      } else {
         this.a.dR().ag().a("hasLineOfSight");
         boolean $$2 = this.a.F($$0);
         this.a.dR().ag().c();
         if ($$2) {
            this.b.add($$1);
         } else {
            this.c.add($$1);
         }

         return $$2;
      }
   }
}
