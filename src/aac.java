import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aac(UUID c, String d, String e, boolean f, Optional<xi> g) implements zp<zv> {
   public static final int a = 40;
   public static final zg<ByteBuf, aac> b = zg.a(kk.g, aac::b, ze.m, aac::e, ze.b(40), aac::f, ze.b, aac::g, xk.f.a(ze::a), aac::h, aac::new);

   public aac(UUID c, String d, String e, boolean f, Optional<xi> g) {
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
   public zr<aac> a() {
      return aah.g;
   }

   public void a(zv $$0) {
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

   public Optional<xi> h() {
      return this.g;
   }
}
