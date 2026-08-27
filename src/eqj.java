import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqj extends eqq {
   public static final MapCodec<eqj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eth.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eqj::new)
   );
   private final etg b;
   private final boolean c;

   eqj(List<esl> $$0, etg $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eqs b() {
      return eqt.f;
   }

   @Override
   public Set<eru<?>> a() {
      return this.b.a();
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      ayk $$2 = $$1.b();
      return cza.a($$1.d().J(), $$2, $$0, this.b.a($$1), this.c);
   }

   public static eqj.a a(etg $$0) {
      return new eqj.a($$0);
   }

   public static class a extends eqq.a<eqj.a> {
      private final etg a;
      private boolean b;

      public a(etg $$0) {
         this.a = $$0;
      }

      protected eqj.a a() {
         return this;
      }

      public eqj.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eqr b() {
         return new eqj(this.g(), this.a, this.b);
      }
   }
}
