import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record din(he<dim> e, dha f) {
   public static final Codec<din> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dim.j.fieldOf("type").forGetter(din::a), dha.a.fieldOf("generator").forGetter(din::b)).apply($$0, $$0.stable(din::new))
   );
   public static final aey<din> b = aey.a(jc.aJ, new aez("overworld"));
   public static final aey<din> c = aey.a(jc.aJ, new aez("the_nether"));
   public static final aey<din> d = aey.a(jc.aJ, new aez("the_end"));

   public he<dim> a() {
      return this.e;
   }

   public dha b() {
      return this.f;
   }
}
