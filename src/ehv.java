import com.mojang.serialization.MapCodec;

public class ehv extends ehw {
   public static final ehv a = new ehv(dzs.a(0));
   public static final MapCodec<ehv> b = dzs.a.fieldOf("value").xmap(ehv::new, ehv::b);
   private final dzs d;

   public static ehv a(dzs $$0) {
      return new ehv($$0);
   }

   private ehv(dzs $$0) {
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
   public ehx<?> a() {
      return ehx.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
