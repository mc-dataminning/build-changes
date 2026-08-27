import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eib extends eih {
   public static final Codec<eib> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekq.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eib::new)
   );
   private final ekp b;
   private final boolean c;

   eib(List<eju> $$0, ekp $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eij b() {
      return eik.d;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.b.a();
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      auu $$2 = $$1.b();
      return crk.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static eib.a a(ekp $$0) {
      return new eib.a($$0);
   }

   public static class a extends eih.a<eib.a> {
      private final ekp a;
      private boolean b;

      public a(ekp $$0) {
         this.a = $$0;
      }

      protected eib.a a() {
         return this;
      }

      public eib.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eii b() {
         return new eib(this.g(), this.a, this.b);
      }
   }
}
