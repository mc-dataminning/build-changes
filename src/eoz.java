import java.util.Optional;

public record eoz(ji<epa> b, byte c, byte d, byte e, Optional<xl> f) {
   public static final zj<ww, eoz> a = zj.a(epa.c, eoz::c, zh.c, eoz::d, zh.c, eoz::e, zh.c, eoz::f, xn.c, eoz::g, eoz::new);

   public eoz(ji<epa> b, byte c, byte d, byte e, Optional<xl> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alb a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public ji<epa> c() {
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

   public Optional<xl> g() {
      return this.f;
   }
}
