import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aad(UUID c, String d, String e, boolean f, Optional<xg> g) implements zo<zw> {
   public static final int a = 40;
   public static final ze<ByteBuf, aad> b = ze.a(ka.g, aad::b, zc.p, aad::e, zc.b(40), aad::f, zc.b, aad::g, xi.f.a(zc::a), aad::h, aad::new);

   public aad(UUID c, String d, String e, boolean f, Optional<xg> g) {
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
   public zq<aad> a() {
      return aai.g;
   }

   public void a(zw $$0) {
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

   public Optional<xg> h() {
      return this.g;
   }
}
