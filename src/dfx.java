import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dfx extends dde implements dkx {
   protected static final MapCodec<cvf> a = cvf.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dfx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dfx::b), u()).apply($$0, dfx::new));
   protected static final float c = 3.0F;
   protected static final ety d = dcv.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cvf e;

   @Override
   public MapCodec<? extends dfx> a() {
      return b;
   }

   public dfx(iv<bpv> $$0, float $$1, dpx.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dfx(cvf $$0, dpx.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cvf a(iv<bpv> $$0, float $$1) {
      return new cvf(List.of(new cvf.a($$0, axw.d($$1 * 20.0F))));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      etf $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cvf b() {
      return this.e;
   }
}
