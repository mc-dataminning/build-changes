import com.google.gson.JsonObject;

public abstract class cml implements cma<bgj> {
   protected final clx a;
   protected final cix b;
   private final cmd<?> e;
   private final cmc<?> f;
   protected final aer c;
   protected final String d;

   public cml(cmd<?> $$0, cmc<?> $$1, aer $$2, String $$3, clx $$4, cix $$5) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.a = $$4;
      this.b = $$5;
   }

   @Override
   public cmd<?> f() {
      return this.e;
   }

   @Override
   public cmc<?> ai_() {
      return this.f;
   }

   @Override
   public aer e() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   @Override
   public cix a(hs $$0) {
      return this.b;
   }

   @Override
   public hn<clx> a() {
      hn<clx> $$0 = hn.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cix a(bgj $$0, hs $$1) {
      return this.b.p();
   }

   public static class a<T extends cml> implements cmc<T> {
      final cml.a.a<T> x;

      protected a(cml.a.a<T> $$0) {
         this.x = $$0;
      }

      public T b(aer $$0, JsonObject $$1) {
         String $$2 = arg.a($$1, "group", "");
         clx $$3;
         if (arg.d($$1, "ingredient")) {
            $$3 = clx.a(arg.v($$1, "ingredient"), false);
         } else {
            $$3 = clx.a(arg.u($$1, "ingredient"), false);
         }

         String $$5 = arg.i($$1, "result");
         int $$6 = arg.o($$1, "count");
         cix $$7 = new cix(jb.i.a(new aer($$5)), $$6);
         return this.x.create($$0, $$2, $$3, $$7);
      }

      public T b(aer $$0, si $$1) {
         String $$2 = $$1.r();
         clx $$3 = clx.b($$1);
         cix $$4 = $$1.q();
         return this.x.create($$0, $$2, $$3, $$4);
      }

      public void a(si $$0, T $$1) {
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cml> {
         T create(aer var1, String var2, clx var3, cix var4);
      }
   }
}
