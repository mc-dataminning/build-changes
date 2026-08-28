import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cow {
   private final cov<jq<cwb>> a = new cov<>();

   public void a(cwf $$0) {
      if (coq.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cwf $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cwf $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.L());
         this.a.a($$0.i(), $$2);
      }
   }

   public static cov.a<jq<cwb>> a(Stream<jq<cwb>> $$0) {
      List<jq<cwb>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> lz.g.a((cwb)$$0x.a()))).toList();
      return new cov.a<>($$1);
   }

   public boolean a(dat<?> $$0, @Nullable cov.b<jq<cwb>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dat<?> $$0, int $$1, @Nullable cov.b<jq<cwb>> $$2) {
      return this.a.a($$0.a().b(), $$1, $$2);
   }

   public int b(dat<?> $$0, @Nullable cov.b<jq<cwb>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dat<?> $$0, int $$1, @Nullable cov.b<jq<cwb>> $$2) {
      return this.a.b($$0.a().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
