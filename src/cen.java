import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class cen {
   private final buh a;
   private final IntSet b = new IntOpenHashSet();
   private final IntSet c = new IntOpenHashSet();

   public cen(buh $$0) {
      this.a = $$0;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(btj $$0) {
      int $$1 = $$0.ap();
      if (this.b.contains($$1)) {
         return true;
      } else if (this.c.contains($$1)) {
         return false;
      } else {
         this.a.dS().ah().a("hasLineOfSight");
         boolean $$2 = this.a.G($$0);
         this.a.dS().ah().c();
         if ($$2) {
            this.b.add($$1);
         } else {
            this.c.add($$1);
         }

         return $$2;
      }
   }
}
