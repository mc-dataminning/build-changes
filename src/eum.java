import java.util.Optional;

public record eum(jr<eun> b, byte c, byte d, byte e, Optional<wp> f) {
   public static final yn<wa, eum> a = yn.a(eun.c, eum::c, yl.c, eum::d, yl.c, eum::e, yl.c, eum::f, wr.c, eum::g, eum::new);

   public eum(jr<eun> b, byte c, byte d, byte e, Optional<wp> f) {
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

   public jr<eun> c() {
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
