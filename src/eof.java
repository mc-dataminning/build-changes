import java.util.Optional;

public record eof(ix<eog> b, byte c, byte d, byte e, Optional<wx> f) {
   public static final yv<wi, eof> a = yv.a(eog.c, eof::c, yt.c, eof::d, yt.c, eof::e, yt.c, eof::f, wz.c, eof::g, eof::new);

   public eof(ix<eog> b, byte c, byte d, byte e, Optional<wx> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public akn a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public ix<eog> c() {
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

   public Optional<wx> g() {
      return this.f;
   }
}
