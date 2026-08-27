import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edr extends edx {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egg.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, edr::new)
   );
   private final egf b;
   private final boolean c;

   edr(List<efk> $$0, egf $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edz b() {
      return eea.d;
   }

   @Override
   public Set<eet<?>> a() {
      return this.b.a();
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      arx $$2 = $$1.b();
      return cnl.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static edr.a a(egf $$0) {
      return new edr.a($$0);
   }

   public static class a extends edx.a<edr.a> {
      private final egf a;
      private boolean b;

      public a(egf $$0) {
         this.a = $$0;
      }

      protected edr.a a() {
         return this;
      }

      public edr.a e() {
         this.b = true;
         return this;
      }

      @Override
      public edy b() {
         return new edr(this.g(), this.a, this.b);
      }
   }
}
