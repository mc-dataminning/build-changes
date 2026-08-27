import javax.annotation.Nullable;

public class eyt extends ezd {
   private static final ui a = ui.c("symlink_warning.title.world").a(n.r);
   private static final ui b = ui.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final ui c = ui.c("symlink_warning.title.pack").a(n.r);
   private static final ui k = ui.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final ui l;
   private final String m;
   @Nullable
   private final ezd n;
   private final ews o = new ews().b(10);

   public eyt(ui $$0, ui $$1, String $$2, @Nullable ezd $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static ezd a(@Nullable ezd $$0) {
      return new eyt(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static ezd b(@Nullable ezd $$0) {
      return new eyt(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.o.c().b();
      ews.b $$0 = this.o.d(1);
      $$0.a(new euq(this.e, this.i));
      $$0.a(new eud(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      ews $$2 = new ews().a(5);
      ews.b $$3 = $$2.d(3);
      $$3.a(etj.a(uh.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(etj.a(uh.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(etj.a(uh.k, $$0x -> this.aC_()).b(120, 20).a());
      $$0.a($$2);
      this.c();
      this.o.a(this::d);
   }

   @Override
   protected void c() {
      this.o.a();
      ewr.a(this.o, this.s());
   }

   @Override
   public ui h() {
      return uh.a(super.h(), this.l);
   }

   @Override
   public void aC_() {
      this.f.a(this.n);
   }
}
