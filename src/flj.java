import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class flj extends fld {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final wu d;
   private final wz r;
   private final ImmutableList<flj.a> s;
   private ffx u = ffx.a;
   private int v;
   private int w;

   protected flj(wu $$0, List<wu> $$1, ImmutableList<flj.a> $$2) {
      super($$0);
      this.r = wz.a($$1);
      this.d = wt.a($$0, wx.a($$1, wt.a));
      this.s = $$2;
   }

   @Override
   public wu i() {
      return this.d;
   }

   @Override
   public void aM_() {
      UnmodifiableIterator $$1 = this.s.iterator();

      while ($$1.hasNext()) {
         flj.a $$0 = (flj.a)$$1.next();
         this.w = Math.max(this.w, 20 + this.p.a($$0.a) + 20);
      }

      int $$1x = 5 + this.w + 5;
      int $$2 = $$1x * this.s.size();
      this.u = ffx.a(this.p, this.r, $$2);
      int $$3 = this.u.a() * 9;
      this.v = (int)((double)this.o / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.v + $$3 + 9 * 2;
      int $$5 = (int)((double)this.n / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.s.iterator(); var6.hasNext(); $$5 += $$1x) {
         flj.a $$6 = (flj.a)var6.next();
         this.c(ffe.a($$6.a, $$6.b).a($$5, $$4, this.w, 20).a());
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.v - 9 * 2, -1);
      this.u.a($$0, this.n / 2, this.v);
   }

   @Override
   public boolean aD_() {
      return false;
   }

   public static final class a {
      final wu a;
      final ffe.c b;

      public a(wu $$0, ffe.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
