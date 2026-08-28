import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fix {
   private final List<fix.d<?>> a = new ArrayList<>();
   private final List<fix.a<?>> b = new ArrayList<>();
   private final List<fix.e> c = new ArrayList<>();

   public fiy a(String $$0) {
      fix.e $$1 = new fix.e(this.c.size(), $$0);
      this.c.add($$1);
      return $$1;
   }

   public <T> fkr<T> a(String $$0, T $$1) {
      fix.a<T> $$2 = new fix.a<>($$0, null, $$1);
      this.b.add($$2);
      return $$2.b;
   }

   public <T> fkr<T> a(String $$0, fkq<T> $$1) {
      return this.a($$0, $$1, null).b;
   }

   <T> fix.d<T> a(String $$0, fkq<T> $$1, @Nullable fix.e $$2) {
      int $$3 = this.a.size();
      fix.d<T> $$4 = new fix.d<>($$3, $$0, $$2, $$1);
      this.a.add($$4);
      return $$4;
   }

   public void a(fko $$0) {
      this.a($$0, fix.c.a);
   }

   public void a(fko $$0, fix.c $$1) {
      BitSet $$2 = this.a();
      List<fix.e> $$3 = new ArrayList<>($$2.cardinality());
      BitSet $$4 = new BitSet(this.c.size());

      for (fix.e $$5 : this.c) {
         this.a($$5, $$2, $$4, $$3);
      }

      this.a($$3);

      for (fix.e $$6 : $$3) {
         for (fix.d<?> $$7 : $$6.h) {
            $$1.a($$7.a);
            $$7.a($$0);
         }

         $$1.c($$6.c);
         $$6.g.run();
         $$1.d($$6.c);

         for (int $$8 = $$6.i.nextSetBit(0); $$8 >= 0; $$8 = $$6.i.nextSetBit($$8 + 1)) {
            fix.d<?> $$9 = this.a.get($$8);
            $$1.b($$9.a);
            $$9.b($$0);
         }
      }
   }

   private BitSet a() {
      Deque<fix.e> $$0 = new ArrayDeque<>(this.c.size());
      BitSet $$1 = new BitSet(this.c.size());

      for (fix.f<?> $$2 : this.b) {
         fix.e $$3 = $$2.b.d;
         if ($$3 != null) {
            this.a($$3, $$1, $$0);
         }
      }

      for (fix.e $$4 : this.c) {
         if ($$4.j) {
            this.a($$4, $$1, $$0);
         }
      }

      return $$1;
   }

   private void a(fix.e $$0, BitSet $$1, Deque<fix.e> $$2) {
      $$2.add($$0);

      while (!$$2.isEmpty()) {
         fix.e $$3 = $$2.poll();
         if (!$$1.get($$3.b)) {
            $$1.set($$3.b);

            for (int $$4 = $$3.f.nextSetBit(0); $$4 >= 0; $$4 = $$3.f.nextSetBit($$4 + 1)) {
               $$2.add(this.c.get($$4));
            }
         }
      }
   }

   private void a(fix.e $$0, BitSet $$1, BitSet $$2, List<fix.e> $$3) {
      if ($$2.get($$0.b)) {
         String $$4 = $$2.stream().mapToObj($$0x -> this.c.get($$0x).c).collect(Collectors.joining(", "));
         throw new IllegalStateException("Frame graph cycle detected between " + $$4);
      } else if ($$1.get($$0.b)) {
         $$2.set($$0.b);
         $$1.clear($$0.b);

         for (int $$5 = $$0.f.nextSetBit(0); $$5 >= 0; $$5 = $$0.f.nextSetBit($$5 + 1)) {
            this.a(this.c.get($$5), $$1, $$2, $$3);
         }

         for (fix.b<?> $$6 : $$0.d) {
            for (int $$7 = $$6.e.nextSetBit(0); $$7 >= 0; $$7 = $$6.e.nextSetBit($$7 + 1)) {
               if ($$7 != $$0.b) {
                  this.a(this.c.get($$7), $$1, $$2, $$3);
               }
            }
         }

         $$3.add($$0);
         $$2.clear($$0.b);
      }
   }

   private void a(Collection<fix.e> $$0) {
      fix.e[] $$1 = new fix.e[this.a.size()];

      for (fix.e $$2 : $$0) {
         for (int $$3 = $$2.e.nextSetBit(0); $$3 >= 0; $$3 = $$2.e.nextSetBit($$3 + 1)) {
            fix.d<?> $$4 = this.a.get($$3);
            fix.e $$5 = $$1[$$3];
            $$1[$$3] = $$2;
            if ($$5 == null) {
               $$2.h.add($$4);
            } else {
               $$5.i.clear($$3);
            }

            $$2.i.set($$3);
         }
      }
   }

   static class a<T> extends fix.f<T> {
      private final T c;

      public a(String $$0, @Nullable fix.e $$1, T $$2) {
         super($$0, $$1);
         this.c = $$2;
      }

      @Override
      public T a() {
         return this.c;
      }
   }

   static class b<T> implements fkr<T> {
      final fix.f<T> b;
      private final int c;
      @Nullable
      final fix.e d;
      final BitSet e = new BitSet();
      @Nullable
      private fix.b<T> f;

      b(fix.f<T> $$0, int $$1, @Nullable fix.e $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public T get() {
         return this.b.a();
      }

      fix.b<T> a(fix.e $$0) {
         if (this.b.b != this) {
            throw new IllegalStateException("Handle " + this + " is no longer valid, as its contents were moved into " + this.f);
         } else {
            fix.b<T> $$1 = new fix.b<>(this.b, this.c + 1, $$0);
            this.b.b = $$1;
            this.f = $$1;
            return $$1;
         }
      }

      @Override
      public String toString() {
         return this.d != null ? this.b + "#" + this.c + " (from " + this.d + ")" : this.b + "#" + this.c;
      }
   }

   public interface c {
      fix.c a = new fix.c() {
      };

      default void a(String $$0) {
      }

      default void b(String $$0) {
      }

      default void c(String $$0) {
      }

      default void d(String $$0) {
      }
   }

   static class d<T> extends fix.f<T> {
      final int c;
      private final fkq<T> d;
      @Nullable
      private T e;

      public d(int $$0, String $$1, @Nullable fix.e $$2, fkq<T> $$3) {
         super($$1, $$2);
         this.c = $$0;
         this.d = $$3;
      }

      @Override
      public T a() {
         return Objects.requireNonNull(this.e, "Resource is not currently available");
      }

      public void a(fko $$0) {
         if (this.e != null) {
            throw new IllegalStateException("Tried to acquire physical resource, but it was already assigned");
         } else {
            this.e = $$0.a(this.d);
         }
      }

      public void b(fko $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Tried to release physical resource that was not allocated");
         } else {
            $$0.a(this.d, this.e);
            this.e = null;
         }
      }
   }

   class e implements fiy {
      final int b;
      final String c;
      final List<fix.b<?>> d = new ArrayList<>();
      final BitSet e = new BitSet();
      final BitSet f = new BitSet();
      Runnable g = () -> {
      };
      final List<fix.d<?>> h = new ArrayList<>();
      final BitSet i = new BitSet();
      boolean j;

      public e(final int $$0, final String $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      private <T> void a(fix.b<T> $$0) {
         if ($$0.b instanceof fix.d<?> $$1) {
            this.e.set($$1.c);
         }
      }

      private void a(fix.e $$0) {
         this.f.set($$0.b);
      }

      @Override
      public <T> fkr<T> a(String $$0, fkq<T> $$1) {
         fix.d<T> $$2 = fix.this.a($$0, $$1, this);
         this.e.set($$2.c);
         return $$2.b;
      }

      @Override
      public <T> void a(fkr<T> $$0) {
         this.b((fix.b<T>)$$0);
      }

      private <T> void b(fix.b<T> $$0) {
         this.a($$0);
         if ($$0.d != null) {
            this.a($$0.d);
         }

         $$0.e.set(this.b);
      }

      @Override
      public <T> fkr<T> b(fkr<T> $$0) {
         return this.c((fix.b<T>)$$0);
      }

      @Override
      public void a(fiy $$0) {
         this.f.set(((fix.e)$$0).b);
      }

      @Override
      public void a() {
         this.j = true;
      }

      private <T> fix.b<T> c(fix.b<T> $$0) {
         this.d.add($$0);
         this.b($$0);
         return $$0.a(this);
      }

      @Override
      public void a(Runnable $$0) {
         this.g = $$0;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }

   abstract static class f<T> {
      public final String a;
      public fix.b<T> b;

      public f(String $$0, @Nullable fix.e $$1) {
         this.a = $$0;
         this.b = new fix.b<>(this, 0, $$1);
      }

      public abstract T a();

      @Override
      public String toString() {
         return this.a;
      }
   }
}
