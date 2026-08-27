import com.mojang.serialization.Codec;

public class dto extends dtp {
   public static final dto a = new dto(dlm.a(0));
   public static final Codec<dto> b = arf.e(dlm.a, dlm.a.fieldOf("value").codec()).xmap(dto::new, dto::b);
   private final dlm d;

   public static dto a(dlm $$0) {
      return new dto($$0);
   }

   private dto(dlm $$0) {
      this.d = $$0;
   }

   public dlm b() {
      return this.d;
   }

   @Override
   public int a(asc $$0, dlp $$1) {
      return this.d.a($$1);
   }

   @Override
   public dtq<?> a() {
      return dtq.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
