import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dck extends daa {
   public static final MapCodec<dck> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bmh.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dck::new)
   );
   private final bmh b;

   @Override
   public MapCodec<? extends dck> a() {
      return a;
   }

   public dck(bmh $$0, dmy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, cqk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
