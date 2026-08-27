import javax.annotation.Nullable;

public class exz extends eyk {
   private static final tl a = tl.c("symlink_warning.title.world").a(n.r);
   private static final tl b = tl.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final tl c = tl.c("symlink_warning.title.pack").a(n.r);
   private static final tl k = tl.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final tl l;
   private final String m;
   @Nullable
   private final eyk n;
   private final evy o = new evy().b(10);

   public exz(tl $$0, tl $$1, String $$2, @Nullable eyk $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static eyk a(@Nullable eyk $$0) {
      return new exz(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static eyk b(@Nullable eyk $$0) {
      return new exz(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.o.c().b();
      evy.b $$0 = this.o.d(1);
      $$0.a(new etw(this.e, this.i));
      $$0.a(new etk(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      evy $$2 = new evy().a(5);
      evy.b $$3 = $$2.d(3);
      $$3.a(esq.a(tk.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(esq.a(tk.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(esq.a(tk.k, $$0x -> this.az_()).b(120, 20).a());
      $$0.a($$2);
      this.b();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
      evx.a(this.o, this.s());
   }

   @Override
   public tl g() {
      return tk.a(super.g(), this.l);
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }
}
