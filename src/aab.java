import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aab(UUID c, String d, String e, boolean f, Optional<xh> g) implements zo<zu> {
   public static final int a = 40;
   public static final zf<ByteBuf, aab> b = zf.a(kj.g, aab::b, zd.m, aab::e, zd.b(40), aab::f, zd.b, aab::g, xj.f.a(zd::a), aab::h, aab::new);

   public aab(UUID c, String d, String e, boolean f, Optional<xh> g) {
      if (e.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + e.length() + ")");
      } else {
         this.c = c;
         this.d = d;
         this.e = e;
         this.f = f;
         this.g = g;
      }
   }

   @Override
   public zq<aab> a() {
      return aag.g;
   }

   public void a(zu $$0) {
      $$0.a(this);
   }

   public UUID b() {
      return this.c;
   }

   public String e() {
      return this.d;
   }

   public String f() {
      return this.e;
   }

   public boolean g() {
      return this.f;
   }

   public Optional<xh> h() {
      return this.g;
   }
}
