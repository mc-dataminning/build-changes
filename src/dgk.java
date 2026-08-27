import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgk extends dea {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpb.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dgk::new)
   );
   private final bpb b;

   @Override
   public MapCodec<? extends dgk> a() {
      return a;
   }

   public dgk(bpb $$0, drc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, ctq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
