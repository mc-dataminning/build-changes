import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doc extends deu implements dnz {
   public static final MapCodec<doc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnz.a.e.fieldOf("weathering_state").forGetter(dfv::c), u()).apply($$0, doc::new)
   );
   private final dnz.a e;

   @Override
   public MapCodec<doc> a() {
      return d;
   }

   public doc(dnz.a $$0, drw.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drx $$0) {
      return dnz.c($$0.b()).isPresent();
   }

   public dnz.a m() {
      return this.e;
   }
}
