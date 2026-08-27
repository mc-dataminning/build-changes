import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fbf extends faz {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final uv k;
   private final va l;
   private final ImmutableList<fbf.a> m;
   private evx n = evx.a;
   private int o;
   private int p;

   protected fbf(uv $$0, List<uv> $$1, ImmutableList<fbf.a> $$2) {
      super($$0);
      this.l = va.a($$1);
      this.k = uu.a($$0, uy.a($$1, uu.a));
      this.m = $$2;
   }

   @Override
   public uv h() {
      return this.k;
   }

   @Override
   public void aQ_() {
      UnmodifiableIterator $$1 = this.m.iterator();

      while ($$1.hasNext()) {
         fbf.a $$0 = (fbf.a)$$1.next();
         this.p = Math.max(this.p, 20 + this.i.a($$0.a) + 20);
      }

      int $$1x = 5 + this.p + 5;
      int $$2 = $$1x * this.m.size();
      this.n = evx.a(this.i, this.l, $$2);
      int $$3 = this.n.a() * 9;
      this.o = (int)((double)this.h / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.o + $$3 + 9 * 2;
      int $$5 = (int)((double)this.g / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.m.iterator(); var6.hasNext(); $$5 += $$1x) {
         fbf.a $$6 = (fbf.a)var6.next();
         this.d(eve.a($$6.a, $$6.b).a($$5, $$4, this.p, 20).a());
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.o - 9 * 2, -1);
      this.n.a($$0, this.g / 2, this.o);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public boolean aF_() {
      return false;
   }

   public static final class a {
      final uv a;
      final eve.c b;

      public a(uv $$0, eve.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
