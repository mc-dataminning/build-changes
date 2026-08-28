import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dll extends dlk implements dtx {
   public static final MapCodec<dll> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dll::new)
   );
   public static final ebf c = ebe.I;
   public static final ebm<jb> d = ebe.R;
   private final float e;
   private final float f;
   private final Map<jb, ffr> g;

   @Override
   public MapCodec<dll> a() {
      return b;
   }

   public dll(float $$0, float $$1, ean.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jb.b));
      this.g = ffo.d(dmm.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      jb $$3 = $$0.c(d);
      iv $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      dji $$1 = $$0.q();
      iv $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == eww.c)).b(d, $$0.k());
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(c) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, d);
   }
}
