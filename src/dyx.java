import com.mojang.serialization.Codec;

public class dyx extends dyp {
   public static final Codec<dyx> a = aqk.a(jc.e).fieldOf("tag").xmap(dyx::new, $$0 -> $$0.b).codec();
   private final aqk<ctc> b;

   public dyx(aqk<ctc> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfd $$0, ash $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyq<?> a() {
      return dyq.d;
   }
}
