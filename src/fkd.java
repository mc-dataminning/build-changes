import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fkd extends fjx {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final wi d;
   private final wn o;
   private final ImmutableList<fkd.a> p;
   private fer q = fer.a;
   private int r;
   private int s;

   protected fkd(wi $$0, List<wi> $$1, ImmutableList<fkd.a> $$2) {
      super($$0);
      this.o = wn.a($$1);
      this.d = wh.a($$0, wl.a($$1, wh.a));
      this.p = $$2;
   }

   @Override
   public wi i() {
      return this.d;
   }

   @Override
   public void aM_() {
      UnmodifiableIterator $$1 = this.p.iterator();

      while ($$1.hasNext()) {
         fkd.a $$0 = (fkd.a)$$1.next();
         this.s = Math.max(this.s, 20 + this.m.a($$0.a) + 20);
      }

      int $$1x = 5 + this.s + 5;
      int $$2 = $$1x * this.p.size();
      this.q = fer.a(this.m, this.o, $$2);
      int $$3 = this.q.a() * 9;
      this.r = (int)((double)this.l / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.r + $$3 + 9 * 2;
      int $$5 = (int)((double)this.k / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.p.iterator(); var6.hasNext(); $$5 += $$1x) {
         fkd.a $$6 = (fkd.a)var6.next();
         this.c(fdy.a($$6.a, $$6.b).a($$5, $$4, this.s, 20).a());
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, this.r - 9 * 2, -1);
      this.q.a($$0, this.k / 2, this.r);
   }

   @Override
   public boolean aD_() {
      return false;
   }

   public static final class a {
      final wi a;
      final fdy.c b;

      public a(wi $$0, fdy.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
