import com.mojang.serialization.MapCodec;

public class emq extends emr {
   public static final emq a = new emq(eek.a(0));
   public static final MapCodec<emq> b = eek.a.fieldOf("value").xmap(emq::new, emq::b);
   private final eek d;

   public static emq a(eek $$0) {
      return new emq($$0);
   }

   private emq(eek $$0) {
      this.d = $$0;
   }

   public eek b() {
      return this.d;
   }

   @Override
   public int a(bam $$0, een $$1) {
      return this.d.a($$1);
   }

   @Override
   public ems<?> a() {
      return ems.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
