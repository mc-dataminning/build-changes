import java.util.function.Supplier;

public interface ban {
   String b = "root";

   void a();

   void b();

   void a(String var1);

   void a(Supplier<String> var1);

   void c();

   void b(String var1);

   void b(Supplier<String> var1);

   void a(bbr var1);

   default void d(String $$0) {
      this.a($$0, 1);
   }

   void a(String var1, int var2);

   default void c(Supplier<String> $$0) {
      this.a($$0, 1);
   }

   void a(Supplier<String> var1, int var2);

   static ban a(final ban $$0, final ban $$1) {
      if ($$0 == bak.a) {
         return $$1;
      } else {
         return $$1 == bak.a ? $$0 : new ban() {
            @Override
            public void a() {
               $$0.a();
               $$1.a();
            }

            @Override
            public void b() {
               $$0.b();
               $$1.b();
            }

            @Override
            public void a(String $$0x) {
               $$0.a($$0);
               $$1.a($$0);
            }

            @Override
            public void a(Supplier<String> $$0x) {
               $$0.a($$0);
               $$1.a($$0);
            }

            @Override
            public void a(bbr $$0x) {
               $$0.a($$0);
               $$1.a($$0);
            }

            @Override
            public void c() {
               $$0.c();
               $$1.c();
            }

            @Override
            public void b(String $$0x) {
               $$0.b($$0);
               $$1.b($$0);
            }

            @Override
            public void b(Supplier<String> $$0x) {
               $$0.b($$0);
               $$1.b($$0);
            }

            @Override
            public void a(String $$0x, int $$1x) {
               $$0.a($$0, $$1);
               $$1.a($$0, $$1);
            }

            @Override
            public void a(Supplier<String> $$0x, int $$1x) {
               $$0.a($$0, $$1);
               $$1.a($$0, $$1);
            }
         };
      }
   }
}
