import javax.annotation.Nullable;

public class afc implements zd<abs> {
   public static final yu<vs, afc> a = zd.a(afc::a, afc::new);
   private final int b;
   private final int c;

   public afc(bwa $$0, @Nullable bwa $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private afc(vs $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vs $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zf<afc> a() {
      return agl.aG;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
