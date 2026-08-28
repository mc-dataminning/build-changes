import java.util.List;
import javax.annotation.Nullable;

public class cpb {
   private final cpa<jr<cwk>> a = new cpa<>();

   public void a(cwo $$0) {
      if (cov.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cwo $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cwo $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(dbd<?> $$0, @Nullable cpa.b<jr<cwk>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dbd<?> $$0, int $$1, @Nullable cpa.b<jr<cwk>> $$2) {
      dbc $$3 = $$0.ao_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends cpa.a<jr<cwk>>> $$0, @Nullable cpa.b<jr<cwk>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends cpa.a<jr<cwk>>> $$0, int $$1, @Nullable cpa.b<jr<cwk>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dbd<?> $$0, @Nullable cpa.b<jr<cwk>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dbd<?> $$0, int $$1, @Nullable cpa.b<jr<cwk>> $$2) {
      return this.a.b($$0.ao_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
