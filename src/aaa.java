import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class aaa<T extends wu, B extends ByteBuf> {
   private final wk a;
   private final zw b;
   private final List<aaa.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zu d;

   public aaa(wk $$0, zw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zv<? super T>> aaa<T, B> a(zx<P> $$0, zm<? super B, P> $$1) {
      this.c.add(new aaa.a<>($$0, $$1));
      return this;
   }

   public <P extends zt<? super T>, D extends zs<? super T>> aaa<T, B> a(zx<P> $$0, Function<Iterable<zv<? super T>>, P> $$1, D $$2) {
      zm<ByteBuf, D> $$3 = zm.a($$2);
      zx<D> $$4 = (zx<D>)$$2.a();
      this.c.add(new aaa.a<>($$4, $$3));
      this.d = zu.a($$0, $$1, $$2);
      return this;
   }

   private zm<ByteBuf, zv<? super T>> a(Function<ByteBuf, B> $$0, List<aaa.a<T, ?, B>> $$1) {
      zz<ByteBuf, T> $$2 = new zz<>(this.b);

      for (aaa.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public ww<T> a(Function<ByteBuf, B> $$0) {
      return new aaa.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public ww.a<T, B> a() {
      List<aaa.a<T, ?, B>> $$0 = List.copyOf(this.c);
      zu $$1 = this.d;
      return $$2 -> new aaa.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends wu> ww<L> a(wk $$0, zw $$1, Consumer<aaa<L, wl>> $$2) {
      aaa<L, wl> $$3 = new aaa<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(wl::new);
   }

   public static <T extends xa> ww<T> a(wk $$0, Consumer<aaa<T, wl>> $$1) {
      return a($$0, zw.a, $$1);
   }

   public static <T extends wg> ww<T> b(wk $$0, Consumer<aaa<T, wl>> $$1) {
      return a($$0, zw.b, $$1);
   }

   private static <L extends wu, B extends ByteBuf> ww.a<L, B> b(wk $$0, zw $$1, Consumer<aaa<L, B>> $$2) {
      aaa<L, B> $$3 = new aaa<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends xa, B extends ByteBuf> ww.a<T, B> c(wk $$0, Consumer<aaa<T, B>> $$1) {
      return b($$0, zw.a, $$1);
   }

   public static <T extends wg, B extends ByteBuf> ww.a<T, B> d(wk $$0, Consumer<aaa<T, B>> $$1) {
      return b($$0, zw.b, $$1);
   }

   static record a<T extends wu, P extends zv<? super T>, B extends ByteBuf>(zx<P> a, zm<? super B, P> b) {
      public void a(zz<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zm<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wu>(wk a, zw b, zm<ByteBuf, zv<? super L>> c, @Nullable zu d) implements ww<L> {
   }
}
