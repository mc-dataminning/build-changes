import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;

public record alu(List<alu.a> d) {
   public static final alu a = new alu(List.of());
   public static final zb<ByteBuf, Either<alu.b, xd>> b = yz.a(alu.b.k, xf.f);
   public static final zb<ByteBuf, List<alu.c>> c = alu.c.a.a(yz.a());

   public boolean a() {
      return this.d.isEmpty();
   }

   public Optional<alu.a> a(alu.b $$0) {
      return this.d.stream().filter($$1 -> (Boolean)$$1.a.map($$1x -> $$1x == $$0, $$0xx -> false)).findFirst();
   }

   public List<alu.c> b() {
      return this.d.stream().map($$0 -> new alu.c($$0.a, $$0.b.toString())).toList();
   }

   public List<alu.a> c() {
      return this.d;
   }

   public static record a(Either<alu.b, xd> a, URI b) {

      public static alu.a a(alu.b $$0, URI $$1) {
         return new alu.a(Either.left($$0), $$1);
      }

      public static alu.a a(xd $$0, URI $$1) {
         return new alu.a(Either.right($$0), $$1);
      }

      public xd a() {
         return (xd)this.a.map(alu.b::a, $$0 -> $$0);
      }

      public Either<alu.b, xd> b() {
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

      private static final IntFunction<alu.b> l = axu.a($$0 -> $$0.m, values(), axu.a.a);
      public static final zb<ByteBuf, alu.b> k = yz.a(l, $$0 -> $$0.m);
      private final int m;
      private final String n;

      private b(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      private xd a() {
         return xd.c("known_server_link." + this.n);
      }

      public alu.a a(URI $$0) {
         return alu.a.a(this, $$0);
      }
   }

   public static record c(Either<alu.b, xd> b, String c) {
      public static final zb<ByteBuf, alu.c> a = zb.a(alu.b, alu.c::a, yz.l, alu.c::b, alu.c::new);

      public Either<alu.b, xd> a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }
   }
}
