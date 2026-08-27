import java.util.List;
import javax.annotation.Nullable;

public class cnj extends cpl {
   private final aut<djc> a;

   public cnj(aut<djc> $$0, cpl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public aut<djc> b() {
      return this.a;
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      $$2.add(this.c().a(n.h));
   }

   public wg c() {
      return vs.c(this.a() + ".desc");
   }
}
