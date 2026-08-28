import io.netty.buffer.ByteBuf;

public class aag<B extends ByteBuf, L extends xb> {
   private final zs.a<B, aac<? super L>, aae<? extends aac<? super L>>> a = zs.a(aac::a);
   private final aad b;

   public aag(aad $$0) {
      this.b = $$0;
   }

   public <T extends aac<? super L>> aag<B, L> a(aae<T> $$0, zt<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zt<B, aac<? super L>> a() {
      return this.a.a();
   }
}
