import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eoy extends eoo {
   public static final Codec<eoy> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ajt.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  aws.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kr.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eoy::new)
   );
   private final ajt b;
   private final long c;
   private final il<dmh<?>> d;

   private eoy(List<eqc> $$0, ajt $$1, long $$2, il<dmh<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eoq b() {
      return eor.t;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         $$0.b(jp.U, new cuh(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(enk $$0) {
      super.a($$0);
      end<enj> $$1 = new end<>(eng.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static eoo.a<?> a(dmh<?> $$0, ajt $$1) {
      return a($$2 -> new eoy($$2, $$1, 0L, $$0.a()));
   }

   public static eoo.a<?> a(dmh<?> $$0, ajt $$1, long $$2) {
      return a($$3 -> new eoy($$3, $$1, $$2, $$0.a()));
   }
}
