import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dii extends dfy {
   public static final MapCodec<dii> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpw.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dii::new)
   );
   private final bpw b;

   @Override
   public MapCodec<? extends dii> a() {
      return a;
   }

   public dii(bpw $$0, dtb.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
