import java.util.List;
import javax.annotation.Nullable;

public class cpd {
   private final cpc<jr<cwm>> a = new cpc<>();

   public void a(cwq $$0) {
      if (cox.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cwq $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cwq $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(dbf<?> $$0, @Nullable cpc.b<jr<cwm>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dbf<?> $$0, int $$1, @Nullable cpc.b<jr<cwm>> $$2) {
      dbe $$3 = $$0.ao_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends cpc.a<jr<cwm>>> $$0, @Nullable cpc.b<jr<cwm>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends cpc.a<jr<cwm>>> $$0, int $$1, @Nullable cpc.b<jr<cwm>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dbf<?> $$0, @Nullable cpc.b<jr<cwm>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dbf<?> $$0, int $$1, @Nullable cpc.b<jr<cwm>> $$2) {
      return this.a.b($$0.ao_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
