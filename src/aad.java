import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aad(UUID c, String d, String e, boolean f, Optional<xj> g) implements zq<zw> {
   public static final int a = 40;
   public static final zh<ByteBuf, aad> b = zh.a(kk.g, aad::b, zf.n, aad::e, zf.b(40), aad::f, zf.b, aad::g, xl.f.a(zf::a), aad::h, aad::new);

   public aad(UUID c, String d, String e, boolean f, Optional<xj> g) {
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
   public zs<aad> a() {
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

   public Optional<xj> h() {
      return this.g;
   }
}
