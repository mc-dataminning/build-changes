import javax.annotation.Nullable;

public abstract class czq implements daj<daz> {
   protected final dap<?> a;
   protected final czw b;
   protected final String c;
   protected final daf d;
   protected final cvx e;
   protected final float f;
   protected final int g;
   @Nullable
   private dai j;

   public czq(dap<?> $$0, String $$1, czw $$2, daf $$3, cvx $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(daz $$0, dev $$1) {
      return this.d.a($$0.c());
   }

   public cvx a(daz $$0, jr.a $$1) {
      return this.e.v();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public dai a() {
      if (this.j == null) {
         this.j = dai.a(this.d);
      }

      return this.j;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cvx a(jr.a $$0) {
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
   public dap<?> e() {
      return this.a;
   }

   public czw f() {
      return this.b;
   }

   public interface a<T extends czq> {
      T create(String var1, czw var2, daf var3, cvx var4, float var5, int var6);
   }
}
