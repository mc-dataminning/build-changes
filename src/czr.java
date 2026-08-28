import javax.annotation.Nullable;

public abstract class czr implements dak<dba> {
   protected final daq<?> a;
   protected final czx b;
   protected final String c;
   protected final dag d;
   protected final cvs e;
   protected final float f;
   protected final int g;
   @Nullable
   private daj j;

   public czr(daq<?> $$0, String $$1, czx $$2, dag $$3, cvs $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(dba $$0, dej $$1) {
      return this.d.a($$0.c());
   }

   public cvs a(dba $$0, jq.a $$1) {
      return this.e.u();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public daj a() {
      if (this.j == null) {
         this.j = daj.a(this.d);
      }

      return this.j;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cvs a(jq.a $$0) {
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
   public daq<?> e() {
      return this.a;
   }

   public czx f() {
      return this.b;
   }

   public interface a<T extends czr> {
      T create(String var1, czx var2, dag var3, cvs var4, float var5, int var6);
   }
}
