import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dns extends djz implements dfp {
   public static final MapCodec<dns> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(dns::b), u()).apply($$0, dns::new));
   private final cti k;

   @Override
   public MapCodec<dns> a() {
      return j;
   }

   public dns(cti $$0, dtb.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cti b() {
      return this.k;
   }
}
