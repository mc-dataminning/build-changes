import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fju extends fjo {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final wg d;
   private final wl o;
   private final ImmutableList<fju.a> p;
   private fei q = fei.a;
   private int r;
   private int s;

   protected fju(wg $$0, List<wg> $$1, ImmutableList<fju.a> $$2) {
      super($$0);
      this.o = wl.a($$1);
      this.d = wf.a($$0, wj.a($$1, wf.a));
      this.p = $$2;
   }

   @Override
   public wg i() {
      return this.d;
   }

   @Override
   public void aN_() {
      UnmodifiableIterator $$1 = this.p.iterator();

      while ($$1.hasNext()) {
         fju.a $$0 = (fju.a)$$1.next();
         this.s = Math.max(this.s, 20 + this.m.a($$0.a) + 20);
      }

      int $$1x = 5 + this.s + 5;
      int $$2 = $$1x * this.p.size();
      this.q = fei.a(this.m, this.o, $$2);
      int $$3 = this.q.a() * 9;
      this.r = (int)((double)this.l / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.r + $$3 + 9 * 2;
      int $$5 = (int)((double)this.k / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.p.iterator(); var6.hasNext(); $$5 += $$1x) {
         fju.a $$6 = (fju.a)var6.next();
         this.c(fdp.a($$6.a, $$6.b).a($$5, $$4, this.s, 20).a());
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, this.r - 9 * 2, -1);
      this.q.a($$0, this.k / 2, this.r);
   }

   @Override
   public boolean aE_() {
      return false;
   }

   public static final class a {
      final wg a;
      final fdp.c b;

      public a(wg $$0, fdp.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
