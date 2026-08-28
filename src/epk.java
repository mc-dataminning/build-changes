import java.util.Optional;

public record epk(jj<epl> b, byte c, byte d, byte e, Optional<wu> f) {
   public static final ys<wf, epk> a = ys.a(epl.c, epk::c, yq.c, epk::d, yq.c, epk::e, yq.c, epk::f, ww.c, epk::g, epk::new);

   public epk(jj<epl> b, byte c, byte d, byte e, Optional<wu> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public akk a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jj<epl> c() {
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

   public Optional<wu> g() {
      return this.f;
   }
}
