import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record amr(List<amr.a> d) {
   public static final amr a = new amr(List.of());
   public static final zt<ByteBuf, Either<amr.b, xv>> b = zr.a(amr.b.k, xx.f);
   public static final zt<ByteBuf, List<amr.c>> c = amr.c.a.a(zr.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<amr.a> a(amr.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<amr.c> b() {
      return this.d.stream().map($$0 -> new amr.c($$0.a, $$0.b.toString())).toList();
   }

   public List<amr.a> c() {
      return this.d;
   }

   public static record a(Either<amr.b, xv> a, URI b) {

      public static amr.a a(amr.b $$0, URI $$1) {
         return new amr.a(Either.left($$0), $$1);
      }

      public static amr.a a(xv $$0, URI $$1) {
         return new amr.a(Either.right($$0), $$1);
      }

      public xv a() {
         return (xv)this.a.map(amr.b::a, $$0 -> $$0);
      }

      public Either<amr.b, xv> b() {
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

      private static final IntFunction<amr.b> l = ayv.a($$0 -> $$0.m, values(), ayv.a.a);
      public static final zt<ByteBuf, amr.b> k = zr.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xv a() {
         return xv.c("known_server_link." + this.n);
      }

      public amr.a a(URI $$0) {
         return amr.a.a(this, $$0);
      }
   }

   public static record c(Either<amr.b, xv> b, String c) {
      public static final zt<ByteBuf, amr.c> a = zt.a(amr.b, amr.c::a, zr.o, amr.c::b, amr.c::new);

      public Either<amr.b, xv> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
