import com.mojang.serialization.MapCodec;

public class emj extends emk {
   public static final emj a = new emj(eed.a(0));
   public static final MapCodec<emj> b = eed.a.fieldOf("value").xmap(emj::new, emj::b);
   private final eed d;

   public static emj a(eed $$0) {
      return new emj($$0);
   }

   private emj(eed $$0) {
      this.d = $$0;
   }

   public eed b() {
      return this.d;
   }

   @Override
   public int a(bac $$0, eeg $$1) {
      return this.d.a($$1);
   }

   @Override
   public eml<?> a() {
      return eml.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
