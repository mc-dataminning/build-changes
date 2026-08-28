import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czg(float c, Optional<ali> d) {
   public static final Codec<czg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayt.o.fieldOf("seconds").forGetter(czg::b), ali.a.optionalFieldOf("cooldown_group").forGetter(czg::c)).apply($$0, czg::new)
   );
   public static final zg<wt, czg> b = zg.a(ze.j, czg::b, ali.b.a(ze::a), czg::c, czg::new);

   public czg(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cwb $$0, bva $$1) {
      if ($$1 instanceof com $$2) {
         $$2.gF().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<ali> c() {
      return this.d;
   }
}
