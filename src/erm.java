import javax.annotation.Nullable;

public class erm {
   private final dds a;
   @Nullable
   private final erl b;
   private final jf c;
   private final jf.a d = new jf.a();

   public erm(dds $$0, bup $$1) {
      this.a = $$0;
      if ($$1.dS() instanceof arj $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.ds();
   }

   public erk a(int $$0, int $$1, int $$2) {
      jf $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? erp.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dus a(jf $$0) {
      return this.a.a_($$0);
   }

   public dds a() {
      return this.a;
   }

   public jf b() {
      return this.c;
   }
}
