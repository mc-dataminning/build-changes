import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwv(ja<dwu> f, duz g) {
   public static final Codec<dwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwu.j.fieldOf("type").forGetter(dwv::a), duz.a.fieldOf("generator").forGetter(dwv::b)).apply($$0, $$0.stable(dwv::new))
   );
   public static final aks<dwv> b = aks.a(li.aT, new akt("overworld"));
   public static final aks<dwv> c = aks.a(li.aT, new akt("the_nether"));
   public static final aks<dwv> d = aks.a(li.aT, new akt("the_end"));
   public static final aks<dwv> e = aks.a(li.aT, new akt("potato"));

   public ja<dwu> a() {
      return this.f;
   }

   public duz b() {
      return this.g;
   }
}
