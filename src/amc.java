import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record amc(List<amc.a> d) {
   public static final amc a = new amc(List.of());
   public static final za<ByteBuf, Either<amc.b, xc>> b = yy.a(amc.b.k, xe.f);
   public static final za<ByteBuf, List<amc.c>> c = amc.c.a.a(yy.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<amc.a> a(amc.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<amc.c> b() {
      return this.d.stream().map($$0 -> new amc.c($$0.a, $$0.b.toString())).toList();
   }

   public List<amc.a> c() {
      return this.d;
   }

   public static record a(Either<amc.b, xc> a, URI b) {

      public static amc.a a(amc.b $$0, URI $$1) {
         return new amc.a(Either.left($$0), $$1);
      }

      public static amc.a a(xc $$0, URI $$1) {
         return new amc.a(Either.right($$0), $$1);
      }

      public xc a() {
         return (xc)this.a.map(amc.b::a, $$0 -> $$0);
      }

      public Either<amc.b, xc> b() {
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

      private static final IntFunction<amc.b> l = ayg.a($$0 -> $$0.m, values(), ayg.a.a);
      public static final za<ByteBuf, amc.b> k = yy.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xc a() {
         return xc.c("known_server_link." + this.n);
      }

      public amc.a a(URI $$0) {
         return amc.a.a(this, $$0);
      }
   }

   public static record c(Either<amc.b, xc> b, String c) {
      public static final za<ByteBuf, amc.c> a = za.a(amc.b, amc.c::a, yy.p, amc.c::b, amc.c::new);

      public Either<amc.b, xc> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
