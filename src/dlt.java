import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlt implements dmb {
   public static final Codec<dlt> a = RecordCodecBuilder.create($$0 -> $$0.group(hx.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dlt::new));
   final hx c;

   public dlt(hx $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<ejz> a(csf $$0) {
      return Optional.of(ejz.b(this.c));
   }

   @Override
   public dmc<?> a() {
      return dmc.a;
   }

   public static class a implements dmc<dlt> {
      public dlt a(ty $$0) {
         return new dlt($$0.e());
      }

      public void a(ty $$0, dlt $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dlt> a() {
         return dlt.a;
      }
   }
}
