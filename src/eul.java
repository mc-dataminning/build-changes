import java.util.Optional;

public record eul(jr<eum> b, byte c, byte d, byte e, Optional<wo> f) {
   public static final ym<vz, eul> a = ym.a(eum.c, eul::c, yk.c, eul::d, yk.c, eul::e, yk.c, eul::f, wq.c, eul::g, eul::new);

   public eul(jr<eum> b, byte c, byte d, byte e, Optional<wo> f) {
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

   public jr<eum> c() {
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

   public Optional<wo> g() {
      return this.f;
   }
}
