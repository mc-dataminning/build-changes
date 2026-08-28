import javax.annotation.Nullable;

public record aen(String b, @Nullable String c) implements zk<abz> {
   public static final zb<wa, aen> a = zk.a(aen::a, aen::new);

   private aen(wa $$0) {
      this($$0.p(), $$0.c(wa::p));
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wa::a);
   }

   @Override
   public zm<aen> a() {
      return ago.ch;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
