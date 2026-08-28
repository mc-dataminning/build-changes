import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddq(float c, Optional<alr> d) {
   public static final Codec<ddq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azg.o.fieldOf("seconds").forGetter(ddq::b), alr.a.optionalFieldOf("cooldown_group").forGetter(ddq::c)).apply($$0, ddq::new)
   );
   public static final ze<wp, ddq> b = ze.a(zc.l, ddq::b, alr.b.a(zc::a), ddq::c, ddq::new);

   public ddq(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(dak $$0, byf $$1) {
      if ($$1 instanceof csi $$2) {
         $$2.gF().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alr> c() {
      return this.d;
   }
}
