import java.util.List;
import javax.annotation.Nullable;

public class cpf extends cre {
   private final avr<dlv> a;

   public cpf(avr<dlv> $$0, cre.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public avr<dlv> b() {
      return this.a;
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      $$2.add(this.c().a(n.h));
   }

   public wu c() {
      return wg.c(this.a() + ".desc");
   }
}
