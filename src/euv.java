import javax.annotation.Nullable;

public class euv extends euq {
   private static final sw a = sw.c("symlink_warning.title").a(n.r);
   private static final sw b = sw.a("symlink_warning.message", "https://aka.ms/MinecraftSymLinks");
   @Nullable
   private final euq c;
   private final esf k = new esf().b(10);

   public euv(@Nullable euq $$0) {
      super(a);
      this.c = $$0;
   }

   @Override
   protected void b() {
      super.b();
      this.k.b().b();
      esf.b $$0 = this.k.d(1);
      $$0.a(new eqk(this.e, this.i));
      $$0.a(new eqa(b, this.i).i(this.g - 50).b(true));
      int $$1 = 120;
      esf $$2 = new esf().a(5);
      esf.b $$3 = $$2.d(3);
      $$3.a(epi.a(sv.n, $$0x -> ac.i().a("https://aka.ms/MinecraftSymLinks")).b(120, 20).a());
      $$3.a(epi.a(sv.o, $$0x -> this.f.o.a("https://aka.ms/MinecraftSymLinks")).b(120, 20).a());
      $$3.a(epi.a(sv.k, $$0x -> this.aw_()).b(120, 20).a());
      $$0.a($$2);
      this.aG_();
      this.k.a(this::d);
   }

   @Override
   protected void aG_() {
      this.k.c();
      ese.a(this.k, this.s());
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public sw au_() {
      return sv.a(super.au_(), b);
   }

   @Override
   public void aw_() {
      this.f.a(this.c);
   }
}
