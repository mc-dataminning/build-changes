import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class eul extends euu {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exp.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kc.a(lv.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, eul::new)
   );
   private final exo b;
   private final Optional<jr<dbk>> c;

   eul(List<ews> $$0, exo $$1, Optional<jr<dbk>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public euw<eul> b() {
      return eux.g;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.a();
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      azl $$2 = $$1.b();
      kb $$3 = $$1.d().F_();
      return dbm.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static eul.a a(jp.a $$0, exo $$1) {
      return new eul.a($$1).a($$0.b(lv.aM).b(aww.n));
   }

   public static class a extends euu.a<eul.a> {
      private final exo a;
      private Optional<jr<dbk>> b = Optional.empty();

      public a(exo $$0) {
         this.a = $$0;
      }

      protected eul.a a() {
         return this;
      }

      public eul.a a(jr<dbk> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public euv b() {
         return new eul(this.g(), this.a, this.b);
      }
   }
}
