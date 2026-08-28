import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djf extends dgv {
   public static final MapCodec<djf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqp.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, djf::new)
   );
   private final bqp b;

   @Override
   public MapCodec<? extends djf> a() {
      return a;
   }

   public djf(bqp $$0, dtz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, cvl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
