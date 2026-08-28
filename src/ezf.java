import java.util.Optional;

public record ezf(jg<ezg> b, byte c, byte d, byte e, Optional<xc> f) {
   public static final za<wn, ezf> a = za.a(ezg.c, ezf::c, yy.c, ezf::d, yy.c, ezf::e, yy.c, ezf::f, xe.c, ezf::g, ezf::new);

   public ezf(jg<ezg> b, byte c, byte d, byte e, Optional<xc> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public alk a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jg<ezg> c() {
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

   public Optional<xc> g() {
      return this.f;
   }
}
