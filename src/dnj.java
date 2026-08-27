import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnj extends djh implements des {
   public static final MapCodec<dnj> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csy.q.fieldOf("color").forGetter(dnj::b), u()).apply($$0, dnj::new));
   private final csy k;

   @Override
   public MapCodec<dnj> a() {
      return j;
   }

   public dnj(csy $$0, dtb.d $$1) {
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
   public csy b() {
      return this.k;
   }
}
