import javax.annotation.Nullable;

public class afc implements zl<abw> {
   public static final zc<we, afc> a = zl.a(afc::a, afc::new);
   private final int b;
   private final int c;

   public afc(brv $$0, @Nullable brv $$1) {
      this.b = $$0.al();
      this.c = $$1 != null ? $$1.al() : 0;
   }

   private afc(we $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(we $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zn<afc> a() {
      return agj.aE;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
