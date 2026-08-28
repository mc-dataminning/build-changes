import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dde(float c, Optional<ali> d) {
   public static final Codec<dde> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.o.fieldOf("seconds").forGetter(dde::b), ali.a.optionalFieldOf("cooldown_group").forGetter(dde::c)).apply($$0, dde::new)
   );
   public static final yy<wl, dde> b = yy.a(yw.l, dde::b, ali.b.a(yw::a), dde::c, dde::new);

   public dde(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(czy $$0, bxu $$1) {
      if ($$1 instanceof crx $$2) {
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
