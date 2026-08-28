import java.util.Objects;

public interface fbx {
   static fbx a() {
      return fcc.a;
   }

   static fbx a(bvf $$0) {
      Objects.requireNonNull($$0);

      return (fbx)(switch ($$0) {
         case crr $$1 -> crr.b($$1.dV()) ? new fcg($$1, false) : new fcc($$0, false);
         default -> new fcc($$0, false);
      });
   }

   static fbx a(bvf $$0, boolean $$1) {
      return new fcc($$0, $$1);
   }

   boolean b();

   boolean a(fcm var1, jh var2, boolean var3);

   boolean a(cxg var1);

   boolean a(etp var1, etp var2);

   fcm a(dxn var1, dgj var2, jh var3);
}
