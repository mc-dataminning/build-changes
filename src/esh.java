import java.util.Optional;

public record esh(jo<esi> b, byte c, byte d, byte e, Optional<xe> f) {
   public static final zc<wp, esh> a = zc.a(esi.c, esh::c, za.c, esh::d, za.c, esh::e, za.c, esh::f, xg.c, esh::g, esh::new);

   public esh(jo<esi> b, byte c, byte d, byte e, Optional<xe> f) {
      e = (byte)(e & 15);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ale a() {
      return this.b.a().b();
   }

   public boolean b() {
      return this.b.a().c();
   }

   public jo<esi> c() {
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

   public Optional<xe> g() {
      return this.f;
   }
}
