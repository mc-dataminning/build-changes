import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dls extends dwd {
   public static final MapCodec<dls> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alf.a(mh.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               alf.a(mh.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
               alf.a(mh.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dls::new)
   );
   public static final ebr<jb> b = dqs.e;
   private static final Map<jb, ffw> c = fft.c(dmr.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final alf<dmr> d;
   private final alf<dmr> e;
   private final alf<czj> f;

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   protected dls(alf<dmr> $$0, alf<dmr> $$1, alf<czj> $$2, eas.d $$3) {
      super($$3);
      this.l(this.C.b().b(b, jb.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dmr> $$8 = $$1.F_().f(mh.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dux.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(dmt.cN);
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn((djl)DataFixUtils.orElse($$0.F_().f(mh.K).f(this.f), this));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }
}
