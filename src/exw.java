import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class exw extends eya {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final tf k;
   private final tj l;
   private final ImmutableList<exw.a> m;
   private esz n = esz.a;
   private int o;
   private int p;

   protected exw(tf $$0, List<tf> $$1, ImmutableList<exw.a> $$2) {
      super($$0);
      this.l = tj.a($$1);
      this.k = te.a($$0, th.a($$1, te.a));
      this.m = $$2;
   }

   @Override
   public tf e() {
      return this.k;
   }

   @Override
   public void aC_() {
      UnmodifiableIterator $$1 = this.m.iterator();

      while ($$1.hasNext()) {
         exw.a $$0 = (exw.a)$$1.next();
         this.p = Math.max(this.p, 20 + this.i.a($$0.a) + 20);
      }

      int $$1x = 5 + this.p + 5;
      int $$2 = $$1x * this.m.size();
      this.n = esz.a(this.i, this.l, $$2);
      int $$3 = this.n.a() * 9;
      this.o = (int)((double)this.h / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.o + $$3 + 9 * 2;
      int $$5 = (int)((double)this.g / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.m.iterator(); var6.hasNext(); $$5 += $$1x) {
         exw.a $$6 = (exw.a)var6.next();
         this.d(esg.a($$6.a, $$6.b).a($$5, $$4, this.p, 20).a());
      }
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.o - 9 * 2, -1);
      this.n.a($$0, this.g / 2, this.o);
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public boolean ay_() {
      return false;
   }

   public static final class a {
      final tf a;
      final esg.c b;

      public a(tf $$0, esg.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
