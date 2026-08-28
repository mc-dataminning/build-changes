import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aap(UUID c, String d, String e, boolean f, Optional<xv> g) implements aac<aai> {
   public static final int a = 40;
   public static final zt<ByteBuf, aap> b = zt.a(kk.g, aap::b, zr.o, aap::e, zr.b(40), aap::f, zr.b, aap::g, xx.f.a(zr::a), aap::h, aap::new);

   public aap(UUID c, String d, String e, boolean f, Optional<xv> g) {
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
   public aae<aap> a() {
      return aau.g;
   }

   public void a(aai $$0) {
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

   public Optional<xv> h() {
      return this.g;
   }
}
