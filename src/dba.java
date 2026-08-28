import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dba(float c, Optional<ald> d) {
   public static final Codec<dba> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.o.fieldOf("seconds").forGetter(dba::b), ald.a.optionalFieldOf("cooldown_group").forGetter(dba::c)).apply($$0, dba::new)
   );
   public static final yt<wg, dba> b = yt.a(yr.l, dba::b, ald.b.a(yr::a), dba::c, dba::new);

   public dba(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cxy $$0, bwr $$1) {
      if ($$1 instanceof cqi $$2) {
         $$2.gE().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<ald> c() {
      return this.d;
   }
}
