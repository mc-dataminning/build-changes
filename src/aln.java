import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record aln(List<aln.a> d) {
   public static final aln a = new aln(List.of());
   public static final yn<ByteBuf, Either<aln.b, wp>> b = yl.a(aln.b.k, wr.f);
   public static final yn<ByteBuf, List<aln.c>> c = aln.c.a.a(yl.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<aln.a> a(aln.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<aln.c> b() {
      return this.d.stream().map($$0 -> new aln.c($$0.a, $$0.b.toString())).toList();
   }

   public List<aln.a> c() {
      return this.d;
   }

   public static record a(Either<aln.b, wp> a, URI b) {

      public static aln.a a(aln.b $$0, URI $$1) {
         return new aln.a(Either.left($$0), $$1);
      }

      public static aln.a a(wp $$0, URI $$1) {
         return new aln.a(Either.right($$0), $$1);
      }

      public wp a() {
         return (wp)this.a.map(aln.b::a, $$0 -> $$0);
      }

      public Either<aln.b, wp> b() {
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

      private static final IntFunction<aln.b> l = axq.a($$0 -> $$0.m, values(), axq.a.a);
      public static final yn<ByteBuf, aln.b> k = yl.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private wp a() {
         return wp.c("known_server_link." + this.n);
      }

      public aln.a a(URI $$0) {
         return aln.a.a(this, $$0);
      }
   }

   public static record c(Either<aln.b, wp> b, String c) {
      public static final yn<ByteBuf, aln.c> a = yn.a(aln.b, aln.c::a, yl.o, aln.c::b, aln.c::new);

      public Either<aln.b, wp> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
