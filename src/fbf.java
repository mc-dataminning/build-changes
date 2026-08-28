import java.util.Objects;

public interface fbf {
   static fbf a() {
      return fbk.a;
   }

   static fbf a(buk $$0) {
      Objects.requireNonNull($$0);

      return (fbf)(switch ($$0) {
         case cqw $$1 -> cqw.b($$1.dW()) ? new fbo($$1, false) : new fbk($$0, false);
         default -> new fbk($$0, false);
      });
   }

   static fbf a(buk $$0, boolean $$1) {
      return new fbk($$0, $$1);
   }

   boolean b();

   boolean a(fbu var1, ji var2, boolean var3);

   boolean a(cwl var1);

   boolean a(esz var1, esz var2);

   fbu a(dwx var1, dfr var2, ji var3);
}
