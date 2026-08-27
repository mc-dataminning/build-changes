import java.util.Optional;

public record eod(ix<eoe> b, byte c, byte d, byte e, Optional<wx> f) {
   public static final yv<wi, eod> a = yv.a(eoe.c, eod::c, yt.c, eod::d, yt.c, eod::e, yt.c, eod::f, wz.c, eod::g, eod::new);

   public eod(ix<eoe> b, byte c, byte d, byte e, Optional<wx> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public akm a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public ix<eoe> c() {
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
