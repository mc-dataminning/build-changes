public class enm extends Exception {
   public final emb a;

   public enm(emb $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
