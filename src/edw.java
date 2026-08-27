import com.mojang.serialization.Codec;

public class edw extends edx {
   public static final edw a = new edw(dvu.a(0));
   public static final Codec<edw> b = awu.e(dvu.a, dvu.a.fieldOf("value").codec()).xmap(edw::new, edw::b);
   private final dvu d;

   public static edw a(dvu $$0) {
      return new edw($$0);
   }

   private edw(dvu $$0) {
      this.d = $$0;
   }

   public dvu b() {
      return this.d;
   }

   @Override
   public int a(axt $$0, dvx $$1) {
      return this.d.a($$1);
   }

   @Override
   public edy<?> a() {
      return edy.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
