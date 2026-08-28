import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alm(List<alm.a> d) {
   public static final alm a = new alm(List.of());
   public static final ym<ByteBuf, Either<alm.b, wo>> b = yk.a(alm.b.k, wq.f);
   public static final ym<ByteBuf, List<alm.c>> c = alm.c.a.a(yk.a());

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

   public static record a(Either<alm.b, wo> a, URI b) {

      public static alm.a a(alm.b $$0, URI $$1) {
         return new alm.a(Either.left($$0), $$1);
      }

      public static alm.a a(wo $$0, URI $$1) {
         return new alm.a(Either.right($$0), $$1);
      }

      public wo a() {
         return (wo)this.a.map(alm.b::a, $$0 -> $$0);
      }

      public Either<alm.b, wo> b() {
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
      public static final ym<ByteBuf, alm.b> k = yk.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private wo a() {
         return wo.c("known_server_link." + this.n);
      }

      public alm.a a(URI $$0) {
         return alm.a.a(this, $$0);
      }
   }

   public static record c(Either<alm.b, wo> b, String c) {
      public static final ym<ByteBuf, alm.c> a = ym.a(alm.b, alm.c::a, yk.o, alm.c::b, alm.c::new);

      public Either<alm.b, wo> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
