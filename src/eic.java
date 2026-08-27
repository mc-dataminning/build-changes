import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eic extends eii {
   public static final Codec<eic> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekr.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eic::new)
   );
   private final ekq b;
   private final boolean c;

   eic(List<ejv> $$0, ekq $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eik b() {
      return eil.d;
   }

   @Override
   public Set<eje<?>> a() {
      return this.b.a();
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      auv $$2 = $$1.b();
      return crl.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static eic.a a(ekq $$0) {
      return new eic.a($$0);
   }

   public static class a extends eii.a<eic.a> {
      private final ekq a;
      private boolean b;

      public a(ekq $$0) {
         this.a = $$0;
      }

      protected eic.a a() {
         return this;
      }

      public eic.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eij b() {
         return new eic(this.g(), this.a, this.b);
      }
   }
}
