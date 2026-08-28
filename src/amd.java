import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record amd(List<amd.a> d) {
   public static final amd a = new amd(List.of());
   public static final zj<ByteBuf, Either<amd.b, xl>> b = zh.a(amd.b.k, xn.f);
   public static final zj<ByteBuf, List<amd.c>> c = amd.c.a.a(zh.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<amd.a> a(amd.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<amd.c> b() {
      return this.d.stream().map($$0 -> new amd.c($$0.a, $$0.b.toString())).toList();
   }

   public List<amd.a> c() {
      return this.d;
   }

   public static record a(Either<amd.b, xl> a, URI b) {

      public static amd.a a(amd.b $$0, URI $$1) {
         return new amd.a(Either.left($$0), $$1);
      }

      public static amd.a a(xl $$0, URI $$1) {
         return new amd.a(Either.right($$0), $$1);
      }

      public xl a() {
         return (xl)this.a.map(amd.b::a, $$0 -> $$0);
      }

      public Either<amd.b, xl> b() {
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

      private static final IntFunction<amd.b> l = aye.a($$0 -> $$0.m, values(), aye.a.a);
      public static final zj<ByteBuf, amd.b> k = zh.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xl a() {
         return xl.c("known_server_link." + this.n);
      }

      public amd.a a(URI $$0) {
         return amd.a.a(this, $$0);
      }
   }

   public static record c(Either<amd.b, xl> b, String c) {
      public static final zj<ByteBuf, amd.c> a = zj.a(amd.b, amd.c::a, zh.m, amd.c::b, amd.c::new);

      public Either<amd.b, xl> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
