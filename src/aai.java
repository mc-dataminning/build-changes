import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aai(UUID c, String d, String e, boolean f, Optional<xp> g) implements zw<aac> {
   public static final int a = 40;
   public static final zn<ByteBuf, aai> b = zn.a(kc.g, aai::b, zl.l, aai::e, zl.b(40), aai::f, zl.b, aai::g, xr.f.a(zl::a), aai::h, aai::new);

   public aai(UUID c, String d, String e, boolean f, Optional<xp> g) {
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
   public zy<aai> a() {
      return aam.f;
   }

   public void a(aac $$0) {
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

   public Optional<xp> h() {
      return this.g;
   }
}
