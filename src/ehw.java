import com.mojang.serialization.MapCodec;

public class ehw extends ehx {
   public static final ehw a = new ehw(dzs.a(0));
   public static final MapCodec<ehw> b = dzs.a.fieldOf("value").xmap(ehw::new, ehw::b);
   private final dzs d;

   public static ehw a(dzs $$0) {
      return new ehw($$0);
   }

   private ehw(dzs $$0) {
      this.d = $$0;
   }

   public dzs b() {
      return this.d;
   }

   @Override
   public int a(ayw $$0, dzv $$1) {
      return this.d.a($$1);
   }

   @Override
   public ehy<?> a() {
      return ehy.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
