import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehk extends ehq {
   public static final Codec<ehk> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ejz.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ehk::new)
   );
   private final ejy b;
   private final boolean c;

   ehk(List<ejd> $$0, ejy $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ehs b() {
      return eht.d;
   }

   @Override
   public Set<eim<?>> a() {
      return this.b.a();
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      auf $$2 = $$1.b();
      return cqu.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static ehk.a a(ejy $$0) {
      return new ehk.a($$0);
   }

   public static class a extends ehq.a<ehk.a> {
      private final ejy a;
      private boolean b;

      public a(ejy $$0) {
         this.a = $$0;
      }

      protected ehk.a a() {
         return this;
      }

      public ehk.a e() {
         this.b = true;
         return this;
      }

      @Override
      public ehr b() {
         return new ehk(this.g(), this.a, this.b);
      }
   }
}
