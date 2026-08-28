import java.util.Optional;

public record ewh(js<ewi> b, byte c, byte d, byte e, Optional<wv> f) {
   public static final yt<wg, ewh> a = yt.a(ewi.c, ewh::c, yr.c, ewh::d, yr.c, ewh::e, yr.c, ewh::f, wx.c, ewh::g, ewh::new);

   public ewh(js<ewi> b, byte c, byte d, byte e, Optional<wv> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ald a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public js<ewi> c() {
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

   public Optional<wv> g() {
      return this.f;
   }
}
