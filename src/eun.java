import java.util.Optional;

public record eun(jr<euo> b, byte c, byte d, byte e, Optional<wp> f) {
   public static final yn<wa, eun> a = yn.a(euo.c, eun::c, yl.c, eun::d, yl.c, eun::e, yl.c, eun::f, wr.c, eun::g, eun::new);

   public eun(jr<euo> b, byte c, byte d, byte e, Optional<wp> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public akv a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jr<euo> c() {
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

   public Optional<wp> g() {
      return this.f;
   }
}
