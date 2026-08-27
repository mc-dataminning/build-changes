import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpr(il<dpq> e, dob f) {
   public static final Codec<dpr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpq.j.fieldOf("type").forGetter(dpr::a), dob.a.fieldOf("generator").forGetter(dpr::b)).apply($$0, $$0.stable(dpr::new))
   );
   public static final ajb<dpr> b = ajb.a(ki.aO, new ajc("overworld"));
   public static final ajb<dpr> c = ajb.a(ki.aO, new ajc("the_nether"));
   public static final ajb<dpr> d = ajb.a(ki.aO, new ajc("the_end"));

   public il<dpq> a() {
      return this.e;
   }

   public dob b() {
      return this.f;
   }
}
