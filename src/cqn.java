import java.util.List;
import javax.annotation.Nullable;

public class cqn {
   private final cqm<js<cxu>> a = new cqm<>();

   public void a(cxy $$0) {
      if (cqh.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cxy $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cxy $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(dcl<?> $$0, @Nullable cqm.b<js<cxu>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dcl<?> $$0, int $$1, @Nullable cqm.b<js<cxu>> $$2) {
      dck $$3 = $$0.ak_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends cqm.a<js<cxu>>> $$0, @Nullable cqm.b<js<cxu>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends cqm.a<js<cxu>>> $$0, int $$1, @Nullable cqm.b<js<cxu>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dcl<?> $$0, @Nullable cqm.b<js<cxu>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dcl<?> $$0, int $$1, @Nullable cqm.b<js<cxu>> $$2) {
      return this.a.b($$0.ak_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
