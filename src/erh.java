import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erh extends erp {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euj.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, erh::new)
   );
   private final eui b;
   private final boolean c;

   erh(List<etn> $$0, eui $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public err<erh> b() {
      return ers.g;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.a();
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      azc $$2 = $$1.b();
      return czw.a($$1.d().J(), $$2, $$0, this.b.a($$1), this.c);
   }

   public static erh.a a(eui $$0) {
      return new erh.a($$0);
   }

   public static class a extends erp.a<erh.a> {
      private final eui a;
      private boolean b;

      public a(eui $$0) {
         this.a = $$0;
      }

      protected erh.a a() {
         return this;
      }

      public erh.a e() {
         this.b = true;
         return this;
      }

      @Override
      public erq b() {
         return new erh(this.g(), this.a, this.b);
      }
   }
}
