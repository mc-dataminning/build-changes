import javax.annotation.Nullable;

public class afk implements zo<acd> {
   public static final zf<we, afk> a = zo.a(afk::a, afk::new);
   private final int b;
   private final int c;

   public afk(btz $$0, @Nullable btz $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private afk(we $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(we $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zq<afk> a() {
      return ags.aD;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
