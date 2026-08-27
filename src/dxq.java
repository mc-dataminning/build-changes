import java.util.Optional;
import java.util.function.Function;

public class dxq extends dwn {
   private final jj a;
   private final dvu b;
   private final dwe c;
   private final dwh.o d;

   public dxq(dvt $$0, jj $$1, czw $$2, dvu $$3, dwe $$4, dwh.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dpy> a(Function<im, iv<dat>> $$0, dru $$1, im $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public jj c() {
      return this.a;
   }

   public dwe d() {
      return this.c;
   }
}
