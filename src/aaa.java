import io.netty.buffer.ByteBuf;

public class aaa<B extends ByteBuf, L extends wv> {
   private final zm.a<B, zw<? super L>, zy<? extends zw<? super L>>> a = zm.a(zw::a);
   private final zx b;

   public aaa(zx $$0) {
      this.b = $$0;
   }

   public <T extends zw<? super L>> aaa<B, L> a(zy<T> $$0, zn<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zn<B, zw<? super L>> a() {
      return this.a.a();
   }
}
