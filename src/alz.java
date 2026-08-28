import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alz(List<alz.a> d) {
   public static final alz a = new alz(List.of());
   public static final zf<ByteBuf, Either<alz.b, xh>> b = zd.a(alz.b.k, xj.f);
   public static final zf<ByteBuf, List<alz.c>> c = alz.c.a.a(zd.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<alz.a> a(alz.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<alz.c> b() {
      return this.d.stream().map($$0 -> new alz.c($$0.a, $$0.b.toString())).toList();
   }

   public List<alz.a> c() {
      return this.d;
   }

   public static record a(Either<alz.b, xh> a, URI b) {

      public static alz.a a(alz.b $$0, URI $$1) {
         return new alz.a(Either.left($$0), $$1);
      }

      public static alz.a a(xh $$0, URI $$1) {
         return new alz.a(Either.right($$0), $$1);
      }

      public xh a() {
         return (xh)this.a.map(alz.b::a, $$0 -> $$0);
      }

      public Either<alz.b, xh> b() {
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

      private static final IntFunction<alz.b> l = aya.a($$0 -> $$0.m, values(), aya.a.a);
      public static final zf<ByteBuf, alz.b> k = zd.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xh a() {
         return xh.c("known_server_link." + this.n);
      }

      public alz.a a(URI $$0) {
         return alz.a.a(this, $$0);
      }
   }

   public static record c(Either<alz.b, xh> b, String c) {
      public static final zf<ByteBuf, alz.c> a = zf.a(alz.b, alz.c::a, zd.m, alz.c::b, alz.c::new);

      public Either<alz.b, xh> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
