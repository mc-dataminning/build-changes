import javax.annotation.Nullable;

public class eyb extends eym {
   private static final tn a = tn.c("symlink_warning.title.world").a(n.r);
   private static final tn b = tn.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final tn c = tn.c("symlink_warning.title.pack").a(n.r);
   private static final tn k = tn.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final tn l;
   private final String m;
   @Nullable
   private final eym n;
   private final ewa o = new ewa().b(10);

   public eyb(tn $$0, tn $$1, String $$2, @Nullable eym $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static eym a(@Nullable eym $$0) {
      return new eyb(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static eym b(@Nullable eym $$0) {
      return new eyb(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.o.c().b();
      ewa.b $$0 = this.o.d(1);
      $$0.a(new ety(this.e, this.i));
      $$0.a(new etm(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      ewa $$2 = new ewa().a(5);
      ewa.b $$3 = $$2.d(3);
      $$3.a(ess.a(tm.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(ess.a(tm.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(ess.a(tm.k, $$0x -> this.az_()).b(120, 20).a());
      $$0.a($$2);
      this.b();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
      evz.a(this.o, this.s());
   }

   @Override
   public tn g() {
      return tm.a(super.g(), this.l);
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }
}
