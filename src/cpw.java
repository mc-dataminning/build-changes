import java.util.List;
import javax.annotation.Nullable;

public class cpw {
   private final cpv<jr<cxd>> a = new cpv<>();

   public void a(cxh $$0) {
      if (cpq.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cxh $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cxh $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(dbv<?> $$0, @Nullable cpv.b<jr<cxd>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dbv<?> $$0, int $$1, @Nullable cpv.b<jr<cxd>> $$2) {
      dbu $$3 = $$0.ao_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends cpv.a<jr<cxd>>> $$0, @Nullable cpv.b<jr<cxd>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends cpv.a<jr<cxd>>> $$0, int $$1, @Nullable cpv.b<jr<cxd>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dbv<?> $$0, @Nullable cpv.b<jr<cxd>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dbv<?> $$0, int $$1, @Nullable cpv.b<jr<cxd>> $$2) {
      return this.a.b($$0.ao_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
