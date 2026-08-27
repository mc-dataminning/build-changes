import javax.annotation.Nullable;

public class exu extends eye {
   private static final tl a = tl.c("symlink_warning.title.world").a(n.r);
   private static final tl b = tl.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final tl c = tl.c("symlink_warning.title.pack").a(n.r);
   private static final tl k = tl.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final tl l;
   private final String m;
   @Nullable
   private final eye n;
   private final evt o = new evt().b(10);

   public exu(tl $$0, tl $$1, String $$2, @Nullable eye $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static eye a(@Nullable eye $$0) {
      return new exu(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static eye b(@Nullable eye $$0) {
      return new exu(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.o.c().b();
      evt.b $$0 = this.o.d(1);
      $$0.a(new etr(this.e, this.i));
      $$0.a(new ete(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      evt $$2 = new evt().a(5);
      evt.b $$3 = $$2.d(3);
      $$3.a(esk.a(tk.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(esk.a(tk.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(esk.a(tk.k, $$0x -> this.az_()).b(120, 20).a());
      $$0.a($$2);
      this.b();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
      evs.a(this.o, this.s());
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
