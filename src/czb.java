import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czb(float c, Optional<ale> d) {
   public static final Codec<czb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayo.n.fieldOf("seconds").forGetter(czb::b), ale.a.optionalFieldOf("cooldown_group").forGetter(czb::c)).apply($$0, czb::new)
   );
   public static final zc<wp, czb> b = zc.a(za.j, czb::b, ale.b.a(za::a), czb::c, czb::new);

   public czb(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cvs $$0, bun $$1) {
      if ($$1 instanceof cnx $$2) {
         $$2.gy().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<ale> c() {
      return this.d;
   }
}
