import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eql extends eqs {
   public static final MapCodec<eql> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(etj.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eql::new)
   );
   private final eti b;
   private final boolean c;

   eql(List<esn> $$0, eti $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public equ b() {
      return eqv.f;
   }

   @Override
   public Set<erw<?>> a() {
      return this.b.a();
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      aym $$2 = $$1.b();
      return czc.a($$1.d().J(), $$2, $$0, this.b.a($$1), this.c);
   }

   public static eql.a a(eti $$0) {
      return new eql.a($$0);
   }

   public static class a extends eqs.a<eql.a> {
      private final eti a;
      private boolean b;

      public a(eti $$0) {
         this.a = $$0;
      }

      protected eql.a a() {
         return this;
      }

      public eql.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eqt b() {
         return new eql(this.g(), this.a, this.b);
      }
   }
}
