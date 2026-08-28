import java.util.Optional;

public record evk(jr<evl> b, byte c, byte d, byte e, Optional<wp> f) {
   public static final yn<wa, evk> a = yn.a(evl.c, evk::c, yl.c, evk::d, yl.c, evk::e, yl.c, evk::f, wr.c, evk::g, evk::new);

   public evk(jr<evl> b, byte c, byte d, byte e, Optional<wp> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public aku a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jr<evl> c() {
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
