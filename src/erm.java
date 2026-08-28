import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erm extends eru {
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euo.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, erm::new)
   );
   private final eun b;
   private final boolean c;

   erm(List<ets> $$0, eun $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erw<erm> b() {
      return erx.g;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.a();
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      azh $$2 = $$1.b();
      return dab.a($$1.d().J(), $$2, $$0, this.b.a($$1), this.c);
   }

   public static erm.a a(eun $$0) {
      return new erm.a($$0);
   }

   public static class a extends eru.a<erm.a> {
      private final eun a;
      private boolean b;

      public a(eun $$0) {
         this.a = $$0;
      }

      protected erm.a a() {
         return this;
      }

      public erm.a e() {
         this.b = true;
         return this;
      }

      @Override
      public erv b() {
         return new erm(this.g(), this.a, this.b);
      }
   }
}
