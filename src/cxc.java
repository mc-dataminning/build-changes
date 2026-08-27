import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxc extends cut {
   public static final MapCodec<cxc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bhv.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, cxc::new)
   );
   private final bhv b;

   @Override
   public MapCodec<? extends cxc> a() {
      return a;
   }

   public cxc(bhv $$0, dgv.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, clb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
