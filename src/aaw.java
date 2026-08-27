import javax.annotation.Nullable;

public record aaw(ajt b, @Nullable byte[] c) implements yn<aav> {
   public static final ye<vg, aaw> a = yn.a(aaw::a, aaw::new);

   private aaw(vg $$0) {
      this($$0.q(), $$0.c(za.b));
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, za.b);
   }

   @Override
   public yp<aaw> a() {
      return aau.b;
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
