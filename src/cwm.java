public abstract class cwm implements cxd<bpf> {
   protected final cxi<?> a;
   protected final cws b;
   protected final String c;
   protected final cxa d;
   protected final csz e;
   protected final float f;
   protected final int g;

   public cwm(cxi<?> $$0, String $$1, cws $$2, cxa $$3, csz $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bpf $$0, dad $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public csz a(bpf $$0, iy.a $$1) {
      return this.e.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jf<cxa> a() {
      jf<cxa> $$0 = jf.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public csz a(iy.a $$0) {
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
   public cxi<?> e() {
      return this.a;
   }

   public cws f() {
      return this.b;
   }

   public interface a<T extends cwm> {
      T create(String var1, cws var2, cxa var3, csz var4, float var5, int var6);
   }
}
