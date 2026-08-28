import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class com {
   private final col<jp<cvt>> a = new col<>();

   public void a(cvx $$0) {
      if (cog.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cvx $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cvx $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.L());
         this.a.a($$0.i(), $$2);
      }
   }

   public static col.a<jp<cvt>> a(Stream<jp<cvt>> $$0) {
      List<jp<cvt>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> lx.g.a((cvt)$$0x.a()))).toList();
      return new col.a<>($$1);
   }

   public boolean a(daj<?> $$0, @Nullable col.b<jp<cvt>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(daj<?> $$0, int $$1, @Nullable col.b<jp<cvt>> $$2) {
      return this.a.a($$0.a().b(), $$1, $$2);
   }

   public int b(daj<?> $$0, @Nullable col.b<jp<cvt>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(daj<?> $$0, int $$1, @Nullable col.b<jp<cvt>> $$2) {
      return this.a.b($$0.a().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
