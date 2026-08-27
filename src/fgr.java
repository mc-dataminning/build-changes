import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fgr {
   MapCodec<fgr> b = fgs.f.dispatchMap(fgr::a, $$0 -> $$0.a().codec());

   fgs a();

   Either<fgr.b, fgr.c> b();

   public static record a(fgr b, fgf.a c) {
      public static final Codec<fgr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fgr.b.forGetter(fgr.a::a), aws.a(fgf.a.a, "filter", fgf.a.b).forGetter(fgr.a::b)).apply($$0, fgr.a::new)
      );

      public fgr a() {
         return this.b;
      }

      public fgf.a b() {
         return this.c;
      }
   }

   public interface b {
      eul load(atc var1) throws IOException;
   }

   public static record c(ajt a) {
   }
}
