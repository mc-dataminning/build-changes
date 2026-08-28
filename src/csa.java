import java.util.List;

public class csa extends cty {
   private final awm<dpg> a;

   public csa(awm<dpg> $$0, cty.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public awm<dpg> b() {
      return this.a;
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      $$2.add(this.c().a(n.h));
   }

   public xi c() {
      return wu.c(this.a() + ".desc");
   }
}
