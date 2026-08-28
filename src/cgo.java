import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class cgo {
   private final bwh a;
   private final IntSet b = new IntOpenHashSet();
   private final IntSet c = new IntOpenHashSet();

   public cgo(bwh $$0) {
      this.a = $$0;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(bvj $$0) {
      int $$1 = $$0.ar();
      if (this.b.contains($$1)) {
         return true;
      } else if (this.c.contains($$1)) {
         return false;
      } else {
         bps $$2 = bpr.a();
         $$2.a("hasLineOfSight");
         boolean $$3 = this.a.E($$0);
         $$2.c();
         if ($$3) {
            this.b.add($$1);
         } else {
            this.c.add($$1);
         }

         return $$3;
      }
   }
}
