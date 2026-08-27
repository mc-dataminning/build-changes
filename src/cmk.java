import com.google.gson.JsonObject;

public abstract class cmk implements clz<bgh> {
   protected final clw a;
   protected final ciw b;
   private final cmc<?> e;
   private final cmb<?> f;
   protected final aep c;
   protected final String d;

   public cmk(cmc<?> $$0, cmb<?> $$1, aep $$2, String $$3, clw $$4, ciw $$5) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.a = $$4;
      this.b = $$5;
   }

   @Override
   public cmc<?> f() {
      return this.e;
   }

   @Override
   public cmb<?> aj_() {
      return this.f;
   }

   @Override
   public aep e() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   @Override
   public ciw a(ht $$0) {
      return this.b;
   }

   @Override
   public ho<clw> a() {
      ho<clw> $$0 = ho.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public ciw a(bgh $$0, ht $$1) {
      return this.b.p();
   }

   public static class a<T extends cmk> implements cmb<T> {
      final cmk.a.a<T> x;

      protected a(cmk.a.a<T> $$0) {
         this.x = $$0;
      }

      public T b(aep $$0, JsonObject $$1) {
         String $$2 = arf.a($$1, "group", "");
         clw $$3;
         if (arf.d($$1, "ingredient")) {
            $$3 = clw.a(arf.v($$1, "ingredient"), false);
         } else {
            $$3 = clw.a(arf.u($$1, "ingredient"), false);
         }

         String $$5 = arf.i($$1, "result");
         int $$6 = arf.o($$1, "count");
         ciw $$7 = new ciw(jc.i.a(new aep($$5)), $$6);
         return this.x.create($$0, $$2, $$3, $$7);
      }

      public T b(aep $$0, sh $$1) {
         String $$2 = $$1.r();
         clw $$3 = clw.b($$1);
         ciw $$4 = $$1.q();
         return this.x.create($$0, $$2, $$3, $$4);
      }

      public void a(sh $$0, T $$1) {
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cmk> {
         T create(aep var1, String var2, clw var3, ciw var4);
      }
   }
}
