import com.mojang.serialization.MapCodec;

public class ekh extends eki {
   public static final ekh a = new ekh(ecd.a(0));
   public static final MapCodec<ekh> b = ecd.a.fieldOf("value").xmap(ekh::new, ekh::b);
   private final ecd d;

   public static ekh a(ecd $$0) {
      return new ekh($$0);
   }

   private ekh(ecd $$0) {
      this.d = $$0;
   }

   public ecd b() {
      return this.d;
   }

   @Override
   public int a(azv $$0, ecg $$1) {
      return this.d.a($$1);
   }

   @Override
   public ekj<?> a() {
      return ekj.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
