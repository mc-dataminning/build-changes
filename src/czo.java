import javax.annotation.Nullable;

public abstract class czo implements dah<dax> {
   protected final dan<?> a;
   protected final czu b;
   protected final String c;
   protected final dad d;
   protected final cvp e;
   protected final float f;
   protected final int g;
   @Nullable
   private dag j;

   public czo(dan<?> $$0, String $$1, czu $$2, dad $$3, cvp $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(dax $$0, deg $$1) {
      return this.d.a($$0.c());
   }

   public cvp a(dax $$0, jp.a $$1) {
      return this.e.u();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public dag a() {
      if (this.j == null) {
         this.j = dag.a(this.d);
      }

      return this.j;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cvp a(jp.a $$0) {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   public int d() {
      return this.g;
   }

   @Override
   public dan<?> e() {
      return this.a;
   }

   public czu f() {
      return this.b;
   }

   public interface a<T extends czo> {
      T create(String var1, czu var2, dad var3, cvp var4, float var5, int var6);
   }
}
