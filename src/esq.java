import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esq extends esj {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(dph.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, esq::new)
   );
   private final dph b;
   private final boolean c;

   esq(List<euh> $$0, dph $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cud a(cud $$0, eqw $$1) {
      if (this.c) {
         $$0.a(kn.X, dph.a, this.b, ($$0x, $$1x) -> new dph.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kn.X, this.b);
      }

      return $$0;
   }

   @Override
   public esl<esq> b() {
      return esm.E;
   }

   public static esq.a a(boolean $$0) {
      return new esq.a($$0);
   }

   public static class a extends esj.a<esq.a> {
      private final dph.a a = new dph.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected esq.a a() {
         return this;
      }

      @Override
      public esk b() {
         return new esq(this.g(), this.a.a(), this.b);
      }

      public esq.a a(jj<dpg> $$0, csw $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
