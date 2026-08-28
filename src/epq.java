import java.util.Optional;

public record epq(jj<epr> b, byte c, byte d, byte e, Optional<wu> f) {
   public static final ys<wf, epq> a = ys.a(epr.c, epq::c, yq.c, epq::d, yq.c, epq::e, yq.c, epq::f, ww.c, epq::g, epq::new);

   public epq(jj<epr> b, byte c, byte d, byte e, Optional<wu> f) {
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

   public jj<epr> c() {
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
