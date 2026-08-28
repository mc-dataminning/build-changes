import com.mojang.brigadier.StringReader;

public class bmf extends blw<StringReader> {
   private final StringReader a;

   public bmf(blt<StringReader> $$0, blu<StringReader> $$1, StringReader $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   public StringReader d() {
      return this.a;
   }

   @Override
   public int c() {
      return this.a.getCursor();
   }

   @Override
   public void a(int $$0) {
      this.a.setCursor($$0);
   }
}
