import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class aab<T extends wv, B extends ByteBuf> {
   private final wl a;
   private final zx b;
   private final List<aab.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zv d;

   public aab(wl $$0, zx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zw<? super T>> aab<T, B> a(zy<P> $$0, zn<? super B, P> $$1) {
      this.c.add(new aab.a<>($$0, $$1));
      return this;
   }

   public <P extends zu<? super T>, D extends zt<? super T>> aab<T, B> a(zy<P> $$0, Function<Iterable<zw<? super T>>, P> $$1, D $$2) {
      zn<ByteBuf, D> $$3 = zn.a($$2);
      zy<D> $$4 = (zy<D>)$$2.a();
      this.c.add(new aab.a<>($$4, $$3));
      this.d = zv.a($$0, $$1, $$2);
      return this;
   }

   private zn<ByteBuf, zw<? super T>> a(Function<ByteBuf, B> $$0, List<aab.a<T, ?, B>> $$1) {
      aaa<ByteBuf, T> $$2 = new aaa<>(this.b);

      for (aab.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wx<T> a(Function<ByteBuf, B> $$0) {
      return new aab.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wx.a<T, B> a() {
      List<aab.a<T, ?, B>> $$0 = List.copyOf(this.c);
      zv $$1 = this.d;
      return $$2 -> new aab.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends wv> wx<L> a(wl $$0, zx $$1, Consumer<aab<L, wm>> $$2) {
      aab<L, wm> $$3 = new aab<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(wm::new);
   }

   public static <T extends xb> wx<T> a(wl $$0, Consumer<aab<T, wm>> $$1) {
      return a($$0, zx.a, $$1);
   }

   public static <T extends wh> wx<T> b(wl $$0, Consumer<aab<T, wm>> $$1) {
      return a($$0, zx.b, $$1);
   }

   private static <L extends wv, B extends ByteBuf> wx.a<L, B> b(wl $$0, zx $$1, Consumer<aab<L, B>> $$2) {
      aab<L, B> $$3 = new aab<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends xb, B extends ByteBuf> wx.a<T, B> c(wl $$0, Consumer<aab<T, B>> $$1) {
      return b($$0, zx.a, $$1);
   }

   public static <T extends wh, B extends ByteBuf> wx.a<T, B> d(wl $$0, Consumer<aab<T, B>> $$1) {
      return b($$0, zx.b, $$1);
   }

   static record a<T extends wv, P extends zw<? super T>, B extends ByteBuf>(zy<P> a, zn<? super B, P> b) {
      public void a(aaa<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zn<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wv>(wl a, zx b, zn<ByteBuf, zw<? super L>> c, @Nullable zv d) implements wx<L> {
   }
}
