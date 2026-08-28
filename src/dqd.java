import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqd extends djb implements dqb {
   public static final MapCodec<dqd> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dup.a.fieldOf("block_set_type").forGetter(djb::b), dqb.a.e.fieldOf("weathering_state").forGetter(dqd::m), u()).apply($$0, dqd::new)
   );
   private final dqb.a m;

   @Override
   public MapCodec<dqd> a() {
      return l;
   }

   protected dqd(dup $$0, dqb.a $$1, dtz.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(djb.f) == duw.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dua $$0) {
      return dqb.c($$0.b()).isPresent();
   }

   public dqb.a m() {
      return this.m;
   }
}
