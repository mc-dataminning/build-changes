import java.util.Optional;

public record eun(jr<euo> b, byte c, byte d, byte e, Optional<wo> f) {
   public static final ym<vz, eun> a = ym.a(euo.c, eun::c, yk.c, eun::d, yk.c, eun::e, yk.c, eun::f, wq.c, eun::g, eun::new);

   public eun(jr<euo> b, byte c, byte d, byte e, Optional<wo> f) {
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

   public Optional<wo> g() {
      return this.f;
   }
}
