import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erl extends ert {
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eun.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, erl::new)
   );
   private final eum b;
   private final boolean c;

   erl(List<etr> $$0, eum $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erv<erl> b() {
      return erw.g;
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.a();
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      azg $$2 = $$1.b();
      return daa.a($$1.d().J(), $$2, $$0, this.b.a($$1), this.c);
   }

   public static erl.a a(eum $$0) {
      return new erl.a($$0);
   }

   public static class a extends ert.a<erl.a> {
      private final eum a;
      private boolean b;

      public a(eum $$0) {
         this.a = $$0;
      }

      protected erl.a a() {
         return this;
      }

      public erl.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eru b() {
         return new erl(this.g(), this.a, this.b);
      }
   }
}
