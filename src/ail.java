import javax.annotation.Nullable;

public class ail implements zo<agu> {
   public static final zf<we, ail> a = zo.a(ail::a, ail::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ail(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ail(we $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq<ail> a() {
      return ags.bY;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   @Nullable
   public ddv a(dev $$0) {
      btz $$1 = $$0.a(this.b);
      return $$1 instanceof cqo ? ((cqo)$$1).E() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
