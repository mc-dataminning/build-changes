import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dlq extends dlp implements duc {
   public static final MapCodec<dlq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dlq::new)
   );
   public static final ebk c = ebj.I;
   public static final ebr<jb> d = ebj.R;
   private final float e;
   private final float f;
   private final Map<jb, ffw> g;

   @Override
   public MapCodec<dlq> a() {
      return b;
   }

   public dlq(float $$0, float $$1, eas.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jb.b));
      this.g = fft.d(dmr.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      jb $$3 = $$0.c(d);
      iv $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      djn $$1 = $$0.q();
      iv $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == exb.c)).b(d, $$0.k());
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(c) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, d);
   }
}
