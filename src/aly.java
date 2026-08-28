import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record aly(List<aly.a> d) {
   public static final aly a = new aly(List.of());
   public static final yw<ByteBuf, Either<aly.b, wy>> b = yu.a(aly.b.k, xa.f);
   public static final yw<ByteBuf, List<aly.c>> c = aly.c.a.a(yu.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<aly.a> a(aly.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<aly.c> b() {
      return this.d.stream().map($$0 -> new aly.c($$0.a, $$0.b.toString())).toList();
   }

   public List<aly.a> c() {
      return this.d;
   }

   public static record a(Either<aly.b, wy> a, URI b) {

      public static aly.a a(aly.b $$0, URI $$1) {
         return new aly.a(Either.left($$0), $$1);
      }

      public static aly.a a(wy $$0, URI $$1) {
         return new aly.a(Either.right($$0), $$1);
      }

      public wy a() {
         return (wy)this.a.map(aly.b::a, $$0 -> $$0);
      }

      public Either<aly.b, wy> b() {
         return this.a;
      }

      public URI c() {
         return this.b;
      }
   }

   public static enum b {
      a(0, "report_bug"),
      b(1, "community_guidelines"),
      c(2, "support"),
      d(3, "status"),
      e(4, "feedback"),
      f(5, "community"),
      g(6, "website"),
      h(7, "forums"),
      i(8, "news"),
      j(9, "announcements");

      private static final IntFunction<aly.b> l = ayc.a($$0 -> $$0.m, values(), ayc.a.a);
      public static final yw<ByteBuf, aly.b> k = yu.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private wy a() {
         return wy.c("known_server_link." + this.n);
      }

      public aly.a a(URI $$0) {
         return aly.a.a(this, $$0);
      }
   }

   public static record c(Either<aly.b, wy> b, String c) {
      public static final yw<ByteBuf, aly.c> a = yw.a(aly.b, aly.c::a, yu.o, aly.c::b, aly.c::new);

      public Either<aly.b, wy> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
