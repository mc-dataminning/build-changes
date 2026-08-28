import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alw(List<alw.a> d) {
   public static final alw a = new alw(List.of());
   public static final yu<ByteBuf, Either<alw.b, ww>> b = ys.a(alw.b.k, wy.f);
   public static final yu<ByteBuf, List<alw.c>> c = alw.c.a.a(ys.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<alw.a> a(alw.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<alw.c> b() {
      return this.d.stream().map($$0 -> new alw.c($$0.a, $$0.b.toString())).toList();
   }

   public List<alw.a> c() {
      return this.d;
   }

   public static record a(Either<alw.b, ww> a, URI b) {

      public static alw.a a(alw.b $$0, URI $$1) {
         return new alw.a(Either.left($$0), $$1);
      }

      public static alw.a a(ww $$0, URI $$1) {
         return new alw.a(Either.right($$0), $$1);
      }

      public ww a() {
         return (ww)this.a.map(alw.b::a, $$0 -> $$0);
      }

      public Either<alw.b, ww> b() {
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

      private static final IntFunction<alw.b> l = aya.a($$0 -> $$0.m, values(), aya.a.a);
      public static final yu<ByteBuf, alw.b> k = ys.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private ww a() {
         return ww.c("known_server_link." + this.n);
      }

      public alw.a a(URI $$0) {
         return alw.a.a(this, $$0);
      }
   }

   public static record c(Either<alw.b, ww> b, String c) {
      public static final yu<ByteBuf, alw.c> a = yu.a(alw.b, alw.c::a, ys.o, alw.c::b, alw.c::new);

      public Either<alw.b, ww> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
