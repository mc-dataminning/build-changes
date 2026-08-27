import java.util.List;
import javax.annotation.Nullable;

public class cja extends cle {
   private final arv<deu> a;

   public cja(arv<deu> $$0, cle.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public arv<deu> b() {
      return this.a;
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      $$2.add(this.d().a(n.h));
   }

   public vf d() {
      return ur.c(this.a() + ".desc");
   }
}
