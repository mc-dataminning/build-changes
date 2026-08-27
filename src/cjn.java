import com.google.gson.JsonObject;

public abstract class cjn implements cjc<bdq> {
   protected final ciz a;
   protected final cfz b;
   private final cjf<?> e;
   private final cje<?> f;
   protected final acq c;
   protected final String d;

   public cjn(cjf<?> $$0, cje<?> $$1, acq $$2, String $$3, ciz $$4, cfz $$5) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.a = $$4;
      this.b = $$5;
   }

   @Override
   public cjf<?> f() {
      return this.e;
   }

   @Override
   public cje<?> aj_() {
      return this.f;
   }

   @Override
   public acq e() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   @Override
   public cfz a(hs $$0) {
      return this.b;
   }

   @Override
   public hn<ciz> a() {
      hn<ciz> $$0 = hn.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cfz a(bdq $$0, hs $$1) {
      return this.b.p();
   }

   public static class a<T extends cjn> implements cje<T> {
      final cjn.a.a<T> x;

      protected a(cjn.a.a<T> $$0) {
         this.x = $$0;
      }

      public T b(acq $$0, JsonObject $$1) {
         String $$2 = aor.a($$1, "group", "");
         ciz $$3;
         if (aor.d($$1, "ingredient")) {
            $$3 = ciz.a(aor.v($$1, "ingredient"), false);
         } else {
            $$3 = ciz.a(aor.u($$1, "ingredient"), false);
         }

         String $$5 = aor.i($$1, "result");
         int $$6 = aor.o($$1, "count");
         cfz $$7 = new cfz(jb.i.a(new acq($$5)), $$6);
         return this.x.create($$0, $$2, $$3, $$7);
      }

      public T b(acq $$0, sf $$1) {
         String $$2 = $$1.s();
         ciz $$3 = ciz.b($$1);
         cfz $$4 = $$1.r();
         return this.x.create($$0, $$2, $$3, $$4);
      }

      public void a(sf $$0, T $$1) {
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cjn> {
         T create(acq var1, String var2, ciz var3, cfz var4);
      }
   }
}
