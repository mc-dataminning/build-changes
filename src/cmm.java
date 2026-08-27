import com.google.gson.JsonObject;

public abstract class cmm implements cmb<bgj> {
   protected final cly a;
   protected final ciy b;
   private final cme<?> e;
   private final cmd<?> f;
   protected final aer c;
   protected final String d;

   public cmm(cme<?> $$0, cmd<?> $$1, aer $$2, String $$3, cly $$4, ciy $$5) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.a = $$4;
      this.b = $$5;
   }

   @Override
   public cme<?> f() {
      return this.e;
   }

   @Override
   public cmd<?> aj_() {
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
   public ciy a(hs $$0) {
      return this.b;
   }

   @Override
   public hn<cly> a() {
      hn<cly> $$0 = hn.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public ciy a(bgj $$0, hs $$1) {
      return this.b.p();
   }

   public static class a<T extends cmm> implements cmd<T> {
      final cmm.a.a<T> x;

      protected a(cmm.a.a<T> $$0) {
         this.x = $$0;
      }

      public T b(aer $$0, JsonObject $$1) {
         String $$2 = arg.a($$1, "group", "");
         cly $$3;
         if (arg.d($$1, "ingredient")) {
            $$3 = cly.a(arg.v($$1, "ingredient"), false);
         } else {
            $$3 = cly.a(arg.u($$1, "ingredient"), false);
         }

         String $$5 = arg.i($$1, "result");
         int $$6 = arg.o($$1, "count");
         ciy $$7 = new ciy(jb.i.a(new aer($$5)), $$6);
         return this.x.create($$0, $$2, $$3, $$7);
      }

      public T b(aer $$0, si $$1) {
         String $$2 = $$1.r();
         cly $$3 = cly.b($$1);
         ciy $$4 = $$1.q();
         return this.x.create($$0, $$2, $$3, $$4);
      }

      public void a(si $$0, T $$1) {
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cmm> {
         T create(aer var1, String var2, cly var3, ciy var4);
      }
   }
}
