import javax.annotation.Nullable;

public class erx {
   private final dee a;
   @Nullable
   private final erw b;
   private final jg c;
   private final jg.a d = new jg.a();

   public erx(dee $$0, bux $$1) {
      this.a = $$0;
      if ($$1.dX() instanceof arm $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dx();
   }

   public erv a(int $$0, int $$1, int $$2) {
      jg $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? esa.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dvd a(jg $$0) {
      return this.a.a_($$0);
   }

   public dee a() {
      return this.a;
   }

   public jg b() {
      return this.c;
   }
}
