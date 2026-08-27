import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class day extends cyo {
   public static final MapCodec<day> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bkz.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, day::new)
   );
   private final bkz b;

   @Override
   public MapCodec<? extends day> a() {
      return a;
   }

   public day(bkz $$0, dle.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, coz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
