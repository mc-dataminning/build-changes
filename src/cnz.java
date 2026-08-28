import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cnz {
   private final cny<jn<cvk>> a = new cny<>();

   public void a(cvp $$0) {
      if (cnt.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cvp $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cvp $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.J());
         this.a.a($$0.i(), $$2);
      }
   }

   public static cny.a<jn<cvk>> a(Stream<jn<cvk>> $$0) {
      List<jn<cvk>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> lu.g.a((cvk)$$0x.a()))).toList();
      return new cny.a<>($$1);
   }

   public boolean a(dah<?> $$0, @Nullable cny.b<jn<cvk>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dah<?> $$0, int $$1, @Nullable cny.b<jn<cvk>> $$2) {
      return this.a.a($$0.a().b(), $$1, $$2);
   }

   public int b(dah<?> $$0, @Nullable cny.b<jn<cvk>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dah<?> $$0, int $$1, @Nullable cny.b<jn<cvk>> $$2) {
      return this.a.b($$0.a().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
