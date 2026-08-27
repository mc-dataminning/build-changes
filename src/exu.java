import javax.annotation.Nullable;

public class exu extends eyf {
   private static final ti a = ti.c("symlink_warning.title.world").a(n.r);
   private static final ti b = ti.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final ti c = ti.c("symlink_warning.title.pack").a(n.r);
   private static final ti k = ti.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final ti l;
   private final String m;
   @Nullable
   private final eyf n;
   private final evt o = new evt().b(10);

   public exu(ti $$0, ti $$1, String $$2, @Nullable eyf $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static eyf a(@Nullable eyf $$0) {
      return new exu(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static eyf b(@Nullable eyf $$0) {
      return new exu(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.o.c().b();
      evt.b $$0 = this.o.d(1);
      $$0.a(new etr(this.e, this.i));
      $$0.a(new etf(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      evt $$2 = new evt().a(5);
      evt.b $$3 = $$2.d(3);
      $$3.a(esl.a(th.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(esl.a(th.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(esl.a(th.k, $$0x -> this.au_()).b(120, 20).a());
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
   public ti g() {
      return th.a(super.g(), this.l);
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }
}
