import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alv(List<alv.a> d) {
   public static final alv a = new alv(List.of());
   public static final yt<ByteBuf, Either<alv.b, wv>> b = yr.a(alv.b.k, wx.f);
   public static final yt<ByteBuf, List<alv.c>> c = alv.c.a.a(yr.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<alv.a> a(alv.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<alv.c> b() {
      return this.d.stream().map($$0 -> new alv.c($$0.a, $$0.b.toString())).toList();
   }

   public List<alv.a> c() {
      return this.d;
   }

   public static record a(Either<alv.b, wv> a, URI b) {

      public static alv.a a(alv.b $$0, URI $$1) {
         return new alv.a(Either.left($$0), $$1);
      }

      public static alv.a a(wv $$0, URI $$1) {
         return new alv.a(Either.right($$0), $$1);
      }

      public wv a() {
         return (wv)this.a.map(alv.b::a, $$0 -> $$0);
      }

      public Either<alv.b, wv> b() {
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

      private static final IntFunction<alv.b> l = aya.a($$0 -> $$0.m, values(), aya.a.a);
      public static final yt<ByteBuf, alv.b> k = yr.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private wv a() {
         return wv.c("known_server_link." + this.n);
      }

      public alv.a a(URI $$0) {
         return alv.a.a(this, $$0);
      }
   }

   public static record c(Either<alv.b, wv> b, String c) {
      public static final yt<ByteBuf, alv.c> a = yt.a(alv.b, alv.c::a, yr.o, alv.c::b, alv.c::new);

      public Either<alv.b, wv> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
