import javax.annotation.Nullable;

public class exp extends eya {
   private static final tf a = tf.c("symlink_warning.title.world").a(n.r);
   private static final tf b = tf.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final tf c = tf.c("symlink_warning.title.pack").a(n.r);
   private static final tf k = tf.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final tf l;
   private final String m;
   @Nullable
   private final eya n;
   private final evo o = new evo().b(10);

   public exp(tf $$0, tf $$1, String $$2, @Nullable eya $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static eya a(@Nullable eya $$0) {
      return new exp(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static eya b(@Nullable eya $$0) {
      return new exp(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aC_() {
      super.aC_();
      this.o.c().b();
      evo.b $$0 = this.o.d(1);
      $$0.a(new etm(this.e, this.i));
      $$0.a(new eta(this.l, this.i).j(this.g - 50).b(true));
      int $$1 = 120;
      evo $$2 = new evo().a(5);
      evo.b $$3 = $$2.d(3);
      $$3.a(esg.a(te.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(esg.a(te.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(esg.a(te.k, $$0x -> this.at_()).b(120, 20).a());
      $$0.a($$2);
      this.b();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
      evn.a(this.o, this.s());
   }

   @Override
   public tf e() {
      return te.a(super.e(), this.l);
   }

   @Override
   public void at_() {
      this.f.a(this.n);
   }
}
