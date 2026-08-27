import javax.annotation.Nullable;

public class exk extends exv {
   private static final te a = te.c("symlink_warning.title.world").a(n.r);
   private static final te b = te.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final te c = te.c("symlink_warning.title.pack").a(n.r);
   private static final te k = te.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final te l;
   private final String m;
   @Nullable
   private final exv n;
   private final evj o = new evj().b(10);

   public exk(te $$0, te $$1, String $$2, @Nullable exv $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static exv a(@Nullable exv $$0) {
      return new exk(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static exv b(@Nullable exv $$0) {
      return new exk(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.o.c().b();
      evj.b $$0 = this.o.d(1);
      $$0.a(new etn(this.e, this.i));
      $$0.a(new etc(this.l, this.i).i(this.g - 50).b(true));
      int $$1 = 120;
      evj $$2 = new evj().a(5);
      evj.b $$3 = $$2.d(3);
      $$3.a(esi.a(td.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(esi.a(td.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(esi.a(td.k, $$0x -> this.au_()).b(120, 20).a());
      $$0.a($$2);
      this.b();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
      evi.a(this.o, this.s());
   }

   @Override
   public te e() {
      return td.a(super.e(), this.l);
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }
}
