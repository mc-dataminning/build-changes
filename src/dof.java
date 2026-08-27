import java.util.Optional;
import java.util.function.Function;

public class dof extends dnc {
   private final ip a;
   private final dmj b;
   private final dmt c;
   private final dmw.o d;

   public dof(dmi $$0, ip $$1, cru $$2, dmj $$3, dmt $$4, dmw.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dgw> a(Function<ht, ib<csq>> $$0, dis $$1, ht $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public ip c() {
      return this.a;
   }

   public dmt d() {
      return this.c;
   }
}
