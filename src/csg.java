import java.util.List;

public class csg extends cuf {
   private final axb<dos> a;

   public csg(axb<dos> $$0, cuf.a $$1) {
      super($$1);
      this.a = $$0;
   }

   public axb<dos> b() {
      return this.a;
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      $$2.add(this.c().a(n.h));
   }

   public xz c() {
      return xl.c(this.a() + ".desc");
   }
}
