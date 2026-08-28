import java.util.Optional;

public record euo(jr<eup> b, byte c, byte d, byte e, Optional<wp> f) {
   public static final yn<wa, euo> a = yn.a(eup.c, euo::c, yl.c, euo::d, yl.c, euo::e, yl.c, euo::f, wr.c, euo::g, euo::new);

   public euo(jr<eup> b, byte c, byte d, byte e, Optional<wp> f) {
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

   public jr<eup> c() {
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
