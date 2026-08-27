import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fkz extends fkt {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final ws d;
   private final wx r;
   private final ImmutableList<fkz.a> s;
   private ffn u = ffn.a;
   private int v;
   private int w;

   protected fkz(ws $$0, List<ws> $$1, ImmutableList<fkz.a> $$2) {
      super($$0);
      this.r = wx.a($$1);
      this.d = wr.a($$0, wv.a($$1, wr.a));
      this.s = $$2;
   }

   @Override
   public ws i() {
      return this.d;
   }

   @Override
   public void aM_() {
      UnmodifiableIterator $$1 = this.s.iterator();

      while ($$1.hasNext()) {
         fkz.a $$0 = (fkz.a)$$1.next();
         this.w = Math.max(this.w, 20 + this.p.a($$0.a) + 20);
      }

      int $$1x = 5 + this.w + 5;
      int $$2 = $$1x * this.s.size();
      this.u = ffn.a(this.p, this.r, $$2);
      int $$3 = this.u.a() * 9;
      this.v = (int)((double)this.o / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.v + $$3 + 9 * 2;
      int $$5 = (int)((double)this.n / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.s.iterator(); var6.hasNext(); $$5 += $$1x) {
         fkz.a $$6 = (fkz.a)var6.next();
         this.c(feu.a($$6.a, $$6.b).a($$5, $$4, this.w, 20).a());
      }
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.v - 9 * 2, -1);
      this.u.a($$0, this.n / 2, this.v);
   }

   @Override
   public boolean aD_() {
      return false;
   }

   public static final class a {
      final ws a;
      final feu.c b;

      public a(ws $$0, feu.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
