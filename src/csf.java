import java.util.List;
import javax.annotation.Nullable;

public class csf {
   private final cse<jg<czw>> a = new cse<>();

   public void a(daa $$0) {
      if (cry.e($$0)) {
         this.b($$0);
      }
   }

   public void b(daa $$0) {
      this.a($$0, $$0.k());
   }

   public void a(daa $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(der<?> $$0, @Nullable cse.b<jg<czw>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(der<?> $$0, int $$1, @Nullable cse.b<jg<czw>> $$2) {
      deq $$3 = $$0.ap_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends cse.a<jg<czw>>> $$0, @Nullable cse.b<jg<czw>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends cse.a<jg<czw>>> $$0, int $$1, @Nullable cse.b<jg<czw>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(der<?> $$0, @Nullable cse.b<jg<czw>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(der<?> $$0, int $$1, @Nullable cse.b<jg<czw>> $$2) {
      return this.a.b($$0.ap_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
