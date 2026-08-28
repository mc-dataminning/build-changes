import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alt(List<alt.a> d) {
   public static final alt a = new alt(List.of());
   public static final zb<ByteBuf, Either<alt.b, xd>> b = yz.a(alt.b.k, xf.f);
   public static final zb<ByteBuf, List<alt.c>> c = alt.c.a.a(yz.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<alt.a> a(alt.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<alt.c> b() {
      return this.d.stream().map($$0 -> new alt.c($$0.a, $$0.b.toString())).toList();
   }

   public List<alt.a> c() {
      return this.d;
   }

   public static record a(Either<alt.b, xd> a, URI b) {

      public static alt.a a(alt.b $$0, URI $$1) {
         return new alt.a(Either.left($$0), $$1);
      }

      public static alt.a a(xd $$0, URI $$1) {
         return new alt.a(Either.right($$0), $$1);
      }

      public xd a() {
         return (xd)this.a.map(alt.b::a, $$0 -> $$0);
      }

      public Either<alt.b, xd> b() {
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

      private static final IntFunction<alt.b> l = axt.a($$0 -> $$0.m, values(), axt.a.a);
      public static final zb<ByteBuf, alt.b> k = yz.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xd a() {
         return xd.c("known_server_link." + this.n);
      }

      public alt.a a(URI $$0) {
         return alt.a.a(this, $$0);
      }
   }

   public static record c(Either<alt.b, xd> b, String c) {
      public static final zb<ByteBuf, alt.c> a = zb.a(alt.b, alt.c::a, yz.l, alt.c::b, alt.c::new);

      public Either<alt.b, xd> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
