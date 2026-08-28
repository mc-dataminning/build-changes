import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record amj(List<amj.a> d) {
   public static final amj a = new amj(List.of());
   public static final ze<ByteBuf, Either<amj.b, xg>> b = zc.a(amj.b.k, xi.f);
   public static final ze<ByteBuf, List<amj.c>> c = amj.c.a.a(zc.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<amj.a> a(amj.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<amj.c> b() {
      return this.d.stream().map($$0 -> new amj.c($$0.a, $$0.b.toString())).toList();
   }

   public List<amj.a> c() {
      return this.d;
   }

   public static record a(Either<amj.b, xg> a, URI b) {

      public static amj.a a(amj.b $$0, URI $$1) {
         return new amj.a(Either.left($$0), $$1);
      }

      public static amj.a a(xg $$0, URI $$1) {
         return new amj.a(Either.right($$0), $$1);
      }

      public xg a() {
         return (xg)this.a.map(amj.b::a, $$0 -> $$0);
      }

      public Either<amj.b, xg> b() {
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

      private static final IntFunction<amj.b> l = ayo.a($$0 -> $$0.m, values(), ayo.a.a);
      public static final ze<ByteBuf, amj.b> k = zc.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xg a() {
         return xg.c("known_server_link." + this.n);
      }

      public amj.a a(URI $$0) {
         return amj.a.a(this, $$0);
      }
   }

   public static record c(Either<amj.b, xg> b, String c) {
      public static final ze<ByteBuf, amj.c> a = ze.a(amj.b, amj.c::a, zc.p, amj.c::b, amj.c::new);

      public Either<amj.b, xg> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
