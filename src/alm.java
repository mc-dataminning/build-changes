import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alm(List<alm.a> d) {
   public static final alm a = new alm(List.of());
   public static final yn<ByteBuf, Either<alm.b, wp>> b = yl.a(alm.b.k, wr.f);
   public static final yn<ByteBuf, List<alm.c>> c = alm.c.a.a(yl.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<alm.a> a(alm.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<alm.c> b() {
      return this.d.stream().map($$0 -> new alm.c($$0.a, $$0.b.toString())).toList();
   }

   public List<alm.a> c() {
      return this.d;
   }

   public static record a(Either<alm.b, wp> a, URI b) {

      public static alm.a a(alm.b $$0, URI $$1) {
         return new alm.a(Either.left($$0), $$1);
      }

      public static alm.a a(wp $$0, URI $$1) {
         return new alm.a(Either.right($$0), $$1);
      }

      public wp a() {
         return (wp)this.a.map(alm.b::a, $$0 -> $$0);
      }

      public Either<alm.b, wp> b() {
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

      private static final IntFunction<alm.b> l = axq.a($$0 -> $$0.m, values(), axq.a.a);
      public static final yn<ByteBuf, alm.b> k = yl.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private wp a() {
         return wp.c("known_server_link." + this.n);
      }

      public alm.a a(URI $$0) {
         return alm.a.a(this, $$0);
      }
   }

   public static record c(Either<alm.b, wp> b, String c) {
      public static final yn<ByteBuf, alm.c> a = yn.a(alm.b, alm.c::a, yl.o, alm.c::b, alm.c::new);

      public Either<alm.b, wp> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
