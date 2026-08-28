import javax.annotation.Nullable;

public interface cki extends ckz {
   void b(boolean var1);

   @Nullable
   buf m();

   void a();

   default void b(buf $$0, float $$1) {
      brj $$2 = cok.a($$0, cvo.vX);
      cvl $$3 = $$0.b($$2);
      if ($$3.h() instanceof cty $$4) {
         $$4.a($$0.dS(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dS().am().a() * 4), this.m());
      }

      this.a();
   }
}
