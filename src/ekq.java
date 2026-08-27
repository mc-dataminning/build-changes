import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ekq extends elg {
   public static final MapCodec<ekq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwt.a.g.fieldOf("heightmap").orElse(dwt.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ekq::new)
   );
   private final dwt.a b;
   private final int c;

   public ekq(dwt.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      dwt.a $$6;
      if ($$0 instanceof aqm) {
         if (this.b == dwt.a.a) {
            $$6 = dwt.a.b;
         } else if (this.b == dwt.a.c) {
            $$6 = dwt.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      io $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new elj.c(new io($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eli<?> a() {
      return eli.g;
   }
}
