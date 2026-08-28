import java.util.Optional;

public record eyp(jf<eyq> b, byte c, byte d, byte e, Optional<wy> f) {
   public static final yw<wj, eyp> a = yw.a(eyq.c, eyp::c, yu.c, eyp::d, yu.c, eyp::e, yu.c, eyp::f, xa.c, eyp::g, eyp::new);

   public eyp(jf<eyq> b, byte c, byte d, byte e, Optional<wy> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alg a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jf<eyq> c() {
      return this.b;
   }

   public byte d() {
      return this.c;
   }

   public byte e() {
      return this.d;
   }

   public byte f() {
      return this.e;
   }

   public Optional<wy> g() {
      return this.f;
   }
}
