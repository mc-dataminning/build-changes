import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aah(UUID c, String d, String e, boolean f, Optional<xo> g) implements zv<aab> {
   public static final int a = 40;
   public static final zm<ByteBuf, aah> b = zm.a(kc.g, aah::b, zk.l, aah::e, zk.b(40), aah::f, zk.b, aah::g, xq.f.a(zk::a), aah::h, aah::new);

   public aah(UUID c, String d, String e, boolean f, Optional<xo> g) {
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
   public zx<aah> a() {
      return aal.f;
   }

   public void a(aab $$0) {
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

   public Optional<xo> h() {
      return this.g;
   }
}
