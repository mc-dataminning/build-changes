import javax.annotation.Nullable;

public class exo extends exz {
   private static final tf a = tf.c("symlink_warning.title.world").a(n.r);
   private static final tf b = tf.a("symlink_warning.message.world", "https://aka.ms/MinecraftSymLinks");
   private static final tf c = tf.c("symlink_warning.title.pack").a(n.r);
   private static final tf k = tf.a("symlink_warning.message.pack", "https://aka.ms/MinecraftSymLinks");
   private final tf l;
   private final String m;
   @Nullable
   private final exz n;
   private final evn o = new evn().b(10);

   public exo(tf $$0, tf $$1, String $$2, @Nullable exz $$3) {
      super($$0);
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   public static exz a(@Nullable exz $$0) {
      return new exo(a, b, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   public static exz b(@Nullable exz $$0) {
      return new exo(c, k, "https://aka.ms/MinecraftSymLinks", $$0);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.o.c().b();
      evn.b $$0 = this.o.d(1);
      $$0.a(new etm(this.e, this.i));
      $$0.a(new etb(this.l, this.i).i(this.g - 50).b(true));
      int $$1 = 120;
      evn $$2 = new evn().a(5);
      evn.b $$3 = $$2.d(3);
      $$3.a(esh.a(te.n, $$0x -> ac.i().a(this.m)).b(120, 20).a());
      $$3.a(esh.a(te.o, $$0x -> this.f.o.a(this.m)).b(120, 20).a());
      $$3.a(esh.a(te.k, $$0x -> this.au_()).b(120, 20).a());
      $$0.a($$2);
      this.b();
      this.o.a(this::d);
   }

   @Override
   protected void b() {
      this.o.a();
      evm.a(this.o, this.s());
   }

   @Override
   public tf e() {
      return te.a(super.e(), this.l);
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }
}
