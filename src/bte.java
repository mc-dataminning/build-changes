import java.util.EnumSet;

public class bte extends btk {
   private final bmq a;

   public bte(bmq $$0) {
      this.a = $$0;
      this.a(EnumSet.of(btk.a.c));
      $$0.N().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aZ() && this.a.b(asn.a) > this.a.df() || this.a.bn();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.eg().i() < 0.8F) {
         this.a.M().a();
      }
   }
}
