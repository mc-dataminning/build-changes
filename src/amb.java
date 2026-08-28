import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record amb(List<amb.a> d) {
   public static final amb a = new amb(List.of());
   public static final zh<ByteBuf, Either<amb.b, xj>> b = zf.a(amb.b.k, xl.f);
   public static final zh<ByteBuf, List<amb.c>> c = amb.c.a.a(zf.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<amb.a> a(amb.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<amb.c> b() {
      return this.d.stream().map($$0 -> new amb.c($$0.a, $$0.b.toString())).toList();
   }

   public List<amb.a> c() {
      return this.d;
   }

   public static record a(Either<amb.b, xj> a, URI b) {

      public static amb.a a(amb.b $$0, URI $$1) {
         return new amb.a(Either.left($$0), $$1);
      }

      public static amb.a a(xj $$0, URI $$1) {
         return new amb.a(Either.right($$0), $$1);
      }

      public xj a() {
         return (xj)this.a.map(amb.b::a, $$0 -> $$0);
      }

      public Either<amb.b, xj> b() {
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

      private static final IntFunction<amb.b> l = ayd.a($$0 -> $$0.m, values(), ayd.a.a);
      public static final zh<ByteBuf, amb.b> k = zf.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xj a() {
         return xj.c("known_server_link." + this.n);
      }

      public amb.a a(URI $$0) {
         return amb.a.a(this, $$0);
      }
   }

   public static record c(Either<amb.b, xj> b, String c) {
      public static final zh<ByteBuf, amb.c> a = zh.a(amb.b, amb.c::a, zf.n, amb.c::b, amb.c::new);

      public Either<amb.b, xj> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
