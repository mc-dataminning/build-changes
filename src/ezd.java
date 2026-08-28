import java.util.Optional;

public record ezd(jf<eze> b, byte c, byte d, byte e, Optional<xa> f) {
   public static final yy<wl, ezd> a = yy.a(eze.c, ezd::c, yw.c, ezd::d, yw.c, ezd::e, yw.c, ezd::f, xc.c, ezd::g, ezd::new);

   public ezd(jf<eze> b, byte c, byte d, byte e, Optional<xa> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ali a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jf<eze> c() {
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

   public Optional<xa> g() {
      return this.f;
   }
}
