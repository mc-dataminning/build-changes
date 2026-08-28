import javax.annotation.Nullable;

public class eom {
   private final dbg a;
   @Nullable
   private final eol b;
   private final iz c;
   private final iz.a d = new iz.a();

   public eom(dbg $$0, btp $$1) {
      this.a = $$0;
      if ($$1.dP() instanceof are $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dp();
   }

   public eok a(int $$0, int $$1, int $$2) {
      iz $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eop.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dsa a(iz $$0) {
      return this.a.a_($$0);
   }

   public dbg a() {
      return this.a;
   }

   public iz b() {
      return this.c;
   }
}
