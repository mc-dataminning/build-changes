import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fdf extends fcz {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final vf k;
   private final vk l;
   private final ImmutableList<fdf.a> m;
   private exx n = exx.a;
   private int o;
   private int p;

   protected fdf(vf $$0, List<vf> $$1, ImmutableList<fdf.a> $$2) {
      super($$0);
      this.l = vk.a($$1);
      this.k = ve.a($$0, vi.a($$1, ve.a));
      this.m = $$2;
   }

   @Override
   public vf h() {
      return this.k;
   }

   @Override
   public void aN_() {
      UnmodifiableIterator $$1 = this.m.iterator();

      while ($$1.hasNext()) {
         fdf.a $$0 = (fdf.a)$$1.next();
         this.p = Math.max(this.p, 20 + this.i.a($$0.a) + 20);
      }

      int $$1x = 5 + this.p + 5;
      int $$2 = $$1x * this.m.size();
      this.n = exx.a(this.i, this.l, $$2);
      int $$3 = this.n.a() * 9;
      this.o = (int)((double)this.h / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.o + $$3 + 9 * 2;
      int $$5 = (int)((double)this.g / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.m.iterator(); var6.hasNext(); $$5 += $$1x) {
         fdf.a $$6 = (fdf.a)var6.next();
         this.d(exe.a($$6.a, $$6.b).a($$5, $$4, this.p, 20).a());
      }
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.o - 9 * 2, -1);
      this.n.a($$0, this.g / 2, this.o);
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public boolean aL_() {
      return false;
   }

   public static final class a {
      final vf a;
      final exe.c b;

      public a(vf $$0, exe.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
