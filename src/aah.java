import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class aah<T extends xb, B extends ByteBuf> {
   final wq a;
   final aad b;
   private final List<aah.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private aab d;

   public aah(wq $$0, aad $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends aac<? super T>> aah<T, B> a(aae<P> $$0, zt<? super B, P> $$1) {
      this.c.add(new aah.a<>($$0, $$1));
      return this;
   }

   public <P extends aaa<? super T>, D extends zz<? super T>> aah<T, B> a(aae<P> $$0, Function<Iterable<aac<? super T>>, P> $$1, D $$2) {
      zt<ByteBuf, D> $$3 = zt.a($$2);
      aae<D> $$4 = (aae<D>)$$2.a();
      this.c.add(new aah.a<>($$4, $$3));
      this.d = aab.a($$0, $$1, $$2);
      return this;
   }

   zt<ByteBuf, aac<? super T>> a(Function<ByteBuf, B> $$0, List<aah.a<T, ?, B>> $$1) {
      aag<ByteBuf, T> $$2 = new aag<>(this.b);

      for (aah.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public xd<T> a(Function<ByteBuf, B> $$0) {
      return new aah.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public xd.a<T, B> a() {
      final List<aah.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final aab $$1 = this.d;
      return new xd.a<T, B>() {
         @Override
         public xd<T> a(Function<ByteBuf, B> $$0x) {
            return new aah.b<>(aah.this.a, aah.this.b, aah.this.a($$0, $$0), $$1);
         }

         @Override
         public wq a() {
            return aah.this.a;
         }

         @Override
         public aad b() {
            return aah.this.b;
         }

         @Override
         public void a(xd.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               aah.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends xb, B extends ByteBuf> xd.a<L, B> a(wq $$0, aad $$1, Consumer<aah<L, B>> $$2) {
      aah<L, B> $$3 = new aah<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends xh, B extends ByteBuf> xd.a<T, B> a(wq $$0, Consumer<aah<T, B>> $$1) {
      return a($$0, aad.a, $$1);
   }

   public static <T extends wm, B extends ByteBuf> xd.a<T, B> b(wq $$0, Consumer<aah<T, B>> $$1) {
      return a($$0, aad.b, $$1);
   }

   static record a<T extends xb, P extends aac<? super T>, B extends ByteBuf>(aae<P> a, zt<? super B, P> b) {

      public void a(aag<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zt<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends xb>(wq a, aad b, zt<ByteBuf, aac<? super L>> c, @Nullable aab d) implements xd<L> {
   }
}
