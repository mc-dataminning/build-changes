import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class coz {
   private final coy<jq<cwi>> a = new coy<>();

   public void a(cwm $$0) {
      if (cot.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cwm $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cwm $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.L());
         this.a.a($$0.i(), $$2);
      }
   }

   public static coy.a<jq<cwi>> a(Stream<jq<cwi>> $$0) {
      List<jq<cwi>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> lz.g.a((cwi)$$0x.a()))).toList();
      return new coy.a<>($$1);
   }

   public boolean a(dba<?> $$0, @Nullable coy.b<jq<cwi>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dba<?> $$0, int $$1, @Nullable coy.b<jq<cwi>> $$2) {
      return this.a.a($$0.a().b(), $$1, $$2);
   }

   public int b(dba<?> $$0, @Nullable coy.b<jq<cwi>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dba<?> $$0, int $$1, @Nullable coy.b<jq<cwi>> $$2) {
      return this.a.b($$0.a().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
