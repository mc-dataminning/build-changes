import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddg(float c, Optional<alk> d) {
   public static final Codec<ddg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayy.o.fieldOf("seconds").forGetter(ddg::b), alk.a.optionalFieldOf("cooldown_group").forGetter(ddg::c)).apply($$0, ddg::new)
   );
   public static final za<wn, ddg> b = za.a(yy.l, ddg::b, alk.b.a(yy::a), ddg::c, ddg::new);

   public ddg(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(daa $$0, bxw $$1) {
      if ($$1 instanceof crz $$2) {
         $$2.gF().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alk> c() {
      return this.d;
   }
}
