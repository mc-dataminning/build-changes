import javax.annotation.Nullable;

public class elu {
   private final cyq a;
   @Nullable
   private final elt b;
   private final id c;
   private final id.a d = new id.a();

   public elu(cyq $$0, bqv $$1) {
      this.a = $$0;
      if ($$1.dM() instanceof apu $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dm();
   }

   public els a(int $$0, int $$1, int $$2) {
      id $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? elx.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dpi a(id $$0) {
      return this.a.a_($$0);
   }

   public cyq a() {
      return this.a;
   }

   public id b() {
      return this.c;
   }
}
