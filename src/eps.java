import java.util.Optional;

public record eps(jj<ept> b, byte c, byte d, byte e, Optional<wu> f) {
   public static final ys<wf, eps> a = ys.a(ept.c, eps::c, yq.c, eps::d, yq.c, eps::e, yq.c, eps::f, ww.c, eps::g, eps::new);

   public eps(jj<ept> b, byte c, byte d, byte e, Optional<wu> f) {
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

   public jj<ept> c() {
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
