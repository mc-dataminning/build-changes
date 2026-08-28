import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxx(jn<dxw> e, dvx f) {
   public static final Codec<dxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxw.k.fieldOf("type").forGetter(dxx::a), dvx.a.fieldOf("generator").forGetter(dxx::b)).apply($$0, $$0.stable(dxx::new))
   );
   public static final ala<dxx> b = ala.a(lv.bb, alb.b("overworld"));
   public static final ala<dxx> c = ala.a(lv.bb, alb.b("the_nether"));
   public static final ala<dxx> d = ala.a(lv.bb, alb.b("the_end"));

   public jn<dxw> a() {
      return this.e;
   }

   public dvx b() {
      return this.f;
   }
}
