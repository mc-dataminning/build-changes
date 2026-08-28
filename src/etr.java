import javax.annotation.Nullable;

public class etr {
   private final dfq a;
   @Nullable
   private final etq b;
   private final ji c;
   private final ji.a d = new ji.a();

   public etr(dfq $$0, bvi $$1) {
      this.a = $$0;
      if ($$1.dV() instanceof ard $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.dv();
   }

   public etp a(int $$0, int $$1, int $$2) {
      ji $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? etu.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dww a(ji $$0) {
      return this.a.a_($$0);
   }

   public dfq a() {
      return this.a;
   }

   public ji b() {
      return this.c;
   }
}
