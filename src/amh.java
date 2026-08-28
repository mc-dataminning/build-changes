import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record amh(List<amh.a> d) {
   public static final amh a = new amh(List.of());
   public static final zi<ByteBuf, Either<amh.b, xk>> b = zg.a(amh.b.k, xm.f);
   public static final zi<ByteBuf, List<amh.c>> c = amh.c.a.a(zg.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<amh.a> a(amh.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<amh.c> b() {
      return this.d.stream().map($$0 -> new amh.c($$0.a, $$0.b.toString())).toList();
   }

   public List<amh.a> c() {
      return this.d;
   }

   public static record a(Either<amh.b, xk> a, URI b) {

      public static amh.a a(amh.b $$0, URI $$1) {
         return new amh.a(Either.left($$0), $$1);
      }

      public static amh.a a(xk $$0, URI $$1) {
         return new amh.a(Either.right($$0), $$1);
      }

      public xk a() {
         return (xk)this.a.map(amh.b::a, $$0 -> $$0);
      }

      public Either<amh.b, xk> b() {
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

      private static final IntFunction<amh.b> l = ayl.a($$0 -> $$0.m, values(), ayl.a.a);
      public static final zi<ByteBuf, amh.b> k = zg.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xk a() {
         return xk.c("known_server_link." + this.n);
      }

      public amh.a a(URI $$0) {
         return amh.a.a(this, $$0);
      }
   }

   public static record c(Either<amh.b, xk> b, String c) {
      public static final zi<ByteBuf, amh.c> a = zi.a(amh.b, amh.c::a, zg.o, amh.c::b, amh.c::new);

      public Either<amh.b, xk> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
