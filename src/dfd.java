import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfd extends cyf implements dfb {
   public static final MapCodec<dfd> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.fieldOf("block_set_type").forGetter(cyf::b), dfb.a.e.fieldOf("weathering_state").forGetter(dfd::g), u()).apply($$0, dfd::new)
   );
   private final dfb.a m;

   @Override
   public MapCodec<dfd> a() {
      return l;
   }

   protected dfd(dje $$0, dfb.a $$1, dio.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(cyf.f) == djl.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dip $$0) {
      return dfb.c($$0.b()).isPresent();
   }

   public dfb.a g() {
      return this.m;
   }
}
