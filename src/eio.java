import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eio extends eje {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dur.a.g.fieldOf("heightmap").orElse(dur.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eio::new)
   );
   private final dur.a b;
   private final int c;

   public eio(dur.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      dur.a $$6;
      if ($$0 instanceof aps) {
         if (this.b == dur.a.a) {
            $$6 = dur.a.b;
         } else if (this.b == dur.a.c) {
            $$6 = dur.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ib $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ejh.c(new ib($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ejg<?> a() {
      return ejg.g;
   }
}
