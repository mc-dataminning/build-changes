import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehv extends eib {
   public static final Codec<ehv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekk.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ehv::new)
   );
   private final ekj b;
   private final boolean c;

   ehv(List<ejo> $$0, ekj $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eid b() {
      return eie.d;
   }

   @Override
   public Set<eix<?>> a() {
      return this.b.a();
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      aup $$2 = $$1.b();
      return cre.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static ehv.a a(ekj $$0) {
      return new ehv.a($$0);
   }

   public static class a extends eib.a<ehv.a> {
      private final ekj a;
      private boolean b;

      public a(ekj $$0) {
         this.a = $$0;
      }

      protected ehv.a a() {
         return this;
      }

      public ehv.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eic b() {
         return new ehv(this.g(), this.a, this.b);
      }
   }
}
