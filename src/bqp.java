import com.mojang.brigadier.StringReader;

public class bqp extends bpu<StringReader> {
   private final StringReader a;

   public bqp(bpy<StringReader> $$0, StringReader $$1) {
      super($$0);
      this.a = $$1;
   }

   public StringReader h() {
      return this.a;
   }

   @Override
   public int g() {
      return this.a.getCursor();
   }

   @Override
   public void a(int $$0) {
      this.a.setCursor($$0);
   }
}
