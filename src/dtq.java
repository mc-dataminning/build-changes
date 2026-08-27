import java.util.Optional;
import java.util.function.Function;

public class dtq extends dsn {
   private final iy a;
   private final dru b;
   private final dse c;
   private final dsh.o d;

   public dtq(drt $$0, iy $$1, cwg $$2, dru $$3, dse $$4, dsh.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dme> a(Function<ib, il<cxd>> $$0, doa $$1, ib $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public iy c() {
      return this.a;
   }

   public dse d() {
      return this.c;
   }
}
