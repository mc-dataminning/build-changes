import java.util.Optional;

public record etc(jq<etd> b, byte c, byte d, byte e, Optional<xl> f) {
   public static final zj<ww, etc> a = zj.a(etd.c, etc::c, zh.c, etc::d, zh.c, etc::e, zh.c, etc::f, xn.c, etc::g, etc::new);

   public etc(jq<etd> b, byte c, byte d, byte e, Optional<xl> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public all a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jq<etd> c() {
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
