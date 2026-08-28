import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aae(UUID c, String d, String e, boolean f, Optional<xl> g) implements zs<zy> {
   public static final int a = 40;
   public static final zj<ByteBuf, aae> b = zj.a(kc.g, aae::b, zh.l, aae::e, zh.b(40), aae::f, zh.b, aae::g, xn.f.a(zh::a), aae::h, aae::new);

   public aae(UUID c, String d, String e, boolean f, Optional<xl> g) {
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
   public zu<aae> a() {
      return aai.f;
   }

   public void a(zy $$0) {
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

   public Optional<xl> h() {
      return this.g;
   }
}
