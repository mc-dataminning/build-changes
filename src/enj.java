import java.util.Optional;

public record enj(iw<enk> b, byte c, byte d, byte e, Optional<wu> f) {
   public static final ys<wf, enj> a = ys.a(enk.c, enj::c, yq.c, enj::d, yq.c, enj::e, yq.c, enj::f, ww.c, enj::g, enj::new);

   public enj(iw<enk> b, byte c, byte d, byte e, Optional<wu> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public akh a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public iw<enk> c() {
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

   public Optional<wu> g() {
      return this.f;
   }
}
