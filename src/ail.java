import javax.annotation.Nullable;

public class ail implements zw<agw> {
   public static final zn<wm, ail> a = zw.a(ail::a, ail::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ail(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ail(wm $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<ail> a() {
      return agu.bV;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   @Nullable
   public daz a(dby $$0) {
      bsu $$1 = $$0.a(this.b);
      return $$1 instanceof cpb ? ((cpb)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
