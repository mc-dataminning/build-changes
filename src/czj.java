import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czj(jo<awf> c) implements czi {
   public static final MapCodec<czj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awf.b.fieldOf("sound").forGetter(czj::b)).apply($$0, czj::new));
   public static final zc<wp, czj> b = zc.a(awf.d, czj::b, czj::new);

   @Override
   public czi.a<czj> a() {
      return czi.a.e;
   }

   @Override
   public boolean a(dej $$0, cvs $$1, bun $$2) {
      $$0.a(null, $$2.ds(), this.c.a(), $$2.di(), 1.0F, 1.0F);
      return true;
   }

   public jo<awf> b() {
      return this.c;
   }
}
