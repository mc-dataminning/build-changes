import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record ama(List<ama.a> d) {
   public static final ama a = new ama(List.of());
   public static final zg<ByteBuf, Either<ama.b, xi>> b = ze.a(ama.b.k, xk.f);
   public static final zg<ByteBuf, List<ama.c>> c = ama.c.a.a(ze.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<ama.a> a(ama.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<ama.c> b() {
      return this.d.stream().map($$0 -> new ama.c($$0.a, $$0.b.toString())).toList();
   }

   public List<ama.a> c() {
      return this.d;
   }

   public static record a(Either<ama.b, xi> a, URI b) {

      public static ama.a a(ama.b $$0, URI $$1) {
         return new ama.a(Either.left($$0), $$1);
      }

      public static ama.a a(xi $$0, URI $$1) {
         return new ama.a(Either.right($$0), $$1);
      }

      public xi a() {
         return (xi)this.a.map(ama.b::a, $$0 -> $$0);
      }

      public Either<ama.b, xi> b() {
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

      private static final IntFunction<ama.b> l = ayb.a($$0 -> $$0.m, values(), ayb.a.a);
      public static final zg<ByteBuf, ama.b> k = ze.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xi a() {
         return xi.c("known_server_link." + this.n);
      }

      public ama.a a(URI $$0) {
         return ama.a.a(this, $$0);
      }
   }

   public static record c(Either<ama.b, xi> b, String c) {
      public static final zg<ByteBuf, ama.c> a = zg.a(ama.b, ama.c::a, ze.m, ama.c::b, ama.c::new);

      public Either<ama.b, xi> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
