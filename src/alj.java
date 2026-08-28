import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alj(List<alj.a> d) {
   public static final alj a = new alj(List.of());
   public static final yx<ByteBuf, Either<alj.b, wz>> b = yv.a(alj.b.k, xb.f);
   public static final yx<ByteBuf, List<alj.c>> c = alj.c.a.a(yv.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<alj.a> a(alj.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<alj.c> b() {
      return this.d.stream().map($$0 -> new alj.c($$0.a, $$0.b.toString())).toList();
   }

   public List<alj.a> c() {
      return this.d;
   }

   public static record a(Either<alj.b, wz> a, URI b) {

      public static alj.a a(alj.b $$0, URI $$1) {
         return new alj.a(Either.left($$0), $$1);
      }

      public static alj.a a(wz $$0, URI $$1) {
         return new alj.a(Either.right($$0), $$1);
      }

      public wz a() {
         return (wz)this.a.map(alj.b::a, $$0 -> $$0);
      }

      public Either<alj.b, wz> b() {
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

      private static final IntFunction<alj.b> l = axe.a($$0 -> $$0.m, values(), axe.a.a);
      public static final yx<ByteBuf, alj.b> k = yv.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private wz a() {
         return wz.c("known_server_link." + this.n);
      }

      public alj.a a(URI $$0) {
         return alj.a.a(this, $$0);
      }
   }

   public static record c(Either<alj.b, wz> b, String c) {
      public static final yx<ByteBuf, alj.c> a = yx.a(alj.b, alj.c::a, yv.l, alj.c::b, alj.c::new);

      public Either<alj.b, wz> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
