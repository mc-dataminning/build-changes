import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fmf extends flz {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final wx d;
   private final xc r;
   private final ImmutableList<fmf.a> s;
   private fgt u = fgt.a;
   private int v;
   private int w;

   protected fmf(wx $$0, List<wx> $$1, ImmutableList<fmf.a> $$2) {
      super($$0);
      this.r = xc.a($$1);
      this.d = ww.a($$0, xa.a($$1, ww.a));
      this.s = $$2;
   }

   @Override
   public wx i() {
      return this.d;
   }

   @Override
   public void aN_() {
      UnmodifiableIterator $$1 = this.s.iterator();

      while ($$1.hasNext()) {
         fmf.a $$0 = (fmf.a)$$1.next();
         this.w = Math.max(this.w, 20 + this.p.a($$0.a) + 20);
      }

      int $$1x = 5 + this.w + 5;
      int $$2 = $$1x * this.s.size();
      this.u = fgt.a(this.p, this.r, $$2);
      int $$3 = this.u.a() * 9;
      this.v = (int)((double)this.o / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.v + $$3 + 9 * 2;
      int $$5 = (int)((double)this.n / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.s.iterator(); var6.hasNext(); $$5 += $$1x) {
         fmf.a $$6 = (fmf.a)var6.next();
         this.c(fga.a($$6.a, $$6.b).a($$5, $$4, this.w, 20).a());
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.v - 9 * 2, -1);
      this.u.a($$0, this.n / 2, this.v);
   }

   @Override
   public boolean aE_() {
      return false;
   }

   public static final class a {
      final wx a;
      final fga.c b;

      public a(wx $$0, fga.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
