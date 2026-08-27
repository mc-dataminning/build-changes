import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public enum aqc {
   a(avw.a),
   b(avw.b),
   c(avw.c),
   d(avw.d),
   e(avw.e),
   f(avw.f),
   g(avw.g),
   h(avw.h),
   i(avw.i),
   j(avw.j),
   k(avw.B),
   l(avw.k);

   public static final Set<TypeReference> m;
   private final TypeReference n;

   private aqc(TypeReference $$0) {
      this.n = $$0;
   }

   private static int a() {
      return aa.b().d().c();
   }

   public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2, int $$3) {
      return $$0.update(this.n, $$1, $$2, $$3);
   }

   public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   public qr a(DataFixer $$0, qr $$1, int $$2, int $$3) {
      return (qr)this.a($$0, new Dynamic(rc.a, $$1), $$2, $$3).getValue();
   }

   public qr a(DataFixer $$0, qr $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   static {
      m = Set.of(a.n);
   }
}
