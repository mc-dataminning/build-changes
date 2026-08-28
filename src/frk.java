import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class frk extends fod {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final wz r;
   private final List<wz> s;
   private final ImmutableList<frk.a> u;
   private fjf v = fjf.a;
   private int w;
   private int x;

   protected frk(wz $$0, List<wz> $$1, ImmutableList<frk.a> $$2) {
      super($$0);
      this.s = $$1;
      this.r = wy.a($$0, xc.a($$1, wy.a));
      this.u = $$2;
   }

   @Override
   public wz i() {
      return this.r;
   }

   @Override
   public void aT_() {
      UnmodifiableIterator $$1 = this.u.iterator();

      while ($$1.hasNext()) {
         frk.a $$0 = (frk.a)$$1.next();
         this.x = Math.max(this.x, 20 + this.o.a($$0.a) + 20);
      }

      int $$1x = 5 + this.x + 5;
      int $$2 = $$1x * this.u.size();
      this.v = fjf.a(this.o, $$2, this.s.toArray(new wz[0]));
      int $$3 = this.v.a() * 9;
      this.w = (int)((double)this.n / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.w + $$3 + 9 * 2;
      int $$5 = (int)((double)this.m / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.u.iterator(); var6.hasNext(); $$5 += $$1x) {
         frk.a $$6 = (frk.a)var6.next();
         this.c(fim.a($$6.a, $$6.b).a($$5, $$4, this.x, 20).a());
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, this.w - 9 * 2, -1);
      this.v.a($$0, this.m / 2, this.w);
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   public static final class a {
      final wz a;
      final fim.c b;

      public a(wz $$0, fim.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
