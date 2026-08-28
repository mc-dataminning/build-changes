import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eun extends eug {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dqv.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, eun::new)
   );
   private final dqv b;
   private final boolean c;

   eun(List<ewe> $$0, dqv $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      if (this.c) {
         $$0.a(kr.aa, dqv.a, this.b, ($$0x, $$1x) -> new dqv.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kr.aa, this.b);
      }

      return $$0;
   }

   @Override
   public eui<eun> b() {
      return euj.E;
   }

   public static eun.a a(boolean $$0) {
      return new eun.a($$0);
   }

   public static class a extends eug.a<eun.a> {
      private final dqv.a a = new dqv.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eun.a a() {
         return this;
      }

      @Override
      public euh b() {
         return new eun(this.g(), this.a.a(), this.b);
      }

      public eun.a a(jn<dqu> $$0, cue $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
