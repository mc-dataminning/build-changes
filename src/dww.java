import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class dww<T> implements dxe<T> {
   private final jt<T> a;
   private final ayc<T> b;
   private final dxf<T> c;
   private final int d;

   public dww(jt<T> $$0, int $$1, dxf<T> $$2, List<T> $$3) {
      this($$0, $$1, $$2);
      $$3.forEach(this.b::d);
   }

   public dww(jt<T> $$0, int $$1, dxf<T> $$2) {
      this($$0, $$1, $$2, ayc.c(1 << $$1));
   }

   private dww(jt<T> $$0, int $$1, dxf<T> $$2, ayc<T> $$3) {
      this.a = $$0;
      this.d = $$1;
      this.c = $$2;
      this.b = $$3;
   }

   public static <A> dxe<A> a(int $$0, jt<A> $$1, dxf<A> $$2, List<A> $$3) {
      return new dww<>($$1, $$0, $$2, $$3);
   }

   @Override
   public int a(T $$0) {
      int $$1 = this.b.a($$0);
      if ($$1 == -1) {
         $$1 = this.b.d($$0);
         if ($$1 >= 1 << this.d) {
            $$1 = this.c.onResize(this.d + 1, $$0);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(Predicate<T> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         if ($$0.test(this.b.a($$1))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public T a(int $$0) {
      T $$1 = this.b.a($$0);
      if ($$1 == null) {
         throw new dxd($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(wb $$0) {
      this.b.a();
      int $$1 = $$0.l();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         this.b.d(this.a.b($$0.l()));
      }
   }

   @Override
   public void b(wb $$0) {
      int $$1 = this.b();
      $$0.c($$1);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         $$0.c(this.a.a(this.b.a($$2)));
      }
   }

   @Override
   public int a() {
      int $$0 = wv.a(this.b());

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         $$0 += wv.a(this.a.a(this.b.a($$1)));
      }

      return $$0;
   }

   public List<T> c() {
      ArrayList<T> $$0 = new ArrayList<>();
      this.b.iterator().forEachRemaining($$0::add);
      return $$0;
   }

   @Override
   public int b() {
      return this.b.d();
   }

   @Override
   public dxe<T> a(dxf<T> $$0) {
      return new dww<>(this.a, this.d, $$0, this.b.b());
   }
}
