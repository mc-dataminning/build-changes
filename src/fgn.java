import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fgn extends fgh {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final vs k;
   private final vx l;
   private final ImmutableList<fgn.a> m;
   private fbd n = fbd.a;
   private int o;
   private int p;

   protected fgn(vs $$0, List<vs> $$1, ImmutableList<fgn.a> $$2) {
      super($$0);
      this.l = vx.a($$1);
      this.k = vr.a($$0, vv.a($$1, vr.a));
      this.m = $$2;
   }

   @Override
   public vs i() {
      return this.k;
   }

   @Override
   public void aP_() {
      UnmodifiableIterator $$1 = this.m.iterator();

      while ($$1.hasNext()) {
         fgn.a $$0 = (fgn.a)$$1.next();
         this.p = Math.max(this.p, 20 + this.i.a($$0.a) + 20);
      }

      int $$1x = 5 + this.p + 5;
      int $$2 = $$1x * this.m.size();
      this.n = fbd.a(this.i, this.l, $$2);
      int $$3 = this.n.a() * 9;
      this.o = (int)((double)this.h / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.o + $$3 + 9 * 2;
      int $$5 = (int)((double)this.g / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.m.iterator(); var6.hasNext(); $$5 += $$1x) {
         fgn.a $$6 = (fgn.a)var6.next();
         this.c(fak.a($$6.a, $$6.b).a($$5, $$4, this.p, 20).a());
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.o - 9 * 2, -1);
      this.n.a($$0, this.g / 2, this.o);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public boolean aN_() {
      return false;
   }

   public static final class a {
      final vs a;
      final fak.c b;

      public a(vs $$0, fak.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
