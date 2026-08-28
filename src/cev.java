import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class cev {
   private final bup a;
   private final IntSet b = new IntOpenHashSet();
   private final IntSet c = new IntOpenHashSet();

   public cev(bup $$0) {
      this.a = $$0;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(btr $$0) {
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
