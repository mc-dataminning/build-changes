import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aae(UUID c, String d, String e, boolean f, Optional<xk> g) implements zr<zx> {
   public static final int a = 40;
   public static final zi<ByteBuf, aae> b = zi.a(kk.g, aae::b, zg.o, aae::e, zg.b(40), aae::f, zg.b, aae::g, xm.f.a(zg::a), aae::h, aae::new);

   public aae(UUID c, String d, String e, boolean f, Optional<xk> g) {
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
   public zt<aae> a() {
      return aaj.g;
   }

   public void a(zx $$0) {
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

   public Optional<xk> h() {
      return this.g;
   }
}
