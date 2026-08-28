import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezf extends eyy {
   public static final MapCodec<ezf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dvb.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, ezf::new)
   );
   private final dvb b;
   private final boolean c;

   ezf(List<fau> $$0, dvb $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxy a(cxy $$0, exl $$1) {
      if (this.c) {
         $$0.a(kx.ak, dvb.a, this.b, ($$0x, $$1x) -> new dvb.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kx.ak, this.b);
      }

      return $$0;
   }

   @Override
   public eza<ezf> b() {
      return ezb.E;
   }

   public static ezf.a a(boolean $$0) {
      return new ezf.a($$0);
   }

   public static class a extends eyy.a<ezf.a> {
      private final dvb.a a = new dvb.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ezf.a a() {
         return this;
      }

      @Override
      public eyz b() {
         return new ezf(this.g(), this.a.a(), this.b);
      }

      public ezf.a a(js<dva> $$0, cwv $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
