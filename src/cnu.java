import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cnu {
   private final cnt<jn<cvg>> a = new cnt<>();

   public void a(cvl $$0) {
      if (cno.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cvl $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cvl $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.J());
         this.a.a($$0.i(), $$2);
      }
   }

   public static cnt.a<jn<cvg>> a(Stream<jn<cvg>> $$0) {
      List<jn<cvg>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> lu.g.a((cvg)$$0x.a()))).toList();
      return new cnt.a<>($$1);
   }

   public boolean a(czt<?> $$0, @Nullable cnt.b<jn<cvg>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(czt<?> $$0, int $$1, @Nullable cnt.b<jn<cvg>> $$2) {
      return this.a.a($$0.a().b(), $$1, $$2);
   }

   public int b(czt<?> $$0, @Nullable cnt.b<jn<cvg>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(czt<?> $$0, int $$1, @Nullable cnt.b<jn<cvg>> $$2) {
      return this.a.b($$0.a().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
