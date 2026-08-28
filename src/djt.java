import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djt extends dhj {
   public static final MapCodec<djt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqu.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, djt::new)
   );
   private final bqu b;

   @Override
   public MapCodec<? extends djt> a() {
      return a;
   }

   public djt(bqu $$0, dun.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, cvp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
