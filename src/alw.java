import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alw(List<alw.a> d) {
   public static final alw a = new alw(List.of());
   public static final zc<ByteBuf, Either<alw.b, xe>> b = za.a(alw.b.k, xg.f);
   public static final zc<ByteBuf, List<alw.c>> c = alw.c.a.a(za.a());

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

   public static record a(Either<alw.b, xe> a, URI b) {

      public static alw.a a(alw.b $$0, URI $$1) {
         return new alw.a(Either.left($$0), $$1);
      }

      public static alw.a a(xe $$0, URI $$1) {
         return new alw.a(Either.right($$0), $$1);
      }

      public xe a() {
         return (xe)this.a.map(alw.b::a, $$0 -> $$0);
      }

      public Either<alw.b, xe> b() {
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

      private static final IntFunction<alw.b> l = axw.a($$0 -> $$0.m, values(), axw.a.a);
      public static final zc<ByteBuf, alw.b> k = za.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xe a() {
         return xe.c("known_server_link." + this.n);
      }

      public alw.a a(URI $$0) {
         return alw.a.a(this, $$0);
      }
   }

   public static record c(Either<alw.b, xe> b, String c) {
      public static final zc<ByteBuf, alw.c> a = zc.a(alw.b, alw.c::a, za.m, alw.c::b, alw.c::new);

      public Either<alw.b, xe> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
