import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpn extends dnc {
   public static final MapCodec<dpn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btw.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dpn::new)
   );
   private final btw b;

   @Override
   public MapCodec<? extends dpn> a() {
      return a;
   }

   public dpn(btw $$0, ebd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, czy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
