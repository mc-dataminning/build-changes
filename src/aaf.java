import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record aaf(UUID c, String d, String e, boolean f, Optional<xl> g) implements zs<zy> {
   public static final int a = 40;
   public static final zj<ByteBuf, aaf> b = zj.a(kk.g, aaf::b, zh.m, aaf::e, zh.b(40), aaf::f, zh.b, aaf::g, xn.f.a(zh::a), aaf::h, aaf::new);

   public aaf(UUID c, String d, String e, boolean f, Optional<xl> g) {
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
   public zu<aaf> a() {
      return aak.g;
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
