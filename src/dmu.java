import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmu extends djc implements des {
   public static final MapCodec<dmu> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctk.q.fieldOf("color").forGetter(dmu::b), u()).apply($$0, dmu::new));
   private final ctk k;

   @Override
   public MapCodec<dmu> a() {
      return j;
   }

   public dmu(ctk $$0, dsd.d $$1) {
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
   public ctk b() {
      return this.k;
   }
}
