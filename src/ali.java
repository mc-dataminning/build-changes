import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record ali(List<ali.a> c) {
   public static final ali a = new ali(List.of());
   public static final yw<ByteBuf, ali> b = yw.a(ali.a.b.a(yu.a()), ali::b, ali::new);

   public boolean a() {
      return this.c.isEmpty();
   }

   public Optional<ali.a> a(ali.b $$0) {
      return this.c.stream().filter($$1 -> (Boolean)$$1.c.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<ali.a> b() {
      return this.c;
   }

   public static record a(Either<ali.b, wy> c, String d) {
      public static final yw<ByteBuf, Either<ali.b, wy>> a = yu.a(ali.b.b, xa.f);
      public static final yw<ByteBuf, ali.a> b = yw.a(a, ali.a::b, yu.l, ali.a::c, ali.a::new);

      public static ali.a a(ali.b $$0, String $$1) {
         return new ali.a(Either.left($$0), $$1);
      }

      public static ali.a a(wy $$0, String $$1) {
         return new ali.a(Either.right($$0), $$1);
      }

      public wy a() {
         return (wy)this.c.map(ali.b::a, $$0 -> $$0);
      }

      public Either<ali.b, wy> b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum b {
      a(0, "report_bug");

      private static final IntFunction<ali.b> c = axd.a($$0 -> $$0.d, values(), axd.a.a);
      public static final yw<ByteBuf, ali.b> b = yu.a(c, $$0 -> $$0.d);
      private final int d;
      private final String e;

      private b(final int $$0, final String $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      private wy a() {
         return wy.c("known_server_link." + this.e);
      }

      public ali.a a(String $$0) {
         return ali.a.a(this, $$0);
      }
   }
}
