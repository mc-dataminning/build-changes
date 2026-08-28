import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class chg {
   private final bxb a;
   private final IntSet b = new IntOpenHashSet();
   private final IntSet c = new IntOpenHashSet();

   public chg(bxb $$0) {
      this.a = $$0;
   }

   public void a() {
      this.b.clear();
      this.c.clear();
   }

   public boolean a(bwa $$0) {
      int $$1 = $$0.ar();
      if (this.b.contains($$1)) {
         return true;
      } else if (this.c.contains($$1)) {
         return false;
      } else {
         bqj $$2 = bqi.a();
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
