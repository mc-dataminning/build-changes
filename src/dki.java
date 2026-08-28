import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dki extends dhy {
   public static final MapCodec<dki> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brd.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dki::new)
   );
   private final brd b;

   @Override
   public MapCodec<? extends dki> a() {
      return a;
   }

   public dki(brd $$0, dvc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, cvx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
