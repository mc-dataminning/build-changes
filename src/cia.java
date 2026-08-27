import java.util.List;
import javax.annotation.Nullable;

public class cia extends cke {
   private final arh<ddo> a;

   public cia(arh<ddo> $$0, cke.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public arh<ddo> b() {
      return this.a;
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      $$2.add(this.d().a(n.h));
   }

   public uw d() {
      return ui.c(this.a() + ".desc");
   }
}
