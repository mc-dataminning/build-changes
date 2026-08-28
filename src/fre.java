import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fre extends fnx {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final wy q;
   private final xd r;
   private final ImmutableList<fre.a> s;
   private fiz u = fiz.a;
   private int v;
   private int w;

   protected fre(wy $$0, List<wy> $$1, ImmutableList<fre.a> $$2) {
      super($$0);
      this.r = xd.a($$1);
      this.q = wx.a($$0, xb.a($$1, wx.a));
      this.s = $$2;
   }

   @Override
   public wy i() {
      return this.q;
   }

   @Override
   public void aP_() {
      UnmodifiableIterator $$1 = this.s.iterator();

      while ($$1.hasNext()) {
         fre.a $$0 = (fre.a)$$1.next();
         this.w = Math.max(this.w, 20 + this.o.a($$0.a) + 20);
      }

      int $$1x = 5 + this.w + 5;
      int $$2 = $$1x * this.s.size();
      this.u = fiz.a(this.o, this.r, $$2);
      int $$3 = this.u.a() * 9;
      this.v = (int)((double)this.n / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.v + $$3 + 9 * 2;
      int $$5 = (int)((double)this.m / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.s.iterator(); var6.hasNext(); $$5 += $$1x) {
         fre.a $$6 = (fre.a)var6.next();
         this.c(fig.a($$6.a, $$6.b).a($$5, $$4, this.w, 20).a());
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, this.v - 9 * 2, -1);
      this.u.a($$0, this.m / 2, this.v);
   }

   @Override
   public boolean aF_() {
      return false;
   }

   public static final class a {
      final wy a;
      final fig.c b;

      public a(wy $$0, fig.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
