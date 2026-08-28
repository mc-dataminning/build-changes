import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cpt {
   private final cps<jq<cxc>> a = new cps<>();

   public void a(cxg $$0) {
      if (cpn.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cxg $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cxg $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public static cps.a<jq<cxc>> a(Stream<jq<cxc>> $$0) {
      List<jq<cxc>> $$1 = $$0.sorted(Comparator.comparingInt($$0x -> ma.g.a((cxc)$$0x.a()))).toList();
      return new cps.a<>($$1);
   }

   public boolean a(dbv<?> $$0, @Nullable cps.b<jq<cxc>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dbv<?> $$0, int $$1, @Nullable cps.b<jq<cxc>> $$2) {
      dbu $$3 = $$0.ap_();
      return $$3.d() ? false : this.a($$3.c(), $$1, $$2);
   }

   public boolean a(List<cps.a<jq<cxc>>> $$0, @Nullable cps.b<jq<cxc>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<cps.a<jq<cxc>>> $$0, int $$1, @Nullable cps.b<jq<cxc>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dbv<?> $$0, @Nullable cps.b<jq<cxc>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dbv<?> $$0, int $$1, @Nullable cps.b<jq<cxc>> $$2) {
      return this.a.b($$0.ap_().c(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
