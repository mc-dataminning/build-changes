import java.util.UUID;

public record aiy(String b, UUID c) implements zg<aiw> {
   public static final yx<vw, aiy> a = zg.a(aiy::a, aiy::new);

   private aiy(vw $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vw $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zi<aiy> a() {
      return aiu.g;
   }

   public void a(aiw $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
