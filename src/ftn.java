import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class ftn extends fqh {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final xe d;
   private final List<xe> s;
   private final ImmutableList<ftn.a> u;
   private flh v = flh.a;
   private int w;
   private int x;

   protected ftn(xe $$0, List<xe> $$1, ImmutableList<ftn.a> $$2) {
      super($$0);
      this.s = $$1;
      this.d = xd.a($$0, xh.a($$1, xd.a));
      this.u = $$2;
   }

   @Override
   public xe i() {
      return this.d;
   }

   @Override
   public void aS_() {
      UnmodifiableIterator $$1 = this.u.iterator();

      while ($$1.hasNext()) {
         ftn.a $$0 = (ftn.a)$$1.next();
         this.x = Math.max(this.x, 20 + this.p.a($$0.a) + 20);
      }

      int $$1x = 5 + this.x + 5;
      int $$2 = $$1x * this.u.size();
      this.v = flh.a(this.p, $$2, this.s.toArray(new xe[0]));
      int $$3 = this.v.a() * 9;
      this.w = (int)((double)this.o / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.w + $$3 + 9 * 2;
      int $$5 = (int)((double)this.n / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.u.iterator(); var6.hasNext(); $$5 += $$1x) {
         ftn.a $$6 = (ftn.a)var6.next();
         this.c(fko.a($$6.a, $$6.b).a($$5, $$4, this.x, 20).a());
      }
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.w - 9 * 2, -1);
      this.v.a($$0, this.n / 2, this.w);
   }

   @Override
   public boolean aI_() {
      return false;
   }

   public static final class a {
      final xe a;
      final fko.c b;

      public a(xe $$0, fko.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
